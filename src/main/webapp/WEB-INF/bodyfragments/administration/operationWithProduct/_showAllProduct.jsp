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
        <th>Image</th>
        <th><spring:message
                code="Id"></spring:message></th>
        <th><spring:message
                code="Name.Product"></spring:message></th>
        <th><spring:message code="Group.Id"></spring:message></th>
        <th><spring:message code="Group.Name"></spring:message></th>
        </thead>
        <c:forEach items="${allProducts}" var="product">
            <tr>
                <td><img src="data:image/jpeg;base64,${product.imageProduct}"/></td>
                <td>${product.id}</td>
                <td>${product.productName}</td>
                <td>${product.groups.id}</td>
                <td>${product.groups.groupName}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</sec:authorize>
</body>
</html>
