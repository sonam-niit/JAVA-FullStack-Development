import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-switchdemo',
  templateUrl: './switchdemo.component.html',
  styleUrls: ['./switchdemo.component.css']
})
export class SwitchdemoComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  people=[
    {name:"Alex",age:35,country:"MARS"},
    {name:"Bob",age:40,country:"USA"},
    {name:"Catty",age:42,country:"UK"},
    {name:"Sonam",age:30,country:"India"},
  ]

}
