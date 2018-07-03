(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error('Cannot find module "' + req + '".');
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "html {\n    position: relative;\n    min-height: 100%;\n}\n\nbody {\n  /* Margin bottom by footer height */\n  margin-bottom: 30px;\n}\n\n.app-container {\n  /* padding-bottom: 40px; */\n  margin-bottom: 30px;\n}\n\n.logged-content {\n  padding-top: 1%;\n  padding-left: 1%;\n  margin-right: 0 !important;\n}"

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<app-prime-notifications></app-prime-notifications>\n<div class=\"app-container\">\n    <span *ngIf=\"!(isLoggedIn$ | async)\">\n        <app-unlogged-navbar></app-unlogged-navbar>\n        <router-outlet></router-outlet>\n    </span>\n\n\n    <span *ngIf=\"isLoggedIn$ | async as isLoggedIn\">\n        <app-logged-navbar></app-logged-navbar>\n        <div class=\"row logged-content\">\n            <router-outlet></router-outlet>\n            <app-lateral-menu></app-lateral-menu>\n        </div>\n    </span>\n</div>\n\n<app-info-footer></app-info-footer>"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _auth_auth_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ./auth/auth.service */ "./src/app/auth/auth.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var AppComponent = /** @class */ (function () {
    function AppComponent(authService) {
        this.authService = authService;
    }
    AppComponent.prototype.ngOnInit = function () {
        this.isLoggedIn$ = this.authService.isLoggedIn;
    };
    AppComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        }),
        __metadata("design:paramtypes", [_auth_auth_service__WEBPACK_IMPORTED_MODULE_1__["AuthService"]])
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @ng-bootstrap/ng-bootstrap */ "./node_modules/@ng-bootstrap/ng-bootstrap/index.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var angular_font_awesome__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! angular-font-awesome */ "./node_modules/angular-font-awesome/dist/angular-font-awesome.es5.js");
/* harmony import */ var _angular_http__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! @angular/http */ "./node_modules/@angular/http/fesm5/http.js");
/* harmony import */ var _angular_platform_browser_animations__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! @angular/platform-browser/animations */ "./node_modules/@angular/platform-browser/fesm5/animations.js");
/* harmony import */ var primeng_growl__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! primeng/growl */ "./node_modules/primeng/growl.js");
/* harmony import */ var primeng_growl__WEBPACK_IMPORTED_MODULE_7___default = /*#__PURE__*/__webpack_require__.n(primeng_growl__WEBPACK_IMPORTED_MODULE_7__);
/* harmony import */ var primeng_autocomplete__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! primeng/autocomplete */ "./node_modules/primeng/autocomplete.js");
/* harmony import */ var primeng_autocomplete__WEBPACK_IMPORTED_MODULE_8___default = /*#__PURE__*/__webpack_require__.n(primeng_autocomplete__WEBPACK_IMPORTED_MODULE_8__);
/* harmony import */ var primeng_paginator__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! primeng/paginator */ "./node_modules/primeng/paginator.js");
/* harmony import */ var primeng_paginator__WEBPACK_IMPORTED_MODULE_9___default = /*#__PURE__*/__webpack_require__.n(primeng_paginator__WEBPACK_IMPORTED_MODULE_9__);
/* harmony import */ var primeng_orderlist__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! primeng/orderlist */ "./node_modules/primeng/orderlist.js");
/* harmony import */ var primeng_orderlist__WEBPACK_IMPORTED_MODULE_10___default = /*#__PURE__*/__webpack_require__.n(primeng_orderlist__WEBPACK_IMPORTED_MODULE_10__);
/* harmony import */ var primeng_overlaypanel__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! primeng/overlaypanel */ "./node_modules/primeng/overlaypanel.js");
/* harmony import */ var primeng_overlaypanel__WEBPACK_IMPORTED_MODULE_11___default = /*#__PURE__*/__webpack_require__.n(primeng_overlaypanel__WEBPACK_IMPORTED_MODULE_11__);
/* harmony import */ var primeng_tree__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! primeng/tree */ "./node_modules/primeng/tree.js");
/* harmony import */ var primeng_tree__WEBPACK_IMPORTED_MODULE_12___default = /*#__PURE__*/__webpack_require__.n(primeng_tree__WEBPACK_IMPORTED_MODULE_12__);
/* harmony import */ var primeng_dataview__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! primeng/dataview */ "./node_modules/primeng/dataview.js");
/* harmony import */ var primeng_dataview__WEBPACK_IMPORTED_MODULE_13___default = /*#__PURE__*/__webpack_require__.n(primeng_dataview__WEBPACK_IMPORTED_MODULE_13__);
/* harmony import */ var primeng_dialog__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! primeng/dialog */ "./node_modules/primeng/dialog.js");
/* harmony import */ var primeng_dialog__WEBPACK_IMPORTED_MODULE_14___default = /*#__PURE__*/__webpack_require__.n(primeng_dialog__WEBPACK_IMPORTED_MODULE_14__);
/* harmony import */ var primeng_table__WEBPACK_IMPORTED_MODULE_15__ = __webpack_require__(/*! primeng/table */ "./node_modules/primeng/table.js");
/* harmony import */ var primeng_table__WEBPACK_IMPORTED_MODULE_15___default = /*#__PURE__*/__webpack_require__.n(primeng_table__WEBPACK_IMPORTED_MODULE_15__);
/* harmony import */ var primeng_confirmdialog__WEBPACK_IMPORTED_MODULE_16__ = __webpack_require__(/*! primeng/confirmdialog */ "./node_modules/primeng/confirmdialog.js");
/* harmony import */ var primeng_confirmdialog__WEBPACK_IMPORTED_MODULE_16___default = /*#__PURE__*/__webpack_require__.n(primeng_confirmdialog__WEBPACK_IMPORTED_MODULE_16__);
/* harmony import */ var primeng_api__WEBPACK_IMPORTED_MODULE_17__ = __webpack_require__(/*! primeng/api */ "./node_modules/primeng/api.js");
/* harmony import */ var primeng_api__WEBPACK_IMPORTED_MODULE_17___default = /*#__PURE__*/__webpack_require__.n(primeng_api__WEBPACK_IMPORTED_MODULE_17__);
/* harmony import */ var primeng_tabview__WEBPACK_IMPORTED_MODULE_18__ = __webpack_require__(/*! primeng/tabview */ "./node_modules/primeng/tabview.js");
/* harmony import */ var primeng_tabview__WEBPACK_IMPORTED_MODULE_18___default = /*#__PURE__*/__webpack_require__.n(primeng_tabview__WEBPACK_IMPORTED_MODULE_18__);
/* harmony import */ var _common_routing_module_app_routing_module__WEBPACK_IMPORTED_MODULE_19__ = __webpack_require__(/*! ./common/routing-module/app-routing.module */ "./src/app/common/routing-module/app-routing.module.ts");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_20__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _unlogged_unlogged_navbar_unlogged_navbar_component__WEBPACK_IMPORTED_MODULE_21__ = __webpack_require__(/*! ./unlogged/unlogged-navbar/unlogged-navbar.component */ "./src/app/unlogged/unlogged-navbar/unlogged-navbar.component.ts");
/* harmony import */ var _common_globals__WEBPACK_IMPORTED_MODULE_22__ = __webpack_require__(/*! ./common/globals */ "./src/app/common/globals.ts");
/* harmony import */ var _common_info_footer_info_footer_component__WEBPACK_IMPORTED_MODULE_23__ = __webpack_require__(/*! ./common/info-footer/info-footer.component */ "./src/app/common/info-footer/info-footer.component.ts");
/* harmony import */ var _unlogged_welcome_welcome_component__WEBPACK_IMPORTED_MODULE_24__ = __webpack_require__(/*! ./unlogged/welcome/welcome.component */ "./src/app/unlogged/welcome/welcome.component.ts");
/* harmony import */ var _unlogged_sign_up_sign_up_component__WEBPACK_IMPORTED_MODULE_25__ = __webpack_require__(/*! ./unlogged/sign-up/sign-up.component */ "./src/app/unlogged/sign-up/sign-up.component.ts");
/* harmony import */ var _logged_sports_sports_component__WEBPACK_IMPORTED_MODULE_26__ = __webpack_require__(/*! ./logged/sports/sports.component */ "./src/app/logged/sports/sports.component.ts");
/* harmony import */ var _logged_logged_navbar_logged_navbar_component__WEBPACK_IMPORTED_MODULE_27__ = __webpack_require__(/*! ./logged/logged-navbar/logged-navbar.component */ "./src/app/logged/logged-navbar/logged-navbar.component.ts");
/* harmony import */ var _logged_modalities_modalities_component__WEBPACK_IMPORTED_MODULE_28__ = __webpack_require__(/*! ./logged/modalities/modalities.component */ "./src/app/logged/modalities/modalities.component.ts");
/* harmony import */ var _logged_modality_filters_modality_filters_component__WEBPACK_IMPORTED_MODULE_29__ = __webpack_require__(/*! ./logged/modality-filters/modality-filters.component */ "./src/app/logged/modality-filters/modality-filters.component.ts");
/* harmony import */ var _logged_lateral_menu_lateral_menu_component__WEBPACK_IMPORTED_MODULE_30__ = __webpack_require__(/*! ./logged/lateral-menu/lateral-menu.component */ "./src/app/logged/lateral-menu/lateral-menu.component.ts");
/* harmony import */ var _logged_lateral_menu_settings_settings_component__WEBPACK_IMPORTED_MODULE_31__ = __webpack_require__(/*! ./logged/lateral-menu/settings/settings.component */ "./src/app/logged/lateral-menu/settings/settings.component.ts");
/* harmony import */ var _logged_lateral_menu_subscriptions_subscriptions_component__WEBPACK_IMPORTED_MODULE_32__ = __webpack_require__(/*! ./logged/lateral-menu/subscriptions/subscriptions.component */ "./src/app/logged/lateral-menu/subscriptions/subscriptions.component.ts");
/* harmony import */ var _common_notifications_prime_notifications_prime_notifications_component__WEBPACK_IMPORTED_MODULE_33__ = __webpack_require__(/*! ./common/notifications/prime-notifications/prime-notifications.component */ "./src/app/common/notifications/prime-notifications/prime-notifications.component.ts");
/* harmony import */ var _logged_lateral_menu_notifications_notifications_component__WEBPACK_IMPORTED_MODULE_34__ = __webpack_require__(/*! ./logged/lateral-menu/notifications/notifications.component */ "./src/app/logged/lateral-menu/notifications/notifications.component.ts");
/* harmony import */ var _logged_lateral_menu_subscriptions_subcription_subcription_component__WEBPACK_IMPORTED_MODULE_35__ = __webpack_require__(/*! ./logged/lateral-menu/subscriptions/subcription/subcription.component */ "./src/app/logged/lateral-menu/subscriptions/subcription/subcription.component.ts");
/* harmony import */ var _logged_lateral_menu_notifications_notification_notification_component__WEBPACK_IMPORTED_MODULE_36__ = __webpack_require__(/*! ./logged/lateral-menu/notifications/notification/notification.component */ "./src/app/logged/lateral-menu/notifications/notification/notification.component.ts");
/* harmony import */ var _logged_teams_teams_component__WEBPACK_IMPORTED_MODULE_37__ = __webpack_require__(/*! ./logged/teams/teams.component */ "./src/app/logged/teams/teams.component.ts");
/* harmony import */ var _logged_athletes_athletes_component__WEBPACK_IMPORTED_MODULE_38__ = __webpack_require__(/*! ./logged/athletes/athletes.component */ "./src/app/logged/athletes/athletes.component.ts");
/* harmony import */ var _common_array_filter_array_filter_component__WEBPACK_IMPORTED_MODULE_39__ = __webpack_require__(/*! ./common/array-filter/array-filter.component */ "./src/app/common/array-filter/array-filter.component.ts");
/* harmony import */ var _common_pusher_service__WEBPACK_IMPORTED_MODULE_40__ = __webpack_require__(/*! ./common/pusher.service */ "./src/app/common/pusher.service.ts");
/* harmony import */ var _common_notifications_notifications_service__WEBPACK_IMPORTED_MODULE_41__ = __webpack_require__(/*! ./common/notifications/notifications.service */ "./src/app/common/notifications/notifications.service.ts");
/* harmony import */ var _common_array_paginator_array_paginator_component__WEBPACK_IMPORTED_MODULE_42__ = __webpack_require__(/*! ./common/array-paginator/array-paginator.component */ "./src/app/common/array-paginator/array-paginator.component.ts");
/* harmony import */ var _logged_competitions_competitions_component__WEBPACK_IMPORTED_MODULE_43__ = __webpack_require__(/*! ./logged/competitions/competitions.component */ "./src/app/logged/competitions/competitions.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};












































var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_20__["AppComponent"],
                _unlogged_unlogged_navbar_unlogged_navbar_component__WEBPACK_IMPORTED_MODULE_21__["UnloggedNavbarComponent"],
                _common_info_footer_info_footer_component__WEBPACK_IMPORTED_MODULE_23__["InfoFooterComponent"],
                _unlogged_welcome_welcome_component__WEBPACK_IMPORTED_MODULE_24__["WelcomeComponent"],
                _unlogged_sign_up_sign_up_component__WEBPACK_IMPORTED_MODULE_25__["SignUpComponent"],
                _logged_sports_sports_component__WEBPACK_IMPORTED_MODULE_26__["SportsComponent"],
                _logged_logged_navbar_logged_navbar_component__WEBPACK_IMPORTED_MODULE_27__["LoggedNavbarComponent"],
                _logged_modalities_modalities_component__WEBPACK_IMPORTED_MODULE_28__["ModalitiesComponent"],
                _logged_modality_filters_modality_filters_component__WEBPACK_IMPORTED_MODULE_29__["ModalityFiltersComponent"],
                _logged_lateral_menu_lateral_menu_component__WEBPACK_IMPORTED_MODULE_30__["LateralMenuComponent"],
                _logged_lateral_menu_settings_settings_component__WEBPACK_IMPORTED_MODULE_31__["SettingsComponent"],
                _logged_lateral_menu_subscriptions_subscriptions_component__WEBPACK_IMPORTED_MODULE_32__["SubscriptionsComponent"],
                _logged_lateral_menu_notifications_notifications_component__WEBPACK_IMPORTED_MODULE_34__["NotificationsComponent"],
                _common_notifications_prime_notifications_prime_notifications_component__WEBPACK_IMPORTED_MODULE_33__["PrimeNotificationsComponent"],
                _logged_lateral_menu_subscriptions_subcription_subcription_component__WEBPACK_IMPORTED_MODULE_35__["SubcriptionComponent"],
                _logged_lateral_menu_notifications_notification_notification_component__WEBPACK_IMPORTED_MODULE_36__["NotificationComponent"],
                _logged_teams_teams_component__WEBPACK_IMPORTED_MODULE_37__["TeamsComponent"],
                _logged_athletes_athletes_component__WEBPACK_IMPORTED_MODULE_38__["AthletesComponent"],
                _common_array_filter_array_filter_component__WEBPACK_IMPORTED_MODULE_39__["ArrayFilterComponent"],
                _common_array_paginator_array_paginator_component__WEBPACK_IMPORTED_MODULE_42__["ArrayPaginatorComponent"],
                _logged_competitions_competitions_component__WEBPACK_IMPORTED_MODULE_43__["CompetitionsComponent"],
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"],
                _ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_2__["NgbModule"].forRoot(),
                _common_routing_module_app_routing_module__WEBPACK_IMPORTED_MODULE_19__["AppRoutingModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_3__["ReactiveFormsModule"],
                angular_font_awesome__WEBPACK_IMPORTED_MODULE_4__["AngularFontAwesomeModule"],
                _angular_http__WEBPACK_IMPORTED_MODULE_5__["HttpModule"],
                _angular_platform_browser_animations__WEBPACK_IMPORTED_MODULE_6__["BrowserAnimationsModule"],
                primeng_growl__WEBPACK_IMPORTED_MODULE_7__["GrowlModule"],
                primeng_autocomplete__WEBPACK_IMPORTED_MODULE_8__["AutoCompleteModule"],
                primeng_paginator__WEBPACK_IMPORTED_MODULE_9__["PaginatorModule"],
                primeng_orderlist__WEBPACK_IMPORTED_MODULE_10__["OrderListModule"],
                primeng_overlaypanel__WEBPACK_IMPORTED_MODULE_11__["OverlayPanelModule"],
                primeng_tree__WEBPACK_IMPORTED_MODULE_12__["TreeModule"],
                primeng_dataview__WEBPACK_IMPORTED_MODULE_13__["DataViewModule"],
                primeng_dialog__WEBPACK_IMPORTED_MODULE_14__["DialogModule"],
                primeng_table__WEBPACK_IMPORTED_MODULE_15__["TableModule"],
                primeng_confirmdialog__WEBPACK_IMPORTED_MODULE_16__["ConfirmDialogModule"],
                primeng_tabview__WEBPACK_IMPORTED_MODULE_18__["TabViewModule"],
            ],
            providers: [
                _common_globals__WEBPACK_IMPORTED_MODULE_22__["Globals"],
                _common_notifications_notifications_service__WEBPACK_IMPORTED_MODULE_41__["NotificationsService"],
                _common_pusher_service__WEBPACK_IMPORTED_MODULE_40__["PusherService"],
                primeng_api__WEBPACK_IMPORTED_MODULE_17__["ConfirmationService"],
            ],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_20__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/auth/auth.guard.ts":
/*!************************************!*\
  !*** ./src/app/auth/auth.guard.ts ***!
  \************************************/
/*! exports provided: AuthGuard */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AuthGuard", function() { return AuthGuard; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var rxjs_operators__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! rxjs/operators */ "./node_modules/rxjs/_esm5/operators/index.js");
/* harmony import */ var _auth_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./auth.service */ "./src/app/auth/auth.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var AuthGuard = /** @class */ (function () {
    function AuthGuard(authService, router) {
        this.authService = authService;
        this.router = router;
    }
    AuthGuard.prototype.canActivate = function (next, state) {
        var _this = this;
        return this.authService.isLoggedIn
            .pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_2__["take"])(1), Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_2__["map"])(function (isLoggedIn) {
            if (!isLoggedIn) {
                _this.router.navigate(['/welcome']);
                return false;
            }
            return true;
        }));
    };
    AuthGuard = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [_auth_service__WEBPACK_IMPORTED_MODULE_3__["AuthService"],
            _angular_router__WEBPACK_IMPORTED_MODULE_1__["Router"]])
    ], AuthGuard);
    return AuthGuard;
}());



