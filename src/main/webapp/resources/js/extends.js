var app = angular.module('RaymondSite', []);

app.controller('indexCtrl', function($scope){
	var userName = $scope.myUsername;
	var pwd = $scope.myPwd;
	var flag = userName != undefined && pwd != undefined;
	if(userName != "" && pwd != "" && flag){
		alert("yes");
	}
});