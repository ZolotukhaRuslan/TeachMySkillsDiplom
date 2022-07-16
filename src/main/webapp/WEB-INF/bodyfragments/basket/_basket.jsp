<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>

</head>
<body>
<table>

    <c:forEach items="${allItemsInBasket}" var="item">
        <form>
            <div>
                <p> Name: ${item.product.productName}
                <p> Coast: ${item.coast}
            </div>
        </form>
    </c:forEach>

</table>
</body>
</html>