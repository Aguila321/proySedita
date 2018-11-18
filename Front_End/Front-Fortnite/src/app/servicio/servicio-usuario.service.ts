import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Usuario } from '../model/usuario.interface';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators'


@Injectable({
  providedIn: 'root'
})
export class ServicioUsuarioService {

  usuario : Usuario;

  /* URL GENERAL*/ 
  urlGeneral ="http://localhost:8080/Fortnite/rest/proyecto/";
  urlRegister = this.urlGeneral +"regUsuario"
  
  constructor(private http:HttpClient) { }

  registrarUsuario(usuario : Usuario) : Observable<any>{
    let body = JSON.stringify(usuario);
    let headers = new HttpHeaders({
      'Content-Type': 'application/json'
    });
    console.log(this.urlRegister);
    return this.http.post(this.urlRegister,body,{headers:headers});
  }
}
