var myApp = angular.module('bill', []);


myApp.controller('MainController', function ($scope, $http) {

    $http.get("/mvc/users").then(function (response) {
        $scope.users = response.data;
    });

    $http.get("/mvc/serviceTypes").then(function (response){
        $scope.serviceTypes = response.data;
    });

    $scope.deleteUser = function (user) {
        $http
            .delete("/mvc/users/delete/" + user.userId)
            .then(function (response) {
                updateUsers();
            });
    };

    var updateUsers = function () {
        $http
            .get("/mvc/users")
            .then(function (response) {
                $scope.users = response.data;
            });
    };

    $scope.addUser = function(userName) {
        $http
            .post("/mvc/users/add", userName)
            .then(function (response) {
                updateUsers();
            });
    };

    $scope.addServiceType = function(servicetypeName) {
        $http
            .post("/mvc/serviceTypes/add", servicetypeName)
            .then(function (response) {
                updateServiceTypes();
            })
    };

    var updateServiceTypes = function () {
        $http
            .get("/mvc/serviceTypes")
            .then(function (response) {
                $scope.serviceTypes = response.data;
            });
    };


    $scope.deleteServiceType = function (type) {
        $http
            .delete("/mvc/serviceTypes/delete/" + type.serviceTypeId)
            .then(function (response) {
                updateServiceTypes();
            });
    };

    $scope.showServiceTypes = function () {
        $scope.state = !$scope.state;

    };

    $scope.showAllServices = function() {
        $http
            .get("/mvc/services")
            .then(function (response) {
                $scope.services = response.data;
            });
    };

    var updateServices = function () {
        $http
            .get("/mvc/serviceTypes")
            .then(function (response) {
                $scope.serviceTypes = response.data;
            });
    };

    $scope.showServices = function () {
        $scope.serviceState = !$scope.serviceState;

    };









});