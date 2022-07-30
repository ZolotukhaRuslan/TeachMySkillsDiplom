<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
</div>
    <%--@elvariable id="groupForm" type=""--%>
    <form:form  method="POST" modelAttribute="groupForm"  autocomplete="off" >
        <div>
            <form:input type="text" path="groupName" placeholder="groupName"
                        autofocus="true"></form:input>

        <button type="submit" class="ButtonForAdmin"><spring:message code ="Confirm"/></button>

    </form:form>
            <a href="/" class="ButtonForAdmin"><spring:message code ="Home.Page"/></a>

</div>
</body>
</html>
