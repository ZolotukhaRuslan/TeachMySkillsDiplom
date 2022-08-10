<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sec:authorize access="hasAuthority('ROLE_ADMIN')">
<div>
    <a href="/showAllItems" class="ButtonAdmin"><spring:message
            code="Show.All.Items"></spring:message></a>
</div>
<div>
    <a href="/showItem" class="ButtonAdmin"><spring:message
            code="Show.Item.By.Id"></spring:message></a>
    </form>
</div>
<div>
    <a href="/createItem" class="ButtonAdmin"><spring:message
            code="Create.item"></spring:message></a>
</div>
<div>
    <a href="/deleteItem" class="ButtonAdmin"><spring:message
            code="Delete.Item"></spring:message></a>
</div>
<div>
    <a href="/updateItem" class="ButtonAdmin"><spring:message
            code="Update.item"></spring:message></a>
</div>
</sec:authorize>
</body>
</html>
