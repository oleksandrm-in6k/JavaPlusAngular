angular.module('myApp')
    .factory('notesFactory', ['$http', function($http) {

        var urlBase = '/api/notes';
        var dataFactory = {};

        dataFactory.getNotes = function () {
            return $http.get(urlBase);
        };

        dataFactory.getNote = function (id) {
            return $http.get(urlBase + '/' + id);
        };

        dataFactory.insertNote = function (note) {
            return $http.post(urlBase, note);
        };

        dataFactory.updateNote = function (note) {
            return $http.put(urlBase + '/' + note.id, cust)
        };

        dataFactory.deleteNote = function (id) {
            return $http.delete(urlBase + '/' + id);
        };

        return dataFactory;
    }]);