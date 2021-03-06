var myApp = angular.module('bill', []);


myApp.controller('MainController', function ($scope, $http) {

    $http.get("/mvc/users").then(function (response) {
        $scope.users = response.data;
    });

    $http.get("/mvc/services").then(function (response) {
        $scope.services = response.data;
    });

    $http.get("/mvc/serviceTypes").then(function (response) {
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

    $scope.addUser = function (userName) {
        $http
            .post("/mvc/users/add", userName)
            .then(function (response) {
                updateUsers();
            });
    };

    $scope.addServiceType = function (servicetypeName) {
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

    $scope.showServiceTypes = function (user) {

        //showUserBill(user.userId);
        $scope.state = !$scope.state;

    };

    $scope.showAllServices = function () {
        $http
            .get("/mvc/services")
            .then(function (response) {
                $scope.services = response.data;
            });
    };

    var updateServices = function (type) {

        $http
            .get("/mvc/services/byType/" + type.serviceTypeId)
            .then(function (response) {
                $scope.services1 = response.data;
            });
    };

    $scope.showServices = function (type) {
        updateServices(type);
        $scope.state1 = !$scope.state1;

    };

    var showUserBill = function (userId) {
        console.log(userId);
        $scope.showUserServicetypes = function (userId) {
            $http
                .get("/mvc/serviceTypes/" + userId)
                .then(function (response) {
                    $scope.servTypes = response.data;
                    console.log(servTypes);
                });
        }
    }

});