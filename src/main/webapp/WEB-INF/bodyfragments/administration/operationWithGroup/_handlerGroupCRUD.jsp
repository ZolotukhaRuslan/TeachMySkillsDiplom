<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 21.07.2022
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
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

</body>
</html>
