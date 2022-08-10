<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
<%--@elvariable id="productForm" type=""--%>
<form:form method="POST" modelAttribute="productForm">
    <spring:message code="Enter.product.name"></spring:message>
    <div><form:input type="text" path="productName"></form:input>
    </div>
    <spring:message code="Enter.id.group"></spring:message>
    <div>
    <form:input type="long" path="groups.id"></form:input>
    </div>
    <button type="submit" class="ButtonForAdmin"><spring:message
            code="Confirm"></spring:message></button>
</form:form>
</sec:authorize>
</body>
</html>
