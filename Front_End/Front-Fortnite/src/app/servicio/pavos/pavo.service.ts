import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Pavo } from '../../model/pavo.model';
import { map } from 'rxjs/operators'
import { Observable } from 'rxjs'
@Injectable({
  providedIn: 'root'
})
export class PavoService {

 // pavo : Pavo;
  urlGeneral :string="http://localhost:8080/Fortnite/rest/proyecto/";
  urlListPavo :string =this.urlGeneral +"pavos"
  urlGetPavo :string=this.urlGeneral+"";
  constructor(private http : HttpClient) { }

  getPavos(): Observable<Pavo[]>{
    
    return this.http.get(this.urlListPavo).pipe(map( (rest:any) =>{
        return rest;
    }));

  }
  
}
