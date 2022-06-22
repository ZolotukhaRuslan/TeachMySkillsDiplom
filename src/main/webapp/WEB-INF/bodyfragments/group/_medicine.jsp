<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>

</head>

<body>
<button>
<form action="/go">
    <p><input type="submit" value="goo" name="start"></p>
</form>
</button>
<button>
    <form action="/group">
        <p><input type="submit" value="group" name="start"></p>
    </form>
</button>
<button>
    <form action="/product">
        <p><input type="submit" value="product" name="start"></p>
    </form>
</button>
</body>
</html>