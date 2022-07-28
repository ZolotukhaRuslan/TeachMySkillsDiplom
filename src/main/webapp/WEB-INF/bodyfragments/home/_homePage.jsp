<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>

</style>

<a href="/medicine" class="myButtonMenu">Medicine</a>


<a href="/dietarySupplement" class="myButtonMenu">Dietary Supplement</a>



<a href="/medicalProducts" class="myButtonMenu">Medical Products</a>

<a href="/cosmetics" class="myButtonMenu">Cosmetics</a>

<sec:authorize access="isAuthenticated()">
    <sec:authorize access="hasAuthority('ADMIN_ROLE')">
        <form action="/admins">
            <p><input type="submit" value="ADMIN" name="admin"></p>
        </form>
    </sec:authorize>
</sec:authorize>


</div>