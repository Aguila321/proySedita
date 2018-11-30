import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { url } from 'inspector';
import { Observable } from 'rxjs';
import { item } from 'src/app/model/item.model';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  url = "http://localhost:8080/Fortnite/rest/proyecto/";
  urlItem = this.url + "item";
  urlFilter = this.url + "itemFil?id=";
  constructor(private _http : HttpClient) { }

  getAllItems():Observable<item[]>{
    return this._http.get<item[]>(this.urlItem).pipe();
  }

  getItemById(id : number){
    return this._http.get<item>(this.urlFilter + id).pipe();
  }

}
