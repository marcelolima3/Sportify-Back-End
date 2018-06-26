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

module.exports = "html {\n    position: relative;\n    min-height: 100%;\n}\n\nbody {\n  /* Margin bottom by footer height */\n  margin-bottom: 30px;\n  margin-top: 80px;\n}"

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<app-unlogged-navbar></app-unlogged-navbar>\n<router-outlet></router-outlet>\n<app-info-footer></app-info-footer>"

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
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = 'app';
    }
    AppComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        })
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
/* harmony import */ var _common_routing_module_app_routing_module__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./common/routing-module/app-routing.module */ "./src/app/common/routing-module/app-routing.module.ts");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _unlogged_unlogged_navbar_unlogged_navbar_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./unlogged/unlogged-navbar/unlogged-navbar.component */ "./src/app/unlogged/unlogged-navbar/unlogged-navbar.component.ts");
/* harmony import */ var _common_globals__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./common/globals */ "./src/app/common/globals.ts");
/* harmony import */ var _common_info_footer_info_footer_component__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./common/info-footer/info-footer.component */ "./src/app/common/info-footer/info-footer.component.ts");
/* harmony import */ var _unlogged_welcome_welcome_component__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./unlogged/welcome/welcome.component */ "./src/app/unlogged/welcome/welcome.component.ts");
/* harmony import */ var _unlogged_sign_up_sign_up_component__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ./unlogged/sign-up/sign-up.component */ "./src/app/unlogged/sign-up/sign-up.component.ts");
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
                _app_component__WEBPACK_IMPORTED_MODULE_5__["AppComponent"],
                _unlogged_unlogged_navbar_unlogged_navbar_component__WEBPACK_IMPORTED_MODULE_6__["UnloggedNavbarComponent"],
                _common_info_footer_info_footer_component__WEBPACK_IMPORTED_MODULE_8__["InfoFooterComponent"],
                _unlogged_welcome_welcome_component__WEBPACK_IMPORTED_MODULE_9__["WelcomeComponent"],
                _unlogged_sign_up_sign_up_component__WEBPACK_IMPORTED_MODULE_10__["SignUpComponent"]
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"],
                _ng_bootstrap_ng_bootstrap__WEBPACK_IMPORTED_MODULE_2__["NgbModule"].forRoot(),
                _common_routing_module_app_routing_module__WEBPACK_IMPORTED_MODULE_4__["AppRoutingModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_3__["ReactiveFormsModule"]
            ],
            providers: [
                _common_globals__WEBPACK_IMPORTED_MODULE_7__["Globals"]
            ],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_5__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
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

module.exports = "footer {\n    position: absolute;\n    bottom: 0;\n}\n\nfooter,\nfooter .nav {\n    line-height: 30px;\n    width: 100%;\n    height: 30px;\n    padding: 0 !important;\n}\n\n.nav .nav-link {\n    padding-bottom: 0;\n    padding-top: 0;\n}\n\nfooter,\n.nav .nav-link {\n    color: rgb(94, 94, 94) !important;\n}"

/***/ }),

/***/ "./src/app/common/info-footer/info-footer.component.html":
/*!***************************************************************!*\
  !*** ./src/app/common/info-footer/info-footer.component.html ***!
  \***************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<footer>\n    <ul class=\"nav justify-content-end\">\n        <li class=\"nav-item\">\n            <a class=\"nav-link\" href=\"#\">About</a>\n        </li>\n        |\n        <li class=\"nav-item\">\n            <a class=\"nav-link\" href=\"#\">Contact us</a>\n        </li>\n    </ul>\n</footer>"

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
/* harmony import */ var _unlogged_welcome_welcome_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../unlogged/welcome/welcome.component */ "./src/app/unlogged/welcome/welcome.component.ts");
/* harmony import */ var _unlogged_sign_up_sign_up_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../../unlogged/sign-up/sign-up.component */ "./src/app/unlogged/sign-up/sign-up.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};




var routes = [
    { path: '', redirectTo: '/welcome', pathMatch: 'full' },
    { path: 'welcome', component: _unlogged_welcome_welcome_component__WEBPACK_IMPORTED_MODULE_2__["WelcomeComponent"] },
    { path: 'signup', component: _unlogged_sign_up_sign_up_component__WEBPACK_IMPORTED_MODULE_3__["SignUpComponent"] },
    { path: '**', redirectTo: '/welcome' },
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

/***/ "./src/app/unlogged/sign-up/sign-up.component.css":
/*!********************************************************!*\
  !*** ./src/app/unlogged/sign-up/sign-up.component.css ***!
  \********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ".image-container {\n    position: absolute;\n    z-index: -1;\n    top: 0;\n    bottom: 0;\n    left: 0;\n    right: 0;\n\n    background: url('welcome_main.jpg') no-repeat center center fixed;\n    background-size: cover;\n}\n\ndiv.signup-box-wrapper {\n    position: absolute;\n    top: 15%;\n    width: 100%;\n}\n\ndiv.signup-box-wrapper > * {\n    margin: 0 !important;\n}\n\ndiv.signup-box {\n    padding: 15px !important;\n}\n\n.align-center {\n    text-align: center;\n}\n\n.btns-row {\n    margin-top: 5px !important;\n    display: inline-block;\n    width: 100%;\n}\n\n.btn-wraper-right {\n    float: right;\n}\n\n.btn-wraper-left {\n    float: left;\n}"

/***/ }),

