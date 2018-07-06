<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../fragments/header.jsp" />

<div class="container">

    <c:if test="${not empty msg}">
        <div class="alert alert-${css} alert-dismissible" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
            <strong>${msg}</strong>
        </div>
    </c:if>

    <h1 align="center">Contract calculations</h1>
    <br />
    <h3 align="center">You will earn on this contract (in PLN) for 22 days:</h3>
    <h2 align="center">${salary}</h2>

    <spring:url value="/contracts" var="contracts" />
    <br/>
        <div class="row">
            <div class="col-sm-12">
                <div class="text-center" align="center">
    <button class="btn btn-success btn-lg" onclick="location.href='${contracts}'">Calculate another one</button>
    </div>
            </div>
        </div>

    </div>
</div>


</body>
</html>