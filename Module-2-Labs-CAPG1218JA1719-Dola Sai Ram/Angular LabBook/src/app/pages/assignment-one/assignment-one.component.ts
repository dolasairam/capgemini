import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-assignment-one',
  templateUrl: './assignment-one.component.html',
  styleUrls: ['./assignment-one.component.css']
})
export class AssignmentOneComponent implements OnInit {
  id1;
  name;
  salary;
  department;
  constructor() { }
  data()
  {
    alert(`${this.id1} ${this.name} ${this.salary} ${this.department} `)
  }
  ngOnInit() {
  }

}
