import { Component, OnInit } from '@angular/core';
import { ServicioUsuarioService } from '../../servicio/servicio-usuario.service';
import { Usuario } from '../../model/usuario.interface';

@Component({
  selector: 'app-usuario',
  templateUrl: './usuario.component.html',
  styleUrls: ['./usuario.component.css']
})
export class UsuarioComponent implements OnInit {

  usuario : Usuario=null;
  constructor() { }

  ngOnInit() {
  }

  

}
