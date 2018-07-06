<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../fragments/header.jsp" />

<div class="container">

	<h1>Conctract Detail</h1>
	<br />
	<div class="row">
		<label class="col-sm-2">ID</label>
		<div class="col-sm-10">${country.uuid}</div>
	</div>

	<div class="row">
		<label class="col-sm-2">Name</label>
		<div class="col-sm-10">${country.countryName}</div>
	</div>

	<div class="row">
		<label class="col-sm-2">Tax</label>
		<div class="col-sm-10">${country.tax} %</div>
	</div>

	<div class="row">
		<label class="col-sm-2">Cost</label>
		<div class="col-sm-10">${country.cost}</div>
	</div>

	<div class="row">
		<label class="col-sm-2">Currency code</label>
		<div class="col-sm-10">${country.currencyCode}</div>
	</div>

	<div class="row">
		<label class="col-sm-2">Date created</label>
		<div class="col-sm-10">${country.dateCreated}</div>
	</div>

	<form name="foo" action="/contractsCalc" method="post">
		<input type="hidden"  name="uuid" value="${country.uuid}"/>
		<label class="col-sm-2 control-label">Enter daily salary</label>
		<input name="value" class="form-control-plaintext" type="text" />
		<input type="submit" class="btn-md btn-primary pull-center" value="Count">
		</form>
</div>


</body>
</html>