<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html ng-app="RaymondSite" ng-controller="indexCtrl">
<head>
	<c:import url="page/head.jsp"></c:import>
</head>
<body class="index-body-content">
	<c:import url="page/header.jsp"></c:import>
	<div class="bg-slider-wrapper">
        <div class="flexslider bg-slider">
            <ul class="slides">
                <li class="slide slide-1"></li>
               <!--  <li class="slide slide-2"></li>
                <li class="slide slide-3"></li> -->
            </ul>
        </div>
    </div>
    <div data-ng-show="currentTab == 'HOME'">
	    <!-- index page content -->
	    <c:import url="page/content/index-content.jsp"/>
    </div>
    <div data-ng-show="currentTab == 'BLOGS'">
	    <!-- blogs page content -->
	    <c:import url="page/content/blogs-content.jsp"/>
    </div>
    <!-- login-modal -->
    <c:import url="page/modals/loginModal.jsp"/>
    <!-- blog-modal -->
    <c:import url="page/modals/blogModal.jsp"/>
</body>
</html>
