<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<div id="maine">
    <c:forEach items="${allMedicalProducts}" var="medicalProduct">
        <c:forEach items="${medicalProduct.products}" var="product">
            <form>
                <img src="data:image/jpeg;base64,${product.imageProduct}"/>
                    ${product.productName}
                <p>  ${product.items.coast}byn
                <p><a href="/medicalProducts/${product.id}"><img src="/resources/icons/basket.png"></a></p>
            </form>
            </form>
        </c:forEach>
    </c:forEach>
</div>
</body>
</html>