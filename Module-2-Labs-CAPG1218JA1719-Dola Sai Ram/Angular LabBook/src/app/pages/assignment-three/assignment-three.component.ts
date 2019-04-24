import { Component, OnInit } from '@angular/core';
import { FormGroup,FormBuilder,Validators} from '@angular/forms';

@Component({
  selector: 'app-assignment-three',
  templateUrl: './assignment-three.component.html',
  styleUrls: ['./assignment-three.component.css']
})
export class AssignmentThreeComponent implements OnInit {
 myForm:FormGroup;
 arr:any[];
  constructor(private fb:FormBuilder) { 
    this.myForm=this.fb.group(
      {
        'pid':['',Validators.required],
        'pname':['',Validators.required],
        'pcost':['',Validators.required],
        'po':['',Validators.required],
        'pcat':['',Validators.required],
      }
    )
    
  }
  fun1()
  {
    this.arr=this.myForm.getRawValue();
    console.log(this.arr);
  }

  ngOnInit() {
  }

}
