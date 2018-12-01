import { Component, OnInit, Output } from '@angular/core';
import { ServicioUsuarioService } from '../../servicio/usuario/servicio-usuario.service';
import { Usuario } from '../../model/usuario.interface';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-usuario',
  templateUrl: './usuario.component.html',
  styleUrls: ['./usuario.component.css']
})
export class UsuarioComponent implements OnInit {

   usuario : Usuario = {
    username:'',
    clave:''
  };
  constructor(private servicio:ServicioUsuarioService,private  router: Router) {
  
   }

  ngOnInit() {
  }
  login(forma :NgForm){
    return this.servicio.loginUsuario(this.usuario)
        .subscribe( data=>{
         
          if(data ==null){
            alert("se queda");
          }else{
            this.usuario = data;
            this.router.navigate(['/item-detail']);
          }
        
        }, err => console.log(err));
  }
  

}
