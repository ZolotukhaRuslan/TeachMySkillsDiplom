<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
        <c:forEach items="${User}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.login}</td>
                <td>${user.username}</td>
                <td>${user.age}</td>
                <td>${user.mail}</td>
                <td>${user.gender}</td>
                <td> ${user.basket.id}</td>
                <td><c:forEach items="${user.roles}" var="role">
                    ${role.name}
                </c:forEach></td>
            </tr>
        </c:forEach>
    </table>
</div>
</sec:authorize>
</body>
</html>
