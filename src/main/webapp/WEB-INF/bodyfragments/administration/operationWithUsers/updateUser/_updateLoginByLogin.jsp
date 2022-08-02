<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    <p><strong>  new login</strong>
        <input maxlength="25" size="40" name="logins"></p>
    <p><input type="submit" value="<spring:message
            code="Confirm"></spring:message>" class="ButtonForAdmin"> <a href="/updateUserById" class="ButtonForAdmin"> back</a></p>
</form>
</body>
</html>


