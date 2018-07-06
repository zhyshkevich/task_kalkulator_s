<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../fragments/header.jsp" />

<body>

	<div class="container">

		<h1>All contracts</h1>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Country</th>
					<th>Tax</th>
					<th>Fixed Cost</th>
					<th>Currency code</th>
					<th>Daily earnings</th>
				</tr>
			</thead>

			<c:forEach var="country" items="${countries}">
				<tr>
					<td>
						${country.countryName}
					</td>
					<td>${country.tax} %</td>
					<td>${country.cost}</td>
					<td>${country.currencyCode}<td>
						<spring:url value="/contracts/${country.uuid}" var="countryUrl" />
						<spring:url value="/contracts/${country.uuid}/delete" var="deleteUrl" />

						<button class="btn btn-info" onclick="location.href='${countryUrl}'">Enter salary</button>
						<button class="btn btn-danger" onclick="location.href='${deleteUrl}'">Delete</button></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>