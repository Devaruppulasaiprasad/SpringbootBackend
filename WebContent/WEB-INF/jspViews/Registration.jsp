<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<style>
.error {
color: #ff0000;
font-style: italic;
}
</style>
</head>
<body>
<center>
<h2>Employee Registration</h2>
<form:form method="POST" modelAttribute="employeeBean" action="registration.html">
	<table border="3">
		<tr>
			<td>Employee Name :</td>
			<td><form:input path="name" /></td>
			<td><form:errors path="name"  cssClass="error"/></td>
		</tr>
		
		<tr>
			<td>Gender :</td>
			<td><form:radiobutton path="gender" value="M" label="Male" /> 
				<form:radiobutton path="gender" value="F" label="Female" /></td>
			<td><form:errors path="gender"  cssClass="error"/></td>
		</tr>
		<tr>
			<td>Country :</td>
			<td><form:select path="country">
				<form:option value="" label="--Select--" />
				<form:option value="1" label="India" />
				<form:option value="2" label="USA" />
				<form:option value="3" label="UK" />
			</form:select></td>
		    <td><form:errors path="country"  cssClass="error"/></td>
		</tr>
		<tr>
			<td>About you :</td>
			<td><form:textarea path="aboutYou" /></td>
			<td><form:errors path="aboutYou"  cssClass="error"/></td>
		</tr>
		<tr>
			<td>Community :</td>
			<td><form:checkbox path="community" value="SpringV"     label="SpringL" /> 
				<form:checkbox path="community" value="HibernateV"  label="HibernateL" /> 
				<form:checkbox path="community" value="StrutsV"     label="StrutsL" /></td>
			<td><form:errors path="community"  cssClass="error"/></td>
		</tr>
		<tr>
			<td>Joining Date :</td>
			<td><form:input path="joiningDate"  /></td> <!--2 we use check boxes for dynamic  -->
			<td><form:errors path="joiningDate"  cssClass="error"/></td>
			
		</tr>
		<tr>
			<td>Age :</td>
			<td><form:input path="age"  /></td> <!--2 we use check boxes for dynamic  -->
			<td><form:errors path="age"  cssClass="error"/></td>
			
		</tr>
		<tr>
			<td colspan="2"><form:checkbox path="mailingList" label="Would you like to join our mailinglist?" /></td> <!-- acts as boolean if value is not given -->
			<td><form:errors path="mailingList"  cssClass="error"/></td>
		</tr>
		
		<tr>
			<td>Secret Key :</td>
			<td><form:password path="password" /></td>
			<td><form:errors path="password"  cssClass="error"/></td>
		</tr>
		<tr>
			<td>Confirm Secret Key:</td>
			<td><form:password path="confirmPassword" /></td>
			<td><form:errors path="confirmPassword"  cssClass="error"/></td>
		</tr>
		<tr >
			<td align="center" colspan="3" ><input type="submit" value="Register"></td>
		</tr>
	</table>
	<!-- Following is used to display all the errors on the page. 
		should be placed in side the spring form -->
	<spring:hasBindErrors name="employeeBean">
			<h3>All Errors</h3>
			<form:errors path="*"  cssClass="error"/>
	</spring:hasBindErrors>
</form:form>
	
</center>
</body>
</html>
