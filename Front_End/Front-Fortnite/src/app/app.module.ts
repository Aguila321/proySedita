import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { UsuarioComponent } from './componente/usuario/usuario.component';
import { RegistrarUsuarioComponent } from './componente/usuario/registrar-usuario/registrar-usuario.component';
// import generales
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

//servicio
import { ServicioUsuarioService } from './servicio/servicio-usuario.service';
import { AppRoutingModule } from 'src/app-routing.module';
import { HeaderComponent } from './componente/header/header.component';
import { ListItemComponent } from './componente/list-item/list-item.component';
import { ItemService } from './servicio/item/item.service';
import { ItemDetailComponent } from './componente/item-detail/item-detail.component';


@NgModule({
  declarations: [
    AppComponent,
    UsuarioComponent,
    RegistrarUsuarioComponent,
    HeaderComponent,
    ListItemComponent,
    ItemDetailComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [ItemService],
  bootstrap: [AppComponent]
})
export class AppModule { }
