import { Component, OnInit } from '@angular/core';
import { ItemService } from 'src/app/servicio/item/item.service';
import { item } from 'src/app/model/item.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-item',
  templateUrl: './list-item.component.html',
  styleUrls: ['./list-item.component.css']
})
export class ListItemComponent implements OnInit {

  items : item[];
  item : item;
  constructor(private service : ItemService, private route : Router) { }

  ngOnInit() {
    this.getItems();
  }


  getItems(){
    this.service.getAllItems().subscribe(data =>{
      this.items = data;
      console.log(this.items);
    })
  }

  filterItem(id : number){
    this.service.getItemById(id).subscribe(data=>{
        this.item = data;
        this.route.navigate(['/item-detail', id]);
        console.log(this.item);
    })
  }

}
