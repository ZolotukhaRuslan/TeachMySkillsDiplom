
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
    <form action="/updateProductById">
        <p ><strong><spring:message
                code="Enter.id.product"></spring:message></strong>
            <input maxlength="25" size="40" name="id"></p>
        <p><input type="submit" class="ButtonForAdmin" value="<spring:message
            code="Confirm"></spring:message>" name="start"></p>
    </form>
    <div>
        <table class="AdminTable">
            <thead>
            <th>Image</th>
            <th><spring:message
                    code="Id"></spring:message></th>
            <th><spring:message
                    code="Name.Product"></spring:message></th>
            <th><spring:message
                    code="Group.Id"></spring:message></th>
            <th><spring:message code="Group.Name"></spring:message></th>
            </thead>
            <tr>
                <td><img src="data:image/jpeg;base64,${product.imageProduct}"/></td>
                <td>${product.id}</td>
                <td>${product.productName}</td>
                <td>${product.groups.id}</td>
                <td>${product.groups.groupName}</td>
            </tr>
        </table>
    </div>
    <form>
        <p><a href="/updateProductName/${product.id}" class="ButtonForAdmin"><spring:message
                code="Update.Product.Name"></spring:message></a>
            <a href="/updateProductGroup/${product.id}" class="ButtonForAdmin"><spring:message
                    code="Update.Group"></spring:message></a>
    </form>
    </div>
</sec:authorize>
</body>
</html>
