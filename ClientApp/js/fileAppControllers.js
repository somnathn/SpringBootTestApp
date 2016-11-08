/* js/fileAppControllers.js */

function fileCtrl ($scope, $http) {
    $scope.partialDownloadLink = 'http://localhost:8080/download?filename=';
    $scope.filename = '';

	//Now load the data from server
    _refreshPageData();
			
   /* Private Methods */
                //HTTP GET- get all files
                function _refreshPageData() {
                    $http({
                        method : 'GET',
                        url : 'http://localhost:8080/items'
                    }).then(function successCallback(response) {
					  
                        $scope.files = response.data.files;
                    }, function errorCallback(response) {
                        console.log(response.statusText);
                    });
                }
				
    $scope.uploadFile = function() {
        $scope.processDropzone();
	
		
   };

    $scope.reset = function() {
        $scope.resetDropzone();

    };
	
	 $scope.reloadTable = function() {
	    _refreshPageData();
     };
}

angular.module('fileApp').controller('fileCtrl', fileCtrl);