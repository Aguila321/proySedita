import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegistrarUsuarioComponent } from './app/componente/usuario/registrar-usuario/registrar-usuario.component';
import { ListItemComponent } from './app/componente/list-item/list-item.component';
import { ItemDetailComponent } from './app/componente/item-detail/item-detail.component';
import { ListPavoComponent } from './app/componente/list-pavo/list-pavo.component';
import { UsuarioComponent } from './app/componente/usuario/usuario.component';



const routes: Routes = [
  { path:'login', component: UsuarioComponent},
  {
    path: 'lista-pavo',
    component : ListPavoComponent
  },
  {
    path: 'lista-item',
    component: ListItemComponent
  },
  {
    path: 'registrar',
    component : RegistrarUsuarioComponent
  },
  {
    path: 'item-detail/:id',
    component: ItemDetailComponent
   },
  {
    path: '**', pathMatch:'full', redirectTo:'lista-item'
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes, {useHash: false})],
  exports: [RouterModule],
  providers: []
})
export class AppRoutingModule {}
