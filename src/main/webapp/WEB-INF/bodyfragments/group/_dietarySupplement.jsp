<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>

</head>
<body>
<table>

    <c:forEach items="${allDietarySupplement}" var="dietarySupplement">

        <form action="/addBasket">
        <c:forEach items="${dietarySupplement.products}" var="product">${product.productName}
            <p><input type="submit" value="Add basket" name="addBasket"></p>
            </form>

        </c:forEach>
    </c:forEach>
</table>
</body>
</html>