/***/ }),

/***/ "./src/app/auth/auth.service.ts":
/*!**************************************!*\
  !*** ./src/app/auth/auth.service.ts ***!
  \**************************************/
/*! exports provided: AuthService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AuthService", function() { return AuthService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
/* harmony import */ var _data_api_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../data/api.service */ "./src/app/data/api.service.ts");
/* harmony import */ var _common_notifications_notifications_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../common/notifications/notifications.service */ "./src/app/common/notifications/notifications.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var AuthService = /** @class */ (function () {
    function AuthService(router, apiService, notificationsService) {
        this.router = router;
        this.apiService = apiService;
        this.notificationsService = notificationsService;
        this.loggedIn = new rxjs__WEBPACK_IMPORTED_MODULE_2__["BehaviorSubject"](false);
        // TODO: remove
        this.user = {
            ID: 1,
            email: 'email@gmail.com',
            name: 'Miguel Calafate',
            isManager: true,
            paymentManager: {
                currentAmount: 0
            }
        };
    }
    Object.defineProperty(AuthService.prototype, "isLoggedIn", {
        get: function () {
            return this.loggedIn.asObservable();
        },
        enumerable: true,
        configurable: true
    });
    AuthService.prototype.login = function (user) {
        var _this = this;
        var user_request = {
            'email': user.Email,
            'password': user.Password
        };
        this.apiService.setEntity('users/login');
        this.apiService.postRequest(user_request).subscribe(function (data) {
            if (data !== undefined) {
                _this.loggedIn.next(true);
                _this.router.navigate(['/sports']);
                _this.user = data;
            }
            else {
                _this.notificationsService.notify('error', 'Invalid user', 'The email/password pair doesn\'t exists.');
            }
        });
    };
    AuthService.prototype.logout = function () {
        this.loggedIn.next(false);
        this.router.navigate(['/welcome']);
    };
    AuthService.prototype.updateBalance = function () {
        var _this = this;
        this.apiService.setEntity("users/" + this.user.paymentManager.ID);
        this.apiService.getAll().subscribe(function (data) {
            _this.user.paymentManager.currentAmount = data.paymentManager.currentAmount;
        });
    };
    AuthService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_1__["Router"], _data_api_service__WEBPACK_IMPORTED_MODULE_3__["ApiService"], _common_notifications_notifications_service__WEBPACK_IMPORTED_MODULE_4__["NotificationsService"]])
    ], AuthService);
    return AuthService;
}());



/***/ }),

/***/ "./src/app/common/array-filter/array-filter.component.css":
/*!****************************************************************!*\
  !*** ./src/app/common/array-filter/array-filter.component.css ***!
  \****************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "div.options-container {\n    background-color: #F8F9FA;\n    border: 1px solid lightgray;\n    padding: 1%;\n}\n\n.options-container .form-inline .w-padding {\n    margin-right: 1%;\n    margin-left: 3%;\n}\n\n.w-r-padding {\n    margin-left: 1%;\n}\n\n.options-container select {\n    width: 200px;\n}"

/***/ }),

/***/ "./src/app/common/array-filter/array-filter.component.html":
/*!*****************************************************************!*\
  !*** ./src/app/common/array-filter/array-filter.component.html ***!
  \*****************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"options-container\">\n    <form class=\"form-inline\">\n        <label class=\"col-form-label col-form-label-sm w-padding\">Search</label>\n        <p-autoComplete placeholder=\"name\" [field]=\"dataFilter\" [suggestions]=\"results\" (onClear)=\"search($event)\" (onSelect)=\"search($event)\" (completeMethod)=\"search($event)\"></p-autoComplete>\n\n        <label class=\"col-form-label col-form-label-sm w-padding\" *ngIf=\"ordersBy != null\">Order by</label>\n        <select class=\"form-control\" *ngIf=\"ordersBy != null\" (change)=\"orderSelected($event.target.value)\">\n            <option selected disabled>Choose...</option>\n            <option value=\"{{ item.value }}\" *ngFor=\"let item of ordersBy\">{{ item.name }}</option>\n        </select>\n        <input class=\"w-r-padding\" type=\"checkbox\" [checked]=\"isAscending\" (change)=\"changeOrder()\">\n        <label class=\"form-check-label w-r-padding\">Ascending\n            <fa name=\"chevron-up\" class=\"w-r-padding\"></fa>\n        </label>\n    </form>\n</div>"

/***/ }),

/***/ "./src/app/common/array-filter/array-filter.component.ts":
/*!***************************************************************!*\
  !*** ./src/app/common/array-filter/array-filter.component.ts ***!
  \***************************************************************/
/*! exports provided: ArrayFilterComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ArrayFilterComponent", function() { return ArrayFilterComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var ArrayFilterComponent = /** @class */ (function () {
    function ArrayFilterComponent() {
        this.dataFiltering = new _angular_core__WEBPACK_IMPORTED_MODULE_0__["EventEmitter"]();
        this.isAscending = true;
    }
    Object.defineProperty(ArrayFilterComponent.prototype, "data", {
        set: function (data) {
            this.results = data;
            this._data = data;
        },
        enumerable: true,
        configurable: true
    });
    ArrayFilterComponent.prototype.ngOnInit = function () {
    };
    ArrayFilterComponent.prototype.search = function (event) {
        var _this = this;
        var query = event.query || event[this.dataFilter];
        this.results = this._data.filter(function (d) { return query === undefined || d[_this.dataFilter].toLowerCase().indexOf(query.toLowerCase()) == 0; });
        this.dataFiltering.emit(this.results);
    };
    ArrayFilterComponent.prototype.orderSelected = function (value) {
        this.results = this.results.sort(function (a, b) { return a[value] > b[value] ? 1 : 0; });
        if (!this.isAscending) {
            this.results = this.results.reverse();
        }
        this.dataFiltering.emit(this.results);
    };
    ArrayFilterComponent.prototype.changeOrder = function () {
        this.isAscending = !this.isAscending;
        this.results = this.results.reverse();
        this.dataFiltering.emit(this.results);
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", Array)
    ], ArrayFilterComponent.prototype, "ordersBy", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", String)
    ], ArrayFilterComponent.prototype, "dataFilter", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Output"])(),
        __metadata("design:type", Object)
    ], ArrayFilterComponent.prototype, "dataFiltering", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", Array),
        __metadata("design:paramtypes", [Array])
    ], ArrayFilterComponent.prototype, "data", null);
    ArrayFilterComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-array-filter',
            template: __webpack_require__(/*! ./array-filter.component.html */ "./src/app/common/array-filter/array-filter.component.html"),
            styles: [__webpack_require__(/*! ./array-filter.component.css */ "./src/app/common/array-filter/array-filter.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], ArrayFilterComponent);
    return ArrayFilterComponent;
}());



/***/ }),

/***/ "./src/app/common/array-paginator/array-paginator.component.css":
/*!**********************************************************************!*\
  !*** ./src/app/common/array-paginator/array-paginator.component.css ***!
  \**********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/common/array-paginator/array-paginator.component.html":
/*!***********************************************************************!*\
  !*** ./src/app/common/array-paginator/array-paginator.component.html ***!
  \***********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<p-paginator [rows]=\"numberOfRows\" [totalRecords]=\"_data.length\" (onPageChange)=\"paginate($event)\"></p-paginator>"

/***/ }),

/***/ "./src/app/common/array-paginator/array-paginator.component.ts":
/*!*********************************************************************!*\
  !*** ./src/app/common/array-paginator/array-paginator.component.ts ***!
  \*********************************************************************/
/*! exports provided: ArrayPaginatorComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ArrayPaginatorComponent", function() { return ArrayPaginatorComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var ArrayPaginatorComponent = /** @class */ (function () {
    function ArrayPaginatorComponent() {
        this.dataPaginating = new _angular_core__WEBPACK_IMPORTED_MODULE_0__["EventEmitter"]();
        this.numberOfRows = 8;
    }
    Object.defineProperty(ArrayPaginatorComponent.prototype, "data", {
        set: function (data) {
            // if (data === undefined || data === null || data === []) {
            // }
            this._data = data || [];
            // this.dataPaginating.emit(this._data.slice(0, this.numberOfRows));
            this.paginate({ first: 0, rows: 8 });
        },
        enumerable: true,
        configurable: true
    });
    ArrayPaginatorComponent.prototype.ngOnInit = function () {
    };
    ArrayPaginatorComponent.prototype.paginate = function (page) {
        this.dataPaginating.emit({
            from: page.first,
            to: page.rows + page.first
        });
        // this.dataPaginating.emit(this._data.slice(page.first, page.rows + page.first));
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Output"])(),
        __metadata("design:type", Object)
    ], ArrayPaginatorComponent.prototype, "dataPaginating", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", Object)
    ], ArrayPaginatorComponent.prototype, "numberOfRows", void 0);
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", Array),
        __metadata("design:paramtypes", [Array])
    ], ArrayPaginatorComponent.prototype, "data", null);
    ArrayPaginatorComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-array-paginator',
            template: __webpack_require__(/*! ./array-paginator.component.html */ "./src/app/common/array-paginator/array-paginator.component.html"),
            styles: [__webpack_require__(/*! ./array-paginator.component.css */ "./src/app/common/array-paginator/array-paginator.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], ArrayPaginatorComponent);
    return ArrayPaginatorComponent;
}());



/***/ }),

/***/ "./src/app/common/globals.ts":
/*!***********************************!*\
  !*** ./src/app/common/globals.ts ***!
  \***********************************/
/*! exports provided: Globals */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Globals", function() { return Globals; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var Globals = /** @class */ (function () {
    function Globals() {
        this.app_name = 'Sportify';
        this.API_URL = 'http://localhost:8080/Sportify';
    }
    Globals = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])()
    ], Globals);
    return Globals;
}());



/***/ }),

/***/ "./src/app/common/info-footer/info-footer.component.css":
/*!**************************************************************!*\
  !*** ./src/app/common/info-footer/info-footer.component.css ***!
  \**************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "footer {\n    position: fixed;\n    bottom: 0;\n    font-size: x-small;\n}\n\nfooter,\nfooter .nav {\n    line-height: 30px;\n    width: 100%;\n    height: 30px;\n    padding: 0 !important;\n}\n\n.nav .nav-link {\n    padding-bottom: 0;\n    padding-top: 0;\n}\n\nfooter,\n.nav .nav-link {\n    color: rgb(94, 94, 94) !important;\n}"

/***/ }),

