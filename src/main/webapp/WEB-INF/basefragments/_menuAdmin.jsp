<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
<table>
    <div>
        <a href="/" class="ButtonForAdmin"><spring:message code ="Home.Page"/></a>
    </div>

    <div>
        <a href="/operationWithUsers" class="ButtonForAdmin"> <spring:message code ="Operation.with.Users"></spring:message></a>
    </div>
    <div>
        <a href="/operationWithGroupProduct" class="ButtonForAdmin"><spring:message code ="Operation.with.Group"></spring:message></a>
    </div>
    <div>
        <a href="/operationWithProduct" class="ButtonForAdmin"><spring:message code ="Operation.with.Product"></spring:message></a>
    </div>
    <div>
        <a href="/operationWithItem" class="ButtonForAdmin"><spring:message code ="Operation.with.Item"></spring:message></a>
    </div>

    <div>
        <a href="/operationWithBasket" class="ButtonForAdmin"><spring:message code ="Operation.with.Basket"></spring:message></a>
    </div>
</table>
</sec:authorize>
</body>
</html>

