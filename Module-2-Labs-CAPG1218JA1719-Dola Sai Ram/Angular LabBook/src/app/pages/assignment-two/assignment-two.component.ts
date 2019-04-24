import { Component, OnInit } from '@angular/core';
import { FormGroup,FormBuilder,Validators } from '@angular/forms';

@Component({
  selector: 'app-assignment-two',
  templateUrl: './assignment-two.component.html',
  styleUrls: ['./assignment-two.component.css']
})
export class AssignmentTwoComponent implements OnInit {
  myForm:FormGroup;
  myForm2:FormGroup;
  myArr=[];
  msg;
  ind;
  counter=0;
  constructor(private fb:FormBuilder) { 
    this.myForm=this.fb.group(
      {
        'id':['',Validators.required],
        'name':['',Validators.required],
        'salary':['',Validators.required],
        'department':['',Validators.required],
      }
    )
    this.myForm2=this.fb.group(
      {
        'id':['',Validators.required],
        'name':['',Validators.required],
        'salary':['',Validators.required],
        'department':['',Validators.required],
      }
    )
  }
  data()
  {
    let formData=this.myForm.getRawValue();
    this.myArr.push(formData);
    this.msg="DATA INSERTED";
  }
  del(row)
  {
    let ind=this.myArr.indexOf(row);
    this.myArr.splice(ind,1);
    this.msg="Record Deleted";
  }
  updata()
  {
    let fData=this.myForm2.getRawValue();
    this.myArr[this.ind]=fData;
    this.counter=0;
    this.msg="Record Updated";
  }
  up(row)
  {
    this.counter=1;
    this.ind=this.myArr.indexOf(row);
    this.myForm2.controls.id.patchValue(this.myArr[this.ind].id);
    this.myForm2.controls.name.patchValue(this.myArr[this.ind].name);
    this.myForm2.controls.salary.patchValue(this.myArr[this.ind].salary);
    this.myForm2.controls.department.patchValue(this.myArr[this.ind].department);
  }
  ngOnInit() {
  }

}





