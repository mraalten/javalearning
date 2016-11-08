hardwinBankApp.controller('ZoekController', ['$scope', '$rootScope', '$timeout', '$http', '$q', '$location', 'HardWinBankService', function($scope, $rootScope, $timeout, $http, $q, $location, HardWinBankService) {
    var self = this;
    var ophalenProduktenUrl            = 'ophalenprodukten';

    $scope.zoekenRekening = function () {
        zoekenRekening($scope.rekeningNummer);
    };

    // private functions

    function zoekenRekening(rekeningNummer) {
        HardWinBankService.findRekeningen(rekeningNummer).then(
            function (responsedata) { // success
                $scope.rekeningen = responsedata.rekeningen;
            }, function () { // error
                alert('Fout bij het ophalen van de produkten voor een produktgroep');
            }
        );
    };

}]);
