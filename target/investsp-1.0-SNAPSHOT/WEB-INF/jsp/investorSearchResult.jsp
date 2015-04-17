<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">

<head>
  <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
</head>
<body>
    <table>
        <tr>
            <td>Investor Id</td>
            <td>First Name</td>
            <td>Last Name</td>
            <td>City</td>
            <td>Phone Number</td>
        </tr>
      <c:forEach var="investor" items="${investorList}">
        <tr>
            <td>${investor.investorId}</td>
            <td>${investor.firstName}</td>
            <td>${investor.lastName}</td>
            <td>${investor.city}</td>
            <td>${investor.phoneNumber}</td>
        </tr>
      </c:forEach>
    </table>
</body>
</html>
