<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html SYSTEM "about:legacy-compat">

<html lang="en">

 <head>

  <!-- Required meta tags -->

<meta charset="utf-8">

<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">



  <!-- Bootstrap CSS -->

 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Login Page</title>
</head>
<body>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>

<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<form:form method="post" modelAttribute="login">
<table width="50%" height="50" bgcolor="#ff6f61" align="center">

<tr>
<td colspan=2><center><font size=4><b>Login Page</b></font></center></td>
</tr>






<tr>
<td>UserName:</td>
<td><form:input path="userName" id="userName"/></td>
<td><form:errors path="userName"/></td>
</tr>

<tr>
<td>Password:</td>
<td><form:input type="Password" path="password" id="password"/></td>
<td><form:errors path="password"/></td>
</tr>






<tr>
<td ><input type="Reset"></td>
<td><button class="btn btn-lg btn-primary btn-block" type="submit">Login</button> </td>
</tr>

</table>
</form:form>


</body>
</html>