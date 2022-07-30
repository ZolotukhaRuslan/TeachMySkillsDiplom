<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<body>
<div>
            <a href="/showAllItems" class="ButtonAdmin"><spring:message
                    code="Show.All.Items"></spring:message></a>
</div>
<div>
            <a href="/showItemById" class="ButtonAdmin"><spring:message
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
</body>
</body>
</html>
