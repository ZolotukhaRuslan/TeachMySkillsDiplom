<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>


<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
<div id="one">
    <form>
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

    <div>
        <sec:authorize access="hasAuthority('ADMIN_ROLE')">
            <a href="/admins" class="ButtonForAdmin">Admin Operation</a>
        </sec:authorize>
    </div>
    </form>
</div>

