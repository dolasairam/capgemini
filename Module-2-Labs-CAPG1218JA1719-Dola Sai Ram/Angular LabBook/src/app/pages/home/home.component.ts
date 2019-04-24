import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/services/book.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private bookser:BookService) { }
  bookData;
  ngOnInit() {
      this.bookser.getBooksDetails()
      .subscribe(res=>
        {
          this.bookData=res;
          console.log(this.bookData)
        })
  }

}
