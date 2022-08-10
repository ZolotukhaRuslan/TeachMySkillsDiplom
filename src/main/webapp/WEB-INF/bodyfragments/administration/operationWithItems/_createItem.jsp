<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
    <%--@elvariable id="itemForm" type=""--%>
    <form:form method="POST" modelAttribute="itemForm">
        <spring:message code="Enter.coast"></spring:message>
        <div><form:input type="double" path="coast"></form:input>
        </div>
        <spring:message code="Enter.amount.product"></spring:message>
        <div>
            <form:input type="long" path="amountProduct"></form:input>
        </div>
        <spring:message code="Enter.product.id"></spring:message>
        <div>
            <form:input type="long" path="product.id"></form:input>
        </div>
        <spring:message code="Enter.id.group"></spring:message>
        <div>
            <form:input type="long" path="group.id"></form:input>
        </div>
        <button type="submit" class="ButtonForAdmin"><spring:message
                code="Confirm"></spring:message></button>
    </form:form>
</sec:authorize>
</body>
</html>
