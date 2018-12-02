import { Component, OnInit, Input } from '@angular/core';
import { Usuario } from '../../model/usuario.interface';
import { UsuarioComponent } from '../../componente/usuario/usuario.component';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  
  
  
  constructor() {
    
   }

  ngOnInit() {
  }
  

}
