%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title></title>
</head>
<body>

<form action="/addImage" method="POST" enctype="multipart/form-data">
    Файл: <input type = "file" name = "test" />
    <input type = "submit" value = "Загрузить" />
</form>

</body>
</html>