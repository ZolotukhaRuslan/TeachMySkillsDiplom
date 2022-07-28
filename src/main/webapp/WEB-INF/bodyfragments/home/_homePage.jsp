<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
<style>
    .colortext {
        background-color: #07e8aa; /* Цвет фона */
        color: #000000; /* Цвет текста */
    }
</style>
    <form action="/medicine">
        <p><input type="submit" value="Medicine" class="colortext" name="medicine"></p>
    </form>

    <form action="/dietarySupplement">
        <p><input type="submit" value="Dietary Supplement" name="dietarySupplement"></p>
    </form>


    <form action="/medicalProducts">
        <p><input type="submit" value="Medical Products" name="medicalProducts"></p>
    </form>


    <form action="/cosmetics">
        <p><input type="submit" value="Cosmetics" name="cosmetics"></p>
    </form>


<sec:authorize access="isAuthenticated()">
    <sec:authorize access="hasAuthority('ADMIN_ROLE')">
        <form action="/admins">
            <p><input type="submit" value="ADMIN" name="admin"></p>
        </form>
    </sec:authorize>
</sec:authorize>


</div>