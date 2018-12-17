import { Component, OnInit,Output, EventEmitter } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Router } from '@angular/router';
import { Location } from '@angular/common';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  // @output private outer = new EventEmitter<string>();
	
  constructor(private location: Location,private router: Router) { }

  post(id){
		// this.outer.emit(formid);
		const url = "http://172.25.71.76:8080/WebAttendance/select/do";
		alert(id);
		this.router.navigateByUrl("/result");
	}
	
  ngOnInit() {
// 		post(formid){
// 			
// 		}
  }
}

// export class Formid{
// 	constructor(
// 	public Formid:number
// 	){}
// }
// 