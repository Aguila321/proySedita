import { Component, OnInit } from '@angular/core';
import { PavoService } from '../../servicio/pavos/pavo.service';
import { Pavo } from '../../model/pavo.model';

@Component({
  selector: 'app-list-pavo',
  templateUrl: './list-pavo.component.html',
  styleUrls: ['./list-pavo.component.css']
})
export class ListPavoComponent implements OnInit {
  pavos : Pavo[];
  constructor(private servicio: PavoService) {
    this.servicio.getPavos().subscribe( data=>{
      this.pavos= data
      console.log(this.pavos);
    })
   }

  ngOnInit() {
  }


}
