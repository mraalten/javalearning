hardwinBankApp.controller('ZoekController', ['$scope', 'HardWinBankService', function($scope, HardWinBankService) {
    var self = this;
    var ophalenProduktenUrl            = 'ophalenprodukten';
    var rekeningen = {};

    $scope.zoekenRekening = function () {
        zoekenRekening($scope.rekeningNummer);
    };

    // private functions

    function zoekenRekening(rekeningNummer) {
        HardWinBankService.findRekeningen(rekeningNummer).then(
            function (responsedata) { // success
                $scope.rekeningen = responsedata.rekeningenViewModel.rekeningen;
            }, function () { // error
                alert('Fout bij het ophalen van de produkten voor een produktgroep');
            }
        );
    };

}]);
