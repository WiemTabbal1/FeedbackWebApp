import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdddefaultService {

  constructor(private http: HttpClient) { }

  API = 'http://localhost:8100/api/v1/defaut';

  

  public deleteadddefault(id: any) {
    return this.http.delete(this.API + '/defauts/' + id);
  }

 
}
