<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
    <form method="post">
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
            <p><strong><spring:message
                    code="Enter.new.Name.product"></spring:message></strong>
                <input maxlength="25" size="40" name="name"></p>
            <p><input type="submit" value="<spring:message
            code="Confirm"></spring:message>" class="ButtonForAdmin"></p>
        </form>
    </form>
</sec:authorize>
</body>
</html>
