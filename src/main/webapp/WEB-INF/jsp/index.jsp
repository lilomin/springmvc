<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html ng-app="RaymondSite" ng-controller="indexCtrl">
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
	</div>
	
	<div id="myLoginModal" class="modal fade" role="dialog" aria-labelledby="gridSystemModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="gridSystemModalLabel">登录</h4>
	      </div>
		  <form action="login">
		     <div class="modal-body">
				<div class="container-fluid">
				  <div class="form-group">
				  	  <label for="inputUsername">用户名:</label>
				  	  <div class="input-group">
					    <input name="username" type="text" class="form-control" ng-model="myUsername" required
					     id="inputUsername" placeholder="请输入用户名">
					    <div class="input-group-addon"><span class="glyphicon glyphicon-user" aria-hidden="true"></span></div>
				  	  </div>
				  </div>
				  <div class="form-group">
					  <label for="inputPassword">密码:</label>
					  <div class="input-group">
						<input name="pwd" type="password" class="form-control" ng-model="myPwd" required
						 id="inputPassword" placeholder="请输入密码">
						<div class="input-group-addon"><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span></div>
					  </div>
				  </div>
				</div>
		      </div>
		      <div class="modal-footer">
		        <button type="submit" class="btn btn-block btn-primary">登录</button>
		      </div>
		  </form>
	   </div><!-- /.modal-content -->
	  </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
    
</body>
</html>
