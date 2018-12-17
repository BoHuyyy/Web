import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Router } from '@angular/router';
import { Location } from '@angular/common';


@Component({
  selector: 'app-clerk',
  templateUrl: './clerk.component.html',
  styleUrls: ['./clerk.component.css']
})
export class ClerkComponent implements OnInit {

  constructor(private location: Location,private router: Router,private http: HttpClient) { }
	
	submit(id,username,phone,days,starttime,endtime,reason){
		const httpOptions = {
			headers: new HttpHeaders({
					'Content-Type':  'application/json'
				})
		};
		var info={
			id:id,
			name:username,
			phone:phone,
			days:days,
			beginTime:starttime,
			endTime:endtime,
			reason:reason
		};
		const url= "http://172.25.71.76:8080/WebAttendance/sinsert/do";
		
		this.http.post(url, info, httpOptions).subscribe((data)=> {
			console.log(data)
			if(data=="1"){
				alert("提交成功");
			}
			else if(data=="0"){
				alert("提交失败，请稍后再试");
			}
		});
	}

  ngOnInit() {
  }

}
