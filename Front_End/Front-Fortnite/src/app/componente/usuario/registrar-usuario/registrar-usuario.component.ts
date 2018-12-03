import { Component, OnInit,Input } from '@angular/core';
import { ServicioUsuarioService } from '../../../servicio/usuario/servicio-usuario.service';
import { Usuario } from '../../../model/usuario.interface';
import { NgForm } from '@angular/forms';
import { Pais } from 'src/app/model/pais.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registrar-usuario',
  templateUrl: './registrar-usuario.component.html',
  styleUrls: ['./registrar-usuario.component.css']
})
export class RegistrarUsuarioComponent implements OnInit {

  paises : Pais[];
  usuario:Usuario ={
    nombre:'',
    apellido:'',
    username:'',
    clave:'',
    fecnac: '',
    email: '',
  
    pais: {
        idpais:0
     
    }
    }
  constructor(private servicio : ServicioUsuarioService, private router : Router) { }

  ngOnInit() {
    this.servicio.getAllCountries().subscribe(response=>{
      this.paises = response;
    })
  }
  registrarUsuario(forma : NgForm){
    this.servicio.registrarUsuario(this.usuario).subscribe( data=>{
      this.usuario = data;
      console.log(this.usuario);
      console.log(data);
      alert("Usuario Registrado!");
      this.router.navigate(['/login']);
    },error => console.log(error));
  }

}
