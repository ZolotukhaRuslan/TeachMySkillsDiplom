<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<body>
<table>
    <div>
        <a href="/showAllUsers" class="ButtonAdmin"><spring:message
                code="Show.all.users"></spring:message></a>
    </div>
    <div>
        <a href="/showUserById" class="ButtonAdmin"><spring:message
                code="Show.user.by.id"></spring:message></a>
    </div>
    <div>
        <a href="/showUserByLogin" class="ButtonAdmin"><spring:message
                code="Show.user.by.login"></spring:message></a>
    </div>
    <div>
        <a href="/showUsersByName" class="ButtonAdmin"><spring:message
                code="Show.users.by.name"></spring:message></a>
    </div>
    <div>
        <a href="/createNewUser" class="ButtonAdmin"><spring:message
                code="Create.new.User"></spring:message></a>
    </div>
    <div>
        <a href="/updateUserById" class="ButtonAdmin"><spring:message
                code="Update.user.by.id"></spring:message></a>
    </div>
    <div>
        <a href="/updateUserByLogin" class="ButtonAdmin"><spring:message
                code="Update.user.by.login"></spring:message></a>
    </div>
    <div>
        <a href="/deleteUserById" class="ButtonAdmin"><spring:message
                code="Delete.user.by.id"></spring:message></a>
    </div>
    <div>
        <a href="/deleteUserByLogin" class="ButtonAdmin"><spring:message
                code="Delete.user.by.login"></spring:message></a>
    </div>
</table>
</body>
</html>

