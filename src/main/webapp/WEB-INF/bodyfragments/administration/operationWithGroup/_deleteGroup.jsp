<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
<form action="/deleteGroupById">
    <p ><strong><spring:message
            code="Enter.id.group"></spring:message></strong>
        <input maxlength="25" size="40" name="id"></p>
    <p><input type="submit" value="<spring:message code ="Confirm"/>" name="id" class="ButtonForAdmin"></p>
</form>
</sec:authorize>
</body>
</html>
