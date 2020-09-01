package com.cognizant.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.model.Item;
import com.cognizant.model.LoginModel;
import com.cognizant.model.UserDetailModel;
import com.cognizant.repository.BookDetailRepository;
import com.cognizant.repository.CartDetailRepository;
import com.cognizant.repository.LoginRepository;
import com.cognizant.repository.UserDetailRepository;

@Controller
@RequestMapping("bookstore")
public class MainController {

	@Autowired
	private LoginRepository loginRepo;
	@Autowired
	private UserDetailRepository usdRepo;
	@Autowired
	private BookDetailRepository bdRepo;
	@Autowired
	private CartDetailRepository ctRepo;

	@GetMapping("/login")
	public String showLogin(@ModelAttribute("login") LoginModel loginModel, Model model) {
		return "login";
	}

	@PostMapping("/login")
	public String showRegistrationPage(@ModelAttribute("login") LoginModel loginModel, BindingResult result,
			@RequestParam("userName") String userName, ModelMap model) {

		model.put("userName", userName);

		loginRepo.insertUserCredential(loginModel.getUserName(), loginModel.getPassword());

		return "redirect:/bookstore/" + loginModel.getUserName();
	}

	@GetMapping("/{userName}")
	public String showBookStoreUser(@ModelAttribute("login") LoginModel loginModel, BindingResult result,
			@PathVariable("userName") String userName, ModelMap model) {

		List<LoginModel> list = loginRepo.findAll();

		model.addAttribute("list", bdRepo.findAll());
		model.put("userName", list.get(list.size() - 1).getUserName());
		return "bookstore";
	}

	@GetMapping("/signup")
	public String signup(@ModelAttribute("register") UserDetailModel userModel, BindingResult result, Model model) {

		return "Welcome";
	}

	@PostMapping("/signup")
	public String showBookStore(@ModelAttribute("register") UserDetailModel userModel, BindingResult result,
			Model model) {

		usdRepo.insertUserDetail(userModel.getUserId(), userModel.getUserName(), userModel.getUserAddress(),
				userModel.getUserPhoneNumber(), userModel.getMailid());

		return "redirect:/bookstore/";
	}

	@GetMapping("/")
	public String showBookStoreHome(ModelMap model) {

		model.addAttribute("list", bdRepo.findAll());
		return "bookstore";
	}

	@GetMapping("/{userName}/cart")
	public String showCart(@PathVariable("userName") String userName, @RequestParam(value = "sum", required = false)Integer sum, ModelMap model) {

		List<LoginModel> list = loginRepo.findAll();
		List<Item> cartItems = ctRepo.findAll();
		Integer s = 0;
		for (Item i : cartItems) {
			s = i.getBook().getBookPrice() + s;
		}
		sum=s;
		model.put("sum", sum);

		model.addAttribute("list", bdRepo.findAll());
		model.put("userName", list.get(list.size() - 1).getUserName());

		model.addAttribute("cart", ctRepo.findAll());
		return "cart";
	}

	@PostMapping("cart/buy/{bookid}")
	public String buyById(@PathVariable("bookid") int bookId, Model model) {
		List<LoginModel> list = loginRepo.findAll();

		if (model.getAttribute("cart") == null) {

			ctRepo.addToCart(bookId, bdRepo.findById(bookId).getBookName(), bdRepo.findById(bookId).getBookPrice(), 1);

		}
		return "redirect:/bookstore/" + list.get(list.size() - 1).getUserName();
	}

}
