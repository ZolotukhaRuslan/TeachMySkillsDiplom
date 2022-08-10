<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
<div>
    <table class="AdminTable">
        <thead>
        <th><spring:message
                code="Id"></spring:message></th>
        <th><spring:message
                code="Coast"></spring:message></th>
        <th><spring:message
                code="Amount"></spring:message></th>
        <th><spring:message
                code="Basket.Item.Id"></spring:message></th>
        <th><spring:message
                code="Name.Product"></spring:message></th>
        <th><spring:message
                code="Product.id"></spring:message></th>
        <th><spring:message
                code="Group.Id"></spring:message></th>
        <th><spring:message
                code="Group.Name"></spring:message></th>
        </thead>
        <c:forEach items="${Items}" var="item">
            <tr>
                <td>${item.itemId}</td>
                <td>${item.coast}</td>
                <td>${item.amountProduct}</td>
                <td>${item.basketItems.id}</td>
                <td>${item.product.productName}</td>
                <td>${item.product.id}</td>
                <td>${item.group.id}</td>
                <td>${item.group.groupName}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</sec:authorize>
</body>
</html>
