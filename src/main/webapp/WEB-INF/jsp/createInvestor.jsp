<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">

<head>
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
</head>

<body>
	<h2>Creating new user</h2>
	<form:form method="POST" action="/createInvestor.do" modelAttribute="createUserForm">
        <form:errors path="" element="div" />
        <div>
            <form:label path="firstName">First Name</form:label>
            <form:input path="firstName" />
            <form:errors path="firstName" />
        </div>
        <div>
            <form:label path="lastName">Last Name</form:label>
            <form:input path="lastName" />
            <form:errors path="lastName" />
        </div>
        <div>
            <form:label path="dob">Date of Birth</form:label>
            <form:input path="dob" />
            <form:errors path="dob" />
        </div>
        <div>
            <form:label path="address">Address</form:label>
            <form:input path="address" />
            <form:errors path="address" />
        </div>
        <div>
            <form:label path="city">City</form:label>
            <form:input path="city" />
            <form:errors path="city" />
        </div>
        <div>
            <form:label path="state">State</form:label>
            <form:input path="state" />
            <form:errors path="state" />
        </div>
        <div>
            <form:label path="zipCode">Zip Code</form:label>
            <form:input path="zipCode" />
            <form:errors path="zipCode" />
        </div>
        <div>
            <form:label path="phoneNumber">Phone Number</form:label>
            <form:input path="phoneNumber" />
            <form:errors path="phoneNumber" />
        </div>
        <div>
            <input type="submit" />
        </div>
     </form:form>
</body>

</html>