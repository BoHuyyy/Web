import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
//import { HttpModule }    from '@angular/common/http';
import { HttpClientModule }    from '@angular/common/http';
import { Injectable } from '@angular/core'; 

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { SearchComponent } from './search/search.component';
import { LoginComponent } from './login/login.component';
import { MainbodyComponent } from './mainbody/mainbody.component';
import { Code404Component } from './code404/code404.component';
import { ClerkComponent } from './clerk/clerk.component';
import { ManagerComponent } from './manager/manager.component';
import { ResultComponent } from './result/result.component';
import { EnrollComponent } from './enroll/enroll.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    SearchComponent,
    LoginComponent,
    MainbodyComponent,
    Code404Component,
    ClerkComponent,
    ManagerComponent,
    ResultComponent,
		
    EnrollComponent
  ],
  imports: [
    BrowserModule,
	  HttpClientModule,
		FormsModule,
		
    AppRoutingModule
  ],
  providers: [
	],
  bootstrap: [AppComponent]
})
export class AppModule {
}