/***/ "./src/app/unlogged/sign-up/sign-up.component.html":
/*!*********************************************************!*\
  !*** ./src/app/unlogged/sign-up/sign-up.component.html ***!
  \*********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"image-container\"></div>\n<div class=\"signup-box-wrapper\">\n    <div class=\"row\">\n        <div class=\"col-md-3 col-0\"></div>\n        <div class=\"bg-white rounded signup-box col-md-6 col-12\">\n            <h3 class=\"align-center\">Join {{globals.app_name}}</h3>\n            <p class=\"lead align-center\">Create your pesonal account</p>\n            <div class=\"alert alert-danger\" *ngIf=\"errorMessage != null\" role=\"alert\">{{ errorMessage }}</div>\n            <form novalidate [formGroup]=\"form\" >\n                <div class=\"row\">\n                    <div class=\"form-group col-4\">\n                        <label for=\"nameInput\">Name</label>\n                        <input type=\"text\" class=\"form-control\" id=\"nameInput\" placeholder=\"Enter name\" formControlName=\"Name\">\n                    </div>\n                    <div class=\"form-group col-8\">\n                        <label for=\"emailInput\">Email</label>\n                        <input type=\"email\" class=\"form-control\" id=\"emailInput\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\" formControlName=\"Email\">\n                        <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n                    </div>\n                    <div class=\"form-group col-6\">\n                        <label for=\"passwordInput\">Password</label>\n                        <input type=\"password\" class=\"form-control\" id=\"passwordInput\" placeholder=\"Password\" formControlName=\"Password\">\n                    </div>\n                    <div class=\"form-group col-6\">\n                        <label for=\"passwordRInput\">Repeat password</label>\n                        <input type=\"password\" class=\"form-control\" id=\"passwordRInput\" placeholder=\"Password\" formControlName=\"PasswordR\">\n                    </div>\n                </div>\n                <div class=\"row btns-row\">\n                    <div class=\"btn-wraper-left\">\n                        <button class=\"btn btn-link\" routerLink=\"/\">Cancel</button>\n                    </div>\n                    <div class=\"btn-wraper-right\">\n                        <button class=\"btn btn-primary\" (click)=\"signUpAccount()\">Sign up</button>\n                    </div>\n                </div>\n            </form>\n        </div>\n        <div class=\"col-md-3 col-0\"></div>\n    </div>\n</div>"

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
/* harmony import */ var _common_globals__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../../common/globals */ "./src/app/common/globals.ts");
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
    function SignUpComponent(globals, fb) {
        this.globals = globals;
        this.fb = fb;
        this.errorMessage = null;
    }
    SignUpComponent.prototype.ngOnInit = function () {
        this.form = this.fb.group({
            Name: [null, _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required],
            Email: [null, _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required],
            Password: [null, _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required],
            PasswordR: [null, _angular_forms__WEBPACK_IMPORTED_MODULE_1__["Validators"].required],
        });
    };
    SignUpComponent.prototype.signUpAccount = function () {
        this.errorMessage = null;
        if (!this.form.valid) {
            this.errorMessage = "All fields must be filled";
            return;
        }
        else if (this.form.value.password !== this.form.value.passwordR) {
            this.errorMessage = "Passwords must match";
            return;
        }
        // TODO: register new user
    };
    SignUpComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-sign-up',
            template: __webpack_require__(/*! ./sign-up.component.html */ "./src/app/unlogged/sign-up/sign-up.component.html"),
            styles: [__webpack_require__(/*! ./sign-up.component.css */ "./src/app/unlogged/sign-up/sign-up.component.css")]
        }),
        __metadata("design:paramtypes", [_common_globals__WEBPACK_IMPORTED_MODULE_2__["Globals"], _angular_forms__WEBPACK_IMPORTED_MODULE_1__["FormBuilder"]])
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

module.exports = "<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n  <a class=\"navbar-brand\" routerLink=\"/\">{{ globals.app_name }}</a>\n  <button class=\"navbar-toggler\" type=\"button\" (click)=\"isCollapsed = !isCollapsed\" [attr.aria-expanded]=\"!isCollapsed\" aria-controls=\"navbarSupportedContent\">\n    <span class=\"navbar-toggler-icon\"></span>\n  </button>\n\n  <div class=\"navbar-collapse\" id=\"navbarSupportedContent\" [ngbCollapse]=\"isCollapsed\">\n    <form class=\"form-inline\">\n      <input class=\"form-control mr-sm-2\" type=\"email\" placeholder=\"Email\" aria-label=\"Email\">\n      <input class=\"form-control mr-sm-2\" type=\"password\" placeholder=\"Password\" aria-label=\"Password\">\n      <button class=\"btn btn-success my-2 my-sm-0\" (click)=\"loginUser()\">Login</button>\n      <a class=\"btn btn-link my-2 my-sm-0\" routerLink=\"/signup\">Sign up</a>\n    </form>\n  </div>\n</nav>"

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
/* harmony import */ var _common_globals__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../../common/globals */ "./src/app/common/globals.ts");
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
    function UnloggedNavbarComponent(globals) {
        this.globals = globals;
        this.isCollapsed = true;
    }
    UnloggedNavbarComponent.prototype.ngOnInit = function () {
    };
    UnloggedNavbarComponent.prototype.loginUser = function () {
        // TODO: login user
    };
    UnloggedNavbarComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-unlogged-navbar',
            template: __webpack_require__(/*! ./unlogged-navbar.component.html */ "./src/app/unlogged/unlogged-navbar/unlogged-navbar.component.html"),
            styles: [__webpack_require__(/*! ./unlogged-navbar.component.css */ "./src/app/unlogged/unlogged-navbar/unlogged-navbar.component.css")]
        }),
        __metadata("design:paramtypes", [_common_globals__WEBPACK_IMPORTED_MODULE_1__["Globals"]])
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
    production: false
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