import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
import { inventario } from 'src/app/model/inventario.model';

@Injectable({
  providedIn: 'root'
})
export class InventarioService {

  inven : inventario[];
  urlInv = "http://localhost:8080/Fortnite/rest/proyecto/locker?iduser=";

  
  private messageSource = new BehaviorSubject(new Number);
  currentMessage = this.messageSource.asObservable();
  
  changeMessage(message:Number){
    this.messageSource.next(message);
    console.log("en el change message :" + message)
  }
  
  constructor(private _http : HttpClient) { }

  getInven(id : Number) : Observable<inventario[]>{
    return this._http.get<inventario[]>(this.urlInv + id).pipe();
  }
}
