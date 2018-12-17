import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Router } from '@angular/router';
import { Location } from '@angular/common';
import {CommonModule} from'@angular/common';
import { Injectable } from '@angular/core'; 



@Component({
  selector: 'app-result',
  templateUrl: './result.component.html',
  styleUrls: ['./result.component.css']
})
export class ResultComponent implements OnInit {

  message_in;

  constructor(private location: Location,private router: Router,private http: HttpClient) { }
	
	select(id){
			const url="http://172.25.71.76:8080/WebAttendance/select/do";
			const httpOptions = {
				 headers: new HttpHeaders({
						'Content-Type':  'application/json'
					})
				};
			this.http.post(url, id, httpOptions).subscribe((data)=>
			{	
				this.message_in=data;
			});
	}
	
  ngOnInit() {
		// this.alert(AppComponent.msgFromSerch);
//     this.forms = [
//       new Form(1, '2018-12-10', '陈子豪', '未审核'),
//       new Form(2, '2018-12-10', '陈子豪', '未审核'),
//       new Form(3, '2018-12-10', '陈子豪', '未审核'),
//       new Form(4, '2018-12-10', '陈子豪', '已审核')
//     ];
  }
}

// export class Form {
//   constructor(
//     public id: number,
//     public applyTime: string,
//     public applyPerson: string,
//     public state: string
//   ) {}
// }
