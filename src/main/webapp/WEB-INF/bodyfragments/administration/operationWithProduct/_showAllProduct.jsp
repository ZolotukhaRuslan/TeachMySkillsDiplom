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
        <th>Name Product</th>
        <td>Group Id</td>
        <td>Group Name</td>
        </thead>
        <c:forEach items="${allProducts}" var="product">
            <tr>
                <td>${product.id}</td>
                <td>${product.productName}</td>
                <td>${product.groups.id}</td>
                <td>${product.groups.groupName}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
