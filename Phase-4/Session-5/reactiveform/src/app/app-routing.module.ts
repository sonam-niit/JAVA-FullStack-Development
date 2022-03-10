import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PipesComponent } from './pipes/pipes.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { RegisterComponent } from './register/register.component';
import { SwitchdemoComponent } from './switchdemo/switchdemo.component';

const routes: Routes = [
  {"path":"register",component:RegisterComponent},
  {"path":"switch",component:SwitchdemoComponent},
  {"path":"pipes",component:PipesComponent},
  {"path":"list",component:ProductlistComponent},
  //{"path":"productDetail/:id",component:ProductDetailComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
