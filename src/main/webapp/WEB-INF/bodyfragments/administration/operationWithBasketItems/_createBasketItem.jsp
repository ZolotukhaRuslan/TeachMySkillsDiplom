<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
<div>
    <form action="/createNewBasketItem">
        <p><input type="submit" value="createNewBasket">
    </form>
</div>
<table>
    New BasketItem
    <thead>
    <th>Basket ID</th>
    <th>BasketItem ID</th>
    </thead>
    <tr>
        <td>${Basket.id}</td>
        <td>${Basket.basketItem.id}</td>
    </tr>
</table>
</div>
</sec:authorize>
</body>
</html>
