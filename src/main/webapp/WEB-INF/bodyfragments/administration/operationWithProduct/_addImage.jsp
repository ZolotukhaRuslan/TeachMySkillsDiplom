<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title> Загрузить картинку </title>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        </head>
        <body>

        <form action="/addImage" method="POST" enctype="multipart/form-data">
        Файл: <input type = "file" name = "file" />
        <input type = "submit" value = "Загрузить" />
        </form>

        </body>
        </html>

</html>

