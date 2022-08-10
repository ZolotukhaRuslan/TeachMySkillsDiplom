<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
<form action="/deleteProductById">
    <p ><strong><spring:message
            code="Enter.id.product"></spring:message></strong>
        <input maxlength="25" size="40" name="id"></p>
    <p><input type="submit" value="id" name="start"></p>
</form>
</sec:authorize>
</body>
</html>