/***/ "./src/app/common/info-footer/info-footer.component.html":
/*!***************************************************************!*\
  !*** ./src/app/common/info-footer/info-footer.component.html ***!
  \***************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!-- Footer -->\n<footer class=\"page-footer font-small bg-light\">\n    <!-- Footer Links -->\n    <div class=\"container-fluid text-center text-sm-left\">\n      <!-- Grid row -->\n      <div class=\"row\">\n        <!-- Grid column -->\n        <div class=\"col-md-3 madeby-text\">\n          <!-- Content -->\n          Made with ❤️ by Sportify Team! \n        </div>\n        <!-- Grid column -->\n          <!-- Grid column -->\n          <div class = \"col-md-9\">\n            <ul class=\"nav justify-content-end\">\n                <li class=\"nav-item\">\n                    <a class=\"nav-link\" routerLink=\"/sports\">About</a>\n                </li>\n                |\n                <li class=\"nav-item\">\n                    <a class=\"nav-link\" routerLink=\"/sports\">Contact us</a>\n                </li>\n            </ul>\n          </div>\n          <!-- Grid column -->\n      </div>\n      <!-- Grid row -->\n    </div>\n    <!-- Footer Links -->\n  </footer>\n  <!-- Footer -->"

/***/ }),

/***/ "./src/app/common/info-footer/info-footer.component.ts":
/*!*************************************************************!*\
  !*** ./src/app/common/info-footer/info-footer.component.ts ***!
  \*************************************************************/
/*! exports provided: InfoFooterComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "InfoFooterComponent", function() { return InfoFooterComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var InfoFooterComponent = /** @class */ (function () {
    function InfoFooterComponent() {
    }
    InfoFooterComponent.prototype.ngOnInit = function () {
    };
    InfoFooterComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-info-footer',
            template: __webpack_require__(/*! ./info-footer.component.html */ "./src/app/common/info-footer/info-footer.component.html"),
            styles: [__webpack_require__(/*! ./info-footer.component.css */ "./src/app/common/info-footer/info-footer.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], InfoFooterComponent);
    return InfoFooterComponent;
}());



/***/ }),

/***/ "./src/app/common/notifications/notifications.service.ts":
/*!***************************************************************!*\
  !*** ./src/app/common/notifications/notifications.service.ts ***!
  \***************************************************************/
/*! exports provided: NotificationsService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "NotificationsService", function() { return NotificationsService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};


var NotificationsService = /** @class */ (function () {
    function NotificationsService() {
        this.notificationChange = new rxjs__WEBPACK_IMPORTED_MODULE_1__["Subject"]();
    }
    NotificationsService.prototype.notify = function (severity, summary, detail, isSticky, lifeTime) {
        this.notificationChange.next({ severity: severity, summary: summary, detail: detail, isSticky: isSticky, lifeTime: lifeTime });
    };
    NotificationsService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])()
    ], NotificationsService);
    return NotificationsService;
}());



/***/ }),

/***/ "./src/app/common/notifications/prime-notifications/prime-notifications.component.css":
/*!********************************************************************************************!*\
  !*** ./src/app/common/notifications/prime-notifications/prime-notifications.component.css ***!
  \********************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/common/notifications/prime-notifications/prime-notifications.component.html":
/*!*********************************************************************************************!*\
  !*** ./src/app/common/notifications/prime-notifications/prime-notifications.component.html ***!
  \*********************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<p-growl [value]=\"msgs\" [sticky]=\"isSticky\" [life]=\"lifeTime\"></p-growl>"

/***/ }),

/***/ "./src/app/common/notifications/prime-notifications/prime-notifications.component.ts":
/*!*******************************************************************************************!*\
  !*** ./src/app/common/notifications/prime-notifications/prime-notifications.component.ts ***!
  \*******************************************************************************************/
/*! exports provided: PrimeNotificationsComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "PrimeNotificationsComponent", function() { return PrimeNotificationsComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _notifications_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../notifications.service */ "./src/app/common/notifications/notifications.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var PrimeNotificationsComponent = /** @class */ (function () {
    function PrimeNotificationsComponent(notificationsService) {
        this.notificationsService = notificationsService;
        this.msgs = [];
        this.isSticky = false;
        this.lifeTime = 4000;
    }
    PrimeNotificationsComponent.prototype.ngOnInit = function () {
        this.subscribeToNotifications();
    };
    PrimeNotificationsComponent.prototype.subscribeToNotifications = function () {
        var _this = this;
        this.subscription = this.notificationsService.notificationChange
            .subscribe(function (notification) {
            // let notificationObject = <INotification> notification;
            // this.isSticky = notificationObject.isSticky || false;
            // this.lifeTime = notificationObject.lifeTime || 2000;
            _this.msgs = [];
            // this.msgs.length = 0;
            _this.msgs.push(notification);
        });
    };
    PrimeNotificationsComponent.prototype.ngOnDestroy = function () {
        this.subscription.unsubscribe();
    };
    PrimeNotificationsComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-prime-notifications',
            template: __webpack_require__(/*! ./prime-notifications.component.html */ "./src/app/common/notifications/prime-notifications/prime-notifications.component.html"),
            styles: [__webpack_require__(/*! ./prime-notifications.component.css */ "./src/app/common/notifications/prime-notifications/prime-notifications.component.css")]
        }),
        __metadata("design:paramtypes", [_notifications_service__WEBPACK_IMPORTED_MODULE_1__["NotificationsService"]])
    ], PrimeNotificationsComponent);
    return PrimeNotificationsComponent;
}());



/***/ }),

/***/ "./src/app/common/pusher.service.ts":
/*!******************************************!*\
  !*** ./src/app/common/pusher.service.ts ***!
  \******************************************/
/*! exports provided: PusherService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "PusherService", function() { return PusherService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../environments/environment */ "./src/environments/environment.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var PusherService = /** @class */ (function () {
    function PusherService() {
        Pusher.logToConsole = true;
        this.pusher = new Pusher(_environments_environment__WEBPACK_IMPORTED_MODULE_1__["environment"].pusher.key, {
            cluster: 'eu',
            encrypted: true,
        });
    }
    PusherService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [])
    ], PusherService);
    return PusherService;
}());



/***/ }),

/***/ "./src/app/common/routing-module/app-routing.module.ts":
/*!*************************************************************!*\
  !*** ./src/app/common/routing-module/app-routing.module.ts ***!
  \*************************************************************/
/*! exports provided: AppRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppRoutingModule", function() { return AppRoutingModule; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _auth_auth_guard__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../auth/auth.guard */ "./src/app/auth/auth.guard.ts");
/* harmony import */ var _unlogged_welcome_welcome_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../../unlogged/welcome/welcome.component */ "./src/app/unlogged/welcome/welcome.component.ts");
/* harmony import */ var _unlogged_sign_up_sign_up_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../../unlogged/sign-up/sign-up.component */ "./src/app/unlogged/sign-up/sign-up.component.ts");
/* harmony import */ var _logged_sports_sports_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../../logged/sports/sports.component */ "./src/app/logged/sports/sports.component.ts");
/* harmony import */ var _logged_modalities_modalities_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ../../logged/modalities/modalities.component */ "./src/app/logged/modalities/modalities.component.ts");
/* harmony import */ var _logged_modality_filters_modality_filters_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ../../logged/modality-filters/modality-filters.component */ "./src/app/logged/modality-filters/modality-filters.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};








var routes = [
    { path: '', redirectTo: '/welcome', pathMatch: 'full' },
    { path: 'welcome', component: _unlogged_welcome_welcome_component__WEBPACK_IMPORTED_MODULE_3__["WelcomeComponent"] },
    { path: 'signup', component: _unlogged_sign_up_sign_up_component__WEBPACK_IMPORTED_MODULE_4__["SignUpComponent"] },
    // { path: 'sports', component: SportsComponent, canActivate: [AuthGuard] },
    { path: 'sports', component: _logged_sports_sports_component__WEBPACK_IMPORTED_MODULE_5__["SportsComponent"] },
    { path: 'sport/:id/modalities', component: _logged_modalities_modalities_component__WEBPACK_IMPORTED_MODULE_6__["ModalitiesComponent"] },
    { path: 'sport/:sportId/modality/:id/filters', component: _logged_modality_filters_modality_filters_component__WEBPACK_IMPORTED_MODULE_7__["ModalityFiltersComponent"] },
    { path: '**', redirectTo: '/sports', canActivate: [_auth_auth_guard__WEBPACK_IMPORTED_MODULE_2__["AuthGuard"]] },
];
var AppRoutingModule = /** @class */ (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["NgModule"])({
            imports: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"].forRoot(routes)],
            exports: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"]]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());



/***/ }),

/***/ "./src/app/data/api.service.ts":
/*!*************************************!*\
  !*** ./src/app/data/api.service.ts ***!
  \*************************************/
/*! exports provided: ApiService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ApiService", function() { return ApiService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/http */ "./node_modules/@angular/http/fesm5/http.js");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
/* harmony import */ var rxjs_operators__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! rxjs/operators */ "./node_modules/rxjs/_esm5/operators/index.js");
/* harmony import */ var _common_globals__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../common/globals */ "./src/app/common/globals.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var ApiService = /** @class */ (function () {
    function ApiService(http, globals) {
        this.http = http;
        this.globals = globals;
    }
    /**
     * Set entity
     * @param entity
     */
    ApiService.prototype.setEntity = function (entity) {
        this.entity = entity;
    };
    /**
     * Get all
     */
    ApiService.prototype.getAll = function () {
        var _this = this;
        if (this.entity !== null && this.entity !== undefined) {
            return this.http
                .get(this.globals.API_URL + '/' + this.entity)
                .pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_3__["map"])(function (response) { return _this.convertToJson(response); }));
        }
        else {
            var error = 'Missing entity';
            return rxjs__WEBPACK_IMPORTED_MODULE_2__["Observable"].throw(error);
        }
    };
    /**
     * Post an item
     * @param item
     */
    ApiService.prototype.postRequest = function (item) {
        var _this = this;
        return this.http
            .post(this.globals.API_URL + '/' + this.entity, item)
            .pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_3__["map"])(function (response) { return _this.convertToJson(response); }));
    };
    ApiService.prototype.convertToJson = function (object) {
        try {
            return object.json();
        }
        catch (_a) {
            return undefined;
        }
    };
    /**
     * Handle error
     * @param error
     */
    ApiService.prototype.handleError = function (error) {
        console.error('ApiService::handleError', error, this.entity);
        return rxjs__WEBPACK_IMPORTED_MODULE_2__["Observable"].throw(error);
    };
    ApiService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [_angular_http__WEBPACK_IMPORTED_MODULE_1__["Http"], _common_globals__WEBPACK_IMPORTED_MODULE_4__["Globals"]])
    ], ApiService);
    return ApiService;
}());



/***/ }),

/***/ "./src/app/logged/athletes/athletes.component.css":
/*!********************************************************!*\
  !*** ./src/app/logged/athletes/athletes.component.css ***!
  \********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "div.col-sm-8.athletes-container {\n    /* background-color: lightblue; */\n    margin: 1% auto;\n}\n\n.athletes-title {\n    text-align: center;\n}\n\n.athletes-cards > * {\n    padding: 1%;\n}\n\n.athlete-card {\n    text-align: center;\n    align-items: center;\n    border: none;\n    cursor: pointer;\n}\n\n.athlete-card:hover {\n    border: 1px lightgray solid;\n    background-color: aliceblue;\n}\n\n.athlete-card > img.card-img-top {\n    width: 100px;\n    height: 100px;\n    -o-object-fit: contain;\n       object-fit: contain;\n}\n\n.athlete-card p.card-text span.nationality {\n    font-size: smaller;\n    color: #888888;\n}"

/***/ }),

/***/ "./src/app/logged/athletes/athletes.component.html":
/*!*********************************************************!*\
  !*** ./src/app/logged/athletes/athletes.component.html ***!
  \*********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"athletes-container\">\n  <h3 class=\"athletes-title\">Choose an athlete</h3>\n  \n  <app-array-filter dataFilter=\"name\" [ordersBy]=\"ordersBy\" [data]=\"athletes\" (dataFiltering)=\"filtering($event)\"></app-array-filter>\n  <app-array-paginator [data]=\"data\" (dataPaginating)=\"paginating($event)\"></app-array-paginator>\n\n  <div class=\"row container athletes-cards\">\n    <div class=\"card col-sm-3 athlete-card\" *ngFor=\"let athlete of data.slice(dataFrom, dataTo)\" (click)=\"selectItem(athlete)\">\n      <img class=\"card-img-top\" src=\"{{ athlete.imgUrl }}\" alt=\"Card image cap\">\n      <div class=\"card-body\">\n        <p class=\"card-text\">\n          {{ athlete.name }}\n          <br>\n          <span class=\"nationality\">{{ athlete.nationality }}</span>\n        </p>\n      </div>\n    </div>\n  </div>\n</div>"

/***/ }),

/***/ "./src/app/logged/athletes/athletes.component.ts":
/*!*******************************************************!*\
  !*** ./src/app/logged/athletes/athletes.component.ts ***!
  \*******************************************************/
/*! exports provided: AthletesComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AthletesComponent", function() { return AthletesComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _data_api_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../data/api.service */ "./src/app/data/api.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var AthletesComponent = /** @class */ (function () {
    function AthletesComponent(route, apiService) {
        this.route = route;
        this.apiService = apiService;
        this.onItemSelected = new _angular_core__WEBPACK_IMPORTED_MODULE_0__["EventEmitter"]();
        this.dataFrom = 0;
        this.dataTo = 8;
    }
    AthletesComponent.prototype.ngOnInit = function () {
        this.getTeams();
        this.ordersBy = [
            { value: 'name', name: 'Name' },
            { value: 'nationality', name: 'Nationality' }
        ];
    };
    AthletesComponent.prototype.getTeams = function () {
        var _this = this;
        var teamId = this.route.snapshot.params.id;
        this.apiService.setEntity("/sports/modalities/" + teamId + "/athletes");
        this.apiService.getAll().subscribe(function (data) {
            _this.athletes = data;
            _this.data = data;
        });
    };
    AthletesComponent.prototype.filtering = function (data) {
        this.data = data;
    };
    AthletesComponent.prototype.paginating = function (values) {
        this.dataFrom = values.from;
        this.dataTo = values.to;
    };
    AthletesComponent.prototype.selectItem = function (item) {
        this.onItemSelected.emit(Object.assign({}, item, { isMatch: false }));
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Output"])(),
        __metadata("design:type", Object)
    ], AthletesComponent.prototype, "onItemSelected", void 0);
    AthletesComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-athletes',
            template: __webpack_require__(/*! ./athletes.component.html */ "./src/app/logged/athletes/athletes.component.html"),
            styles: [__webpack_require__(/*! ./athletes.component.css */ "./src/app/logged/athletes/athletes.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_1__["ActivatedRoute"], _data_api_service__WEBPACK_IMPORTED_MODULE_2__["ApiService"]])
    ], AthletesComponent);
    return AthletesComponent;
}());



