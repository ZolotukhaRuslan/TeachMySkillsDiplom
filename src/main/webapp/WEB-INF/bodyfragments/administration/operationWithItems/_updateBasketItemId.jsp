<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
<form method="post">
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
        <p><strong><spring:message
                code="Enter.Basket.item.Id"></spring:message></strong>
            <input maxlength="25" size="40" name="basketItemId"></p>
        <p><input type="submit" value="<spring:message
            code="Confirm"></spring:message>" class="ButtonForAdmin"></p>
    </form>
</form>
</sec:authorize>
</body>
</html>
