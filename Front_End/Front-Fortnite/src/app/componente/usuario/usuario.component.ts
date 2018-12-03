import { Component, OnInit} from '@angular/core';
import { ServicioUsuarioService } from '../../servicio/usuario/servicio-usuario.service';
import { Usuario } from '../../model/usuario.interface';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { ItemService } from '../../servicio/item/item.service';
import { PavoService } from 'src/app/servicio/pavos/pavo.service';


@Component({
  selector: 'app-usuario',
  templateUrl: './usuario.component.html',
  styleUrls: ['./usuario.component.css']
})
export class UsuarioComponent implements OnInit{
   public ape : string;
   navigationSubscription;
   public pavos : Number;
   public idUsu : Number;
   usuario : Usuario = {
    username:'',
    clave:'',
    apellido:'',
    pavos: 0
  };
  constructor(private servicio:ServicioUsuarioService,private  router: Router,
            private servicioItem:ItemService, private servicioPavo : PavoService) {
   
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
            this.ape= this.usuario.username;
            this.idUsu = this.usuario.iduser;
            this.pavos = this.usuario.pavos;
            this.servicio.changeMessage(this.ape);
            this.servicio.obtenerPavo(this.pavos);
        
            this.servicioItem.changeMessage(this.idUsu);
            this.servicioPavo.changeMessage(this.idUsu);
            console.log(this.ape);
            console.log('en el servicio login   ' +this.idUsu + " pavos:" + this.pavos);
            this.router.navigate(['/lista-item']);
            
          }
        
        }, err => console.log(err));
  }
  

}
