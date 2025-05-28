import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ListedefautService {

  constructor(private http: HttpClient) { }

  API = 'http://localhost:8095/api/v1/defaut';


  public deleteDefaut(id: any) {
    return this.http.delete(this.API + '/id=' + id);
  }

  public updateDefaut(listedefaut: any) {
    return this.http.put(this.API + '/updateDefauts', listedefaut);
  }
}