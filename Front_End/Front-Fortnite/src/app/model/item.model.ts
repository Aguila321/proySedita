export class item{
    idItem? : number;
    nombreItem?: string;
    precioItem?: number;
    tipoItem : {
        idTipoItem?:number;
        descripcion?:string;
    }
    rarezaItem:{
        idrareaza?:number;
        descripcion?:string;
    }
}