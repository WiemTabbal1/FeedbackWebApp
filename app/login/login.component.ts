import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
 

  numerostation: string ="";
  password: string ="";


  constructor(private router: Router,private http: HttpClient) {}
 


  Login() {
    console.log(this.numerostation);
    console.log(this.password);
 
    let bodyData = {
      numerostation: this.numerostation,
      password: this.password,
    };
 
        this.http.post("http://localhost:8082/api/v1/employee/login", bodyData).subscribe(  (resultData: any) => {
        console.log(resultData);
 
        if (resultData.message == "number not exits")
        {
      
          alert("number not exits");
    
 
        }
        else if(resultData.message == "Login Success")
    
         {
          this.router.navigateByUrl('/home');
        }
        else
        {
          alert("Numéro station ou mot de passe incorrect");
        }

      });
    }

}