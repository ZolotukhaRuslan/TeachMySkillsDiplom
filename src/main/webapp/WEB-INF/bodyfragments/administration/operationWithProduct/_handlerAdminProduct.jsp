<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <a href="/addImageProduct" class="ButtonAdmin">AddImage</a>
</div>
<div>
            <a href="/showProductById" class="ButtonAdmin"><spring:message
                    code="Show.product"></spring:message></a>
</div>
<div>
            <a href="/showAllProduct" class="ButtonAdmin"><spring:message
                    code="Show.all.product"></spring:message></a>
</div>
<div>
            <a href="/createProduct" class="ButtonAdmin"><spring:message
                    code="Create.product"></spring:message></a>
</div>
<div>
            <a href="/deleteProduct" class="ButtonAdmin"><spring:message
                    code="Delete.product"></spring:message></a>
</div>
<div>
            <a href="/updateProduct" class="ButtonAdmin"><spring:message
                    code="Update.product"></spring:message></a>
</div>
</body>
</html>
