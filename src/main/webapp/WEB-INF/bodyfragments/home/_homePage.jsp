<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>

</style>
<div>
    <a href="/allProduct" class="myButtonMenu">All products</a>
</div>
<div>
<a href="/medicine" class="myButtonMenu">Medicine</a>
</div>
<div>
<a href="/dietarySupplement" class="myButtonMenu">Dietary Supplement</a>
</div>
<div>
<a href="/medicalProducts" class="myButtonMenu">Medical Products</a>
</div>
<div>
<a href="/cosmetics" class="myButtonMenu">Cosmetics</a>
</div>
<sec:authorize access="isAuthenticated()">
    <sec:authorize access="hasAuthority('ADMIN_ROLE')">

            <a href="/admins" class="ButtonForAdmin">Admin Operation</a>

    </sec:authorize>
</sec:authorize>


</div>