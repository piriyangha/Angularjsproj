/**
 * UserController for login 
 */
myApp.controller("UserController",function($scope,$http,$location,$rootScope,$cookieStore)
{
	$scope.user={loginname:'',password:'',role:'',username:'',email:'',phone:'',address:'',isonline:'',gender:''};
	$scope.userProfile={loginname:'',image:''};
	$rootScope.login=function()
	{
		console.log("Logging Function");
		
		$http.post('http://localhost:8083/SChatMiddleWare/login',$scope.user)
			.then(function(response)
			{
				console.log(response.status);
				$scope.user=response.data;
				$rootScope.currentUser=response.data;
				$cookieStore.put('userDetails',response.data);
				console.log($rootScope.currentUser.role);
					if($rootScope.currentUser.role=="ROLE_ADMIN")
					{
						console.log('AdminPage');
					}
					else
					{
						console.log('UserPage');
					}
				$location.path("/");
			});
	};
	/*$rootScope.uploadPic=function()
	{
		console.log('UploadPic Function');
		$http.post('http://localhost:8083/SChatMiddleWare/doUpload',$scope.userProfile)
		.then(function(response)
				{
					console.log(response.status);
					$scope.userProfile=response.data;
					$location.path("/");
				});
		
	};*/
	$rootScope.logout=function()
	{
		console.log('Logout Function');
		delete $rootScope.currentUser;
		$cookieStore.remove('userDetails');
		$location.path("/");
	}
	
});