import { Component, OnInit } from '@angular/core';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-httpdata',
  templateUrl: './httpdata.component.html',
  styleUrls: ['./httpdata.component.css']
})
export class HttpdataComponent implements OnInit {

  constructor(private pser:ProductService) { }
  resData;
  ngOnInit() 
  {
    this.pser.getProducts()
    .subscribe(res=>
      {
        this.resData=res;
        console.log(res);
      },err=>
      {
        console.log(err);
      })
  }



}
