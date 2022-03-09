import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  fullname:string="Sonam Soni";
  pi:number=3.1415927;
  a:number=0.123456;
  b:number=1.09876;
  today=new Date();
  obj={name:{fname:"alex",lname:"john"},website:"www.blbla.com",numbers:[7,12,89]};
  cust="good morning bye bye"
}
