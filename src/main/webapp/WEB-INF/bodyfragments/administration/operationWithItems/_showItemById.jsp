<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/showItemById">
    <p ><strong><spring:message
            code="Enter.id.product"></spring:message></strong>
        <input maxlength="25" size="40" name="id"></p>
    <p><input type="submit" value="id" name="start"></p>
</form>
<div>
    <table>
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
            <tr>
                <td>${Item.itemId}</td>
                <td>${Item.coast}</td>
                <td>${Item.amountProduct}</td>
                <td>${Item.basketItems.id}</td>
                <td>${Item.product.productName}</td>
                <td>${Item.product.id}</td>
                <td>${Item.group.id}</td>
                <td>${Item.group.groupName}</td>
            </tr>
    </table>
</div>

</body>
</html>
