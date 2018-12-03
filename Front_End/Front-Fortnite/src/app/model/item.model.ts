export class item{
    idItem? : Number;
    nombreItem?: string;
    precioItem?: number;
    tipoItem? : {
        idTipoItem?:number;
        descripcion?:string;
    }
    rarezaItem?:{
        idrareaza?:number;
        descripcion?:string;
    }
}