import { Injectable } from '@angular/core';
import { Product } from './Product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products:Product[]=[];

  constructor() { }

  addProduct(product:Product)
  {
    this.products.push(product);
  }
  getAllProducts():Product[]
  {
    return this.products;
  }
}
