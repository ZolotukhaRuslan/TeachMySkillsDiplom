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
<form>
    <p><strong><spring:message
            code="Enter.User.Name"></spring:message></strong>
        <input maxlength="25" size="40" name="userName"></p>
    <p><input type="submit" value="<spring:message
            code="Confirm"></spring:message>" class="ButtonForAdmin"> <a href="/updateUserByLogin" class="ButtonForAdmin"><spring:message
            code="Back"></spring:message></a></p>
</form>
</sec:authorize>
</body>
</html>
