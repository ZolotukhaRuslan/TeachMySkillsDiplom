<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
    <form action="/updateNameGroup">
        <p><strong><spring:message code="Enter.id.group"></spring:message></strong>
            <input maxlength="25" size="40" name="id"></p>
        <p><input type="submit" value="<spring:message
            code="Confirm"></spring:message>" class="ButtonForAdmin" name="start"></p>
    </form>
    <form method="post">
        <div>
            <table>
                <thead>
                <th><spring:message
                        code="Id"></spring:message></th>
                <th><spring:message
                        code="Group.Name"></spring:message></th>
                </thead>
                <tr>
                    <td>${Group.id}</td>
                    <td>${Group.groupName}</td>
                </tr>
            </table>

        <form>
            <p><strong><spring:message code="Enter.new.name.group"></spring:message></strong>
               <p> <input maxlength="25" size="40" name="newName"></p>
            <p><input type="submit" value="<spring:message
            code="Confirm"></spring:message>" class="ButtonForAdmin"> <a href="/updateUserById" class="ButtonForAdmin">
                back</a></p>
        </form>
</sec:authorize>
</body>
</html>