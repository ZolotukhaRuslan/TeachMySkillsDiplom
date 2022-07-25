<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25.07.2022
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--@elvariable id="productForm" type=""--%>
<form:form method="POST" modelAttribute="productForm">
    <div><form:input type="text" path="productName" placeholder="productName"></form:input>
    </div>
    <div>
    <form:input type="long" path="groups.id" placeholder="id"></form:input>
    </div>
    <button type="submit">ok</button>
</form:form>
</body>
</html>
