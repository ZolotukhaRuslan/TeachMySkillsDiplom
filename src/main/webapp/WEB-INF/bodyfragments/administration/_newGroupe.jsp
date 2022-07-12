<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
<body>
<table>

    <%--@elvariable id="groupForm" type=""--%>
    <form:form method="POST" modelAttribute="groupForm">
        <div>
            <form:input type="text" path="groupName" placeholder="Groupname"
                        autofocus="true"></form:input>
        </div>

        <button type="submit">add</button>
    </form:form>
        <a href="/">Home</a>


</table>
</body>
</html>
