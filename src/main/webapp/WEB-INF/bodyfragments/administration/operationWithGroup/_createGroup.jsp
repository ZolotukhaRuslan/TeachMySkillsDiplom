<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 21.07.2022
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <h1>Sign In Form</h1>
</div>
    <%--@elvariable id="groupForm" type=""--%>
    <form:form id="signin" method="POST" modelAttribute="groupForm"  autocomplete="off" >
        <div>
            <form:input type="text" path="groupName" placeholder="groupName"
                        autofocus="true"></form:input>


        <button type="submit">ok</button>

    </form:form>
    <a href="/">Главная</a>

</div>
</body>
</html>
