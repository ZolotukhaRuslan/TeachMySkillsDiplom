<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
<div>
    <table class="AdminTable">
        <thead>
        <th><spring:message
                code="Id"></spring:message></th>
        <th><spring:message
                code="Login"></spring:message></th>
        <th><spring:message
                code="Name"></spring:message></th>
        <th><spring:message
                code="Age"></spring:message></th>
        <th><spring:message
                code="Mail"></spring:message></th>
        <th><spring:message
                code="Gender"></spring:message></th>
        <th><spring:message
                code="Basket.id"></spring:message></th>
        <th><spring:message
                code="Role"></spring:message></th>
        </thead>
        <tr>
            <td>${User.id}</td>
            <td>${User.login}</td>
            <td>${User.username}</td>
            <td>${User.age}</td>
            <td>${User.mail}</td>
            <td>${User.gender}</td>
            <td> ${User.basket.id}</td>
            <td><c:forEach items="${User.roles}" var="role">
                ${role.name}
            </c:forEach></td
        </tr>
    </table>
</div>
</sec:authorize>
</body>
</html>
