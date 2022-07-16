<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
<body>
<table>

    <div>
        <form action="/operationWithUsers">
            <p><input type="submit" value="CRUD operation with users">
        </form>
    </div>
    <div>
        <form action="/operationWithGroupProduct">
            <p><input type="submit" value="CRUD operation with group product">
        </form>
    </div>
    <div>
        <form action="/operationWithProduct">
            <p><input type="submit" value="CRUD operation with product">
        </form>
    </div>
    <div>
        <form action="/operationWithItem">
            <p><input type="submit" value="CRUD operation with items">
        </form>
    </div>
    <div>
        <form action="/operationWithBasket">
            <p><input type="submit" value="CRUD operation with Basket">
        </form>
    </div>


</table>
</body>
</html>

