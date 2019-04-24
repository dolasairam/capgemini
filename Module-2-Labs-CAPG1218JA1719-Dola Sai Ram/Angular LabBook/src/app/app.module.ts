import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule,ReactiveFormsModule} from '@angular/forms';
import { HomeComponent } from './pages/home/home.component';
import { HttpClientModule} from '@angular/common/http';
import { SearchPipe } from './pipes/search.pipe';
import { AssignmentOneComponent } from './pages/assignment-one/assignment-one.component';
import { AssignmentTwoComponent } from './pages/assignment-two/assignment-two.component';
import { AssignmentFourComponent } from './pages/assignment-four/assignment-four.component';
import { AssignmentThreeComponent } from './pages/assignment-three/assignment-three.component';
import { HttpdataComponent } from './pages/httpdata/httpdata.component';
import { ProductComponent } from './services/product/product.component';
import { AuthGuard} from './guards/auth.guard';
import { SortPipe } from './pipes/sort.pipe';
@NgModule(
  {
  declarations: [
    AppComponent,
    HomeComponent,
    SearchPipe,
    AssignmentOneComponent,
    AssignmentTwoComponent,
    AssignmentFourComponent,
    AssignmentThreeComponent,
    HttpdataComponent,
    ProductComponent,
    SortPipe,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule ,
    HttpClientModule,
    ReactiveFormsModule//modules 
  ],
  providers: [AuthGuard],//services 
  bootstrap: [AppComponent]
})
export class AppModule { }
