<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
	<c:import url="page/head.jsp"></c:import>
</head>
<body>
	<c:import url="page/header.jsp"></c:import>
	<div class="index-container">
		<div class="index-header" id="content" tabindex="-1">
	      <div class="container">
	        <h1>组件</h1>
	        <p>无数可复用的组件，包括字体图标、下拉菜单、导航、警告框、弹出框等更多功能。</p>
	      </div>
	    </div>
		<h2>This is Spring MVC</h2>
		<form action="login" method="post">
			<input type="text" name="username" /> 
			<input type="password" name="pwd" /> 
			<input type="submit" value="login" />
		</form>
	</div>
	
	<div id="myLoginModal" class="modal fade" role="dialog" aria-labelledby="gridSystemModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="gridSystemModalLabel">Modal title</h4>
	      </div>
	      <div class="modal-body">
	        <div class="container-fluid">
	        </div>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
	        <button type="button" class="btn btn-primary">Submit</button>
	      </div>
	   </div><!-- /.modal-content -->
	  </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
</body>
</html>
