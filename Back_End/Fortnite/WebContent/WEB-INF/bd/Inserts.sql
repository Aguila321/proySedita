
	USE fornai;
    
    INSERT INTO tipoUser VALUES(1, 'Usuario');
	INSERT INTO tipoUser VALUES(2, 'Admin');
	
	INSERT INTO inventario VALUES(1,1) ;
	INSERT INTO pais VALUES(1, 'Peru');
    
    INSERT  INTO usuario (nombre,apellido,username,clave,fecnac,email,pavos,idpais, idtipo) VALUES('admin', 'admin', 'admin', 'admin','1969-11-07','admin@epicgames.co', 0, 1, 2);
	INSERT  INTO usuario (nombre,apellido,username,clave,fecnac,email,pavos,idpais, idtipo) VALUES('admin2', 'admin2', 'admin2', 'admin2','1969-11-07','admin2@epicgames.co', 0, 1, 2);
    
	INSERT INTO Pais VALUES(2,'Argentina');
	INSERT INTO Pais VALUES(3,'Brasil');
	INSERT INTO Pais VALUES(4,'Colombia');
	INSERT INTO Pais VALUES(5,'Mexico');
	INSERT INTO Pais VALUES(6,'Chile');
	INSERT INTO Pais VALUES(7,'Ecuador');
    
    INSERT INTO pavos VALUES(1, '1000 v-Bucks', 1000, 9.99);
	INSERT INTO pavos VALUES(2, '2500 v-Bucks',2500, 24.99);
	INSERT INTO pavos VALUES(3, '6000 v-Bucks',6000, 59.99);
	INSERT INTO pavos VALUES(4, '10000 v-Bucks',10000, 99.99);
	
	INSERT INTO tipo VALUES(1, 'Outfit');
	INSERT INTO tipo VALUES(2, 'Back Bling');
	INSERT INTO tipo VALUES(3, 'Glider');
	INSERT INTO tipo VALUES(4, 'Pickaxe');
	INSERT INTO tipo VALUES(5, 'Emote');
	
	INSERT INTO rarity VALUES(1, 'Legendary');
	INSERT INTO rarity VALUES(2, 'Epic');
	INSERT INTO rarity VALUES(3, 'Rare');
	INSERT INTO rarity VALUES(4, 'Uncommon');
	 
	INSERT INTO item VALUES(NULL,'Cuddle Team Leader', 2000, 1, 1);
	
	/*INSERTar datos para el skins*/
	/*Outfit-->Legendary*/
	INSERT item VALUES(NULL,'Omen',2000,1,1);           
	INSERT item VALUES(NULL,'Black Knight',2000,1,1);
	INSERT item VALUES(NULL,'Carbide',2000,1,1);
	INSERT item VALUES(NULL,'Red Knight',2000,1,1);
	INSERT item VALUES(NULL,'Raven',2000,1,1);
	/*Outfit-->Epic*/  
	INSERT item VALUES(NULL,'Skull Tropper',1500,1,2);
	INSERT item VALUES(NULL,'Trailblazer',1500,1,2);
	INSERT item VALUES(NULL,'Ventura',1500,1,2);
	INSERT item VALUES(NULL,'Venturion',1500,1,2);
	INSERT item VALUES(NULL,'Zoey',1500,1,2);
	/*Outfit-->Rare*/  
	INSERT item VALUES(NULL,'Renegade Raider',1200,1,3);
	INSERT item VALUES(NULL,'Blue Squire',1200,1,3);
	INSERT item VALUES(NULL,'Brite Bomber',1200,1,3);
	INSERT item VALUES(NULL,'Cipher',1200,1,3);
	INSERT item VALUES(NULL,'Snorkel Ops',1200,1,3);
	/*Outfit-->Uncommon*/
	INSERT item VALUES(NULL,'Liteshow',800,1,4);
	INSERT item VALUES(NULL,'Nitelite',800,1,4);
	INSERT item VALUES(NULL,'Assault Trooper',800,1,4);
	INSERT item VALUES(NULL,'Dominator',800,1,4);
	INSERT item VALUES(NULL,'Nog Ops',800,1,4);
	
	-- -------------------------------------------------------------------
	
	/*Back Bling-->Legendary*/
	INSERT item VALUES(NULL,'Battle Shroud',2000,2,1);
	INSERT item VALUES(NULL,'Love Wings',2000,2,1);
	INSERT item VALUES(NULL,'Red Shield',2000,2,1);
	INSERT item VALUES(NULL,'Royale Flags',2000,2,1);
	INSERT item VALUES(NULL,'Six String',2000,2,1);
	
	/*Back Bling-->Epic*/
	INSERT item VALUES(NULL,'Steelcast',1500,2,2);
	INSERT item VALUES(NULL,'Strongbox',1500,2,2);
	INSERT item VALUES(NULL,'Tag Bag',1500,2,2);
	INSERT item VALUES(NULL,'True North',1500,2,2);
	INSERT item VALUES(NULL,'Pathogen',1500,2,2);
	
	
	
	/*Back Bling-->Rare*/
	INSERT item VALUES(NULL,'Precision',1200,2,3);
	INSERT item VALUES(NULL,'Squire Shield',1200,2,3);
	INSERT item VALUES(NULL,'Standard Issue',1200,2,3);
	INSERT item VALUES(NULL,'Royale Shield',1200,2,3);
	           
	
	
	-- -------------------------------------------------------------------
	/*Glider-->Legendary*/
	INSERT item VALUES(NULL,'Royale Dragon' ,2000,3,1);
	
	/*Glider-->Epic*/
	INSERT item VALUES(NULL,'Intrepid' ,1500,3,2);
	INSERT item VALUES(NULL,'Hang Time' ,1200,3,2);
	INSERT item VALUES(NULL,'Deep Space Lander',1200,3,2);
	INSERT item VALUES(NULL,'Pterodactyl' ,1200,3,2);
	INSERT item VALUES(NULL,'Orbital Shuttle',1200,3,2);
	
	/*Glider-->Rare*/
	INSERT item VALUES(NULL,'Starry Flight' ,800,3,3);
	INSERT item VALUES(NULL,'Googly' ,800,3,3);
	INSERT item VALUES(NULL,'Stage Dive',800,3,3);
	INSERT item VALUES(NULL,'Zephyr' ,800,3,3);
	INSERT item VALUES(NULL,'Voyager',800,3,3);
	
	/*Glider-->Uncommon*/
	INSERT item VALUES(NULL,'Goalbound' ,500,3,4);
	INSERT item VALUES(NULL,'Glow Rider' ,500,3,4);
	INSERT item VALUES(NULL,'Jolly Roger',500,3,4);
	INSERT item VALUES(NULL,'Mainframe' ,500,3,4);
	INSERT item VALUES(NULL,'Meltdown',500,3,4);
	
	-- -------------------------------------------------------------------
	
	/*Pickaxe-->Epic*/
	INSERT item VALUES(NULL,'AC/DC',1200,4,2);
	INSERT item VALUES(NULL,'Chomp Jr.',1500,4,2);
	INSERT item VALUES(NULL,'Candy Axe',1500,4,2);
	INSERT item VALUES(NULL,'Bottom Feeder',1500,4,2);
	INSERT item VALUES(NULL,'Oracle Axe',1200,4,2);
	
	/*Pickaxe-->Rare*/
	INSERT item VALUES(NULL,'Lollipopper',800,4,3);
	INSERT item VALUES(NULL,'Cutting Edge',800,4,3);
	INSERT item VALUES(NULL,'Carrot Stick',800,4,3);
	INSERT item VALUES(NULL,'Axeroni',800,4,3);
	INSERT item VALUES(NULL,'Tendril',800,4,3);
	
	/*Pickaxe-->Uncommon*/
	INSERT item VALUES(NULL,'Ice Breaker',500,4,4);
	INSERT item VALUES(NULL,'Lucky',500,4,4);
	INSERT item VALUES(NULL,'Tactical Spade',500,4,4);
	INSERT item VALUES(NULL,'You Shouldnt Have',500,4,4);

	-- -------------------------------------------------------------------
	/*Emote-->Epic*/
	INSERT item VALUES(NULL,'Rocket Rodeo',800,5,2);
	INSERT item VALUES(NULL,'Rock Out',800,5,2);
	INSERT item VALUES(NULL,'Fresh',800,5,2);
	INSERT item VALUES(NULL,'Electro Shuffle',800,5,2);
	INSERT item VALUES(NULL,'Breakin',800,5,2);
	
	/*Emote-->Rare*/
	INSERT item VALUES(NULL,'Step it Up',500,5,3);
	INSERT item VALUES(NULL,'Take The L',500,5,3);
	INSERT item VALUES(NULL,'Tidy',500,5,3);
	INSERT item VALUES(NULL,'Wiggle',500,5,3);
	INSERT item VALUES(NULL,'Zany',500,5,3);
	
	/*Emote-->Uncommon*/
	INSERT item VALUES(NULL,'Jubilation',200,5,4);
	INSERT item VALUES(NULL,'Slow Clap',200,5,4);
	INSERT item VALUES(NULL,'Salute',200,5,4);
	INSERT item VALUES(NULL,'Red Card',200,5,4);
	INSERT item VALUES(NULL,'Click!',200,5,4);