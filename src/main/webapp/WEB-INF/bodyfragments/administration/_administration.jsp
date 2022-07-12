<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
<body>
<table>
</div>
<div style="padding: 5px;">
    <form action="/showAppGroups">
        <p><input type="submit" value="Show all Groups" name="showAppGroups"></p>
    </form>
</div>

    <c:forEach items="${allGroups}" var = "group">
     ID:   ${group.id}
       NAME Group: ${group.groupName}
<br>

    </c:forEach>

    <div style="padding: 5px;">
        <form action="/addNewGroup">
            <p><input type="submit" value="Add new group" name="addNewGroup"></p>
        </form>
    </div>

    <div style="padding: 5px;">
        <form action="/findGroupById">
            <p><input type="submit" value="findGroupById" name="findGroupById"></p>
        </form>
    </div>

    <div style="padding: 5px;">
        <form action="/findGroupByName">
            <p><input type="submit" value="findGroupByName" name="findGroupByName"></p>
        </form>
    </div>

    <div style="padding: 5px;">
        <form action="/editGroupById">
            <p><input type="submit" value="editGroupById" name="editGroupById"></p>
        </form>
    </div>


    <div style="padding: 5px;">
        <form action="/deleteGroupById">
            <p><input type="submit" value="deleteGroupById" name="deleteGroupById"></p>
        </form>
    </div>


    <div style="padding: 5px;">
        <form action="/editRole">
            <p><input type="submit" value="/editRole" name="/editRole"></p>
        </form>
    </div>






</table>
</body>
</html>

