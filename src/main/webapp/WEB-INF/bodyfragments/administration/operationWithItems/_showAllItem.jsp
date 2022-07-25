<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <table>
        <thead>
        <th>Id</th>
        <th>Coast</th>
        <th>Amount</th>
        <th>Basket Item Id</th>
        <th>Product Name</th>
        <th>Product Id</th>
        <th>Group Id</th>
        <th>Group Name</th>
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
</body>
</html>
