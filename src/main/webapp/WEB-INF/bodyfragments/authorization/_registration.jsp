<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title><spring:message code="Registration"></spring:message></title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
<div>
</div>
<div id="wrapper">
    <%--@elvariable id="userForm" type=""--%>
    <form:form id="signin" method="POST" modelAttribute="userForm" autocomplete="off">
        <div>
            <form:input type="text" path="login" placeholder="Login"
                        autofocus="true"></form:input>
            <form:errors path="login"></form:errors>
                ${usernameError}
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
        <button type="submit">&#xf0da;</button>
    </form:form>
    <a href="/"><spring:message code="Home.Page"/></a>
</div>
</div>
</body>
</html>