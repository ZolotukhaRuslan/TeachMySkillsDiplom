<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>

</head>
<body>
<table>

    <div>
        <table>
            <thead>
            <th>Name Product</th>
            <th>Coast</th>
            <th>amountZakaz</th>
            </thead>
            <c:forEach items="${allItemsInBasket}" var="item">
                <tr>
                    <td>${item.product.productName}</td>
                   <td>${item.zakaz}</td>
                    <td>${item.coast} <a href="/add/${item.id}"><+></a><a href="/ad/${product.id}"><-></a></></td>
                </tr>
            </c:forEach>
        </table>
    </div>


</table>
</body>
</html>