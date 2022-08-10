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
    <form action="/loadUserById">
        <p><strong><spring:message
                code="Enter.id.user"></spring:message></strong>
            <input maxlength="25" size="40" name="id"></p>
        <p><input type="submit" name="id" value="<spring:message
            code="Confirm"></spring:message>" class="ButtonForAdmin"></p>
    </form>
</sec:authorize>
</body>
</html>

