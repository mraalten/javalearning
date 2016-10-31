var hardwinBankApp = angular.module('hardwinBankApp', []);

hardwinBankApp.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            //when('/ophalenprodukten/:produktGroepId', {
            //    templateUrl: 'templates/produkten-boodschappenlijst.html',
            //    controller: 'ProduktenController'
            //}).
            when('/zoeken', {
               templateUrl: '/templates/zoeken/zoeken.html',
               // controller: 'ProduktenController'
            }).
            when('/openRekening', {
                templateUrl: 'templates/nieuwerekening.html'
                //controller: 'ProduktGroepenController'
            }).
            otherwise({
                redirectTo: '/'
            });
    }]);

