import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-registeradmin',
  templateUrl: './registeradmin.component.html',
  styleUrls: ['./registeradmin.component.scss']
})
export class RegisteradminComponent {

  adminname: string ="";
  email: string ="";
  password: string ="";


  constructor(private http: HttpClient )
  {

  }
  save()
  {
  
    let bodyData = {
      "adminname" : this.adminname,
      "email" : this.email,
      "password" : this.password
    };
    this.http.post("http://localhost:8099/api/v1/admin/save",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("Admin enregistré avec succès");

    });
  }
 
}
