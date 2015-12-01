var myApp = angular.module('myApp', []);


myApp.controller('firstCtrl', function ($scope, $http, notesFactory) {
    $scope.notes = [];

    $scope.addNote = function (note) {

        notesFactory.insertNote(note).then(function(){update();});

    };

    $scope.delete = function (note) {
        notesFactory.deleteNote(note.id).then(function(){update();});
    }

    var update = function() {
        notesFactory.getNotes()
            .then(function(response) {
                $scope.notes = response.data;
            });
    };

    update();


});