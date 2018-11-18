	Drop database IF  EXISTS fornai ; 
	Create database fornai;
	
	
    
	
	/*****************************Create Tablas*****************************/
	Create Table tipoUser(
	idtipo int primary key,
	descripcion varchar(50));
	  
	Create Table pais(
	idpais int primary key not null,
	nombrepais varchar(50));
	
	Create Table usuario(
	iduser   int auto_increment primary key not null,
	nombre   varchar(50) not null,
	apellido varchar(50) not null,
	username varchar(100) not null,
	clave    varchar(100) not null,
	fecnac   date not null,
	email    varchar(255) not null,
	pavos    int,
	idpais   int references pais,
	idtipo   int references tipoUser);
	
	Create Table pavos(
	idpavo int primary key,
	descripcion varchar(50),
	cantidad int,
	precio decimal(15,4));
	
	Create Table orden_pedido(
	idpedido int primary key  ,
	fechapedido datetime ,
	idusuario int references usuario);
	
	Create Table tb_orden_pedido_detalle(
	idpedido int references orden_pedido,
	idpavo int references pavos,
	cantidad int,
	precio decimal(18,0));
	
	Create Table tipo(
	  idtipo int not null primary key,
	  destipo varchar(50));
	
	Create Table rarity(
	idrarity int primary key,
	descripcion varchar(80));
	
	Create Table item(
	iditem int auto_increment primary key,
	nombreItem varchar(255),
	precio int,
	idtipo int references tipo,
	idrarity int references rarity);
	
	Create Table orden_item(
	idcompra int primary key,
	idusuario int references usuario);
	
	Create Table tb_orden_item_detalle (
	idcompra int references orden_item,
	iditem int REFERENCES item ,
	precio int );
	
	create table inventario(
	idusuario int references usuario,
	iditem int references item);
	    
	/*****************************Procedimiento Registrar*****************************/
	    
	insert into tipoUser values(1, 'Usuario');
	insert into tipoUser values(2, 'Admin');
	
	insert into inventario values(1,1) ;
	insert into pais values(1, 'Peru');
    
	DELIMITER $$
	Create Procedure usp_registrar_usuario (
	p_nombre varchar(50),
	p_apellido varchar(50),
	p_username varchar(50),
	p_clave varchar(50),
	p_fec date,
	p_email varchar(255),
	p_idpa int)
	Begin
		declare v_pavos int default 0;
		declare v_tipousaurio int  default 1;
		begin
			insert into usuario (nombre,apellido,username,clave,fecnac,email,pavos,idpais, idtipo)
			values (p_nombre,p_apellido,p_username,p_clave,p_fec,p_email,v_pavos,p_idpa, v_tipousaurio); 
		end;
	END;
	
	call usp_registrar_usuario( 'Carlos','Carrion','Riverslul', '7261255xd','1999-11-07','carloscrivers@gmail.com', 1);
	call usp_registrar_usuario( 'Juan','Torres','TheKead', 'torres123','1999-12-07','torres@gmail.com', 7);
    
	insert  into usuario  (nombre,apellido,username,clave,fecnac,email,pavos,idpais, idtipo) values('admin', 'admin', 'admin', 'admin','1969-11-07','admin@epicgames.co', 0, 1, 2);
	insert  into usuario  (nombre,apellido,username,clave,fecnac,email,pavos,idpais, idtipo) values('admin2', 'admin2', 'admin2', 'admin2','1969-11-07','admin2@epicgames.co', 0, 1, 2);
    
	Insert into Pais values(2,'Argentina');
	Insert into Pais values(3,'Brasil');
	Insert into Pais values(4,'Colombia');
	Insert into Pais values(5,'Mexico');
	Insert into Pais values(6,'Chile');
	Insert into Pais values(7,'Ecuador');
	
	select curdate();

	insert into pavos values(1, '1000 v-Bucks', 1000, 9.99);
	insert into pavos values(2, '2500 v-Bucks',2500, 24.99);
	insert into pavos values(3, '6000 v-Bucks',6000, 59.99);
	insert into pavos values(4, '10000 v-Bucks',10000, 99.99);
	
	insert into tipo values(1, 'Outfit');
	insert into tipo values(2, 'Back Bling');
	insert into tipo values(3, 'Glider');
	insert into tipo values(4, 'Pickaxe');
	insert into tipo values(5, 'Emote');
	
	insert into rarity values(1, 'Legendary');
	insert into rarity values(2, 'Epic');
	insert into rarity values(3, 'Rare');
	insert into rarity values(4, 'Uncommon');
	 
	insert into item values(null,'Cuddle Team Leader', 2000, 1, 1);
	
	/*Insertar datos para el skins*/
	/*Outfit-->Legendary*/
	insert item values(null,'Omen',2000,1,1);           
	insert item values(null,'Black Knight',2000,1,1);
	insert item values(null,'Carbide',2000,1,1);
	insert item values(null,'Red Knight',2000,1,1);
	insert item values(null,'Raven',2000,1,1);
	/*Outfit-->Epic*/  
	insert item values(null,'Skull Tropper',1500,1,2);
	insert item values(null,'Trailblazer',1500,1,2);
	insert item values(null,'Ventura',1500,1,2);
	insert item values(null,'Venturion',1500,1,2);
	insert item values(null,'Zoey',1500,1,2);
	/*Outfit-->Rare*/  
	insert item values(null,'Renegade Raider',1200,1,3);
	insert item values(null,'Blue Squire',1200,1,3);
	insert item values(null,'Brite Bomber',1200,1,3);
	insert item values(null,'Cipher',1200,1,3);
	insert item values(null,'Snorkel Ops',1200,1,3);
	/*Outfit-->Uncommon*/
	insert item values(null,'Liteshow',800,1,4);
	insert item values(null,'Nitelite',800,1,4);
	insert item values(null,'Assault Trooper',800,1,4);
	insert item values(null,'Dominator',800,1,4);
	insert item values(null,'Nog Ops',800,1,4);
	
	-- -------------------------------------------------------------------
	
	/*Back Bling-->Legendary*/
	insert item values(null,'Battle Shroud',2000,2,1);
	insert item values(null,'Love Wings',2000,2,1);
	insert item values(null,'Red Shield',2000,2,1);
	insert item values(null,'Royale Flags',2000,2,1);
	insert item values(null,'Six String',2000,2,1);
	
	/*Back Bling-->Epic*/
	insert item values(null,'Steelcast',1500,2,2);
	insert item values(null,'Strongbox',1500,2,2);
	insert item values(null,'Tag Bag',1500,2,2);
	insert item values(null,'True North',1500,2,2);
	insert item values(null,'Pathogen',1500,2,2);
	
	
	
	/*Back Bling-->Rare*/
	insert item values(null,'Precision',1200,2,3);
	insert item values(null,'Squire Shield',1200,2,3);
	insert item values(null,'Standard Issue',1200,2,3);
	insert item values(null,'Royale Shield',1200,2,3);
	           
	
	
	-- -------------------------------------------------------------------
	/*Glider-->Legendary*/
	insert item values(null,'Royale Dragon' ,2000,3,1);
	
	/*Glider-->Epic*/
	insert item values(null,'Intrepid' ,1500,3,2);
	insert item values(null,'Hang Time' ,1200,3,2);
	insert item values(null,'Deep Space Lander',1200,3,2);
	insert item values(null,'Pterodactyl' ,1200,3,2);
	insert item values(null,'Orbital Shuttle',1200,3,2);
	
	/*Glider-->Rare*/
	insert item values(null,'Starry Flight' ,800,3,3);
	insert item values(null,'Googly' ,800,3,3);
	insert item values(null,'Stage Dive',800,3,3);
	insert item values(null,'Zephyr' ,800,3,3);
	insert item values(null,'Voyager',800,3,3);
	
	/*Glider-->Uncommon*/
	insert item values(null,'Goalbound' ,500,3,4);
	insert item values(null,'Glow Rider' ,500,3,4);
	insert item values(null,'Jolly Roger',500,3,4);
	insert item values(null,'Mainframe' ,500,3,4);
	insert item values(null,'Meltdown',500,3,4);
	
	-- -------------------------------------------------------------------
	
	/*Pickaxe-->Epic*/
	insert item values(null,'AC/DC',1200,4,2);
	insert item values(null,'Chomp Jr.',1500,4,2);
	insert item values(null,'Candy Axe',1500,4,2);
	insert item values(null,'Bottom Feeder',1500,4,2);
	insert item values(null,'Oracle Axe',1200,4,2);
	
	/*Pickaxe-->Rare*/
	insert item values(null,'Lollipopper',800,4,3);
	insert item values(null,'Cutting Edge',800,4,3);
	insert item values(null,'Carrot Stick',800,4,3);
	insert item values(null,'Axeroni',800,4,3);
	insert item values(null,'Tendril',800,4,3);
	
	/*Pickaxe-->Uncommon*/
	insert item values(null,'Ice Breaker',500,4,4);
	insert item values(null,'Lucky',500,4,4);
	insert item values(null,'Tactical Spade',500,4,4);
	insert item values(null,'You Shouldnt Have',500,4,4);
	
	
	-- -------------------------------------------------------------------
	
	
	/*Emote-->Epic*/
	insert item values(null,'Rocket Rodeo',800,5,2);
	insert item values(null,'Rock Out',800,5,2);
	insert item values(null,'Fresh',800,5,2);
	insert item values(null,'Electro Shuffle',800,5,2);
	insert item values(null,'Breakin',800,5,2);
	
	/*Emote-->Rare*/
	insert item values(null,'Step it Up',500,5,3);
	insert item values(null,'Take The L',500,5,3);
	insert item values(null,'Tidy',500,5,3);
	insert item values(null,'Wiggle',500,5,3);
	insert item values(null,'Zany',500,5,3);
	
	/*Emote-->Uncommon*/
	insert item values(null,'Jubilation',200,5,4);
	insert item values(null,'Slow Clap',200,5,4);
	insert item values(null,'Salute',200,5,4);
	insert item values(null,'Red Card',200,5,4);
	insert item values(null,'Click!',200,5,4);
	
	DELIMITER $$
	create procedure autogenerar()
	begin
	  select count(*)
	 + 1 from orden_pedido;
	
	end
	delimiter ;
	/*****************************Procedimiento Contar*****************************/
	DELIMITER $$
	Create Procedure usp_contar_pavos()
	Begin
	select u.iduser,u.nombre,u.apellido,u.username,u.clave,u.email,u.fecnac,u.idpais,sum(dp.cantidad) as 'Suma'
	from tb_orden_pedido_detalle as dp 
	join orden_pedido cp on dp.idPedido = cp.idPedido 
	join usuario as u on u.iduser = cp.idusuario
	group by u.iduser,u.nombre,u.apellido,u.username,u.clave,u.email,u.fecnac,u.idpais;
	End;
	 
	
	/*****************************Procedimiento Listar*****************************/
	select i.iditem,i.nombreItem,i.precio,t.destipo,r.descripcion 
	from  item i join tipo t on i.idtipo = t.idtipo 
	join rarity r on i.idrarity= r.idrarity 
	where t.idtipo = 1;
	
	 Delete
	 from item where iditem = 85;
	
	delimiter //
	DELIMITER $$
	create procedure f_listaItem()
	begin
	select i.iditem, i.nombreItem,i.precio,r.idrarity, r.descripcion, t.destipo from item i
	inner join tipo t
	on i.idtipo = t.idtipo
	inner join rarity r
	on r.idrarity = i.idrarity;
	
	end;
	//
	
	delimiter ;
	
	/*****************************Procedimiento Compras*****************************/
	DELIMITER $$
	create procedure usp_compra_detalle (
	p_idped int ,
	p_idpavo int,
	p_cantidad int,
	p_prec decimal(18,0))
	begin		
		insert into tb_orden_pedido_detalle values (p_idped,p_idpavo,p_cantidad,p_prec);
	    
		update usuario u
	     INNER JOIN orden_pedido as op on op.idusuario = u.iduser
	    set pavos= pavos+ p_cantidad
		where op.idpedido = p_idped;
	
	end;
	delimiter ;
	
	DELIMITER $$
