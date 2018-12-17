import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Router } from '@angular/router';
import { Location } from '@angular/common';

@Component({
  selector: 'app-enroll',
  templateUrl: './enroll.component.html',
  styleUrls: ['./enroll.component.css']
})
export class EnrollComponent implements OnInit {

  constructor(private location: Location,private router: Router,private http: HttpClient) { }
	
	register(id,password,name,phone){
		const httpOptions = {
			headers: new HttpHeaders({
					'Content-Type':  'application/json'
				})
		};
		var info={
			id:id,
			password:password,
			name:name,
			phone:phone
		};
		const url= "http://172.25.71.76:8080/WebAttendance/register/do";
		
		this.http.post(url, info, httpOptions).subscribe((data)=> {
			console.log(data)
			if(data=="1"){
				alert("注册成功！即将跳转到登录界面。");
				this.router.navigateByUrl("");
			}
			else if(data=="0"){
				alert("注册失败，请稍后再试...");
			}
		});
		
	}

  ngOnInit() {
  }

}
