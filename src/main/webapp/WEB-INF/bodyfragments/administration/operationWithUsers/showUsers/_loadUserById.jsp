<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/loadUserById">
    <p ><strong>id go</strong>
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
</body>
</html>