/***/ }),

/***/ "./src/app/logged/competitions/competitions.component.css":
/*!****************************************************************!*\
  !*** ./src/app/logged/competitions/competitions.component.css ***!
  \****************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".competition-name{\n    display:inline-block;\n    margin:2px 0 2px 2px;\n}\n\n.competition-info{\n    font-size:14px;\n    float:right;\n    margin:15px 5px 0 0;\n}\n\n.competitions-title {\n    text-align: center;\n}\n\n.red-circle {\n    color: red;\n    background-color: red;\n}\n\n.green-circle {\n    color: green;\n    background-color: green;\n}\n\n.circle {\n    width: 15px;\n    height: 15px;\n    border-radius: 50%;\n}\n\n.circle-container{\n    padding-top: 12px;\n    padding-left: 0; \n}\n\n.active-container{\n    padding-right: 0; \n}\n\ndiv.col-sm-8.competitions-container {\n    /* background-color: lightblue; */\n    margin: 1% auto;\n}\n\n.competitions-title {\n    text-align: center;\n}\n\n.competitions-cards > * {\n    padding: 1%;\n}\n\n.competition-card {\n    border: none;\n    cursor: pointer;\n}\n\n.competition-card:hover {\n    border: 1px lightgray solid;\n    background-color: aliceblue;\n}\n\n.competition-card > img.card-img-top {\n    width: 100px;\n    height: 100px;\n    -o-object-fit: contain;\n       object-fit: contain;\n}\n\n.manager-button{\n    float: right;\n}"

/***/ }),

/***/ "./src/app/logged/competitions/competitions.component.html":
/*!*****************************************************************!*\
  !*** ./src/app/logged/competitions/competitions.component.html ***!
  \*****************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<p-dialog header=\"Matches of: {{ pickedCompetition.name }}\" modal=\"true\" [(visible)]=\"displayCompetitionModal\">\n  <div class=\"card col-sm-6 competition-card\" *ngFor=\"let match of matches\" (click)=\"selectItem(match)\">\n    <div class=\"card-body\">\n      <div class=\"ui-g\" style=\"border-bottom: 1px solid #d9d9d9\">\n        <div class=\"ui-g-12 ui-md-12 car-details\">\n          <div class=\"ui-g\">\n            <div class=\"ui-g-10 ui-md-12\">\n              <b>{{ match.description }}</b> ({{ match.location }})\n            </div>\n            <br>\n            <div class=\"ui-g-10 ui-md-12\">\n              <b>Date:</b> {{ match.startTime }}\n              <fa name=\"chevron-right\" class=\"w-r-padding\"></fa> {{ match.endTime }}\n            </div>\n            <br>\n            <div class=\"ui-g-10 ui-md-3 active-container\">\n              <b>Active:</b>\n            </div>\n            <div class=\"ui-g-10 ui-md-3 circle-container\">\n              <div class=\"circle red-circle\" *ngIf=\"!match.active\">\n              </div>\n              <div class=\"circle green-circle\" *ngIf=\"match.active\">\n              </div>\n            </div>\n          </div>\n        </div>\n      </div>\n    </div>\n  </div>\n</p-dialog>\n\n<div class=\"competitions-container\">\n  <h3 class=\"competitions-title\">Choose an competition</h3>\n\n  <app-array-filter dataFilter=\"name\" [ordersBy]=\"ordersBy\" [data]=\"competitions\" (dataFiltering)=\"filtering($event)\"></app-array-filter>\n  <app-array-paginator [data]=\"data\" (dataPaginating)=\"paginating($event)\"></app-array-paginator>\n\n  <div class=\"row container competitions-cards\">\n    <div class=\"card col-sm-6 competition-card\" *ngFor=\"let competition of data.slice(dataFrom, dataTo)\" (click)=\"selectCompetition(competition)\">\n      <div class=\"card-body\">\n        <div class=\"ui-g\" style=\"border-bottom: 1px solid #d9d9d9\">\n          <div class=\"ui-g-12 ui-md-12 car-details\">\n            <div class=\"ui-g\">\n              <div class=\"ui-g-10 ui-md-12\">\n                <b>{{competition.name}}</b> ({{competition.location}})\n              </div>\n              <br>\n              <div class=\"ui-g-10 ui-md-12\">\n                <b>Date:</b> {{competition.startDate}}\n                <fa name=\"chevron-right\" class=\"w-r-padding\"></fa> {{competition.endDate}}\n              </div>\n              <br>\n              <div class=\"ui-g-10 ui-md-12\">\n                <b>Description:</b> {{competition.description}}\n              </div>\n              <br>\n              <div class=\"ui-g-10 ui-md-3 active-container\">\n                <b>Active:</b>\n              </div>\n              <div class=\"ui-g-10 ui-md-3 circle-container\">\n                <div class=\"circle red-circle\" *ngIf=\"!competition.active\">\n                </div>\n                <div class=\"circle green-circle\" *ngIf=\"competition.active\">\n                </div>\n              </div>\n            </div>\n          </div>\n        </div>\n      </div>\n    </div>\n  </div>\n\n  <div class=\"row container manager-button\">\n    BUTTON\n  </div>\n</div>"

/***/ }),

/***/ "./src/app/logged/competitions/competitions.component.ts":
/*!***************************************************************!*\
  !*** ./src/app/logged/competitions/competitions.component.ts ***!
  \***************************************************************/
/*! exports provided: CompetitionsComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "CompetitionsComponent", function() { return CompetitionsComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _data_api_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../data/api.service */ "./src/app/data/api.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var CompetitionsComponent = /** @class */ (function () {
    function CompetitionsComponent(route, apiService) {
        this.route = route;
        this.apiService = apiService;
        this.onItemSelected = new _angular_core__WEBPACK_IMPORTED_MODULE_0__["EventEmitter"]();
        this.dataFrom = 0;
        this.dataTo = 2;
        this.pickedCompetition = {};
        this.displayCompetitionModal = false;
    }
    CompetitionsComponent.prototype.ngOnInit = function () {
        this.getCompetitions();
        this.ordersBy = [
            { value: 'name', name: 'Name' },
            { value: 'location', name: 'Location' },
            { value: 'startDate', name: 'Start Date' },
        ];
    };
    CompetitionsComponent.prototype.getCompetitions = function () {
        var _this = this;
        var teamId = this.route.snapshot.params.id;
        this.apiService.setEntity("/sports/modalities/" + teamId + "/competitions");
        this.apiService.getAll().subscribe(function (data) {
            // debugger
            _this.competitions = data;
            _this.data = data;
        });
    };
    CompetitionsComponent.prototype.filtering = function (data) {
        this.data = data;
    };
    CompetitionsComponent.prototype.paginating = function (values) {
        this.dataFrom = values.from;
        this.dataTo = values.to;
    };
    CompetitionsComponent.prototype.selectItem = function (item) {
        this.displayCompetitionModal = false;
        this.onItemSelected.emit(Object.assign({}, item, { isMatch: true, name: item.description }));
    };
    CompetitionsComponent.prototype.selectCompetition = function (competition) {
        var _this = this;
        this.apiService.setEntity("sports/modalities/competitions/" + competition.ID + "/matches");
        this.apiService.getAll().subscribe(function (data) {
            _this.matches = data;
            _this.pickedCompetition = competition;
            _this.displayCompetitionModal = true;
        });
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Output"])(),
        __metadata("design:type", Object)
    ], CompetitionsComponent.prototype, "onItemSelected", void 0);
    CompetitionsComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-competitions',
            template: __webpack_require__(/*! ./competitions.component.html */ "./src/app/logged/competitions/competitions.component.html"),
            styles: [__webpack_require__(/*! ./competitions.component.css */ "./src/app/logged/competitions/competitions.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_1__["ActivatedRoute"], _data_api_service__WEBPACK_IMPORTED_MODULE_2__["ApiService"]])
    ], CompetitionsComponent);
    return CompetitionsComponent;
}());



/***/ }),

/***/ "./src/app/logged/lateral-menu/lateral-menu.component.css":
/*!****************************************************************!*\
  !*** ./src/app/logged/lateral-menu/lateral-menu.component.css ***!
  \****************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".lateral-menu-container {\n    /* background-color: rgb(238, 238, 238); */\n    border: 3px solid gray;\n    border-radius: 5%;\n}"

/***/ }),

/***/ "./src/app/logged/lateral-menu/lateral-menu.component.html":
/*!*****************************************************************!*\
  !*** ./src/app/logged/lateral-menu/lateral-menu.component.html ***!
  \*****************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container lateral-menu-container\">\n    <ngb-tabset type=\"pills\" justify=\"center\">\n        <ngb-tab title=\"Notifications\">\n            <ng-template ngbTabContent>\n                <hr>\n                <app-notifications [sports]=\"sports\"></app-notifications>\n            </ng-template>\n        </ngb-tab>\n        <ngb-tab title=\"Subscriptions\">\n            <ng-template ngbTabContent>\n                <hr>\n                <app-subscriptions [sports]=\"sports\"></app-subscriptions>\n            </ng-template>\n        </ngb-tab>\n        <ngb-tab title=\"Settings\">\n            <ng-template ngbTabContent>\n                <hr>\n                <app-settings></app-settings>\n            </ng-template>\n        </ngb-tab>\n    </ngb-tabset>\n</div>"

/***/ }),

/***/ "./src/app/logged/lateral-menu/lateral-menu.component.ts":
/*!***************************************************************!*\
  !*** ./src/app/logged/lateral-menu/lateral-menu.component.ts ***!
  \***************************************************************/
/*! exports provided: LateralMenuComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LateralMenuComponent", function() { return LateralMenuComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _data_api_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../data/api.service */ "./src/app/data/api.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var LateralMenuComponent = /** @class */ (function () {
    function LateralMenuComponent(apiService) {
        this.apiService = apiService;
        this.sports = [];
        this.getSports();
    }
    LateralMenuComponent.prototype.ngOnInit = function () {
    };
    LateralMenuComponent.prototype.getSports = function () {
        var _this = this;
        this.apiService.setEntity('sports');
        this.apiService.getAll().subscribe(function (data) {
            _this.sports = data;
        });
    };
    LateralMenuComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-lateral-menu',
            template: __webpack_require__(/*! ./lateral-menu.component.html */ "./src/app/logged/lateral-menu/lateral-menu.component.html"),
            styles: [__webpack_require__(/*! ./lateral-menu.component.css */ "./src/app/logged/lateral-menu/lateral-menu.component.css")],
            host: {
                'class': 'col-sm-4'
            }
        }),
        __metadata("design:paramtypes", [_data_api_service__WEBPACK_IMPORTED_MODULE_1__["ApiService"]])
    ], LateralMenuComponent);
    return LateralMenuComponent;
}());



/***/ }),

/***/ "./src/app/logged/lateral-menu/notifications/notification/notification.component.css":
/*!*******************************************************************************************!*\
  !*** ./src/app/logged/lateral-menu/notifications/notification/notification.component.css ***!
  \*******************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/logged/lateral-menu/notifications/notification/notification.component.html":
/*!********************************************************************************************!*\
  !*** ./src/app/logged/lateral-menu/notifications/notification/notification.component.html ***!
  \********************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<p>\n  {{ sport.name }}\n</p>\n"

/***/ }),

/***/ "./src/app/logged/lateral-menu/notifications/notification/notification.component.ts":
/*!******************************************************************************************!*\
  !*** ./src/app/logged/lateral-menu/notifications/notification/notification.component.ts ***!
  \******************************************************************************************/
/*! exports provided: NotificationComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "NotificationComponent", function() { return NotificationComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var NotificationComponent = /** @class */ (function () {
    function NotificationComponent() {
    }
    NotificationComponent.prototype.ngOnInit = function () {
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", Object)
    ], NotificationComponent.prototype, "sport", void 0);
    NotificationComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-notification',
            template: __webpack_require__(/*! ./notification.component.html */ "./src/app/logged/lateral-menu/notifications/notification/notification.component.html"),
            styles: [__webpack_require__(/*! ./notification.component.css */ "./src/app/logged/lateral-menu/notifications/notification/notification.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], NotificationComponent);
    return NotificationComponent;
}());



/***/ }),

/***/ "./src/app/logged/lateral-menu/notifications/notifications.component.css":
/*!*******************************************************************************!*\
  !*** ./src/app/logged/lateral-menu/notifications/notifications.component.css ***!
  \*******************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".notifications-container div.notifications-item {\n    margin-bottom: 20px;\n}\n\n.notifications-container div.notifications-item:last-child {\n    margin-bottom: 10px !important;\n}\n\nbutton.sport-btn:hover {\n    background-color: aliceblue;\n}"

/***/ }),

/***/ "./src/app/logged/lateral-menu/notifications/notifications.component.html":
/*!********************************************************************************!*\
  !*** ./src/app/logged/lateral-menu/notifications/notifications.component.html ***!
  \********************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container notifications-container\">\n  <div class=\"notifications-item\">\n    <p>\n      <b>Sports</b>\n    </p>\n    <ngb-tabset justify=\"fill\">\n      <ngb-tab title=\"{{ sport.name }}\" *ngFor=\"let sport of sports\">\n        <ng-template ngbTabContent>\n          <app-notification [sport]=\"sport\"></app-notification>\n        </ng-template>\n      </ngb-tab>\n    </ngb-tabset>\n  </div>\n</div>"

/***/ }),

/***/ "./src/app/logged/lateral-menu/notifications/notifications.component.ts":
/*!******************************************************************************!*\
  !*** ./src/app/logged/lateral-menu/notifications/notifications.component.ts ***!
  \******************************************************************************/
