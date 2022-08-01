<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
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

</body>
</html>
