<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
<form method="post">
    <div>
        <table>
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
        <form>
            <p><strong><spring:message
                    code="Enter.new.Role"></spring:message></strong>
            <div>
                <select type="select" name="role">
                    <option>ADMIN</option>
                    <option>USER</option>
                </select>
            </div>
            <p><input type="submit" value="<spring:message
            code="Confirm"></spring:message>" class="ButtonForAdmin">  <a href="/updateUserById" class="ButtonForAdmin"><spring:message
                code="Back"></spring:message></a></p>
        </form>
    </div>
</form>
</sec:authorize>
</body>
