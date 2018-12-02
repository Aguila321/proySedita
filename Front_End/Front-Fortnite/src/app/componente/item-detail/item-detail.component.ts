import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ItemService } from 'src/app/servicio/item/item.service';
import { item } from 'src/app/model/item.model';

import { NgForm } from '@angular/forms';
import { CompraItemPersonalizado } from '../../model/compraitem.model';


@Component({
  selector: 'app-item-detail',
  templateUrl: './item-detail.component.html',
  styleUrls: ['./item-detail.component.css']
})
export class ItemDetailComponent implements OnInit {

  inputId: Number =0;
  id : number;
  item : item;
  compra : CompraItemPersonalizado ={
    usuario:{
      iduser:  this.inputId,	
      
    },
    itemDetalle:{
      item:{
        idItem:0,
      },
      precio:0

    }
  };
  constructor(private service : ItemService,private route: Router,
     private activatedRoute: ActivatedRoute
     ) { 
     
   }

  ngOnInit() {
    this.activatedRoute.params.subscribe(parameters =>{
      this.id = parameters["id"];
      
      this.service.getItemById(this.id).subscribe(data=>{
        this.item = data;
        console.log(this.item);
      });
    });
    this.service.currentMessage.subscribe(message =>
      this.inputId = message);
console.log('en el servicio item     ' + this.inputId);
      this.compra.usuario.iduser = this.inputId;
  }
  registrarCompraItem(forma : NgForm){
    return this.service.buyItem(this.compra)
            .subscribe(  data=>{
              this.compra = data;
            },error => console.log(error));

  }  

}
