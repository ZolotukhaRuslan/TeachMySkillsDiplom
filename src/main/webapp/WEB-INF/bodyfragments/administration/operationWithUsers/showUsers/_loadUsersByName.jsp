<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/loadUsersByName">
    <p ><strong><spring:message
            code="Enter.name.user"></spring:message></strong>
        <input maxlength="25" size="40" name="nameUser"></p>
    <p><input type="submit" value="<spring:message
            code="Confirm"></spring:message>" name="nameUser" class="ButtonForAdmin"></p>
</form>
</body>
</html>
