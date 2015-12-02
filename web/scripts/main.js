var myApp = angular.module('bill', []);


myApp.controller('MainController', function ($scope, $http) {

    $http.get("/mvc/users").then(function (response) {
        $scope.users = response.data;
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



});