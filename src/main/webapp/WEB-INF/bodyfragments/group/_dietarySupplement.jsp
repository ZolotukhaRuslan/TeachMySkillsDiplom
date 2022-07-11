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

<div id="maine">

    <c:forEach items="${allDietarySupplement}" var="dietarySupplement">
        <c:forEach items="${dietarySupplement.products}" var="product">
            <form>
            ${product.productName}
            ${product.id}
            <p><a href="/dietarySupplement/${product.id}">Add</a></p>
            </form>
        </c:forEach>
    </c:forEach>

</div>
</body>
</html>