/*! exports provided: NotificationsComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "NotificationsComponent", function() { return NotificationsComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var NotificationsComponent = /** @class */ (function () {
    function NotificationsComponent() {
    }
    NotificationsComponent.prototype.ngOnInit = function () {
        // this.sports = this.sportsService.getSports();
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", Array)
    ], NotificationsComponent.prototype, "sports", void 0);
    NotificationsComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-notifications',
            template: __webpack_require__(/*! ./notifications.component.html */ "./src/app/logged/lateral-menu/notifications/notifications.component.html"),
            styles: [__webpack_require__(/*! ./notifications.component.css */ "./src/app/logged/lateral-menu/notifications/notifications.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], NotificationsComponent);
    return NotificationsComponent;
}());



/***/ }),

/***/ "./src/app/logged/lateral-menu/settings/settings.component.css":
/*!*********************************************************************!*\
  !*** ./src/app/logged/lateral-menu/settings/settings.component.css ***!
  \*********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".settings-container div.settings-item {\n    margin-bottom: 20px;\n}\n\n.settings-container div.settings-item:last-child {\n    margin-bottom: 10px !important;\n}\n\n.settings-container div.row.settings-item > .col-sm-6.save {\n    text-align: right;\n}"

/***/ }),

/***/ "./src/app/logged/lateral-menu/settings/settings.component.html":
/*!**********************************************************************!*\
  !*** ./src/app/logged/lateral-menu/settings/settings.component.html ***!
  \**********************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<p-confirmDialog header=\"Confirmation\" icon=\"pi pi-exclamation-triangle\" width=\"425\" key=\"settingsConfirmation\"></p-confirmDialog>\n\n<p-dialog header=\"Invoice information\" modal=\"true\" width=\"600\" [(visible)]=\"displaySettingsModal\">\n  <p-tree [value]=\"filesTree\" id=\"treeSingle\" ></p-tree>\n</p-dialog>\n\n<div class=\"container settings-container\">\n  <div class=\"settings-item\">\n    <p>\n      <b>Notification type</b>\n    </p>\n    <div class=\"form-check\">\n      <input class=\"form-check-input\" type=\"radio\" name=\"notificationTypes\" id=\"notificationType1\" value=\"notificationType1\">\n      <label class=\"form-check-label\" for=\"notificationType1\">\n        Always real-time subscription\n      </label>\n    </div>\n    <div class=\"form-check\">\n      <input class=\"form-check-input\" type=\"radio\" name=\"notificationTypes\" id=\"notificationType2\" value=\"notificationType2\">\n      <label class=\"form-check-label\" for=\"notificationType2\">\n        Always notification at the end of the competition\n      </label>\n    </div>\n    <div class=\"form-check\">\n      <input class=\"form-check-input\" type=\"radio\" name=\"notificationTypes\" id=\"notificationType3\" value=\"notificationType3\">\n      <label class=\"form-check-label\" for=\"notificationType3\">\n        Always notification at the end of the day\n      </label>\n    </div>\n    <div class=\"form-check\">\n      <input class=\"form-check-input\" type=\"radio\" name=\"notificationTypes\" id=\"notificationType4\" value=\"notificationType4\">\n      <label class=\"form-check-label\" for=\"notificationType4\">\n        Select for each subscription\n      </label>\n    </div>\n  </div>\n  <hr>\n  <div class=\"settings-item\">\n    <p>\n      <b>Payment method</b>\n    </p>\n    <ngb-tabset justify=\"center\">\n      <ngb-tab title=\"Invoice\">\n        <ng-template ngbTabContent>\n          <p></p>\n          <p>You have {{ authService.user.paymentManager.currentAmount }}€ in debt.</p>\n          <p>Click the button below to generate an invoice.</p>\n          <div class=\"btn btn-light\" (click)=\"generateInvoice($event, op)\">Generate invoice</div>\n        </ng-template>\n      </ngb-tab>\n      <ngb-tab title=\"Prepaid card\" [disabled]=\"true\">\n        <ng-template ngbTabContent>\n          <p>Prepaid info</p>\n        </ng-template>\n      </ngb-tab>\n      <ngb-tab title=\"Monthly bill\" [disabled]=\"true\">\n        <ng-template ngbTabContent>\n          <p>Monthly bill info</p>\n        </ng-template>\n      </ngb-tab>\n    </ngb-tabset>\n  </div>\n  <hr>\n  <!-- <div class=\"row settings-item\">\n    <div class=\"col-sm-6\">\n      <div class=\"btn btn-link btn-discard\">Discard</div>\n    </div>\n    <div class=\"col-sm-6 save\">\n      <div class=\"btn btn-success btn-save\">Save</div>\n    </div>\n  </div> -->\n</div>"

/***/ }),

/***/ "./src/app/logged/lateral-menu/settings/settings.component.ts":
/*!********************************************************************!*\
  !*** ./src/app/logged/lateral-menu/settings/settings.component.ts ***!
  \********************************************************************/
/*! exports provided: SettingsComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SettingsComponent", function() { return SettingsComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _auth_auth_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../../auth/auth.service */ "./src/app/auth/auth.service.ts");
/* harmony import */ var _data_api_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../../data/api.service */ "./src/app/data/api.service.ts");
/* harmony import */ var primeng_api__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! primeng/api */ "./node_modules/primeng/api.js");
/* harmony import */ var primeng_api__WEBPACK_IMPORTED_MODULE_3___default = /*#__PURE__*/__webpack_require__.n(primeng_api__WEBPACK_IMPORTED_MODULE_3__);
/* harmony import */ var _common_notifications_notifications_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../../../common/notifications/notifications.service */ "./src/app/common/notifications/notifications.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var SettingsComponent = /** @class */ (function () {
    function SettingsComponent(authService, apiService, confirmationService, notificationsService) {
        this.authService = authService;
        this.apiService = apiService;
        this.confirmationService = confirmationService;
        this.notificationsService = notificationsService;
        this.displaySettingsModal = false;
    }
    SettingsComponent.prototype.ngOnInit = function () {
    };
    SettingsComponent.prototype.generateInvoice = function (event, overlaypanel) {
        var _this = this;
        this.confirmationService.confirm({
            message: "Are you sure that you want to generate an invoice? You currently have a " + this.authService.user.paymentManager.currentAmount + "\u20AC of debt.",
            key: 'settingsConfirmation',
            accept: function () {
                var user = _this.authService.user.ID;
                _this.apiService.setEntity("users/" + user + "/payments");
                _this.apiService.postRequest({}).subscribe(function (data) {
                    if (data === undefined || data.amount == 0) {
                        _this.notificationsService.notify('info', 'No invoice', 'You currently have no debt. Just start subscribing to events right now!');
                    }
                    else {
                        _this.filesTree = _this.convert_json(data);
                        _this.displaySettingsModal = true;
                        _this.authService.updateBalance();
                    }
                });
            }
        });
    };
    SettingsComponent.prototype.convert_json = function (data_json) {
        var subscriptions = [];
        var children = [];
        var price = 0;
        var icon = "fa fa-user";
        data_json.ORM_subscriptions.forEach(function (subscription) {
            children.push({
                label: subscription.date,
                expandedIcon: "fa fa-calendar",
                collapsedIcon: "fa fa-calendar"
            });
            subscription.ORM_subscribedEvents.forEach(function (subscribedEvent) {
                (subscription.subscribedEntity.type === "MatchEvent") ? price = subscribedEvent.regularPrice : price = subscribedEvent.extraPrice;
                switch (subscription.subscribedEntity.type) {
                    case "MatchEvent": {
                        icon = "fa fa-trophy";
                        break;
                    }
                    case "Team": {
                        icon = "fa fa-users";
                        break;
                    }
                    case "Athlete": {
                        icon = "fa fa-user";
                        break;
                    }
                }
                children.push({
                    label: subscribedEvent.name + " (Price: " + price + "€)",
                    expandedIcon: "fa fa-bell",
                    collapsedIcon: "fa fa-bell"
                });
            });
            subscriptions.push({
                label: (subscription.subscribedEntity.name || subscription.subscribedEntity.description) + " (" + subscription.subscribedEntity.type + ")",
                expandedIcon: icon,
                collapsedIcon: icon,
                children: children
            });
            children = [];
        });
        return [
            {
                label: "Name: " + this.authService.user.name,
                expandedIcon: "fa fa-user",
                collapsedIcon: "fa fa-user"
            },
            {
                label: "Total amount: " + data_json.amount + "€",
                expandedIcon: "fa fa-credit-card",
                collapsedIcon: "fa fa-credit-card"
            },
            {
                label: "Subscriptions",
                expandedIcon: "fa fa-align-justify",
                collapsedIcon: "fa fa-align-justify",
                children: subscriptions
            }
        ];
    };
    SettingsComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-settings',
            template: __webpack_require__(/*! ./settings.component.html */ "./src/app/logged/lateral-menu/settings/settings.component.html"),
            styles: [__webpack_require__(/*! ./settings.component.css */ "./src/app/logged/lateral-menu/settings/settings.component.css")]
        }),
        __metadata("design:paramtypes", [_auth_auth_service__WEBPACK_IMPORTED_MODULE_1__["AuthService"], _data_api_service__WEBPACK_IMPORTED_MODULE_2__["ApiService"], primeng_api__WEBPACK_IMPORTED_MODULE_3__["ConfirmationService"],
            _common_notifications_notifications_service__WEBPACK_IMPORTED_MODULE_4__["NotificationsService"]])
    ], SettingsComponent);
    return SettingsComponent;
}());



/***/ }),

/***/ "./src/app/logged/lateral-menu/subscriptions/subcription/subcription.component.css":
/*!*****************************************************************************************!*\
  !*** ./src/app/logged/lateral-menu/subscriptions/subcription/subcription.component.css ***!
  \*****************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/logged/lateral-menu/subscriptions/subcription/subcription.component.html":
/*!******************************************************************************************!*\
  !*** ./src/app/logged/lateral-menu/subscriptions/subcription/subcription.component.html ***!
  \******************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<p>\n  {{ sport.name }}\n</p>"

/***/ }),

/***/ "./src/app/logged/lateral-menu/subscriptions/subcription/subcription.component.ts":
/*!****************************************************************************************!*\
  !*** ./src/app/logged/lateral-menu/subscriptions/subcription/subcription.component.ts ***!
  \****************************************************************************************/
/*! exports provided: SubcriptionComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SubcriptionComponent", function() { return SubcriptionComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var SubcriptionComponent = /** @class */ (function () {
    function SubcriptionComponent() {
    }
    SubcriptionComponent.prototype.ngOnInit = function () {
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", Object)
    ], SubcriptionComponent.prototype, "sport", void 0);
    SubcriptionComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-subcription',
            template: __webpack_require__(/*! ./subcription.component.html */ "./src/app/logged/lateral-menu/subscriptions/subcription/subcription.component.html"),
            styles: [__webpack_require__(/*! ./subcription.component.css */ "./src/app/logged/lateral-menu/subscriptions/subcription/subcription.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], SubcriptionComponent);
    return SubcriptionComponent;
}());



/***/ }),

/***/ "./src/app/logged/lateral-menu/subscriptions/subscriptions.component.css":
/*!*******************************************************************************!*\
  !*** ./src/app/logged/lateral-menu/subscriptions/subscriptions.component.css ***!
  \*******************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".subscriptions-container div.subscriptions-item {\n    margin-bottom: 20px;\n}\n\n.subscriptions-container div.subscriptions-item:last-child {\n    margin-bottom: 10px !important;\n}\n\nbutton.sport-btn:hover {\n    background-color: aliceblue;\n}"

/***/ }),

/***/ "./src/app/logged/lateral-menu/subscriptions/subscriptions.component.html":
/*!********************************************************************************!*\
  !*** ./src/app/logged/lateral-menu/subscriptions/subscriptions.component.html ***!
  \********************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container subscriptions-container\">\n  <div class=\"subscriptions-item\">\n    <p>\n      <b>Sports</b>\n    </p>\n    <ngb-tabset justify=\"fill\">\n      <ngb-tab title=\"{{ sport.name }}\" *ngFor=\"let sport of sports\">\n        <ng-template ngbTabContent>\n          <app-subcription [sport]=\"sport\"></app-subcription>\n        </ng-template>\n      </ngb-tab>\n    </ngb-tabset>\n  </div>\n</div>"

/***/ }),

/***/ "./src/app/logged/lateral-menu/subscriptions/subscriptions.component.ts":
/*!******************************************************************************!*\
  !*** ./src/app/logged/lateral-menu/subscriptions/subscriptions.component.ts ***!
  \******************************************************************************/
/*! exports provided: SubscriptionsComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SubscriptionsComponent", function() { return SubscriptionsComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var SubscriptionsComponent = /** @class */ (function () {
    function SubscriptionsComponent() {
    }
    SubscriptionsComponent.prototype.ngOnInit = function () {
        // this.sports = this.sportsService.getSports();
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Input"])(),
        __metadata("design:type", Array)
    ], SubscriptionsComponent.prototype, "sports", void 0);
    SubscriptionsComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-subscriptions',
            template: __webpack_require__(/*! ./subscriptions.component.html */ "./src/app/logged/lateral-menu/subscriptions/subscriptions.component.html"),
            styles: [__webpack_require__(/*! ./subscriptions.component.css */ "./src/app/logged/lateral-menu/subscriptions/subscriptions.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], SubscriptionsComponent);
    return SubscriptionsComponent;
}());



/***/ }),

/***/ "./src/app/logged/logged-navbar/logged-navbar.component.css":
/*!******************************************************************!*\
  !*** ./src/app/logged/logged-navbar/logged-navbar.component.css ***!
  \******************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".navbar-brand {\n    /* !important; */\n    font-family: Georgia, serif  !important;\n    font-weight: bold  !important;\n    color: rgb(63, 63, 63) !important;\n    text-shadow: 2px 2px 3px rgba(255,255,255,0.1) !important;\n    text-transform: uppercase !important;\n    letter-spacing: 4px !important;\n    font-size: 30px !important;\n}\n\n.navbar {\n    z-index: 999;\n}\n\n.navbar,\n.navbar * {\n    background-color: #F8F9FA !important;\n}\n\n.right-container {\n    display: inline;\n}\n\n.right-container .user-container {\n    float: left;\n}\n\n.right-container .signout-btn {\n    float: right;\n    margin-left: 10px;\n}\n\n.right-container .balance {\n    font-size: x-small;\n}\n\n.right-container .balance-value {\n    font-size: small;\n}\n\n.breadcrumb-home .breadcrumb {\n    margin: 0 !important;\n    font-size: small;\n}\n\n.new-color * {\n    color: #212529 !important;\n}"

/***/ }),

