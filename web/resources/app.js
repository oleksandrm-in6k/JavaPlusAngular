var myApp = angular.module('myApp', []);


myApp.controller('firstCtrl', function ($scope, $http) {
    $scope.arr = [];


    $scope.addNote = function (note) {
        $http
            .post('/api/', {name: note.name, body: note.body})
            .then(function(response){
                update();
            });
    };

    var update = function() {
        $http
            .get('/api/')
            .then(function (response) {
                $scope.arr = response.data;
            });
    };
    
    update();


})