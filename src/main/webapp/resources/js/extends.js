var app = angular.module('RaymondSite', []);

app.controller('indexCtrl', function($scope, $http, $timeout){
	$scope.navItems = ['HOME','BLOGS','WORKSAMPLE','CONTACT'];
	$scope.currentTab = "HOME";
	$scope.blogs = null;
	$scope.onNavItemClick = function(item){
		$scope.currentTab = item;
		if(item == 'BLOGS' && $scope.blogs == null){
			$http({
				method: "get",
				url: "allBlogs"
			}).success(function(response){
				$scope.blogs = response;
			});
		}
	};
	$scope.onSaveBlog = function(){
		var blogData = CKEDITOR.instances.editor1.getData();
		$http({
			method: "post",
			url:"submitBlog",
			data: blogData
		}).success(function(response){
			$timeout(function(){
				$('#blogCloseIcon').trigger('click');
			}, 100);
		}).error(function(response){
			
		});
	};
});