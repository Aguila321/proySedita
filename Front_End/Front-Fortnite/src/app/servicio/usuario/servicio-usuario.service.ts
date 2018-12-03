import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Usuario } from '../../model/usuario.interface';
import { Observable, BehaviorSubject } from 'rxjs';
import { map } from 'rxjs/operators'


@Injectable({
  providedIn: 'root'
})
export class ServicioUsuarioService {

  usuario: Usuario;

  /* URL GENERAL*/
  urlGeneral = "http://localhost:8080/Fortnite/rest/proyecto/";
  urlRegister = this.urlGeneral + "regUsuario"
  urlLogin = this.urlGeneral + "loginUsuario";

  private messageSource = new BehaviorSubject('');
  currentMessage = this.messageSource.asObservable();

  constructor(private http: HttpClient) { }

  changeMessage(message: string) {
    this.messageSource.next(message);
    console.log("en el change message :" + message)
  }

  private messageSource2 = new BehaviorSubject(new Number);
  currentPavos = this.messageSource2.asObservable();
  
  obtenerPavo(pavos: Number) {
    this.messageSource2.next(pavos);
  }
  registrarUsuario(usuario: Usuario): Observable<any> {
    let body = JSON.stringify(usuario);
    let headers = new HttpHeaders({
      'Content-Type': 'application/json'
    });
    console.log(this.urlRegister);
    return this.http.post(this.urlRegister, body, { headers: headers });
  }
  loginUsuario(usuario): Observable<any> {
    let body = JSON.stringify(usuario);
    let headers = new HttpHeaders({
      'Content-Type': 'application/json'
    });
    return this.http.post(this.urlLogin, body, { headers: headers });
  }
}
