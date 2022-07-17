<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/table.css"/>
</head>
<body>
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
        <c:forEach items="${User}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.login}</td>
                <td>${user.username}</td>
                <td>${user.age}</td>
                <td>${user.mail}</td>
                <td>${user.gender}</td>
                <td> ${user.basket.id}</td>
                <td><c:forEach items="${user.roles}" var="role">
                    ${role.name}
                </c:forEach></td>
            </tr>
        </c:forEach>
    </table>
</div>


</body>
</html>
