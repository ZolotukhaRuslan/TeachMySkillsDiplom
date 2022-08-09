<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
<div id="maine">
    <c:forEach items="${allItem}" var="item">
        <form>
                ${item.product.productName}
            <p>  ${item.coast}byn
            <p><a href="/allProduct/${item.itemId}"><img src="/resources/icons/basket.png"></a></p>
        </form>

    </c:forEach>
</div>
</body>
</html>