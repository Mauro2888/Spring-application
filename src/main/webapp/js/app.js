angular.module('app', ['ngRoute', 'controller'])

.config(function($routeProvider) {
	$routeProvider
	.when('/', {
		templateUrl: 'templates/home.html'
	})
	.when('/risorse', {
		templateUrl: 'templates/risorse.html',
		controller: 'ResCtrl'
	})
	.when('/progetti', {
		templateUrl: 'templates/progetti_test.html',
		controller: 'BlogCtrl'
	})
	.when('/progetto', {
		templateUrl: 'templates/progetto.html',
		controller: 'RPCtrl'
	})

	.otherwise({
		templateUrl: 'templates/404.html'
	})
})
