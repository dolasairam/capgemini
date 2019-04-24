import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/services/book.service';
@Component({
  selector: 'app-assignment-four',
  templateUrl: './assignment-four.component.html',
  styleUrls: ['./assignment-four.component.css']
})
export class AssignmentFourComponent implements OnInit {
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
