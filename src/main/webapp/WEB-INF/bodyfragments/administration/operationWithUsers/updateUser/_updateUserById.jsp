<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/updateUserById">
    <p><strong>id go</strong>
        <input maxlength="25" size="40" name="id"></p>
    <p><input type="submit" value="id" name="start"></p>
</form>
<form>
    <div>
        <table>
            <thead>
            <th>Id</th>
            <th>Login</th>
            <th>Name</th>
            <th>Age</th>
            <th>Mail</th>
            <th>Gender</th>
            <th>Basket id</th>
            <th>Role</th>
            </thead>
            <tr>
                <td>${User.id}</td>
                <td>${User.login}</td>
                <td>${User.username}</td>
                <td>${User.age}</td>
                <td>${User.mail}</td>
                <td>${User.gender}</td>
                <td> ${User.basket.id}</td>
                <td><c:forEach items="${User.roles}" var="role">
                    ${role.name}
                </c:forEach></td
            </tr>
        </table>
    </div>
</form>
<%--@elvariable id="updateUserForm" type=""--%>
<form:form method="POST" modelAttribute="updateUserForm">
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
        <form:select type="select" path="gender">
            <option>Man</option>
            <option>Woman</option>
        </form:select>
    </div>
    <button type="submit">ok</button>
</form:form>
</body>
</html>

