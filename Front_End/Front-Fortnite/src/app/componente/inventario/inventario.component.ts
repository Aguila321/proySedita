import { Component, OnInit } from '@angular/core';
import { InventarioService } from 'src/app/servicio/inventario/inventario.service';
import { ServicioUsuarioService } from 'src/app/servicio/usuario/servicio-usuario.service';
import { inventario } from 'src/app/model/inventario.model';
import { Router, ActivatedRoute } from '@angular/router';
import { item } from 'src/app/model/item.model';

@Component({
  selector: 'app-inventario',
  templateUrl: './inventario.component.html',
  styleUrls: ['./inventario.component.css']
})
export class InventarioComponent implements OnInit {

  inputId: Number = 0;
  id : number;
  inven : inventario[];
  item : item = {
    idItem : 0
  }

  idItem: Number = 0;

  constructor(private service : InventarioService, private user_service : ServicioUsuarioService, 
    private router : Router,private activatedRoute: ActivatedRoute) {
    
   }

  ngOnInit() {
    this.activatedRoute.params.subscribe(parameters =>{
      this.id = parameters["id"];
      
      this.service.getInven(this.id).subscribe(data=>{
     
       this.inven = data;
       for(let i = 0; this.inven.length<0; i++){
         this.idItem = this.inven[i].item;
        
       }
      
       // this.precio = data.precioItem;
        console.log(this.inven);
        console.log(this.idItem);
      });
    });
  }


}
