import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Pavo } from '../../model/pavo.model';
import { map } from 'rxjs/operators'
import { Observable, BehaviorSubject } from 'rxjs';
import { CompraPavoPersonalizado } from '../../model/comprapavo.model';

@Injectable({
  providedIn: 'root'
})
export class PavoService {

 // pavo : Pavo;
  urlGeneral :string="http://localhost:8080/Fortnite/rest/proyecto/";
  urlListPavo :string =this.urlGeneral +"pavos"
  urlGetPavo :string=this.urlGeneral+"";
  urlCompraPavo : string =this.urlGeneral+"compraPavos2";
  urlFilter = this.urlGeneral + "PavosFil?idPavos=";
  constructor(private http : HttpClient) { }

  getPavos(): Observable<Pavo[]>{
    
    return this.http.get(this.urlListPavo).pipe(map( (rest:any) =>{
        return rest;
    }));

  }
  compraPavo : CompraPavoPersonalizado;
  buyPav(compraPavo) : Observable<CompraPavoPersonalizado>{
    let body = JSON.stringify(compraPavo);
    let headers = new HttpHeaders ({
      'Content-Type': 'application/json'
    });
    return this.http.post(this.urlCompraPavo,body,{headers:headers});

  }

  private messageSource = new BehaviorSubject(new Number);
  currentMessage = this.messageSource.asObservable();

  getPavobyId(id : number){
    return this.http.get<Pavo>(this.urlFilter + id).pipe();
  }

  changeMessage(message:Number){
    this.messageSource.next(message);
    console.log("en el change message :" + message)
  }
 
}
