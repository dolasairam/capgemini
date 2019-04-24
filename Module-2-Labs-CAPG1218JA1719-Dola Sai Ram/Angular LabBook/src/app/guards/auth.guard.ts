import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Observable } from 'rxjs';
import { Router} from '@angular/router';
@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
   constructor(private router:Router){}
  canActivate()
  {
    // localStorage.setItem('key','value');
    // localStorage.getItem('key');
    // localStorage.removeItem('key');
     let name="anuj";
     if(name=="anuj")
     {
       return true;
     }
     else
     {
       alert("You are not authorise");
       this.router.navigate(['/assignment-three'])
     }
  }
}
