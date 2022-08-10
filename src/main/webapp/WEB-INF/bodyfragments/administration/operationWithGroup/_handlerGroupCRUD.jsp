<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
<div>
    <a href="/updateGroup" class="ButtonAdmin"><spring:message
            code="Update.Group"></spring:message></a>
</div>
<div>
    <a href="/showGroup" class="ButtonAdmin"><spring:message
            code="Show.Group"></spring:message></a>
</div>
<div>
    <a href="/deleteGroup" class="ButtonAdmin"><spring:message
            code="Delete.Group"></spring:message></a>
</div>
<div>
    <a href="/createGroup" class="ButtonAdmin"><spring:message
            code="Create.Group"></spring:message></a>
</div>
</sec:authorize>
</body>
</html>
