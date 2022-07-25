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
        <th>Name</th>
        <th>Name</th>
        <th>Name</th>
        <th>Name</th>
        <th>Name</th>
        </thead>
        <c:forEach items="${Items}" var="item">
            <tr>
                <td>${item.itemId}</td>
                <td>${item.coast}</td>
                <td>${item.amountProduct}</td>
                <td>${item.product.id}</td>
                <td>${item.product.productName}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
