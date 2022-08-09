<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</style>
<div>
    <a href="/" class="myButtonMenu"><spring:message code="Home.Page"/></a>
</div>
<div>
    <a href="/allProduct" class="myButtonMenu"><spring:message code="All.products"/></a>
</div>
<div>
    <a href="/medicine" class="myButtonMenu"> <spring:message code="Medicine"></spring:message></a>
</div>
<div>
    <a href="/dietarySupplement" class="myButtonMenu"><spring:message code="Dietary.Supplement"></spring:message></a>
</div>
<div>
    <a href="/medicalProducts" class="myButtonMenu"><spring:message code="Medical.Products"></spring:message></a>
</div>
<div>
    <a href="/cosmetics" class="myButtonMenu"><spring:message code="Cosmetics"></spring:message></a>
</div>
<sec:authorize access="isAuthenticated()">
    <sec:authorize access="hasAuthority('ADMIN_ROLE')">
        <a href="/admins" class="ButtonForAdmin"><spring:message code="Admin.Operation"></spring:message></a>
    </sec:authorize>
</sec:authorize>
</div>