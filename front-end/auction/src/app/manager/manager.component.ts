import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Router } from '@angular/router';
import { Location } from '@angular/common';
import {CommonModule} from'@angular/common';
import { Injectable } from '@angular/core'; 


@Component({
  selector: 'app-manager',
  templateUrl: './manager.component.html',
  styleUrls: ['./manager.component.css']
})
export class ManagerComponent implements OnInit {

  
	message_in;
  constructor(private location: Location,private router: Router,private http: HttpClient) { }
		
		
// 	getForms (): Observable<managerss[]>{
// 		const managerUrl="";
// 		return this.http.get<managerss[]>(this.managerUrl);
// 	}operation(id,state)

  operate(num){
		const httpOptions = {
			headers: new HttpHeaders({
					'Content-Type':  'application/json'
				})
		};
		const url = "http://172.25.71.76:8080/WebAttendance/update/do";
		this.http.post(url, num, httpOptions).subscribe((data)=> {
			console.log(data);
			if(data=="1"){
				alert("审批成功");
				window.location.reload();
			}
			else if(data=="0"){
				alert("审批失败，请稍后再试");
			}
		});
	}
  delete(num){
		const httpOptions = {
			headers: new HttpHeaders({
					'Content-Type':  'application/json'
				})
		};
		const url = "http://172.25.71.76:8080/WebAttendance/delete/do";
		this.http.post(url, num, httpOptions).subscribe((data)=> {
			console.log(data);
			if(data=="1"){
				alert("删除成功！");
				window.location.reload();
			}
			else if(data=="0"){
				alert("删除失败，请稍后再试");
			}
		});
	}
	
  ngOnInit() {
				// var message_in;
				const url="http://172.25.71.76:8080/WebAttendance/mselect/do";
				const httpOptions = {
					headers: new HttpHeaders({
							'Content-Type':  'application/json'
						})
				};
				var flag = "1";
				this.http.post(url, flag, httpOptions).subscribe((data)=>
				{	
		        this.message_in=data;
				}
				);
  }
}

 

