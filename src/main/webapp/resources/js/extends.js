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
		var blogTitle = $scope.blogTitle;
		var blogContent = CKEDITOR.instances.editor1.getData();
		var date = new Date();
		var blogData = {"content": blogContent, "title": blogTitle, "submitDate": date};
		$http({
			method: "post",
			url:"submitBlog",
			data: blogData
		}).success(function(response){
			$scope.blogs = null;
			$scope.onNavItemClick('BLOGS');
			$timeout(function(){
				$('#blogCloseIcon').trigger('click');
			}, 100);
		}).error(function(response){
			
		});
	};
});