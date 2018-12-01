import { Component, OnInit, Input } from '@angular/core';
import { Usuario } from '../../model/usuario.interface';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  @Input() usuario :Usuario={
    apellido:''
  };
  
  
  constructor() {
    console.log(this.usuario);
   }

  ngOnInit() {
  }
  

}
