<html>
<head>
    <title></title>
</head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/addImageById">
    <p><strong><spring:message
            code="Enter.id.user"></spring:message></strong>
        <input maxlength="25" size="40" name="id"></p>
    <p><input type="submit" value="<spring:message
            code="Confirm"></spring:message>" class="ButtonForAdmin"></p>
</form>
<div>
    <table>
        <thead>
        <th><spring:message
                code="Id"></spring:message></th>
        <th><spring:message
                code="Name.Product"></spring:message></th>
        <td><spring:message
                code="Group.Id"></spring:message></td>
        <td><spring:message
                code="Group.Name"></spring:message></td>
        </thead>
            <tr>
                <td>${product.id}</td>
                <td>${product.productName}</td>
                <td>${product.groups.id}</td>
                <td>${product.groups.groupName}</td>
            </tr>
    </table>

    <form action="/addImage/${product.id}" method="POST" enctype="multipart/form-data">
        Файл: <input type = "file" name = "test" />
        <input type = "submit" value = "Загрузить" />
    </form>
</div>

</body>
</html>