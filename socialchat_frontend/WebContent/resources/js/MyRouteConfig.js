/**
 * myApp to navigate between all pages (SPA)
 */
var myApp = angular.module("myApp", [ 'ngRoute', , 'ngCookies' ]);
myApp.config(function($routeProvider) {
	console.log('I am in routeProvider');
	$routeProvider.when("/", {
		templateUrl : "view/home.html"
	}).when("/login", {
		templateUrl : "view/login.html"
	}).when("/UpdateProfile", {
		templateUrl : "view/UpdateProfile.html"
	}).when("/register", {
		templateUrl : "view/register.html"
	}).when("/contactUs", {
		templateUrl : "view/ContactUs.html"
	}).when("/aboutUs", {
		templateUrl : "view/AboutUs.html"
	}).when("/blog", {
		templateUrl : "view/Blog.html"
	}).when("/updateBlog", {
		templateUrl : "view/updateBlog.html"
	});
});

myApp.run(function($rootScope, $cookieStore) {
	console.log('I am in run function');
	console.log($rootScope.currentUser);

	if ($rootScope.currentUser == undefined) {
		$rootScope.currentUser = $cookieStore.get('user');
	} else {
		console.log($rootScope.currentUser.username);
		console.log($rootScope.currentUser.role);
	}
});