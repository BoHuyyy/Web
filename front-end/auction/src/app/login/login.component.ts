import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Router } from '@angular/router';
import { Location } from '@angular/common';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

	
  constructor(private location: Location,private router: Router,private http: HttpClient) { }
	
	find(id,password){
		
		 const url = "http://172.25.71.76:8080/WebAttendance/login/do";
    const httpOptions = {
      headers: new HttpHeaders({
          'Content-Type':  'application/json'
        })
    };
	 var staff={
			password:password,
			id:id
	 }
		
	this.http.post(url,staff,httpOptions).subscribe((data)=> {
		if (data==1){
			this.router.navigateByUrl("/manager");
		}else if(data==0){
			this.router.navigateByUrl("/clerk");
		}else{
			console.log("用户名或密码错误");
		}
	});
	}
  ngOnInit() {
  }

}
