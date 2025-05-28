import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent {
  employeename: string ="";
  numerostation: string ="";
  password: string ="";


  constructor(private http: HttpClient )
  {

  }
  save()
  {
  
    let bodyData = {
      "employeename" : this.employeename,
      "numerostation" : this.numerostation,
      "password" : this.password
    };
    this.http.post("http://localhost:8082/api/v1/employee/save",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("Agent CFE enregistré avec succès");

    });
  }

}