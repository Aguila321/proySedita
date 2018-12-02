import { Component, OnInit } from '@angular/core';
import { PavoService } from '../../servicio/pavos/pavo.service';
import { Pavo } from '../../model/pavo.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-pavo',
  templateUrl: './list-pavo.component.html',
  styleUrls: ['./list-pavo.component.css']
})
export class ListPavoComponent implements OnInit {
  pavos : Pavo[];
  pavo : Pavo;
  constructor(private servicio: PavoService, private route : Router) {
    this.servicio.getPavos().subscribe( data=>{
      this.pavos= data
      console.log(this.pavos);
    })
   }

  ngOnInit() {
  }

  filterPavo(id : number){
    this.servicio.getPavobyId(id).subscribe(data=>{
        this.pavo = data;
        this.route.navigate(['/pavo-detail', id]);
    })
  }

}
