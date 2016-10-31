hardwinBankApp.controller('ZoekController', ['$scope', '$rootScope', '$timeout', '$http', '$q', '$location', 'HardWinBankService', function($scope, $rootScope, $timeout, $http, $q, $location, HardWinBankService) {
    var self = this;
    var ophalenProduktenUrl            = 'ophalenprodukten';

    $scope.zoekenRekening = function (rekeningNummer) {
        zoekenRekening(rekeningNummer);
    };

    // private functions

    function zoekenRekening(rekeningNummer) {
        if (rekeningNummer) {
            HardWinBankService.findRekeningen(rekeningNummer).then(
                function (responsedata) { // success
                    $scope.rekeningen = responsedata.rekeningen;
                }, function () { // error
                    alert('Fout bij het ophalen van de produkten voor een produktgroep');
                }
            );
        }
    };

}]);
