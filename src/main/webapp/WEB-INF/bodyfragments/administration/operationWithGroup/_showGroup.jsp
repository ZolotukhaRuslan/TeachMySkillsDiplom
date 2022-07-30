<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <table>
        <thead>
        <th><spring:message
                code="Id"></spring:message></th>
        <th><spring:message
                code="Group.Name"></spring:message></th>
        </thead>
        <c:forEach items="${Group}" var="group">
            <tr>
                <td>${group.id}</td>
                <td>${group.groupName}</td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