/***/ "./src/app/logged/logged-navbar/logged-navbar.component.html":
/*!*******************************************************************!*\
  !*** ./src/app/logged/logged-navbar/logged-navbar.component.html ***!
  \*******************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n  <a class=\"navbar-brand\" routerLink=\"/sports\">{{ globals.app_name }}</a>\n\n  <nav class=\"breadcrumb-home\">\n    <ol class=\"breadcrumb\">\n      <li class=\"breadcrumb-item new-color {{item.classes}}\" *ngFor=\"let item of paths\" >\n        <span *ngIf=\"item.last\">{{ item.designation }}</span>\n        <a *ngIf=\"!item.last\" routerLink=\"{{ item.path }}\">{{ item.designation }}</a>\n      </li>\n    </ol>\n  </nav>\n  \n  <button class=\"navbar-toggler\" type=\"button\" (click)=\"isCollapsed = !isCollapsed\" [attr.aria-expanded]=\"!isCollapsed\" aria-controls=\"navbarSupportedContent\">\n    <span class=\"navbar-toggler-icon\"></span>\n  </button>\n\n  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\" [ngbCollapse]=\"isCollapsed\">\n    <ul class=\"navbar-nav mr-auto\"></ul>\n    <div class=\"right-container\">\n      <div class=\"user-container\">\n        <span class=\"username\">Hey <b>{{ authService.user.name }}</b></span>\n        <br>\n        <span class=\"balance\">Current debt: </span><span class=\"balance-value\">-{{ authService.user.paymentManager.currentAmount.toFixed(2) }}€</span>\n      </div>\n      <a class=\"btn signout-btn\" (click)=\"logout()\" title=\"Logout now\"><fa size=\"lg\" name=\"sign-out\"></fa></a>\n    </div>\n  </div>\n</nav>"

/***/ }),

/***/ "./src/app/logged/logged-navbar/logged-navbar.component.ts":
/*!*****************************************************************!*\
  !*** ./src/app/logged/logged-navbar/logged-navbar.component.ts ***!
  \*****************************************************************/
/*! exports provided: LoggedNavbarComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "LoggedNavbarComponent", function() { return LoggedNavbarComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _common_globals__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../common/globals */ "./src/app/common/globals.ts");
/* harmony import */ var _auth_auth_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../auth/auth.service */ "./src/app/auth/auth.service.ts");
/* harmony import */ var _common_pusher_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../../common/pusher.service */ "./src/app/common/pusher.service.ts");
/* harmony import */ var _common_notifications_notifications_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../../common/notifications/notifications.service */ "./src/app/common/notifications/notifications.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _data_api_service__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ../../data/api.service */ "./src/app/data/api.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};







var LoggedNavbarComponent = /** @class */ (function () {
    function LoggedNavbarComponent(globals, authService, pusher, notificationsService, router, route, apiService) {
        this.globals = globals;
        this.authService = authService;
        this.pusher = pusher;
        this.notificationsService = notificationsService;
        this.router = router;
        this.route = route;
        this.apiService = apiService;
    }
    LoggedNavbarComponent.prototype.ngOnInit = function () {
        this.setPusherData();
        this.generatePaths();
    };
    LoggedNavbarComponent.prototype.logout = function () {
        this.authService.logout();
    };
    LoggedNavbarComponent.prototype.setPusherData = function () {
        var _this = this;
        var id = this.authService.user.ID;
        this.messageChannel = this.pusher.pusher.subscribe(id.toString());
        this.messageChannel.bind('my-event', function (message) {
            _this.notificationsService.notify('info', message.title, message.content);
        });
    };
    LoggedNavbarComponent.prototype.generatePaths = function () {
        var _this = this;
        this.router.events.subscribe(function (val) {
            if (val instanceof _angular_router__WEBPACK_IMPORTED_MODULE_5__["NavigationEnd"]) {
                var url_1 = val.url;
                if (url_1 === '/sports') {
                    _this.paths = [{ classes: 'active', path: '/sports', designation: 'Sports', last: true }];
                }
                else {
                    _this.apiService.setEntity('sports');
                    var sportId_1 = /^\/sport\/([0-9]+)/g.exec(url_1)[1];
                    if (url_1.search(/^\/sport\/[0-9]+\/modalities$/g) != -1) {
                        var body = {
                            id: sportId_1,
                            isSport: true,
                            modalityID: 1
                        };
                        _this.apiService.postRequest(body).subscribe(function (data) {
                            console.log("recebi");
                            console.log(data);
                            _this.paths = [{ classes: '', path: '/sports', designation: data.sportName, last: false },
                                { classes: 'active', path: url_1, designation: 'Modalities', last: true }];
                        });
                    }
                    else if (url_1.search(/^\/sport\/[0-9]+\/modality\/[0-9]+\/filters$/g) != -1) {
                        var id = /^\/sport\/[0-9]+\/modality\/([0-9]+)\/filters$/g.exec(url_1)[1];
                        var body = {
                            id: sportId_1,
                            isSport: false,
                            modalityID: id
                        };
                        _this.apiService.postRequest(body).subscribe(function (data) {
                            console.log("recebi2");
                            console.log(data);
                            if (data.hasModality) {
                                _this.paths = [{ classes: '', path: '/sports', designation: data.sportName, last: false },
                                    { classes: '', path: "/sport/" + sportId_1 + "/modalities", designation: data.modalityName, last: false },
                                    { classes: 'active', path: url_1, designation: 'Filters', last: true }];
                            }
                            else {
                                _this.paths = [{ classes: '', path: '/sports', designation: data.sportName, last: false },
                                    { classes: 'active', path: url_1, designation: 'Filters', last: true }];
                            }
                        });
                    }
                }
            }
        });
    };
    LoggedNavbarComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-logged-navbar',
            template: __webpack_require__(/*! ./logged-navbar.component.html */ "./src/app/logged/logged-navbar/logged-navbar.component.html"),
            styles: [__webpack_require__(/*! ./logged-navbar.component.css */ "./src/app/logged/logged-navbar/logged-navbar.component.css")]
        }),
        __metadata("design:paramtypes", [_common_globals__WEBPACK_IMPORTED_MODULE_1__["Globals"], _auth_auth_service__WEBPACK_IMPORTED_MODULE_2__["AuthService"], _common_pusher_service__WEBPACK_IMPORTED_MODULE_3__["PusherService"],
            _common_notifications_notifications_service__WEBPACK_IMPORTED_MODULE_4__["NotificationsService"], _angular_router__WEBPACK_IMPORTED_MODULE_5__["Router"], _angular_router__WEBPACK_IMPORTED_MODULE_5__["ActivatedRoute"],
            _data_api_service__WEBPACK_IMPORTED_MODULE_6__["ApiService"]])
    ], LoggedNavbarComponent);
    return LoggedNavbarComponent;
}());



/***/ }),

/***/ "./src/app/logged/modalities/modalities.component.css":
/*!************************************************************!*\
  !*** ./src/app/logged/modalities/modalities.component.css ***!
  \************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "div.col-sm-8.modalities-container {\n    /* background-color: lightblue; */\n    margin: 1% auto;\n}\n\n.modalities-title {\n    text-align: center;\n}\n\n.modalities-cards > * {\n    padding: 1%;\n}\n\n.modality-card {\n    text-align: center;\n    align-items: center;\n    border: none;\n    cursor: pointer;\n}\n\n.modality-card:hover {\n    border: 1px lightgray solid;\n    background-color: aliceblue;\n}\n\n.modality-card > img.card-img-top {\n    width: 100px;\n    height: 100px;\n    -o-object-fit: contain;\n       object-fit: contain;\n}"

/***/ }),

/***/ "./src/app/logged/modalities/modalities.component.html":
/*!*************************************************************!*\
  !*** ./src/app/logged/modalities/modalities.component.html ***!
  \*************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"modalities-container\">\n    <h3 class=\"modalities-title\">Choose a modality</h3>\n    \n    <app-array-filter dataFilter=\"name\" [ordersBy]=\"ordersBy\" [data]=\"sport.modalities\" (dataFiltering)=\"filtering($event)\"></app-array-filter>\n    <app-array-paginator [data]=\"data\" (dataPaginating)=\"paginating($event)\"></app-array-paginator>\n\n    <div class=\"row container modalities-cards\">\n        <div class=\"card col-sm-3 modality-card\" *ngFor=\"let modality of data.slice(dataFrom, dataTo)\" routerLink=\"/sport/{{ sport.Id }}/modality/{{ modality.ID }}/filters\">\n            <img class=\"card-img-top\" src=\"{{ modality.imgUrl }}\" alt=\"Card image cap\">\n            <div class=\"card-body\">\n                <p class=\"card-text\">{{ modality.name }}</p>\n            </div>\n        </div>\n    </div>\n</div>"

/***/ }),

/***/ "./src/app/logged/modalities/modalities.component.ts":
/*!***********************************************************!*\
  !*** ./src/app/logged/modalities/modalities.component.ts ***!
  \***********************************************************/
/*! exports provided: ModalitiesComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ModalitiesComponent", function() { return ModalitiesComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _data_api_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../data/api.service */ "./src/app/data/api.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var ModalitiesComponent = /** @class */ (function () {
    function ModalitiesComponent(route, apiService) {
        this.route = route;
        this.apiService = apiService;
        this.sport = {
            modalities: []
        };
        this.dataFrom = 0;
        this.dataTo = 8;
    }
    ModalitiesComponent.prototype.ngOnInit = function () {
        this.getData();
        this.ordersBy = [
            { value: 'name', name: 'Name' }
        ];
    };
    ModalitiesComponent.prototype.getData = function () {
        var _this = this;
        var sportId = this.route.snapshot.params.id;
        this.apiService.setEntity("sports/" + sportId + "/modalities");
        this.apiService.getAll().subscribe(function (data) {
            _this.sport = {
                Id: sportId,
                Designation: null,
                modalities: data
            };
            _this.data = data;
        });
    };
    ModalitiesComponent.prototype.filtering = function (data) {
        this.data = data;
    };
    ModalitiesComponent.prototype.paginating = function (values) {
        this.dataFrom = values.from;
        this.dataTo = values.to;
    };
    ModalitiesComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-modalities',
            template: __webpack_require__(/*! ./modalities.component.html */ "./src/app/logged/modalities/modalities.component.html"),
            styles: [__webpack_require__(/*! ./modalities.component.css */ "./src/app/logged/modalities/modalities.component.css")],
            host: {
                'class': 'col-sm-8'
            }
        }),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_1__["ActivatedRoute"], _data_api_service__WEBPACK_IMPORTED_MODULE_2__["ApiService"]])
    ], ModalitiesComponent);
    return ModalitiesComponent;
}());



/***/ }),

/***/ "./src/app/logged/modality-filters/modality-filters.component.css":
/*!************************************************************************!*\
  !*** ./src/app/logged/modality-filters/modality-filters.component.css ***!
  \************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".container-subcribed {\n    padding: 6px 12px;\n}\n\n.align-center {\n    text-align: center;\n}"

/***/ }),

/***/ "./src/app/logged/modality-filters/modality-filters.component.html":
/*!*************************************************************************!*\
  !*** ./src/app/logged/modality-filters/modality-filters.component.html ***!
  \*************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<p-confirmDialog header=\"Confirmation\" icon=\"pi pi-exclamation-triangle\" width=\"425\" key=\"eventsConfirmation\"></p-confirmDialog>\n<p-confirmDialog header=\"Confirmation\" icon=\"pi pi-exclamation-triangle\" width=\"425\" key=\"sendNotificationConfirmation\"></p-confirmDialog>\n\n<p-dialog header=\"{{ currentEntity.name }}\" modal=\"true\" width=\"600\" [(visible)]=\"displayEventModal\" id=\"manager-events-tabs\">\n  <div class=\"events-container\" *ngIf=\"!authService.user.isManager\">\n    <p-table [value]=\"currentEvents\">\n      <ng-template pTemplate=\"header\">\n        <tr>\n          <th>Event</th>\n          <th>Price</th>\n          <th>Status</th>\n        </tr>\n      </ng-template>\n      <ng-template pTemplate=\"body\" let-item>\n        <tr>\n          <td>\n            {{ item.name }}\n          </td>\n          <td *ngIf=\"currentEntity.isMatch\">{{ item.regularPrice }}€</td>\n          <td *ngIf=\"!currentEntity.isMatch\">{{ item.extraPrice }}€</td>\n          <td class=\"align-center\">\n            <button class=\"btn btn-link\" (click)=\"subscribeEvent(item)\" *ngIf=\"!item.subscribed\">Subscribe</button>\n            <div class=\"container-subcribed\" *ngIf=\"item.subscribed\">\n              <fa name=\"check\"></fa>\n            </div>\n          </td>\n        </tr>\n      </ng-template>\n    </p-table>\n  </div>\n  <div class=\"manager-events-container\" *ngIf=\"authService.user.isManager\">\n    <p-tabView orientation=\"left\">\n      <p-tabPanel header=\"{{ item.name }}\" *ngFor=\"let item of currentEvents; let i = index\" [selected]=\"i == 0\">\n        <div class=\"container\">\n          <div class=\"row\">\n            <textarea name=\"\" id=\"\" cols=\"30\" rows=\"5\" (keyup)=\"onKey($event, item)\"></textarea>\n          </div>\n          <div class=\"row button-container\">\n            <button class=\"btn btn-link\" (click)=\"sendNotification(item)\">\n              Send notification<fa name=\"bell\"></fa>\n            </button>\n          </div>\n        </div>\n      </p-tabPanel>\n    </p-tabView>\n  </div>\n</p-dialog>\n\n<div class=\"container\">\n  <ngb-tabset justify=\"fill\">\n    <ngb-tab title=\"Competitions\">\n      <ng-template ngbTabContent>\n        <app-competitions (onItemSelected)=\"entitySelected($event)\"></app-competitions>\n      </ng-template>\n    </ngb-tab>\n    <ngb-tab title=\"Teams\">\n      <ng-template ngbTabContent>\n        <app-teams (onItemSelected)=\"entitySelected($event)\"></app-teams>\n      </ng-template>\n    </ngb-tab>\n    <ngb-tab title=\"Athletes\">\n      <ng-template ngbTabContent>\n        <app-athletes (onItemSelected)=\"entitySelected($event)\"></app-athletes>\n      </ng-template>\n    </ngb-tab>\n  </ngb-tabset>\n</div>"

/***/ }),

