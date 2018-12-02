import { Component,Input, OnInit } from '@angular/core';
import { ServicioUsuarioService } from './servicio/usuario/servicio-usuario.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Front-Fortnite';
  aea:string;
  constructor(private servicio : ServicioUsuarioService){

  }
  ngOnInit(){
    this.servicio.currentMessage.subscribe(message => this.aea = message);
  }

}
