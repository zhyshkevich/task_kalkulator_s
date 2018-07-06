<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../fragments/header.jsp" />

<div class="container">

	<%--<c:choose>--%>
		<%--<c:when test="${userForm['new']}">--%>
			<%--<h1>Add User</h1>--%>
		<%--</c:when>--%>
		<%--<c:otherwise>--%>
			<%--<h1>Update User</h1>--%>
		<%--</c:otherwise>--%>
	<%--</c:choose>--%>
	<br />

        <h1> Add contract </h1>

	<%--<spring:url value="/contracts" var="contractActionUrl" />--%>

	<%--<form:form class="form-horizontal" method="post" modelAttribute="countryModel" action="${contractActionUrl}">--%>
        <%--&lt;%&ndash;<form:hidden path="id" />&ndash;%&gt;--%>
        <%--&lt;%&ndash;<form:hidden path="rev" />&ndash;%&gt;--%>
        <%--&lt;%&ndash;<form:hidden path="isDeleted"/>&ndash;%&gt;--%>
		<%--&lt;%&ndash;<form:hidden path="uuid" />&ndash;%&gt;--%>
        <%--&lt;%&ndash;<form:hidden path="dateCreated" />&ndash;%&gt;--%>


        <%--<spring:bind path="countryName">--%>
			<%--<div class="form-group ${status.error ? 'has-error' : ''}">--%>
				<%--<label class="col-sm-2 control-label">countryName</label>--%>
				<%--<div class="col-sm-10">--%>
					<%--<form:input path="countryName" type="text" class="form-control " id="countryName" placeholder="countryName" />--%>
					<%--<form:errors path="countryName" class="control-label" />--%>
				<%--</div>--%>
			<%--</div>--%>
		<%--</spring:bind>--%>

		<%--<spring:bind path="tax">--%>
			<%--<div class="form-group ${status.error ? 'has-error' : ''}">--%>
				<%--<label class="col-sm-2 control-label">Tax</label>--%>
				<%--<div class="col-sm-10">--%>
					<%--<form:input path="tax" class="form-control" id="tax" placeholder="tax" />--%>
					<%--<form:errors path="tax" class="control-label" />--%>
				<%--</div>--%>
			<%--</div>--%>
		<%--</spring:bind>--%>

		<%--<spring:bind path="cost">--%>
			<%--<div class="form-group ${status.error ? 'has-error' : ''}">--%>
				<%--<label class="col-sm-2 control-label">cost</label>--%>
				<%--<div class="col-sm-10">--%>
					<%--<form:password path="cost" class="form-control" id="cost" placeholder="cost" />--%>
					<%--<form:errors path="cost" class="control-label" />--%>
				<%--</div>--%>
			<%--</div>--%>
		<%--</spring:bind>--%>

		<%--<spring:bind path="currencyCode">--%>
			<%--<div class="form-group ${status.error ? 'has-error' : ''}">--%>
				<%--<label class="col-sm-2 control-label">currencyCode</label>--%>
				<%--<div class="col-sm-10">--%>
					<%--<form:password path="currencyCode" class="form-control" id="currencyCode" placeholder="currencyCode" />--%>
					<%--<form:errors path="currencyCode" class="control-label" />--%>
				<%--</div>--%>
			<%--</div>--%>
		<%--</spring:bind>--%>



		<%--<div class="form-group">--%>
			<%--<div class="col-sm-offset-2 col-sm-10">--%>
                <%--<button type="submit" class="btn-lg btn-primary pull-right">Add</button>--%>
			<%--</div>--%>
		<%--</div>--%>
	<%--</form:form>--%>

        <form class="form-horizontal" method="POST" action="/contracts">
            <table>
                <tr>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <td>Country name :</td>
                            <td><input class="form-control " type="text" id="countryName" name="countryName"/></td>
                        </div>
                    </div>
                </tr>
                <tr>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <td>Tax :</td>
                            <td><input class="form-control " type="text" id="tax" name="tax"/></td>
                        </div>
                    </div>
                </tr>
                <tr>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <td>Cost :</td>
                            <td><input class="form-control " type="text" id="cost" name="cost"/></td>
                        </div>
                    </div>

                </tr>
                <tr>
                    <div class="form-group">
                        <div class="col-sm-10">
                            <td>Currency code :</td>
                            <td><select class="form-control " id="currencyCode" name="currencyCode">
                                <option disabled>Choose currency code</option>
                                <option value="EUR">EUR</option>
                                <option selected value="USD">USD</option>
                                <option value="GBP">GBP</option>
                                <option value="KZT">KZT</option>
                                <option value="NOK">NOK</option>
                                <option value="SEK">SEK</option>
                            </select></td>
                        </div>
                    </div>

                </tr>

            </table>
            <tr>
                <td><button type="submit" class="btn-lg btn-primary pull-center">Add</button></td>
                <%--<td colspan="2"><input type="submit"></td>--%>
            </tr>
            </table>
        </form>

</div>


</body>
</html>

<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>--%>
<%--<html>--%>
<%--<head>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h3>Welcome, Enter The Employee Details</h3>--%>
<%--<form:form method="POST"--%>
           <%--action="/contracts"--%>
           <%--modelAttribute="contract">--%>
    <%--<table>--%>
        <%--<tr>--%>
            <%--<td><form:label path="countryName">Name</form:label></td>--%>
            <%--<td><form:input path="countryName"/></td>--%>
        <%--</tr>--%>
        <%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<td><form:label path="id">Id</form:label></td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<td><form:input path="id"/></td>&ndash;%&gt;--%>
        <%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
        <%--&lt;%&ndash;<tr>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<td><form:label path="contactNumber">&ndash;%&gt;--%>
                <%--&lt;%&ndash;Contact Number</form:label></td>&ndash;%&gt;--%>
            <%--&lt;%&ndash;<td><form:input path="contactNumber"/></td>&ndash;%&gt;--%>
        <%--&lt;%&ndash;</tr>&ndash;%&gt;--%>
        <%--<tr>--%>
            <%--<td><input type="submit" value="Submit"/></td>--%>
        <%--</tr>--%>
    <%--</table>--%>
<%--</form:form>--%>
<%--</body>--%>
<%--</html>--%>