<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Log in with your account</title>
    <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
</head>

<body>
<div>
    <table>



        <c:forEach items="${allGroup}" var="group">
        <tr>
            <td>${group.id}</td>
            <td>${group.groupName}</td>
            <td>
                <c:forEach items="${group.products}" var="product">${product.productName}; </c:forEach>
            </td>
            </c:forEach>



        <c:forEach items="${allProduct}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.productName}</td>
            <td>${product.groups.groupName}</td>

            </c:forEach>



        <c:forEach items="${allUsers}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
              < <td>${user.age}</td>
                <td>${user.mail}</td>
                <td>${user.sex}</td>

            <td>
                <c:forEach items="${user.roles}" var="role">${role.name}; </c:forEach>
            </td>
                <td>


                </td>

            </tr>
        </c:forEach>
    </table>
    <a href="/">Главная</a>
</div>
</body>
</html>