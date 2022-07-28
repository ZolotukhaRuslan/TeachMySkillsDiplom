<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div style="background: #E0E0E0; height: 55px; padding: 5px;">
    <div style="float: left">
        <a href="/basket"><img src="/resources/icons/iconBasket.png"></a>
    </div>
    <sec:authorize access="!isAuthenticated()">
    <div style="float: right; padding: 10px; text-align: right;">
        <h4><a href="/login">Sign in</a></h4></div>
    <div style="float: right; padding: 10px; text-align: right;">
        <h4><a href="/registration">Registration</a></h4>
    </div>
    </sec:authorize>
      <sec:authorize access="isAuthenticated()">
    <div style="float: right; padding: 10px; text-align: right;">
        <h3>   ${pageContext.request.userPrincipal.name}</h3>
        <h4><a href="/logout">Log out</a></h4>
     </sec:authorize>
</div>