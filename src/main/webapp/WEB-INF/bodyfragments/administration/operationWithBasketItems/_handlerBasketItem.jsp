<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
    <div>
        <a href="/updateBasketItem" class="ButtonAdmin"><spring:message
                code="Update.Basket.Item"></spring:message></a>
    </div>
    <div>
        <a href="/showBasketItem" class="ButtonAdmin"><spring:message
                code="Show.Basket.Item"></spring:message></a>
    </div>
    <div>
        <a href="/deleteBasket" class="ButtonAdmin"><spring:message
                code="Delete.Basket"></spring:message></a>
    </div>
    <div>
        <a href="/createBasketItem" class="ButtonAdmin"><spring:message
                code="Create.Basket.Item"></spring:message></a>
    </div>
</sec:authorize>
</body>
</html>
