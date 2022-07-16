<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<div style="padding: 5px;">
    <form action="/medicine">
        <p><input type="submit" value="Medicine" name="medicine"></p>
    </form>
</div>
<div style="padding: 5px;">
    <form action="/dietarySupplement">
        <p><input type="submit" value="Dietary Supplement" name="dietarySupplement"></p>
    </form>
</div>
<div style="padding: 5px;">
    <form action="/medicalProducts">
        <p><input type="submit" value="Medical Products" name="medicalProducts"></p>
    </form>
</div>
<div style="padding: 5px;">
    <form action="/cosmetics">
        <p><input type="submit" value="Cosmetics" name="cosmetics"></p>
    </form>
</div>
<div>
<sec:authorize access="isAuthenticated()">
    <sec:authorize access="hasAuthority('ADMIN_ROLE')">
        <form action="/admins">
            <p><input type="submit" value="ADMIN" name="admin"></p>
        </form>
    </sec:authorize>
</sec:authorize>

</div>