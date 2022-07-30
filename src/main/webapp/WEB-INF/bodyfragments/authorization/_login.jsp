<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title><spring:message code = "Log.in.with.your.account"></spring:message></title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>


</head>

<body>
<sec:authorize access="isAuthenticated()">
    <% response.sendRedirect("/"); %>
</sec:authorize>


<h1>Sign In Form</h1>
<div id="wrapper">
    <form id="signin" method="POST" action="/login" autocomplete="off">
        <input  type="text" id="user" name="username" placeholder="login" />
        <input type="password" id="pass" name="password" placeholder="password" />
        <button type="submit">&#xf0da;</button>
      <p><a href="/registration">Registration</a></p>
    </form>
</div>

</body>
</html>