/***/ "./src/app/logged/modality-filters/modality-filters.component.ts":
/*!***********************************************************************!*\
  !*** ./src/app/logged/modality-filters/modality-filters.component.ts ***!
  \***********************************************************************/
/*! exports provided: ModalityFiltersComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ModalityFiltersComponent", function() { return ModalityFiltersComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _data_api_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../data/api.service */ "./src/app/data/api.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _auth_auth_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../../auth/auth.service */ "./src/app/auth/auth.service.ts");
/* harmony import */ var primeng_api__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! primeng/api */ "./node_modules/primeng/api.js");
/* harmony import */ var primeng_api__WEBPACK_IMPORTED_MODULE_4___default = /*#__PURE__*/__webpack_require__.n(primeng_api__WEBPACK_IMPORTED_MODULE_4__);
/* harmony import */ var _common_notifications_notifications_service__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../../common/notifications/notifications.service */ "./src/app/common/notifications/notifications.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






var ModalityFiltersComponent = /** @class */ (function () {
    function ModalityFiltersComponent(apiService, route, authService, confirmationService, notificationsService) {
        this.apiService = apiService;
        this.route = route;
        this.authService = authService;
        this.confirmationService = confirmationService;
        this.notificationsService = notificationsService;
        this.displayEventModal = false;
        this.currentEntity = {};
        this.currentEvents = [];
    }
    ModalityFiltersComponent.prototype.ngOnInit = function () {
        this.modalityId = this.route.snapshot.params.id;
    };
    ModalityFiltersComponent.prototype.entitySelected = function (item) {
        var _this = this;
        this.currentEntity = item;
        this.apiService.setEntity("/sports/modalities/" + this.modalityId + "/event_categories");
        this.apiService.getAll().subscribe(function (data) {
            _this.apiService.setEntity("/users/" + _this.authService.user.ID + "/subscriptions/" + _this.currentEntity.ID + "/events");
            _this.apiService.getAll().subscribe(function (myData) {
                _this.currentEvents = data.map(function (dt) { return Object.assign({}, dt, { message: '', subscribed: myData.filter(function (mdt) { return mdt.ID === dt.ID; }).length !== 0 }); });
                _this.currentEvents = _this.currentEvents.sort(function (a, b) { return a.name > b.name ? 1 : 0; });
                _this.displayEventModal = true;
            });
        });
    };
    ModalityFiltersComponent.prototype.subscribeEvent = function (event) {
        var _this = this;
        var cost = this.currentEntity.isMatch ? event.regularPrice : event.extraPrice;
        this.confirmationService.confirm({
            message: "Are you sure that you want to subscribe to '" + event.name + "' of " + this.currentEntity.name + "? It will cost you " + cost + "\u20AC.",
            key: 'eventsConfirmation',
            accept: function () {
                _this.apiService.setEntity("/users/" + _this.authService.user.ID + "/subscribe/" + _this.currentEntity.ID);
                var body = {
                    date: new Date(),
                    paid: false,
                    _tracker: {
                        notificationPolicy: 'default'
                    },
                    ORM_subscribedEvents: [
                        { ID: event.ID }
                    ]
                };
                _this.apiService.postRequest(body).subscribe(function (data) {
                    event.subscribed = true;
                    _this.authService.updateBalance();
                });
            }
        });
    };
    ModalityFiltersComponent.prototype.onKey = function (event, item) {
        item.message = event.target.value;
    };
    ModalityFiltersComponent.prototype.sendNotification = function (item) {
        var _this = this;
        this.confirmationService.confirm({
            message: "Are you sure that you want to send a notification to all subscribers of '" + item.name + "' of " + this.currentEntity.name + ".",
            key: 'sendNotificationConfirmation',
            accept: function () {
                var event = {
                    category: {
                        ID: item.ID
                    },
                    textFormat: item.message
                };
                _this.apiService.setEntity("sports/modalities/competitions/matches/" + _this.currentEntity.ID + "/events");
                _this.apiService.postRequest(event).subscribe(function (data) {
                    _this.notificationsService.notify('success', 'Notification sent', "Notification sucessfully sent to all subscribers of '" + item.name + "' of " + _this.currentEntity.name + ".");
                });
            }
        });
    };
    ModalityFiltersComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-modality-filters',
            template: __webpack_require__(/*! ./modality-filters.component.html */ "./src/app/logged/modality-filters/modality-filters.component.html"),
            styles: [__webpack_require__(/*! ./modality-filters.component.css */ "./src/app/logged/modality-filters/modality-filters.component.css")],
            host: {
                'class': 'col-sm-8'
            }
        }),
        __metadata("design:paramtypes", [_data_api_service__WEBPACK_IMPORTED_MODULE_1__["ApiService"], _angular_router__WEBPACK_IMPORTED_MODULE_2__["ActivatedRoute"], _auth_auth_service__WEBPACK_IMPORTED_MODULE_3__["AuthService"],
            primeng_api__WEBPACK_IMPORTED_MODULE_4__["ConfirmationService"], _common_notifications_notifications_service__WEBPACK_IMPORTED_MODULE_5__["NotificationsService"]])
    ], ModalityFiltersComponent);
    return ModalityFiltersComponent;
}());



/***/ }),

/***/ "./src/app/logged/sports/sports.component.css":
/*!****************************************************!*\
  !*** ./src/app/logged/sports/sports.component.css ***!
  \****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "div.col-sm-8.sports-container {\n    /* background-color: lightblue; */\n    margin: 1% auto;\n}\n\n.sports-title {\n    text-align: center;\n}\n\n.sports-cards > * {\n    padding: 1%;\n}\n\n.sport-card {\n    text-align: center;\n    align-items: center;\n    border: none;\n    cursor: pointer;\n}\n\n.sport-card:hover {\n    border: 1px lightgray solid;\n    background-color: aliceblue;\n}\n\n.sport-card > img.card-img-top {\n    width: 100px;\n    height: 100px;\n    -o-object-fit: contain;\n       object-fit: contain;\n}"

/***/ }),

/***/ "./src/app/logged/sports/sports.component.html":
/*!*****************************************************!*\
  !*** ./src/app/logged/sports/sports.component.html ***!
  \*****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"sports-container\">\n    <h3 class=\"sports-title\">Choose a sport</h3>\n    \n    <app-array-filter dataFilter=\"name\" [ordersBy]=\"ordersBy\" [data]=\"sports\" (dataFiltering)=\"filtering($event)\"></app-array-filter>\n    <app-array-paginator [data]=\"data\" (dataPaginating)=\"paginating($event)\"></app-array-paginator>\n\n    <div class=\"row container sports-cards\">\n        <div class=\"card col-sm-3 sport-card\" *ngFor=\"let sport of data.slice(dataFrom, dataTo)\" (click)=\"sportClick(sport)\">\n            <img class=\"card-img-top\" src=\"{{ sport.imgUrl }}\" alt=\"Card image cap\">\n            <div class=\"card-body\">\n                <p class=\"card-text\">{{ sport.name }}</p>\n            </div>\n        </div>\n    </div>\n\n</div>"

/***/ }),

/***/ "./src/app/logged/sports/sports.component.ts":
/*!***************************************************!*\
  !*** ./src/app/logged/sports/sports.component.ts ***!
  \***************************************************/
/*! exports provided: SportsComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SportsComponent", function() { return SportsComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _data_api_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../data/api.service */ "./src/app/data/api.service.ts");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var SportsComponent = /** @class */ (function () {
    function SportsComponent(route, router, apiService) {
        this.route = route;
        this.router = router;
        this.apiService = apiService;
        this.dataFrom = 0;
        this.dataTo = 8;
    }
    SportsComponent.prototype.ngOnInit = function () {
        this.getSports();
        this.ordersBy = [
            { value: 'name', name: 'Name' }
        ];
    };
    SportsComponent.prototype.getSports = function () {
        var _this = this;
        this.apiService.setEntity('sports');
        this.apiService.getAll().subscribe(function (data) {
            _this.sports = data;
            _this.data = data;
        });
    };
    SportsComponent.prototype.filtering = function (data) {
        this.data = data;
    };
    SportsComponent.prototype.sportClick = function (sport) {
        var _this = this;
        if (sport.onlySport) {
            this.router.navigate(["/sport/" + sport.ID + "/modalities"]);
        }
        else {
            this.apiService.setEntity("sports/" + sport.ID + "/modalities");
            this.apiService.getAll().subscribe(function (data) {
                _this.router.navigate(["/sport/" + sport.ID + "/modality/" + data[0].ID + "/filters"]);
            });
        }
    };
    SportsComponent.prototype.paginating = function (values) {
        this.dataFrom = values.from;
        this.dataTo = values.to;
    };
    SportsComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-sports',
            template: __webpack_require__(/*! ./sports.component.html */ "./src/app/logged/sports/sports.component.html"),
            styles: [__webpack_require__(/*! ./sports.component.css */ "./src/app/logged/sports/sports.component.css")],
            host: {
                'class': 'col-sm-8'
            }
        }),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_2__["ActivatedRoute"], _angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"], _data_api_service__WEBPACK_IMPORTED_MODULE_1__["ApiService"]])
    ], SportsComponent);
    return SportsComponent;
}());



/***/ }),

/***/ "./src/app/logged/teams/teams.component.css":
/*!**************************************************!*\
  !*** ./src/app/logged/teams/teams.component.css ***!
  \**************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "div.col-sm-8.teams-container {\n    /* background-color: lightblue; */\n    margin: 1% auto;\n}\n\n.teams-title {\n    text-align: center;\n}\n\n.teams-cards > * {\n    padding: 1%;\n}\n\n.team-card {\n    text-align: center;\n    align-items: center;\n    border: none;\n    cursor: pointer;\n}\n\n.team-card:hover {\n    border: 1px lightgray solid;\n    background-color: aliceblue;\n}\n\n.team-card > img.card-img-top {\n    width: 100px;\n    height: 100px;\n    -o-object-fit: contain;\n       object-fit: contain;\n}"

/***/ }),

/***/ "./src/app/logged/teams/teams.component.html":
/*!***************************************************!*\
  !*** ./src/app/logged/teams/teams.component.html ***!
  \***************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"teams-container\">\n  <h3 class=\"teams-title\">Choose a team</h3>\n  \n  <app-array-filter dataFilter=\"name\" [ordersBy]=\"ordersBy\" [data]=\"teams\" (dataFiltering)=\"filtering($event)\"></app-array-filter>\n  <app-array-paginator [data]=\"data\" (dataPaginating)=\"paginating($event)\"></app-array-paginator>\n\n  <div class=\"row container teams-cards\">\n    <div class=\"card col-sm-3 team-card\" *ngFor=\"let team of data.slice(dataFrom, dataTo)\" (click)=\"selectItem(team)\">\n      <img class=\"card-img-top\" src=\"{{ team.imgUrl }}\" alt=\"Card image cap\">\n      <div class=\"card-body\">\n        <p class=\"card-text\">{{ team.name }}</p>\n      </div>\n    </div>\n  </div>\n</div>"

/***/ }),

/***/ "./src/app/logged/teams/teams.component.ts":
/*!*************************************************!*\
  !*** ./src/app/logged/teams/teams.component.ts ***!
  \*************************************************/
/*! exports provided: TeamsComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "TeamsComponent", function() { return TeamsComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _data_api_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../data/api.service */ "./src/app/data/api.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var TeamsComponent = /** @class */ (function () {
    function TeamsComponent(route, apiService) {
        this.route = route;
        this.apiService = apiService;
        this.onItemSelected = new _angular_core__WEBPACK_IMPORTED_MODULE_0__["EventEmitter"]();
        this.dataFrom = 0;
        this.dataTo = 8;
    }
    TeamsComponent.prototype.ngOnInit = function () {
        this.getTeams();
        this.ordersBy = [
            { value: 'name', name: 'Name' }
        ];
    };
    TeamsComponent.prototype.getTeams = function () {
        var _this = this;
        var teamId = this.route.snapshot.params.id;
        this.apiService.setEntity("/sports/modalities/" + teamId + "/teams");
        this.apiService.getAll().subscribe(function (data) {
            _this.teams = data;
            _this.data = data;
        });
    };
    TeamsComponent.prototype.filtering = function (data) {
        this.data = data;
    };
    TeamsComponent.prototype.selectItem = function (item) {
        this.onItemSelected.emit(Object.assign({}, item, { isMatch: false }));
    };
    TeamsComponent.prototype.paginating = function (values) {
        this.dataFrom = values.from;
        this.dataTo = values.to;
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Output"])(),
        __metadata("design:type", Object)
    ], TeamsComponent.prototype, "onItemSelected", void 0);
    TeamsComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-teams',
            template: __webpack_require__(/*! ./teams.component.html */ "./src/app/logged/teams/teams.component.html"),
            styles: [__webpack_require__(/*! ./teams.component.css */ "./src/app/logged/teams/teams.component.css")]
        }),
        __metadata("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_1__["ActivatedRoute"], _data_api_service__WEBPACK_IMPORTED_MODULE_2__["ApiService"]])
    ], TeamsComponent);
    return TeamsComponent;
}());



/***/ }),

/***/ "./src/app/unlogged/sign-up/sign-up.component.css":
/*!********************************************************!*\
  !*** ./src/app/unlogged/sign-up/sign-up.component.css ***!
  \********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".image-container {\n    position: absolute;\n    z-index: -1;\n    top: 0;\n    bottom: 0;\n    left: 0;\n    right: 0;\n\n    background: url('welcome_main.jpg') no-repeat center center fixed;\n    background-size: cover;\n}\n\ndiv.signup-box-wrapper {\n    position: absolute;\n    top: 15%;\n    width: 100%;\n}\n\ndiv.signup-box-wrapper > * {\n    margin: 0 !important;\n}\n\ndiv.signup-box-wrapper > .row{\n    padding-bottom: 30px;\n}\n\ndiv.signup-box {\n    padding: 15px !important;\n}\n\n.align-center {\n    text-align: center;\n}\n\n.btns-row {\n    margin-top: 5px !important;\n    display: inline-block;\n    width: 100%;\n}\n\n.btn-wraper-right {\n    float: right;\n}\n\n.btn-wraper-left {\n    float: left;\n    margin-left: 30px;\n}"

/***/ }),

