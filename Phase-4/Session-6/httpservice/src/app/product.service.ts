import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from './Product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  url:string="http://localhost:8080/myapi/products";

  constructor(private http:HttpClient) { }

  getAppProducts():Observable<Product[]>
  {
      return this.http.get<Product[]>(this.url);
  }
  addProduct()
  {
    
  }
}
