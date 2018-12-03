import { Component,Input, OnInit} from '@angular/core';
import { ServicioUsuarioService } from './servicio/usuario/servicio-usuario.service';
import { Router } from '@angular/router';
import { InventarioService } from './servicio/inventario/inventario.service';
import { inventario } from './model/inventario.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Front-Fortnite';
  id : Number = 0;
  pavos : Number = 0;
  inventory : inventario[];
  aea:string;
  constructor(private servicio : ServicioUsuarioService, private route : Router, private inven : InventarioService){
     
  }
  ngOnInit(){
    this.servicio.currentMessage.subscribe(message => this.aea = message);
    this.servicio.currentId.subscribe(message=> this.id = message);
    this.servicio.currentPavos.subscribe(message=>this.pavos = message)
  }
  
  filterItem(id : number){
    this.inven.getInven(this.id).subscribe(data=>{
        this.inventory = data;
        this.route.navigate(['/locker', this.id]);
        console.log(this.inventory);
        console.log("id papeto: " + this.id);
    }) 
  }

  logOut(){
    this.route.navigate(['/login']);
    this.aea = '';
  }
}