/***/ "./src/app/unlogged/sign-up/sign-up.component.html":
/*!*********************************************************!*\
  !*** ./src/app/unlogged/sign-up/sign-up.component.html ***!
  \*********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"image-container\"></div>\n<div class=\"signup-box-wrapper\">\n    <div class=\"row\">\n        <div class=\"col-md-2 col-0\"></div>\n        <div class=\"bg-white rounded signup-box col-md-8 col-12\">\n            <h3 class=\"align-center\">Join {{globals.app_name}}</h3>\n            <p class=\"lead align-center\">Create your pesonal account</p>\n            <div class=\"alert alert-danger\" *ngIf=\"errorMessage != null\" role=\"alert\">{{ errorMessage }}</div>\n            <form novalidate [formGroup]=\"form\">\n                <div class=\"row\">\n                    <div class=\"col-md-6\">\n                        <div class=\"form-group col-12\">\n                            <label for=\"nameInput\">\n                                <b>Name</b>\n                            </label>\n                            <input type=\"text\" class=\"form-control\" id=\"nameInput\" placeholder=\"Enter name\" formControlName=\"Name\">\n                        </div>\n                        <div class=\"form-group col-12\">\n                            <label for=\"emailInput\">\n                                <b>Email</b>\n                            </label>\n                            <input type=\"email\" class=\"form-control\" id=\"emailInput\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\" formControlName=\"Email\">\n                            <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n                        </div>\n                        <div class=\"form-group col-12\">\n                            <label for=\"passwordInput\">\n                                <b>Password</b>\n                            </label>\n                            <input type=\"password\" class=\"form-control\" id=\"passwordInput\" placeholder=\"Password\" formControlName=\"Password\">\n                        </div>\n                        <div class=\"form-group col-12\">\n                            <label for=\"passwordRInput\">\n                                <b>Repeat password</b>\n                            </label>\n                            <input type=\"password\" class=\"form-control\" id=\"passwordRInput\" placeholder=\"Password\" formControlName=\"PasswordR\">\n                        </div>\n                    </div>\n                    <div class=\"form-group col-md-6\">\n                        <div class=\"settings-item\">\n                            <p>\n                                <b>Payment method</b>\n                            </p>\n                            <ngb-tabset justify=\"center\">\n                                <ngb-tab title=\"Invoice Payment\" id=\"InvoicePayment\">\n                                    <ng-template ngbTabContent>\n                                        <p>Choose invoice payment if you want to receive a detailed invoice with a breakdown\n                                            of all information you received and the total spent with no traffic limits.</p>\n                                    </ng-template>\n                                </ngb-tab>\n                                <ngb-tab title=\"Prepaid card\" id=\"PrepaidCard\" [disabled]=\"true\">\n                                    <ng-template ngbTabContent>\n                                        <p>If you opt for a prepaid card you will receive information until you have exhausted\n                                            your balance card. To keep usufruating the service you need to recharge the card.\n                                        </p>\n                                    </ng-template>\n                                </ngb-tab>\n                                <ngb-tab title=\"Monthly bill\" id=\"MonthlyBill\" [disabled]=\"true\">\n                                    <ng-template ngbTabContent>\n                                        <p>Opting for a monthly bill, you will establish a limit of information that can be\n                                            sent to you, according to the ammount you signed.</p>\n                                    </ng-template>\n                                </ngb-tab>\n                            </ngb-tabset>\n                        </div>\n                    </div>\n\n                    <div class=\"row btns-row\">\n                        <div class=\"btn-wraper-left\">\n                            <button class=\"btn btn-link\" routerLink=\"/\">Cancel</button>\n                        </div>\n                        <div class=\"btn-wraper-right\">\n                            <button class=\"btn btn-primary\" (click)=\"signUpAccount()\">Sign up</button>\n                        </div>\n                    </div>\n                </div>\n            </form>\n        </div>\n        <div class=\"col-md-2 col-0\"></div>\n    </div>\n</div>"

/***/ }),

/***/ "./src/app/unlogged/sign-up/sign-up.component.ts":
/*!*******************************************************!*\
  !*** ./src/app/unlogged/sign-up/sign-up.component.ts ***!
  \*******************************************************/
/*! exports provided: SignUpComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SignUpComponent", function() { return SignUpComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _data_api_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../data/api.service */ "./src/app/data/api.service.ts");
/* harmony import */ var _ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @ng-bootstrap/ng-bootstrap */ "./node_modules/@ng-bootstrap/ng-bootstrap/index.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _common_globals__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../../common/globals */ "./src/app/common/globals.ts");
/* harmony import */ var _common_notifications_notifications_service__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ../../common/notifications/notifications.service */ "./src/app/common/notifications/notifications.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};







var SignUpComponent = /** @class */ (function () {
    function SignUpComponent(globals, fb, router, apiService, notificationsService) {
        this.globals = globals;
        this.fb = fb;
        this.router = router;
        this.apiService = apiService;
        this.notificationsService = notificationsService;
        this.errorMessage = null;
    }
    Object.defineProperty(SignUpComponent.prototype, "content", {
        set: function (content) {
            this.tabSet = content;
        },
        enumerable: true,
        configurable: true
    });
    ;
    SignUpComponent.prototype.ngOnInit = function () {
        this.form = this.fb.group({
            Name: [null, _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required],
            Email: [null, _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required],
            Password: [null, _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required],
            PasswordR: [null, _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required],
        });
    };
    SignUpComponent.prototype.signUpAccount = function () {
        var _this = this;
        this.errorMessage = null;
        if (!this.form.valid) {
            this.errorMessage = "All fields must be filled";
            return;
        }
        else if (this.form.value.Password !== this.form.value.PasswordR) {
            this.errorMessage = "Passwords must match";
            return;
        }
        else if (this.tabSet.activeId === "PrepaidCard") {
            this.errorMessage = "ERROR: Payment method not available, yet!";
            return;
        }
        else {
            var user = {
                "email": this.form.value.Email,
                "name": this.form.value.Name,
                "password": this.form.value.Password,
                "paymentManager": {
                    "currentAmount": 0,
                    "type": this.tabSet.activeId
                }
            };
            this.apiService.setEntity('users/register');
            this.apiService.postRequest(user).subscribe(function (data) {
                if (data === -1) {
                    _this.notificationsService.notify('error', 'Unvalid information', 'User\'s email already exists.');
                }
                else {
                    _this.notificationsService.notify('success', 'Sucess', 'You just have successfully created a new account.');
                    _this.router.navigate(['/welcome']);
                }
            });
        }
    };
    __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["ViewChild"])(_ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_3__["NgbTabset"]),
        __metadata("design:type", _ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_3__["NgbTabset"]),
        __metadata("design:paramtypes", [_ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_3__["NgbTabset"]])
    ], SignUpComponent.prototype, "content", null);
    SignUpComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-sign-up',
            template: __webpack_require__(/*! ./sign-up.component.html */ "./src/app/unlogged/sign-up/sign-up.component.html"),
            styles: [__webpack_require__(/*! ./sign-up.component.css */ "./src/app/unlogged/sign-up/sign-up.component.css")]
        }),
        __metadata("design:paramtypes", [_common_globals__WEBPACK_IMPORTED_MODULE_5__["Globals"], _angular_forms__WEBPACK_IMPORTED_MODULE_1__["FormBuilder"], _angular_router__WEBPACK_IMPORTED_MODULE_4__["Router"], _data_api_service__WEBPACK_IMPORTED_MODULE_2__["ApiService"],
            _common_notifications_notifications_service__WEBPACK_IMPORTED_MODULE_6__["NotificationsService"]])
    ], SignUpComponent);
    return SignUpComponent;
}());



/***/ }),

/***/ "./src/app/unlogged/unlogged-navbar/unlogged-navbar.component.css":
/*!************************************************************************!*\
  !*** ./src/app/unlogged/unlogged-navbar/unlogged-navbar.component.css ***!
  \************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".navbar-brand {\n    /* !important; */\n    font-family: Georgia, serif  !important;\n    font-weight: bold  !important;\n    color: rgb(63, 63, 63) !important;\n    text-shadow: 2px 2px 3px rgba(255,255,255,0.1) !important;\n    text-transform: uppercase !important;\n    letter-spacing: 4px !important;\n    font-size: 30px !important;\n}\n\n.navbar {\n    z-index: 999;\n}"

/***/ }),

/***/ "./src/app/unlogged/unlogged-navbar/unlogged-navbar.component.html":
/*!*************************************************************************!*\
  !*** ./src/app/unlogged/unlogged-navbar/unlogged-navbar.component.html ***!
  \*************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n  <a class=\"navbar-brand\" routerLink=\"/\">{{ globals.app_name }}</a>\n  <button class=\"navbar-toggler\" type=\"button\" (click)=\"isCollapsed = !isCollapsed\" [attr.aria-expanded]=\"!isCollapsed\" aria-controls=\"navbarSupportedContent\">\n    <span class=\"navbar-toggler-icon\"></span>\n  </button>\n\n  <div class=\"navbar-collapse\" id=\"navbarSupportedContent\" [ngbCollapse]=\"isCollapsed\">\n    <ul class=\"navbar-nav mr-auto\"></ul>\n    <form class=\"form-inline my-2 my-lg-0\" [formGroup]=\"form\">\n      <input class=\"form-control mr-sm-2\" type=\"email\" placeholder=\"Email\" aria-label=\"Email\" formControlName=\"Email\" required>\n      <input class=\"form-control mr-sm-2\" type=\"password\" placeholder=\"Password\" aria-label=\"Password\" formControlName=\"Password\"\n        required>\n      <button class=\"btn btn-success my-2 my-sm-0\" (click)=\"loginUser()\">Login</button>\n      <a class=\"btn btn-link my-2 my-sm-0\" routerLink=\"/signup\">Sign up</a>\n    </form>\n  </div>\n</nav>"

/***/ }),

/***/ "./src/app/unlogged/unlogged-navbar/unlogged-navbar.component.ts":
/*!***********************************************************************!*\
  !*** ./src/app/unlogged/unlogged-navbar/unlogged-navbar.component.ts ***!
  \***********************************************************************/
/*! exports provided: UnloggedNavbarComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "UnloggedNavbarComponent", function() { return UnloggedNavbarComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _common_globals__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../common/globals */ "./src/app/common/globals.ts");
/* harmony import */ var _auth_auth_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../../auth/auth.service */ "./src/app/auth/auth.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var UnloggedNavbarComponent = /** @class */ (function () {
    function UnloggedNavbarComponent(globals, fb, authService) {
        this.globals = globals;
        this.fb = fb;
        this.authService = authService;
        this.isCollapsed = true;
    }
    UnloggedNavbarComponent.prototype.ngOnInit = function () {
        this.form = this.fb.group({
            Email: ['', _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required],
            Password: ['', _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required]
        });
    };
    UnloggedNavbarComponent.prototype.loginUser = function () {
        if (this.form.valid) {
            this.authService.login(this.form.value);
        }
    };
    UnloggedNavbarComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-unlogged-navbar',
            template: __webpack_require__(/*! ./unlogged-navbar.component.html */ "./src/app/unlogged/unlogged-navbar/unlogged-navbar.component.html"),
            styles: [__webpack_require__(/*! ./unlogged-navbar.component.css */ "./src/app/unlogged/unlogged-navbar/unlogged-navbar.component.css")]
        }),
        __metadata("design:paramtypes", [_common_globals__WEBPACK_IMPORTED_MODULE_2__["Globals"], _angular_forms__WEBPACK_IMPORTED_MODULE_1__["FormBuilder"], _auth_auth_service__WEBPACK_IMPORTED_MODULE_3__["AuthService"]])
    ], UnloggedNavbarComponent);
    return UnloggedNavbarComponent;
}());



/***/ }),

/***/ "./src/app/unlogged/welcome/welcome.component.css":
/*!********************************************************!*\
  !*** ./src/app/unlogged/welcome/welcome.component.css ***!
  \********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".image-container {\n    position: absolute;\n    z-index: -1;\n    top: 0;\n    bottom: 0;\n    left: 0;\n    right: 0;\n\n    background: url('welcome_main.jpg') no-repeat center center fixed;\n    background-size: cover;\n}\n\ndiv.welcome-message-wrapper {\n    text-align: center;\n    position: absolute;\n    bottom: 20%;\n    width: 100%;\n}\n\ndiv.welcome-message-wrapper * {\n    padding-left: 0 !important;\n    padding-right: 0 !important;\n    margin: 0 !important;\n}"

/***/ }),

/***/ "./src/app/unlogged/welcome/welcome.component.html":
/*!*********************************************************!*\
  !*** ./src/app/unlogged/welcome/welcome.component.html ***!
  \*********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"image-container\"></div>\n<div class=\"welcome-message-wrapper\">\n    <div class=\"row\">\n        <div class=\"col-sm-3 col-0\"></div>\n        <div class=\"shadow-lg p-3 mb-5 bg-white rounded welcome-message col-sm-6\">\n            <p class=\"lead\">We'll keep you updated about your favourite sports' events</p>\n            <a class=\"btn btn-link my-2 my-sm-0\" routerLink=\"/signup\"><strong>Sign up now</strong></a>\n        </div>\n        <div class=\"col-sm-3 col-sm-0\"></div>\n    </div>\n</div>"

/***/ }),

/***/ "./src/app/unlogged/welcome/welcome.component.ts":
/*!*******************************************************!*\
  !*** ./src/app/unlogged/welcome/welcome.component.ts ***!
  \*******************************************************/
/*! exports provided: WelcomeComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "WelcomeComponent", function() { return WelcomeComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var WelcomeComponent = /** @class */ (function () {
    function WelcomeComponent() {
    }
    WelcomeComponent.prototype.ngOnInit = function () {
    };
    WelcomeComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-welcome',
            template: __webpack_require__(/*! ./welcome.component.html */ "./src/app/unlogged/welcome/welcome.component.html"),
            styles: [__webpack_require__(/*! ./welcome.component.css */ "./src/app/unlogged/welcome/welcome.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], WelcomeComponent);
    return WelcomeComponent;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build ---prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false,
    pusher: {
        key: '1d3b137c219c83de17e0',
    }
};
/*
 * In development mode, to ignore zone related error stack frames such as
 * `zone.run`, `zoneDelegate.invokeTask` for easier debugging, you can
 * import the following file, but please comment it out in production mode
 * because it will have performance impact when throw error
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! /Users/Ricardo/Documents/Git/Sportify/Sportify-Front-end/src/main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map