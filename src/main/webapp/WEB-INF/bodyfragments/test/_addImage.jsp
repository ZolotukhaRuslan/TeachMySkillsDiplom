%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title></title>
</head>
<body>
<h2>Image Form</h2>
<form:form method="POST" action="/addImage">
    Picture: <input type="file" name="image">
    <br />
    <input type="submit" value="Submit" />
</form:form>
</body>
</html>