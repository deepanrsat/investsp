<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--<%@include file="/WEB-INF/jspf/users.jspf"%>--%>

<html lang="en">

<head>
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery-2.1.3.min.js" />"></script>
    <script src="<c:url value="/resources/js/investorHome.js" />"></script>
</head>

<body>
	<h2>Welcome to InvestSP</h2>
	<div>
		<label for="createUser">Create a new investor</label>
		<input type="button" id="createUser" value="Create" >
	</div>
	<div>
		<form method="POST" action="/getInvestorInfo.do" modelAttribute="searchForm">
			Investor Id: <input type="text" id="idSearch" />
			First Name: <input type="text" id="fnSearch" />
			Last Name: <input type="text" id="lnSearch">
			<input type="submit" value="Find" />
		</form>
	</div>

<%--	<div>
		<ul class="nav nav-tabs">
			<li class="active">
				<a href="#users">Users</a>
			</li>
			<li>
				<a href="#invest">Invest</a>
			</li>
		</ul>
	</div>
	<section id="users" class="tab-content active">
		<div>
			&lt;%&ndash;This is simply testing the table - Users&ndash;%&gt;
		</div>
	</section>
	<section id="invest" class="tab-content hide">
		<div>
			This is simply testing the table - Invest
			&lt;%&ndash;<jsp:include page="/WEB-INF/jspf/invest.jspf"/>&ndash;%&gt;
		</div>
	</section>--%>
</body>

</html>