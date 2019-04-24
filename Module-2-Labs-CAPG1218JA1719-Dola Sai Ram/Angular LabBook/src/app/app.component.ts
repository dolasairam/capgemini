import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent 
{
    title="My News Portal";
    tagline="All national news";
    categoryy=["Poltics","Sports","National","Weather","International"];
    abc()
    {
      alert("Hello")
    }
}
