var myApp = angular.module('myApp', []);


myApp.controller('firstCtrl', function ($scope, $http) {
    $scope.arr = [];
    $http.get('/api/').then(function (response) {
        $scope.arr = response.data;
    });
    //$scope.arr = ['asdas',123];

})