<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
    <%--@elvariable id="itemForm" type=""--%>
    <form:form method="POST" modelAttribute="itemForm">
        <div><form:input type="double" path="coast" placeholder="coast"></form:input>
        </div>
        <div>
            <form:input type="long" path="amountProduct" placeholder="amountProduct"></form:input>
        </div>
        <div>
            <form:input type="long" path="product.id" placeholder="amountProduct"></form:input>
        </div>
        <div>
            <form:input type="long" path="group.id" placeholder="amountProduct"></form:input>
        </div>
        <button type="submit">ok</button>
    </form:form>
</sec:authorize>
</body>
</html>
