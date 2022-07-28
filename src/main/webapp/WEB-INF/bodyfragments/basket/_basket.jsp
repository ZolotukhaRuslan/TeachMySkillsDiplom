<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>

</head>
<body>
<form>
    <table>
        <div>
            <table>
                <thead>
                <th>Name Product</th>
                <th>Amount</th>
                <th>Coast</th>
                <th>Price</th>
                <th>AllPrice</th>
                </thead>
                <c:forEach items="${allItemsInBasket}" var="item">
                <tr>
                    <td>${item.product.productName}</td>
                    <td>${item.quantityToOrder}</td>
                    <td>${item.coast}</td>
                    <td>${item.quantityToOrder * item.coast}</td>
                    <td><a href="/add/${item.itemId}"><img src="/resources/icons/iconPlus.png"></a> <a
                            href="/minus/${item.itemId}"><img src="/resources/icons/iconMinus.png"></a></td>

                    </c:forEach>
                    <td> ${AllPrice}</td>
                </tr>
            </table>
        </div>
        <div>
            <select type="select" path="gender" class="ButtonSubmit">
                <option>Adress one</option>
                <option>Adress two</option>
                <option>Adress three</option>
            </select>
        </div>

       <p> <a href="/submitBasket" class="ButtonSubmit">Submit</a>
    </table>
</form>
</body>
</html>