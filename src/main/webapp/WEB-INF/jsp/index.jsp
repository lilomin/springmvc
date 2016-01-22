<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/angular.js"></script>
</head>
<body>
<h2>This is Spring MVC</h2>
<form action="login" method="post">
<input type="text" name="username"/>
<input type="password" name="pwd"/>
<input type="submit" value="login"/>
</form>
</body>
</html>