Create PROCEDURE usp_compra_item1 (p_idcompra int, p_iditem int, p_precio decimal(18,0))
Begin
	Declare v_pavos int;
	set v_pavos = (select pavos from usuario as u join orden_item oi on oi.idusuario = u.iduser where oi.idcompra=p_idcompra);
	
    If v_pavos < p_precio 
    then select 'No Corresponde al precio' as mensaje;
    else
	insert into  tb_orden_item_detalle  values(p_idcompra,p_iditem,p_precio); 
	select 'Los datos son correctos' as mensaje;

    Update orden_item as oi 
	join usuario as u on oi.idusuario = u.iduser
	set pavos = pavos - p_precio
	where oi.idcompra = p_idcompra; 
END IF;
End;


	/*****************************Procedimiento RecuperarContraseña*****************************/
	
	DELIMITER $$
	Create Procedure usp_new_pass (
	p_pass varchar(50),
	p_email varchar(50))
    Begin
		update usuario
		set clave = p_pass
		where email = p_email;
	End;
	delimiter ;
	
	DELIMITER $$
	create procedure usp_validar_correo (
	p_email varchar(100))
	begin
		select * from usuario where email = p_email;
	end;
	delimiter ;
	
	delimiter //
	create procedure autogenerar_item()
	begin
	  select count(*)
	 + 1 from orden_item;
	
	end;
	delimiter ;
	
	/**********************************/
	
	/*La compra pavos , Detalle*/
	select * from usuario;
	select * from orden_pedido;
	select * from tb_orden_pedido_detalle;
	select * from pavos;
	
	/* Insert en duro */
	
	insert orden_pedido values (1,curdate(),1); 
	insert orden_pedido values (2,curdate(),2); 
	insert orden_pedido values (3,curdate(),3); 
	insert orden_pedido values (4,curdate(),4); 
	insert orden_pedido values (5,curdate(),1); 
	
	
	call usp_compra_detalle (2,2,2500,24.9);
	call usp_compra_detalle (3,3,6000,59.9);
	call usp_compra_detalle (4,4,10000,99.9);
	call usp_compra_detalle (5,1,1500,9.9);

