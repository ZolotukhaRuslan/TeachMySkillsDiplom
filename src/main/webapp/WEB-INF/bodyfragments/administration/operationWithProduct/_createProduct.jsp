<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
<%--@elvariable id="productForm" type=""--%>
<form:form method="POST" modelAttribute="productForm">
    <div><form:input type="text" path="productName" placeholder="productName"></form:input>
    </div>
    <div>
    <form:input type="long" path="groups.id" placeholder="id"></form:input>
    </div>
    <button type="submit">ok</button>
</form:form>
</sec:authorize>
</body>
</html>
