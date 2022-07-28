<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
<table>
    <div>
        <a href="/" class="ButtonForAdmin">Home Page</a>
    </div>

    <div>
        <a href="/operationWithUsers" class="ButtonForAdmin">Operation with Users</a>
    </div>
    <div>
        <a href="/operationWithGroupProduct" class="ButtonForAdmin">Operation with Group</a>
    </div>
    <div>
        <a href="/operationWithProduct" class="ButtonForAdmin">Operation with Product</a>
    </div>
    <div>
        <a href="/operationWithItem" class="ButtonForAdmin">Operation with Item</a>
    </div>

    <div>
        <a href="/operationWithBasket" class="ButtonForAdmin">Operation with Basket</a>
    </div>


</table>
</body>
</html>

