import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddToCartComponent } from './add-to-cart/add-to-cart.component';
import { RemoveFromCartComponent } from './remove-from-cart/remove-from-cart.component';
import { InfoComponent } from './info/info.component';
import { ItemsComponent } from './items/items.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

const routes: Routes = [
  {
    path: "addToCart",
    component: AddToCartComponent
  }, 
  {
    path: "removeFromCart",
    component: RemoveFromCartComponent
  }, 
  {
    path: "info",
    component: InfoComponent
  },
  {
    path: "item",
    component: ItemsComponent
  },
  { 
    path: '',   
    redirectTo: "item", 
    pathMatch: 'full' 
  },
  { 
    path: '**', 
    component: PageNotFoundComponent 
  }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const routingComponents = [ RemoveFromCartComponent, InfoComponent, AddToCartComponent ]
