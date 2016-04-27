<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="myLoginModal" class="modal fade" role="dialog" aria-labelledby="gridSystemModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="gridSystemModalLabel">登录</h4>
	      </div>
		  <form action="login" method="post">
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