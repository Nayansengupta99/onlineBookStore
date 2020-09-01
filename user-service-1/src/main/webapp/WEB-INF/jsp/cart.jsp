<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout"
	xmlns:th="http://www.thymeleaf.org">

<head>
<link rel="icon" type="image/jpg"
	href="https://png.pngtree.com/png-clipart/20190705/original/pngtree-vector-book-icon-png-image_4192508.jpg" />
<title>CART SERVICE</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
	integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<script>
	
</script>
<style type="text/css">
.table {
	border-radius: 5px;
	width: 50%;
	margin: 0px auto;
	float: none;
}

body {
	background:
		url("https://images.wallpaperscraft.com/image/books_library_shelves_138556_2560x1440.jpg")
		no-repeat center center fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}
</style>

</head>
<body>
	<nav class="navbar navbar-expand-md bg-dark navbar-dark"> <a
		class="navbar-brand" href="/bookstore/${userName}">Welcome to
		Bookstore ${userName}</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#collapsibleNavbar">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="collapsibleNavbar">
		<ul class="navbar-nav">

			<li class="nav-item"><a class="nav-link" href="cart">Go To
					Cart</a></li>

		</ul>
		<ul class="nav navbar-nav ml-auto">
			<li class="nav-item"><a class="nav-link" href="signup"><span
					class="fas fa-user"></span> Sign Up</a></li>
			<li class="nav-item"><a class="nav-link" href="login"><span
					class="fas fa-sign-in-alt"></span> Login</a></li>
		</ul>
	</div>
	</nav>
	<br>

	<center>
		<h3 style="color: white;">CART INFO</h3>
		<table class="table table-dark table-striped">
			<tr>

				<th scope="col">Name</th>
				<th scope="col">Price</th>
				<th scope="col">Quantity</th>


			</tr>
			<tbody>
				<c:forEach items="${cart}" var="emp">
					<tr>

						<td><c:out value="${emp.book.bookName}" /></td>
						<td><c:out value="Rs ${emp.book.bookPrice}" /></td>
						<td><c:out value="${emp.quantity}" /></td>



					</tr>
				</c:forEach>
				<tr>
					<td>Total (Tax Incl.)</td>

					<td>Rs. ${sum}</td>

				</tr>

			</tbody>




		</table>
	</center>



</body>






</html>