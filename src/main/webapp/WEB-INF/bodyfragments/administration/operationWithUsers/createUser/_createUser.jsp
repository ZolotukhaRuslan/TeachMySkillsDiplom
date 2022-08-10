<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
<%--@elvariable id="usersForm" type=""--%>
<form:form method="POST" modelAttribute="usersForm">
    <div><form:input type="text" path="login" placeholder="Login"></form:input>
    </div>
    <div>
        <form:input type="password" path="password" placeholder="Password"></form:input>
    </div>
    <div>
        <form:input type="password" path="passwordConfirm"
                    placeholder="Confirm your password"></form:input>
        <form:errors path="password"></form:errors>
            ${passwordError}
    </div>
    <div>
        <form:input type="text" path="username" placeholder="Username"
        ></form:input>
    </div>
    <div>
        <form:input type="text" path="age" placeholder="age"></form:input>
    </div>
    <div>
        <form:input type="text" path="mail" placeholder="mail"></form:input>
    </div>
    <div>
        <%//  < <form:input type="text" path="sex" placeholder="sex"></form:input>%>
        <form:select type="select" path="gender">
            <option>Man</option>
            <option>Woman</option>
        </form:select>
    </div>
    <a href type="submit" class="ButtonForAdmin"><spring:message code = "Confirm"></spring:message></a>
</form:form>
</sec:authorize>
</body>
</html>
