import { Component } from '@angular/core';
import * as $ from 'jquery';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = '员工请假系统';
  private msgFromSerch:string;
  receive(msg:string){
	  this.msgFromSerch = msg;
  }
}


