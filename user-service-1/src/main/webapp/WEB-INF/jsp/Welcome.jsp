<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html SYSTEM "about:legacy-compat">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<center><h1>WELCOME TO REGISTRATION PAGE ${userName}</h1></center>
</head>
<body>

<form:form method="post" modelAttribute="register">
<table width="50%" height="50" bgcolor="#ff6f61" align="center">

<tr>
<td colspan=2><center><font size=4><b>Registration Page</b></font></center></td>
</tr>
<tr>
<td>User ID</td>
<td><form:input path="userId" id="userId"/></td>
<td><form:errors path="userId"/></td>
</tr>

<tr>
<td>Name</td>
<td><form:input path="userName" id="userName"/></td>
<td><form:errors path="userName"/></td>
</tr>

<tr>
<td>Address</td>
<td><form:input path="userAddress" id="userAddress"/></td>
<td><form:errors path="userAddress"/></td>
</tr>

<tr>
<td>Phone-Number</td>
<td><form:input path="userPhoneNumber" id="userPhoneNumber"/></td>
<td><form:errors path="userPhoneNumber"/></td>
</tr>

<tr>
<td>Email-Id</td>
<td><form:input path="mailid" id="mailid"/></td>
<td><form:errors path="mailid"/></td>
</tr>






<tr>
<td ><input type="Reset"></td>
<td><button class="btn btn-lg btn-primary btn-block" type="submit">Register</button> </td>
</tr>

</table>
</form:form>

</body>
</html>