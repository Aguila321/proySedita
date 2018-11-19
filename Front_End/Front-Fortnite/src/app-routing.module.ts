import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegistrarUsuarioComponent } from './app/componente/usuario/registrar-usuario/registrar-usuario.component';



const routes: Routes = [
  {
    path: 'registrar',
    component : RegistrarUsuarioComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {useHash: false})],
  exports: [RouterModule],
  providers: []
})
export class AppRoutingModule {}
