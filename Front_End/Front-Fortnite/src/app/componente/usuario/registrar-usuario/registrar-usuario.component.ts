import { Component, OnInit } from '@angular/core';
import { ServicioUsuarioService } from '../../../servicio/servicio-usuario.service';
import { Usuario } from '../../../model/usuario.interface';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-registrar-usuario',
  templateUrl: './registrar-usuario.component.html',
  styleUrls: ['./registrar-usuario.component.css']
})
export class RegistrarUsuarioComponent implements OnInit {

  usuario:Usuario ={
    nombre:'',
    apellido:'',
    username:'',
    clave:'',
    fecnac: '',
    email: '',
  
    pais: {
        idpais: 0
     
    }
    }
  constructor(private servicio : ServicioUsuarioService) { }

  ngOnInit() {
  }
  registrarUsuario(forma : NgForm){
    this.servicio.registrarUsuario(this.usuario).subscribe( data=>{

      console.log(this.usuario);
        console.log(data);
    },error => console.log(error));
  }

}
