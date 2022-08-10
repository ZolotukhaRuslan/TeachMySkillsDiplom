<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
    <form action="/updateItemById">
        <p><strong><spring:message
                code="Enter.id.item"></spring:message></strong>
            <input maxlength="25" size="40" name="id"></p>
        <p><input type="submit" value="<spring:message
            code="Confirm"></spring:message>" class="ButtonForAdmin"></p>
    </form>
    <div>
        <table class="AdminTable">
            <thead>
            <th><spring:message
                    code="Id"></spring:message></th>
            <th><spring:message
                    code="Coast"></spring:message></th>
            <th><spring:message
                    code="Amount"></spring:message></th>
            <th><spring:message
                    code="Basket.Item.Id"></spring:message></th>
            <th><spring:message
                    code="Name.Product"></spring:message></th>
            <th><spring:message
                    code="Product.id"></spring:message></th>
            <th><spring:message
                    code="Group.Id"></spring:message></th>
            <th><spring:message
                    code="Group.Name"></spring:message></th>
            </thead>
            <tr>
                <td>${Item.itemId}</td>
                <td>${Item.coast}</td>
                <td>${Item.amountProduct}</td>
                <td>${Item.basketItems.id}</td>
                <td>${Item.product.productName}</td>
                <td>${Item.product.id}</td>
                <td>${Item.group.id}</td>
                <td>${Item.group.groupName}</td>
            </tr>
        </table>
    </div>
    <form>
        <p><a href="/updateCoast/${Item.itemId}" class="ButtonForAdmin"><spring:message
                code="Update.Coast"></spring:message></a>
            <a href="/updateAmount/${Item.itemId}" class="ButtonForAdmin"><spring:message
                    code="Update.Amount.Product"></spring:message></a>
        <p><a href="/updateBasketItemId/${Item.itemId}" class="ButtonForAdmin"><spring:message
            code="Update.BasketItem.Id"></spring:message></a>
            <a href="/updateProductId/${Item.itemId}" class="ButtonForAdmin"><spring:message
                    code="Update.Product.Id"></spring:message></a>
    </form>
    </div>
</sec:authorize>
</body>
</html>

