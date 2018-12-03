import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ItemService } from 'src/app/servicio/item/item.service';
import { item } from 'src/app/model/item.model';

import { NgForm } from '@angular/forms';
import { CompraItemPersonalizado } from '../../model/compraitem.model';
import { Usuario } from 'src/app/model/usuario.interface';
import { ServicioUsuarioService } from 'src/app/servicio/usuario/servicio-usuario.service';


@Component({
  selector: 'app-item-detail',
  templateUrl: './item-detail.component.html',
  styleUrls: ['./item-detail.component.css']
})
export class ItemDetailComponent implements OnInit {
  private mellegasalpincho:string;
  inputId: Number =0;
  pavos : Number = 0;
  id : number;
  precio : number=0;
  usuario : Usuario = {
    pavos: this.pavos
  };
  item : item;
  
  compra : CompraItemPersonalizado ={
    usuario:{
      iduser:  this.inputId
      
    },
    itemDetalle:{
      item:{
        idItem: this.id,
      },
       precio:this.precio

    }
  };
  constructor(private service : ItemService,private route: Router,
     private activatedRoute: ActivatedRoute, private user_service : ServicioUsuarioService
     ) { 
      this.activatedRoute.params.subscribe(parameters =>{
        this.id = parameters["id"];
        
        this.service.getItemById(this.id).subscribe(data=>{
       
         this.item = data;
         this.precio=this.item[0].precioItem;
         // this.precio = data.precioItem;
          console.log(this.item);
          this.compra.itemDetalle.item.idItem = this.id;
          
          this.compra.itemDetalle.precio = this.precio;
          console.log(this.compra.itemDetalle.precio);

          
          //this.compra.itemDetalle.item.idItem= Number(this.item.idItem);
          //this.compra.itemDetalle.precio = this.item.precioItem;
     
        });
      });
   }

  ngOnInit() {
   
    this.service.currentMessage.subscribe(message =>
      this.inputId = message);
      
      this.user_service.currentPavos.subscribe(message =>{
        this.pavos = message
      });
   
      console.log('en el servicio item: ' + this.inputId + " pavos: " + this.pavos);
      this.compra.usuario.iduser = this.inputId;
  }
  registrarCompraItem(forma : NgForm){
    if(this.inputId==0){
      return this.route.navigate(['/login']);
    }
    else if(this.pavos < this.precio){
      return this.route.navigate(['/lista-pavo']);
    }
    else{
    return this.service.buyItem(this.compra)
            .subscribe(data=>{
              this.compra = data;
              console.log(this.compra);
            },error => console.log(error));

    }
  }  



}
