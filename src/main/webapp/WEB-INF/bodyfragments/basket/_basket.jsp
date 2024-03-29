<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<form method="post">
    <table>
        <div>
            <table>
                <thead>
                <th><spring:message code="Name.Product"></spring:message></th>
                <th><spring:message code="Amount"></spring:message></th>
                <th><spring:message code="Coast"></spring:message></th>
                <th><spring:message code="Price"></spring:message></th>
                <th><spring:message code="AllPrice"></spring:message></th>
                </thead>
                <c:forEach items="${allItemsInBasket}" var="item">
                <tr>
                    <td>${item.product.productName}</td>
                    <td>${item.quantityToOrder}</td>
                    <td>${item.coast}</td>
                    <td>${item.quantityToOrder * item.coast}</td>
                    <td><a href="/add/${item.itemId}"><img src="/resources/icons/iconPlus.png"></a> <a
                            href="/minus/${item.itemId}"><img src="/resources/icons/iconMinus.png"></a></td>
                    </c:forEach>
                    <td> ${AllPrice}</td>
                </tr>
            </table>
        </div>
        <div>
            <h2><spring:message code="pickup.address.confirm"/></h2>
            <select type="select" name="address" class="ButtonSubmit">
                <option><spring:message code="Address.one"/></option>
                <option><spring:message code="Address.two"/></option>
                <option><spring:message code="Address.three"/></option>
            </select>
        </div>
        <form>
            <p><input type="submit" value="<spring:message
            code="Confirm"></spring:message>" class="ButtonForAdmin"></p>
        </form>
    </table>
    </p>
</form>
</body>
</html>