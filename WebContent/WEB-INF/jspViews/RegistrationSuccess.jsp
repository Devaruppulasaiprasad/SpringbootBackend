<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<center>
		<h2>Registration Successful !!</h2>
		<hr>
		<h3 style="color: blue">${message}</h3>
		<table border="2">
			<tr>
				<td>User Name :</td>
				<td>${employeeBean.name}</td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td>${employeeBean.gender}</td>
			</tr>
			<tr>
				<td>Country :</td>
				<td>${employeeBean.country}</td>
			</tr>
			<tr>
				<td>About You :</td>
				<td>${employeeBean.aboutYou}</td>
			</tr>
			<tr>
				<td>Community :</td>
				<td>${employeeBean.community[0]}${employeeBean.community[1]}
					${employeeBean.community[2]}</td>
			</tr>
			<tr>
				<td>Mailing List:</td>
				<td>${employeeBean.mailingList}</td>
			</tr>
			<tr>
				<td>Age:</td>
				<td>${employeeBean.age}</td>
			</tr>
			<tr>
				<td>Joining Date:</td>
				<td>
				<fmt:formatDate value="${employeeBean.joiningDate}" pattern="yyyy:-:MMM:-:dd"/></td>
			</tr>
		</table>
	</center>
</body>
</html>