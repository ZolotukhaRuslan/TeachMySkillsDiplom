
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>


<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
<div id = "one">
    <div >
    <form action="/medicine">
        <p><input type="submit" value="Medicine" name="medicine"></p>
    </form>
    </div>
    <div>
        <form action="/dietarySupplement">
            <p><input type="submit" value="Dietary Supplement" name="dietarySupplement"></p>
        </form>
    </div>
    <form action="/medicalProducts">
            <p><input type="submit" value="Medical Products" name="medicalProducts"></p>
        </form>
        <form action="/cosmetics">
            <p><input type="submit" value="Cosmetics" name="cosmetics"></p>
        </form>
    <div>
<sec:authorize access="hasAuthority('ROLE_ADMIN')" >
    <form action="/admins">
        <p><input type="submit" value="ADMIN" name="admin"></p>
    </form>
</sec:authorize>
    </div>
</div>

