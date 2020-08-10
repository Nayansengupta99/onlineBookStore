package com.cognizant.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cognizant.model.Item;

public interface CartDetailRepository extends JpaRepository<Item, Integer> {
	@Modifying
	@Transactional
	@Query(value = "insert into cart(bookid,bookname,bookprice,quantity) values(?1,?2,?3,?4)", nativeQuery = true)
	public void addToCart(@Param("bookId") int bookId, @Param("bookName") String bookNmae,
			@Param("bookPrice") int bookPrice, @Param("quantity") int quantity);

}
