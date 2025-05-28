import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-administrateur',
  templateUrl: './administrateur.component.html',
  styleUrls: ['./administrateur.component.scss']
})
export class AdministrateurComponent {
  email: string ="";
  password: string ="";


  constructor(private router: Router,private http: HttpClient) {}
 


  Login() {
    console.log(this.email);
    console.log(this.password);
 
    let bodyData = {
      email: this.email,
      password: this.password,
    };
 
        this.http.post("http://localhost:8099/api/v1/admin/login", bodyData).subscribe(  (resultData: any) => {
        console.log(resultData);
 
        if (resultData.message == "number not exits")
        {
      
          alert("Email ou mot de passe incorrect");
    
 
        }
        else if(resultData.message == "Login Success")
    
         {
          this.router.navigateByUrl('/homeadmin');
        }
        else
        {
          alert("Email ou mot de passe incorrect");
        }

      });
    }


  
}
