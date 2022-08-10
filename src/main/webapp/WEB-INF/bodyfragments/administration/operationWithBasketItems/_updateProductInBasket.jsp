<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
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
                    <c:forEach items="${basketItem}" var="item">
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
                <select type="select" class="ButtonSubmit">
                    <option>Adress one</option>
                    <option>Adress two</option>
                    <option>Adress three</option>
                </select>
            </div>
        </table>
        <form>
            <p><strong><spring:message
                    code="Enter.id.user"></spring:message></strong>
                <input maxlength="25" size="40" name="productId"></p>
            <p><input type="submit" value="<spring:message
            code="Confirm"></spring:message>" class="ButtonForAdmin"></p>
        </form>
    </form>
</sec:authorize>
</body>
</html>