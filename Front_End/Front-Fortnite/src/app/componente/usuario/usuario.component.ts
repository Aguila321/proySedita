import { Component, OnInit, Output } from '@angular/core';
import { ServicioUsuarioService } from '../../servicio/usuario/servicio-usuario.service';
import { Usuario } from '../../model/usuario.interface';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { ItemService } from '../../servicio/item/item.service';


@Component({
  selector: 'app-usuario',
  templateUrl: './usuario.component.html',
  styleUrls: ['./usuario.component.css']
})
export class UsuarioComponent implements OnInit {
   public ape : string;
   public idUsu : Number;
   usuario : Usuario = {
    username:'',
    clave:'',
    apellido:''
  };
  constructor(private servicio:ServicioUsuarioService,private  router: Router,
            private servicioItem:ItemService) {
   
   }

  ngOnInit() {
  
   
  }
  login(forma :NgForm){
    return this.servicio.loginUsuario(this.usuario)
        .subscribe( data=>{
         
          if(data ==null){
            alert("Usuario no Registrado");
          }else{
           
            this.usuario = data;
            this.ape= this.usuario.apellido;
            this.idUsu = this.usuario.iduser;
            this.servicio.changeMessage(this.ape);
        
            this.servicioItem.changeMessage(this.idUsu);
            console.log(this.ape);
            console.log('en el servicio login   ' +this.idUsu);
            
          }
        
        }, err => console.log(err));
  }
  

}
