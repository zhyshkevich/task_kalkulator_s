<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../fragments/header.jsp" />

<div class="container">

	<br />
        <h1> Add contract </h1>
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
            </tr>
            </table>
        </form>
</div>
</body>
</html>
