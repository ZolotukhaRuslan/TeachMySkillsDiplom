<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/loadUserByIdForDelete">
    <p ><strong><spring:message
            code="Enter.id.user"></spring:message></strong>
        <input maxlength="25" size="40" name="id"></p>
    <p><input type="submit" value="<spring:message
            code="Confirm"></spring:message>"  class="ButtonForAdmin"> </p>
</form>
<form>
    <div>
        <table>
            <thead>
            <th><spring:message
                    code="Id"></spring:message></th>
            <th><spring:message
                    code="Login"></spring:message></th>
            <th><spring:message
                    code="Name"></spring:message></th>
            <th><spring:message
                    code="Age"></spring:message></th>
            <th><spring:message
                    code="Mail"></spring:message></th>
            <th><spring:message
                    code="Gender"></spring:message></th>
            <th><spring:message
                    code="Basket.id"></spring:message></th>
            <th><spring:message
                    code="Role"></spring:message></th>

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
                </c:forEach></td>
                <td><p> <a href="/deleteUser/${User.id}" class="ButtonForAdmin"><spring:message
                        code="Delete"></spring:message></a></td>
                            </tr>

        </table>
    </div>
</form>
</body>
</html>
