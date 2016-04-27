var app = angular.module('RaymondSite', []);

app.controller('indexCtrl', function($scope, $http){
	$scope.navItems = ['HOME','BLOGS','WORKSAMPLE','CONTACT'];
	$scope.currentTab = "HOME";
	$scope.onNavItemClick = function(item){
		$scope.currentTab = item;
	};
	$scope.onSaveBlog = function(){
		var blogData = CKEDITOR.instances.editor1.getData();
		$http({
			method: "post",
			url:"submitBlog",
			data: blogData
		}).success(function(response){
			
		}).error(function(response){
			
		});
	};
});