import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { UsuarioComponent } from './componente/usuario/usuario.component';
import { RegistrarUsuarioComponent } from './componente/usuario/registrar-usuario/registrar-usuario.component';
// import generales
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

//servicio
import { ServicioUsuarioService } from './servicio/usuario/servicio-usuario.service';
import { AppRoutingModule } from 'src/app-routing.module';
import { HeaderComponent } from './componente/header/header.component';
import { ListItemComponent } from './componente/list-item/list-item.component';
import { ItemService } from './servicio/item/item.service';
import { ItemDetailComponent } from './componente/item-detail/item-detail.component';
import { ListPavoComponent } from './componente/list-pavo/list-pavo.component';
import { PavoDetailComponent } from './componente/pavo-detail/pavo-detail.component';
import { PavoService } from './servicio/pavos/pavo.service';




@NgModule({
  declarations: [
    AppComponent,
    UsuarioComponent,
    RegistrarUsuarioComponent,
    HeaderComponent,
    ListItemComponent,
    ItemDetailComponent,
    ListPavoComponent,
    PavoDetailComponent,
  
   
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [ItemService,PavoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
