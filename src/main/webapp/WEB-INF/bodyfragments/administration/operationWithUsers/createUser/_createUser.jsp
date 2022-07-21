<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 21.07.2022
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--@elvariable id="usersForm" type=""--%>
<form:form method = "POST" modelAttribute="usersForm">
<div><form:input type = "text" path="login" placeholder = "Login"></form:input>
</form:form> </div>
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
</body>
</html>
