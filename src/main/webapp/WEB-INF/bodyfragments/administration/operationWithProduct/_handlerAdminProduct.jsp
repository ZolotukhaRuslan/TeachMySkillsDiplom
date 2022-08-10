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
    <a href="/addImageProduct" class="ButtonAdmin"><spring:message
            code="Add.Image"></spring:message></a>
</div>
<div>
            <a href="/showProduct" class="ButtonAdmin"><spring:message
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
</sec:authorize>
</body>
</html>
