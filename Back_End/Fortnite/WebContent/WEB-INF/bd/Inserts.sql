
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
    
    INSERT INTO pavos VALUES(1, '1000 v-Bucks', 1000, 9.99,'https://vignette.wikia.nocookie.net/fortnite/images/5/5a/Icon_VBucks.png/revision/latest?cb=20170806013747');
	INSERT INTO pavos VALUES(2, '2500 v-Bucks',2500, 24.99,'https://vignette.wikia.nocookie.net/fortnite/images/5/5a/Icon_VBucks.png/revision/latest?cb=20170806013747');
	INSERT INTO pavos VALUES(3, '6000 v-Bucks',6000, 59.99,'https://vignette.wikia.nocookie.net/fortnite/images/5/5a/Icon_VBucks.png/revision/latest?cb=20170806013747');
	INSERT INTO pavos VALUES(4, '10000 v-Bucks',10000, 99.99,'https://vignette.wikia.nocookie.net/fortnite/images/5/5a/Icon_VBucks.png/revision/latest?cb=20170806013747');
	
	INSERT INTO tipo VALUES(1, 'Outfit');
	INSERT INTO tipo VALUES(2, 'Back Bling');
	INSERT INTO tipo VALUES(3, 'Glider');
	INSERT INTO tipo VALUES(4, 'Pickaxe');
	INSERT INTO tipo VALUES(5, 'Emote');
	
	INSERT INTO rarity VALUES(1, 'Legendary','https://i.ibb.co/ncD40Xr/1.png');
	INSERT INTO rarity VALUES(2, 'Epic','https://i.ibb.co/9bpFk9z/2.png');
	INSERT INTO rarity VALUES(3, 'Rare','https://i.ibb.co/FW3sSjC/3.png');
	INSERT INTO rarity VALUES(4, 'Uncommon','https://i.ibb.co/F8HN5pB/4.png');
	 
	INSERT INTO item VALUES(NULL,'Cuddle Team Leader', 2000, 1, 1,'https://image.fnbr.co/outfit/5ab15721e9847b3170da0326/png.png','https://image.fnbr.co/outfit/5ab15721e9847b3170da0326/icon.png');
	
	/*INSERTar datos para el skins*/
	/*Outfit-->Legendary*/
	INSERT item VALUES(NULL,'Omen',2000,1,1,'https://image.fnbr.co/outfit/5b1e86fbefc15513ef14c63d/png.png','https://image.fnbr.co/outfit/5b1e86fbefc15513ef14c63d/icon.png');           
	INSERT item VALUES(NULL,'Black Knight',2000,1,1,'https://image.fnbr.co/outfit/5ab1562ce9847b3170da0322/png.png','https://image.fnbr.co/outfit/5ab1562ce9847b3170da0322/icon.png');
	INSERT item VALUES(NULL,'Carbide',2000,1,1,'https://image.fnbr.co/outfit/5ae8932d96f70486a7e909ad/png.png','https://image.fnbr.co/outfit/5ae8932d96f70486a7e909ad/icon.png');
	INSERT item VALUES(NULL,'Red Knight',2000,1,1,'https://image.fnbr.co/outfit/5ab158a8e9847b3170da032f/png.png','https://image.fnbr.co/outfit/5ab158a8e9847b3170da032f/icon.png');
	INSERT item VALUES(NULL,'Raven',2000,1,1,'https://image.fnbr.co/outfit/5abcf2279542fb06a6da12a5/png.png','https://image.fnbr.co/outfit/5abcf2279542fb06a6da12a5/icon.png');
	/*Outfit-->Epic*/  
	INSERT item VALUES(NULL,'Skull Tropper',1500,1,2,'https://image.fnbr.co/outfit/5ab172825f957f27504aa504/png.png','https://image.fnbr.co/outfit/5ab172825f957f27504aa504/icon.png');
	INSERT item VALUES(NULL,'Trailblazer',1500,1,2,'https://image.fnbr.co/outfit/5ae89edff3d31b9c3ec5b7ff/png.png','https://image.fnbr.co/outfit/5ae89edff3d31b9c3ec5b7ff/icon.png');
	INSERT item VALUES(NULL,'Ventura',1500,1,2,'https://image.fnbr.co/outfit/5b0e945fdb94f10285c0a8e6/png.png','https://image.fnbr.co/outfit/5b0e945fdb94f10285c0a8e6/icon.png');
	INSERT item VALUES(NULL,'Venturion',1500,1,2,'https://image.fnbr.co/outfit/5afc0f74b6e7f71817a32630/png.png','https://image.fnbr.co/outfit/5afc0f74b6e7f71817a32630/icon.png');
	INSERT item VALUES(NULL,'Zoey',1500,1,2,'https://image.fnbr.co/outfit/5ae893be96f704c826e909b4/png.png','https://image.fnbr.co/outfit/5ae893be96f704c826e909b4/icon.png');
	/*Outfit-->Rare*/  
	INSERT item VALUES(NULL,'Renegade Raider',1200,1,3,'https://image.fnbr.co/outfit/5ab17d925f957f27504aa53d/png.png','https://image.fnbr.co/outfit/5ab17d925f957f27504aa53d/icon.png');
	INSERT item VALUES(NULL,'Blue Squire',1200,1,3,'https://image.fnbr.co/outfit/5ab175175f957f27504aa512/png.png','https://image.fnbr.co/outfit/5ab175175f957f27504aa512/icon.png');
	INSERT item VALUES(NULL,'Brite Bomber',1200,1,3,'https://image.fnbr.co/outfit/5ab175f75f957f27504aa518/png.png','https://image.fnbr.co/outfit/5ab175f75f957f27504aa518/icon.png');
	INSERT item VALUES(NULL,'Cipher',1200,1,3,'https://image.fnbr.co/outfit/5ace24371f0d4d067dd42df2/png.png','https://image.fnbr.co/outfit/5ace24371f0d4d067dd42df2/icon.png');
	INSERT item VALUES(NULL,'Snorkel Ops',1200,1,3,'https://image.fnbr.co/outfit/5ab17e705f957f27504aa545/png.png','https://image.fnbr.co/outfit/5ab17e705f957f27504aa545/icon.png');
	/*Outfit-->Uncommon*/
	INSERT item VALUES(NULL,'Liteshow',800,1,4,'https://image.fnbr.co/outfit/5ae89dccf3d31b2a97c5b7f8/png.png','https://image.fnbr.co/outfit/5ae89dccf3d31b2a97c5b7f8/icon.png');
	INSERT item VALUES(NULL,'Nitelite',800,1,4,'https://image.fnbr.co/outfit/5ae89de0f3d31bc15ac5b7f9/png.png','https://image.fnbr.co/outfit/5ae89de0f3d31bc15ac5b7f9/icon.png');
	INSERT item VALUES(NULL,'Assault Trooper',800,1,4,'https://image.fnbr.co/outfit/5ab1b62b9116ac5688c6d7c6/png.png','https://image.fnbr.co/outfit/5ab1b62b9116ac5688c6d7c6/icon.png');
	INSERT item VALUES(NULL,'Dominator',800,1,4,'https://image.fnbr.co/outfit/5ab1b77c9116ac5688c6d7cf/png.png','https://image.fnbr.co/outfit/5ab1b77c9116ac5688c6d7cf/icon.png');
	INSERT item VALUES(NULL,'Nog Ops',800,1,4,'https://image.fnbr.co/outfit/5ab1ba119116ac5688c6d7df/png.png','https://image.fnbr.co/outfit/5ab1ba119116ac5688c6d7df/icon.png');
	
	-- -------------------------------------------------------------------
	
	/*Back Bling-->Legendary*/
	INSERT item VALUES(NULL,'Battle Shroud',2000,2,1,'https://image.fnbr.co/backpack/5b1e8878efc15516e214c64b/icon.png','https://image.fnbr.co/backpack/5b1e8878efc15516e214c64b/icon.png');
	INSERT item VALUES(NULL,'Love Wings',2000,2,1,'https://image.fnbr.co/backpack/5ab157f5e9847b3170da032a/icon.png','https://image.fnbr.co/backpack/5ab157f5e9847b3170da032a/icon.png');
	INSERT item VALUES(NULL,'Red Shield',2000,2,1,'https://image.fnbr.co/backpack/5ab158bce9847b3170da0330/icon.png','https://image.fnbr.co/backpack/5ab158bce9847b3170da0330/icon.png');
	INSERT item VALUES(NULL,'Royale Flags',2000,2,1,'https://image.fnbr.co/backpack/5abcf3939542fb1aa1da12ae/icon.png','https://image.fnbr.co/backpack/5abcf3939542fb1aa1da12ae/icon.png');
	INSERT item VALUES(NULL,'Six String',2000,2,1,'https://image.fnbr.co/backpack/5ab159d8e9847b3170da0335/icon.png','https://image.fnbr.co/backpack/5ab159d8e9847b3170da0335/icon.png');
	
	/*Back Bling-->Epic*/
	INSERT item VALUES(NULL,'Steelcast',1500,2,2,'https://image.fnbr.co/backpack/5adf0a235e41b305eda5de58/icon.png','https://image.fnbr.co/backpack/5adf0a235e41b305eda5de58/icon.png');
	INSERT item VALUES(NULL,'Strongbox',1500,2,2,'https://image.fnbr.co/backpack/5b0e9421db94f1984dc0a8df/icon.png','https://image.fnbr.co/backpack/5b0e9421db94f1984dc0a8df/icon.png');
	INSERT item VALUES(NULL,'Tag Bag',1500,2,2,'https://image.fnbr.co/backpack/5ae89fdbf3d31b10cac5b806/icon.png','https://image.fnbr.co/backpack/5ae89fdbf3d31b10cac5b806/icon.png');
	INSERT item VALUES(NULL,'True North',1500,2,2,'https://image.fnbr.co/backpack/5ae89fedf3d31b513fc5b807/icon.png','https://image.fnbr.co/backpack/5ae89fedf3d31b513fc5b807/icon.png');
	INSERT item VALUES(NULL,'Pathogen',1500,2,2,'https://image.fnbr.co/backpack/5afc1034b6e7f72f2ca3263a/icon.png','https://image.fnbr.co/backpack/5afc1034b6e7f72f2ca3263a/icon.png');
	

	/*Back Bling-->Rare*/
	INSERT item VALUES(NULL,'Precision',1200,2,3,'https://image.fnbr.co/backpack/5ab17c1c5f957f27504aa532/icon.png','https://image.fnbr.co/backpack/5ab17c1c5f957f27504aa532/icon.png');
	INSERT item VALUES(NULL,'Squire Shield',1200,2,3,'https://image.fnbr.co/backpack/5ab17de25f957f27504aa540/icon.png','https://image.fnbr.co/backpack/5ab17de25f957f27504aa540/icon.png');
	INSERT item VALUES(NULL,'Standard Issue',1200,2,3,'https://image.fnbr.co/backpack/5ae89b7df3d31ba398c5b7f6/icon.png','https://image.fnbr.co/backpack/5ae89b7df3d31ba398c5b7f6/icon.png');
	INSERT item VALUES(NULL,'Royale Shield',1200,2,3,'https://image.fnbr.co/backpack/5ab17de25f957f27504aa540/icon.png','https://image.fnbr.co/backpack/5ab17de25f957f27504aa540/icon.png');
	           

	-- -------------------------------------------------------------------
	/*Glider-->Legendary*/
	INSERT item VALUES(NULL,'Royale Dragon' ,2000,3,1,'https://image.fnbr.co/glider/5ab052cbe0aa904a60d66652/png.png','https://image.fnbr.co/glider/5ab052cbe0aa904a60d66652/icon.png');
	
	/*Glider-->Epic*/
	INSERT item VALUES(NULL,'Intrepid' ,1500,3,2,'https://image.fnbr.co/glider/5b1e89a0efc155ec8314c654/png.png','https://image.fnbr.co/glider/5b1e89a0efc155ec8314c654/png.png');
	INSERT item VALUES(NULL,'Hang Time' ,1200,3,2,'https://image.fnbr.co/glider/5b0e93bedb94f1f7dac0a8dd/png.png','https://image.fnbr.co/glider/5b0e93bedb94f1f7dac0a8dd/icon.png');
	INSERT item VALUES(NULL,'Deep Space Lander',1200,3,2,'https://image.fnbr.co/glider/5abcf3de9542fb9ca5da12b1/png.png','https://image.fnbr.co/glider/5abcf3de9542fb9ca5da12b1/icon.png');
	INSERT item VALUES(NULL,'Pterodactyl' ,1200,3,2,'https://image.fnbr.co/glider/5b1e89b1efc1554c2814c655/png.png','https://image.fnbr.co/glider/5b1e89b1efc1554c2814c655/icon.png');
	INSERT item VALUES(NULL,'Orbital Shuttle',1200,3,2,'https://image.fnbr.co/glider/5abcf3ce9542fb67d0da12b0/png.png','https://image.fnbr.co/glider/5abcf3ce9542fb67d0da12b0/png.png');
	
	/*Glider-->Rare*/
	INSERT item VALUES(NULL,'Starry Flight' ,800,3,3,'https://image.fnbr.co/glider/5b0e93d4db94f173b8c0a8de/png.png','https://image.fnbr.co/glider/5b0e93d4db94f173b8c0a8de/icon.png');
	INSERT item VALUES(NULL,'Googly' ,800,3,3,'https://image.fnbr.co/glider/5ace24ca1f0d4d375fd42dfa/png.png','https://image.fnbr.co/glider/5ace24ca1f0d4d375fd42dfa/icon.png');
	INSERT item VALUES(NULL,'Stage Dive',800,3,3,'https://image.fnbr.co/glider/5ab17efa5f957f27504aa54a/png.png','https://image.fnbr.co/glider/5ab17efa5f957f27504aa54a/icon.png');
	INSERT item VALUES(NULL,'Zephyr' ,800,3,3,'https://image.fnbr.co/glider/5ab1800b5f957f27504aa552/png.png','https://image.fnbr.co/glider/5ab1800b5f957f27504aa552/icon.png');
	INSERT item VALUES(NULL,'Voyager',800,3,3,'https://image.fnbr.co/glider/5ab17fc05f957f27504aa550/png.png','https://image.fnbr.co/glider/5ab17fc05f957f27504aa550/icon.png');
	
	/*Glider-->Uncommon*/
	INSERT item VALUES(NULL,'Goalbound' ,500,3,4,'https://image.fnbr.co/glider/5b1e8992efc1551ade14c653/png.png','https://image.fnbr.co/glider/5b1e8992efc1551ade14c653/icon.png');
	INSERT item VALUES(NULL,'Glow Rider' ,500,3,4,'https://image.fnbr.co/glider/5ae89f88f3d31b247dc5b805/png.png','https://image.fnbr.co/glider/5ae89f88f3d31b247dc5b805/icon.png');
	INSERT item VALUES(NULL,'Jolly Roger',500,3,4,'https://image.fnbr.co/glider/5ab1b9329116ac5688c6d7d8/png.png','https://image.fnbr.co/glider/5ab1b9329116ac5688c6d7d8/icon.png');
	INSERT item VALUES(NULL,'Mainframe' ,500,3,4,'https://image.fnbr.co/glider/5ace24e51f0d4dba8bd42dfc/png.png','https://image.fnbr.co/glider/5ace24e51f0d4dba8bd42dfc/icon.png');
	INSERT item VALUES(NULL,'Meltdown',500,3,4,'https://image.fnbr.co/glider/5afc0ffcb6e7f76f91a32636/png.png','https://image.fnbr.co/glider/5afc0ffcb6e7f76f91a32636/icon.png');
	
	-- -------------------------------------------------------------------
	
