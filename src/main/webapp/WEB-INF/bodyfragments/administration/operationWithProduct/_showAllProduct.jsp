<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <table>
        <thead>
        <th><spring:message
                code="Id"></spring:message></th>
        <th><spring:message
                code="Name.Product"></spring:message></th>
        <td><spring:message
                code="Group.Id"></spring:message></td>
        <td><spring:message
                code="Group.Name"></spring:message></td>
        </thead>
        <c:forEach items="${allProducts}" var="product">
            <tr>
                <img src="data:image/jpeg;base64,${image}" />
                <td>${product.imageProduct}</td>
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
