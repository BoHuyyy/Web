import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {Code404Component} from './code404/code404.component';
import {MainbodyComponent} from './mainbody/mainbody.component';
import {ClerkComponent} from './clerk/clerk.component';
import {ManagerComponent} from './manager/manager.component';
import {ResultComponent} from './result/result.component';
import {EnrollComponent} from './enroll/enroll.component';

const routes: Routes = [
  {path: '', component: MainbodyComponent},
  {path: 'clerk', component: ClerkComponent},
  {path: 'manager', component: ManagerComponent},
  {path: 'result', component: ResultComponent},
  {path: 'enroll', component: EnrollComponent},
  {path: '**', component: Code404Component}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
