import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-listeutilisateur',
  templateUrl: './listeutilisateur.component.html',
  styleUrls: ['./listeutilisateur.component.scss']
})
export class ListeutilisateurComponent implements OnInit {

  data: any[] = [];
  
    constructor(private http: HttpClient) {}
  
    ngOnInit(): void {
      this.fetchData();
    }
  
    fetchData(): void {
      this.http.get<any[]>('http://localhost:8082/api/v1/employee/employees').subscribe((response) => {
        this.data = response;
      });
    
    }
    
    
   

}
