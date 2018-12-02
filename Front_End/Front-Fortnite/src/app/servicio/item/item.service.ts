import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders} from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
import { item } from 'src/app/model/item.model';
import { CompraItemPersonalizado } from '../../model/compraitem.model';


@Injectable({
  providedIn: 'root'
})
export class ItemService {

  url = "http://localhost:8080/Fortnite/rest/proyecto/";
  urlItem = this.url + "item";
  urlFilter = this.url + "itemFil?id=";
  urlcompraItem = this.url+ "compraItem"

  private messageSource = new BehaviorSubject(new Number);
  currentMessage = this.messageSource.asObservable();
  
  changeMessage(message:Number){
    this.messageSource.next(message);
    console.log("en el change message :" + message)
  }


  constructor(private _http : HttpClient) { }

  getAllItems():Observable<item[]>{
    return this._http.get<item[]>(this.urlItem).pipe();
  }

  getItemById(id : number){
    return this._http.get<item>(this.urlFilter + id).pipe();
  }

  compraItem : CompraItemPersonalizado;
  buyItem(compraItem : CompraItemPersonalizado) : Observable<any>{
    let body = JSON.stringify(compraItem);
    let headers = new HttpHeaders ({
      'Content-Type': 'application/json'
    });
    return this._http.post(this.urlcompraItem,body,{headers:headers});

  }

}
