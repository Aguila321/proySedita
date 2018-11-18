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




@NgModule({
  declarations: [
    AppComponent,
    UsuarioComponent,
    RegistrarUsuarioComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ServicioUsuarioService],
  bootstrap: [AppComponent]
})
export class AppModule { }
