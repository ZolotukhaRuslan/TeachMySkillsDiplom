<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<form>
    <h2><spring:message code="Thank.you.for.being.with.us"/></h2>
   <p><h2> <spring:message code="your.order.number"/>${numberOrder.id}
    <p><h2><spring:message code="pickup.address"/> ${numberOrder.address}
</form>
</body>
</html>