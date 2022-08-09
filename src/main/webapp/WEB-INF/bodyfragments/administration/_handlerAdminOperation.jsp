<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
<table>
    <div>
        <a href="/operationWithUsers" class="ButtonAdmin"><spring:message
                code="Operation.with.Users"></spring:message></a>
    </div>
    <div>
        <a href="/operationWithGroupProduct" class="ButtonAdmin"><spring:message
                code="Operation.with.Group"></spring:message></a>
    </div>
    <div>
        <a href="/operationWithProduct" class="ButtonAdmin"><spring:message
                code="Operation.with.Product"></spring:message></a>
    </div>
    <div>
        <a href="/operationWithItem" class="ButtonAdmin"><spring:message
                code="Operation.with.Item"></spring:message></a>
    </div>
    <div>
        <a href="/operationWithBasket" class="ButtonAdmin"><spring:message
                code="Operation.with.Basket"></spring:message></a>
    </div>
</table>
</sec:authorize>
</body>
</html>

