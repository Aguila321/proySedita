import { Component,Input, OnInit } from '@angular/core';
import { ServicioUsuarioService } from './servicio/usuario/servicio-usuario.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Front-Fortnite';
  aea:string;
  constructor(private servicio : ServicioUsuarioService, private route : Router){

  }
  ngOnInit(){
    this.servicio.currentMessage.subscribe(message => this.aea = message);
  }

  logOut(){
    this.route.navigate(['/login']);
    this.aea = '';
  }
}
