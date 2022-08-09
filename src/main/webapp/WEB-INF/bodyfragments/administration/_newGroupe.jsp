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
    <%--@elvariable id="groupForm" type=""--%>
    <form:form method="POST" modelAttribute="groupForm">
        <div>
            <form:input type="text" path="groupName" placeholder="Groupname"
                        autofocus="true"></form:input>
        </div>
        <button type="submit" class="ButtonAdmin"><spring:message code="Confirm"/></button>
    </form:form>
    <a href="/"><spring:message code="Home.Page"/></a>
</table>
</sec:authorize>
</body>
</html>
