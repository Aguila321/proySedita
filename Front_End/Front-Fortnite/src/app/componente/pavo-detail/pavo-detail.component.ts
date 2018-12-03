import { Component, OnInit } from '@angular/core';
import { CompraPavoPersonalizado } from 'src/app/model/comprapavo.model'
import { PavoService } from 'src/app/servicio/pavos/pavo.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Pavo } from 'src/app/model/pavo.model';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-pavo-detail',
  templateUrl: './pavo-detail.component.html',
  styleUrls: ['./pavo-detail.component.css']
})

export class PavoDetailComponent implements OnInit {
  inputId: Number = 0;
  id: number;
  pavo: Pavo
  comprapavo: CompraPavoPersonalizado = {
    usuario: {
      iduser: 0,
    },
    pedidoDetalle: {

      pavos: {

        idpavos: 0,
      },
      cantidad: 0,
      precio: 0

    }

  };



  constructor(private service: PavoService, private route: Router,
    private activatedRoute: ActivatedRoute
  ) {

  }

  ngOnInit() {
    this.activatedRoute.params.subscribe(parameters => {
      this.id = parameters["id"];

      this.service.getPavobyId(this.id).subscribe(data => {
        this.pavo = data;
      });
    });
    /* this.service.currentMessage.subscribe(message =>
       this.inputId = message);
       this.comprapavo.usuario.iduser = this.inputId;*/
  }

  registrarCompraPavos(forma: NgForm) {
    return this.service.buyPav(this.comprapavo)
      .subscribe(data => {
        this.comprapavo = data;
        this.route.navigate(['/lista-pavo']);
      }, error => console.log(error));

  }

}
