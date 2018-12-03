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
  pavo: Pavo;
  idpavo:number =0;
  cantidad:number=0;
  precio:number = 0;

  comprapavo: CompraPavoPersonalizado = {
    usuario: {
      iduser: this.inputId,
    },
    pedidoDetalle: {

      pavos: {

        idpavos: this.idpavo,
      },
      cantidad: this.cantidad,
      precio: this.precio

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
        this.idpavo=this.pavo.idpavos;
        this.cantidad= this.pavo.cantidad; 
        this.precio =this.pavo.precio;
        console.log(this.pavo);
        console.log(this.precio);
        console.log(this.idpavo);

        this.comprapavo.pedidoDetalle.pavos.idpavos= this.idpavo;
        this.comprapavo.pedidoDetalle.precio=this.precio;
        this.comprapavo.pedidoDetalle.cantidad=this.cantidad;
        
      });
    });
     this.service.currentMessage.subscribe(message =>
       this.inputId = message);
       this.comprapavo.usuario.iduser = this.inputId;
  }

  registrarCompraPavos(forma: NgForm) {
    return this.service.buyPav(this.comprapavo)
      .subscribe(data => {
        this.comprapavo = data;
        alert("Compra Realizada ...")
        this.route.navigate(['/lista-pavo']);
      }, error => console.log(error));

  }

}
