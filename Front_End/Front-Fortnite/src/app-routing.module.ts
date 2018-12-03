import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegistrarUsuarioComponent } from './app/componente/usuario/registrar-usuario/registrar-usuario.component';
import { ListItemComponent } from './app/componente/list-item/list-item.component';
import { ItemDetailComponent } from './app/componente/item-detail/item-detail.component';
import { ListPavoComponent } from './app/componente/list-pavo/list-pavo.component';
import { UsuarioComponent } from './app/componente/usuario/usuario.component';
import { PavoDetailComponent} from './app/componente/pavo-detail/pavo-detail.component'
import { PrincipalComponent } from './app/componente/principal/principal.component';
import { InventarioComponent } from './app/componente/inventario/inventario.component';




const routes: Routes = [
  {path:'home', component: PrincipalComponent, 
  runGuardsAndResolvers: 'always'},
  { path:'login', component: UsuarioComponent, 
  runGuardsAndResolvers: 'always'},
  {
    path: 'lista-pavo',
    component : ListPavoComponent, 
    runGuardsAndResolvers: 'always'
  },
  {
    path: 'lista-item',
    component: ListItemComponent, 
    runGuardsAndResolvers: 'always'
    
  },
  {
    path: 'registrar',
    component : RegistrarUsuarioComponent, 
    runGuardsAndResolvers: 'always'
  },
  {
    path: 'item-detail/:id',
    component: ItemDetailComponent, 
    runGuardsAndResolvers: 'always'
   },
   {
    path: 'pavo-detail/:id',
    component: PavoDetailComponent, 
    runGuardsAndResolvers: 'always'
   },
   {
    path: 'locker/:id',
    component: InventarioComponent, 
    runGuardsAndResolvers: 'always'
   },
  {
    path: '**', pathMatch:'full', redirectTo:'lista-item', 
    runGuardsAndResolvers: 'always'
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {onSameUrlNavigation: 'reload'})],
  exports: [RouterModule],
  providers: []
})
export class AppRoutingModule {}
