<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
<div id="one">
    <form>
    <div>
        <a href="/allProduct" class="myButtonMenu"><spring:message code = "All.products"/> </a>
    </div>

    <div>
        <a href="/medicine" class="myButtonMenu"> <spring:message code = "Medicine"></spring:message></a>
    </div>

    <div>
        <a href="/dietarySupplement" class="myButtonMenu"><spring:message code = "Dietary.Supplement"></spring:message></a>
    </div>

    <div>
        <a href="/medicalProducts" class="myButtonMenu"><spring:message code = "Medical.Products"></spring:message></a>
    </div>

    <div>
        <a href="/cosmetics" class="myButtonMenu"><spring:message code = "Cosmetics"></spring:message></a>
    </div>

    <div>
        <sec:authorize access="hasAuthority('ADMIN_ROLE')">
            <a href="/admins" class="ButtonForAdmin"><spring:message code = "Admin.Operation"></spring:message></a>
        </sec:authorize>
    </div>
    </form>
</div>

