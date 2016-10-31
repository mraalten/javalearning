hardwinBankApp.factory('HardWinBankService', ['$http', '$rootScope', '$timeout', '$q', function($http, $rootScope, $timeout, $q) {
    var baseUrl                = 'hardwinbank/';
    var zoekenRekeningenUrl    = "zoekenRekeningen";
    var page = 'PRODUKTGROEPEN';

    var service = {
        doGet: doGet,
        doPost: doPost,
        findRekeningen: findRekeningen
    };
    return service;

    function findRekeningen(rekeningNummer) {
        var deferred = $q.defer();

        var params =  {rekeningNummer: rekeningNummer};
        doGet(zoekenRekeningenUrl, params).then(
            function (responsedata) { // success
                items = responsedata.item;
                deferred.resolve();
            }, function () { // error
                alert('Fout bij zoeken van rekeningen');
                deferred.reject();
            }
        );
        return deferred.promise;
    }

    function doGet(requestUrl, params) {
        var deferred = $q.defer();
        $http({
            method: 'GET',
            url: baseUrl + requestUrl,
            params: params
        }).
            success(function (responsedata) {
                deferred.resolve(responsedata);
            }).
            error(function () {
                deferred.reject();
            });
        return deferred.promise;
    }

    function doPost(url, model) {
        var deferred = $q.defer();
        $http({
            method: 'POST',
            url: baseUrl + url,
            data: model
        })
            .success(function (responsedata) {
                deferred.resolve(responsedata);
            })
            .error(function () {
                deferred.reject();
            });
        return deferred.promise;
    }

}])