/*Pickaxe-->Epic*/
	INSERT item VALUES(NULL,'AC/DC',1200,4,2,'https://image.fnbr.co/pickaxe/5ab15ea9a8956031d0159a25/icon.png','https://image.fnbr.co/pickaxe/5ab15ea9a8956031d0159a25/icon.png');
	INSERT item VALUES(NULL,'Chomp Jr.',1500,4,2,'https://image.fnbr.co/pickaxe/5ab165d7c3a23b4380359489/icon.png','https://image.fnbr.co/pickaxe/5ab165d7c3a23b4380359489/icon.png');
	INSERT item VALUES(NULL,'Candy Axe',1500,4,2,'https://image.fnbr.co/pickaxe/5ab1657cc3a23b4380359487/icon.png','https://image.fnbr.co/pickaxe/5ab1657cc3a23b4380359487/icon.png');
	INSERT item VALUES(NULL,'Bottom Feeder',1500,4,2,'https://image.fnbr.co/pickaxe/5ab16416c3a23b4380359483/icon.png','https://image.fnbr.co/pickaxe/5ab16416c3a23b4380359483/icon.png');
	INSERT item VALUES(NULL,'Oracle Axe',1200,4,2,'https://image.fnbr.co/pickaxe/5b1e89d2efc15524a714c656/icon.png','https://image.fnbr.co/pickaxe/5b1e89d2efc15524a714c656/icon.png');
	
	/*Pickaxe-->Rare*/
	INSERT item VALUES(NULL,'Lollipopper',800,4,3,'https://image.fnbr.co/pickaxe/5ae8950596f7044407e909bf/icon.png','https://image.fnbr.co/pickaxe/5ae8950596f7044407e909bf/icon.png');
	INSERT item VALUES(NULL,'Cutting Edge',800,4,3,'https://image.fnbr.co/pickaxe/5ace251b1f0d4d58ffd42dff/icon.png','https://image.fnbr.co/pickaxe/5ace251b1f0d4d58ffd42dff/icon.png');
	INSERT item VALUES(NULL,'Carrot Stick',800,4,3,'https://image.fnbr.co/pickaxe/5abcf4029542fbb759da12b3/icon.png','https://image.fnbr.co/pickaxe/5abcf4029542fbb759da12b3/icon.png');
	INSERT item VALUES(NULL,'Axeroni',800,4,3,'https://image.fnbr.co/pickaxe/5ace250d1f0d4d28fed42dfe/icon.png','https://image.fnbr.co/pickaxe/5ace250d1f0d4d28fed42dfe/icon.png');
	INSERT item VALUES(NULL,'Tendril',800,4,3,'https://image.fnbr.co/pickaxe/5b0e93acdb94f1a8c0c0a8db/featured.png','https://image.fnbr.co/pickaxe/5b0e93acdb94f1a8c0c0a8db/featured.png');
	
	/*Pickaxe-->Uncommon*/
	INSERT item VALUES(NULL,'Ice Breaker',500,4,4,'https://image.fnbr.co/pickaxe/5ab1b91b9116ac5688c6d7d7/icon.png','https://image.fnbr.co/pickaxe/5ab1b91b9116ac5688c6d7d7/icon.png');
	INSERT item VALUES(NULL,'Lucky',500,4,4,'https://image.fnbr.co/pickaxe/5ab1b9749116ac5688c6d7db/png.png','https://image.fnbr.co/pickaxe/5ab1b9749116ac5688c6d7db/icon.png');
	INSERT item VALUES(NULL,'Tactical Spade',500,4,4,'https://image.fnbr.co/pickaxe/5ab1bc649116ac5688c6d7f3/png.png','https://image.fnbr.co/pickaxe/5ab1bc649116ac5688c6d7f3/icon.png');
	INSERT item VALUES(NULL,'You Shouldnt Have',500,4,4,'https://image.fnbr.co/pickaxe/5ab1bdbf9116ac5688c6d7fc/png.png','https://image.fnbr.co/pickaxe/5ab1bdbf9116ac5688c6d7fc/icon.png');

	-- -------------------------------------------------------------------
	/*Emote-->Epic*/
	INSERT item VALUES(NULL,'Rocket Rodeo',800,5,2,'https://image.fnbr.co/emote/5ab173755f957f27504aa508/png.png','https://image.fnbr.co/emote/5ab173755f957f27504aa508/icon.png');
	INSERT item VALUES(NULL,'Rock Out',800,5,2,'https://image.fnbr.co/emote/5ace248f1f0d4dc3d8d42df7/png.png','https://image.fnbr.co/emote/5ace248f1f0d4dc3d8d42df7/icon.png');
	INSERT item VALUES(NULL,'Fresh',800,5,2,'https://image.fnbr.co/emote/5ab16b5c5f957f27504aa4e1/png.png','https://image.fnbr.co/emote/5ab16b5c5f957f27504aa4e1/icon.png');
	INSERT item VALUES(NULL,'Electro Shuffle',800,5,2,'https://image.fnbr.co/emote/5ab16a6f5f957f27504aa4de/png.png','https://image.fnbr.co/emote/5ab16a6f5f957f27504aa4de/icon.png');
	INSERT item VALUES(NULL,'Breakin',800,5,2,'https://image.fnbr.co/emote/5ab164dcc3a23b4380359484/png.png','https://image.fnbr.co/emote/5ab164dcc3a23b4380359484/icon.png');
	
	/*Emote-->Rare*/
	INSERT item VALUES(NULL,'Step it Up',500,5,3,'https://image.fnbr.co/emote/5ab17f1a5f957f27504aa54b/png.png','https://image.fnbr.co/emote/5ab17f1a5f957f27504aa54b/icon.png');
	INSERT item VALUES(NULL,'Take The L',500,5,3,'https://image.fnbr.co/emote/5ab17f6a5f957f27504aa54d/png.png','https://image.fnbr.co/emote/5ab17f6a5f957f27504aa54d/icon.png');
	INSERT item VALUES(NULL,'Tidy',500,5,3,'https://image.fnbr.co/emote/5ae65cf81b8f51dde9a4a2d2/png.png','https://image.fnbr.co/emote/5ae65cf81b8f51dde9a4a2d2/icon.png');
	INSERT item VALUES(NULL,'Wiggle',500,5,3,'https://image.fnbr.co/emote/5abcf4cf9542fb2e3eda12b9/png.png','https://image.fnbr.co/emote/5abcf4cf9542fb2e3eda12b9/icon.png');
	INSERT item VALUES(NULL,'Zany',500,5,3,'https://image.fnbr.co/emote/5afc1045b6e7f7edaea3263b/png.png','https://image.fnbr.co/emote/5afc1045b6e7f7edaea3263b/icon.png');
	
	/*Emote-->Uncommon*/
	INSERT item VALUES(NULL,'Jubilation',200,5,4,'https://image.fnbr.co/emote/5ab1b9419116ac5688c6d7d9/png.png','https://image.fnbr.co/emote/5ab1b9419116ac5688c6d7d9/icon.png');	
	INSERT item VALUES(NULL,'Slow Clap',200,5,4,'https://image.fnbr.co/emote/5ab1bbc39116ac5688c6d7ed/png.png','https://image.fnbr.co/emote/5ab1bbc39116ac5688c6d7ed/icon.png');
	INSERT item VALUES(NULL,'Salute',200,5,4,'https://image.fnbr.co/emote/5ab1bb0b9116ac5688c6d7e8/png.png','https://image.fnbr.co/emote/5ab1bb0b9116ac5688c6d7e8/icon.png');
	INSERT item VALUES(NULL,'Red Card',200,5,4,'https://image.fnbr.co/emote/5b1e8900efc1556cb214c64f/png.png','https://image.fnbr.co/emote/5b1e8900efc1556cb214c64f/icon.png');
	INSERT item VALUES(NULL,'Click!',200,5,4,'https://image.fnbr.co/emote/5add23120f79c490300cc286/png.png','https://image.fnbr.co/emote/5add23120f79c490300cc286/icon.png');