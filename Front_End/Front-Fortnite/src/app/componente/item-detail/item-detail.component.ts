import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ItemService } from 'src/app/servicio/item/item.service';
import { item } from 'src/app/model/item.model';

@Component({
  selector: 'app-item-detail',
  templateUrl: './item-detail.component.html',
  styleUrls: ['./item-detail.component.css']
})
export class ItemDetailComponent implements OnInit {

  id : number;
  item : item;
  constructor(private service : ItemService,private route: Router, private activatedRoute: ActivatedRoute) {
    
   }

  ngOnInit() {
    this.activatedRoute.params.subscribe(parameters =>{
      this.id = parameters["id"];
      
      /*this.service.getItemById(this.id).subscribe(data=>{
        this.item = data;
        console.log(this.id);
      })*/
    })
  }

}