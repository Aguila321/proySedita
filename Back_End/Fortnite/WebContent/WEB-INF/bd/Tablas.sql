	DROP DATABASE IF  EXISTS fornai ; 
	CREATE DATABASE fornai;

    USE fornai;

	/*****************************CREATE Tablas*****************************/
	CREATE Table tipouser(
		idtipo INT PRIMARY KEY,
		descripcion VARCHAR(50)
    );
	  
	CREATE TABLE pais
    (
		idpais INT PRIMARY KEY NOT NULL,
		nombrepais VARCHAR(50)
    );
	
	CREATE Table usuario
    (
		iduser   INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
		nombre   VARCHAR(50) NOT NULL,
		apellido VARCHAR(50) NOT NULL,
		USErname VARCHAR(100) NOT NULL,
		clave    VARCHAR(100) NOT NULL,
		fecnac   DATE NOT NULL,
		email    VARCHAR(255) NOT NULL,
		pavos    INT,
		idpais   INT REFERENCES pais,
		idtipo   INT REFERENCES tipoeser
	);
	
	CREATE Table pavos
    (
		idpavo      INT PRIMARY KEY,
		descripcion VARCHAR(50),
		cantidad    INT,
		precio      DECIMAL(15,4),
        url         VARCHAR(3999)
	);
	
	CREATE Table orden_pedido
    (
		idpedido    INT PRIMARY KEY  ,
		fechapedido DATE,
		idusuario   INT REFERENCES usuario
    );
	
	CREATE Table tb_orden_pedido_detalle
    (
		idpedido INT REFERENCES orden_pedido,
		idpavo   INT REFERENCES pavos,
		cantidad INT,
		precio   DECIMAL(18,0)
    );
	
	CREATE Table tipo
    (
		idtipo  INT NOT NULL PRIMARY KEY,
		destipo VARCHAR(50)
	);
	
	CREATE Table rarity
    (
		idrarity    INT PRIMARY KEY,
		descripcion VARCHAR(80),
        url         VARCHAR(3999)
	);
		
	CREATE Table item
    (
		iditem     INT AUTO_INCREMENT PRIMARY KEY,
		nombreItem VARCHAR(255),
		precio     INT,
		idtipo     INT REFERENCES tipo,
		idrarity   INT REFERENCES rarity,
        urlDetail  VARCHAR(3999),
        urlImg     VARCHAR(3999)
    );
	
	CREATE Table orden_item
    (
		idcompra  INT PRIMARY KEY,
		idusuario INT REFERENCES usuario
    );
	
	CREATE Table tb_orden_item_detalle 
    (
		idcompra INT REFERENCES orden_item,
		iditem   INT REFERENCES item ,
		precio   INT 
    );
	
	CREATE table inventario
    (
		idusuario INT REFERENCES usuario,
		iditem    INT REFERENCES item
    );
	    