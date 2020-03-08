/* CREATED BY 
    Tornike Shelia
*/

angular.module('app', []).controller('MainController',
    function ($scope,$http) {

        $scope.url = 'http://localhost:8080/getPosts';

        $scope.getData = function () {
            $http.post($scope.url).then(function (response) {

                console.log("Shemovida");
                console.log(response);
                $scope.results = response.data;


            }).catch(function (error) {
                console.log(error);
            });
        };

        $scope.getData();

    });