import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { AssignmentOneComponent } from './pages/assignment-one/assignment-one.component';
import { AssignmentTwoComponent } from './pages/assignment-two/assignment-two.component';
import { AssignmentFourComponent } from './pages/assignment-four/assignment-four.component';
import { AssignmentThreeComponent } from './pages/assignment-three/assignment-three.component';
import { HttpdataComponent } from './pages/httpdata/httpdata.component';
import { AuthGuard} from './guards/auth.guard';
const routes: Routes = [
  {path:'',redirectTo:'assignment-one',pathMatch:'full'},
  {path:'assignment-one',component:AssignmentOneComponent,canActivate:[AuthGuard]},
  {path:'assignment-two',component:AssignmentTwoComponent},
  {path:'assignment-three',component:AssignmentThreeComponent},
 {path:'http',component:HttpdataComponent} ,
  {path:'assignment-four',component:AssignmentFourComponent},
  {path:'assignment-five',component:HomeComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
