	
    USE fornai;
    
    DELIMITER $$
	CREATE PROCEDURE usp_registrar_usuario 
    (
	p_nombre VARCHAR(50),
	p_apellido VARCHAR(50),
	p_username VARCHAR(50),
	p_clave VARCHAR(50),
	p_fec DATE,
	p_email VARCHAR(255),
	p_idpa INT
    )
	BEGIN
		DECLARE v_pavos INT DEFAULT 0;
		DECLARE v_tipousaurio INT  DEFAULT 1;
		BEGIN
			INSERT INTO usuario (nombre,apellido,username,clave,fecnac,email,pavos,idpais, idtipo)
			VALUES (p_nombre,p_apellido,p_username,p_clave,p_fec,p_email,v_pavos,p_idpa, v_tipousaurio); 
		END;
	END;
    
	DELIMITER $$
	CREATE PROCEDURE autogenerar()
	BEGIN
	  SELECT COUNT(*)
	  + 1 FROM orden_pedido;
	END;
    
	DELIMITER $$
	CREATE PROCEDURE usp_contar_pavos()
	BEGIN
		SELECT u.iduser,u.nombre,u.apellido,u.username,u.clave,u.email,u.fecnac,u.idpais,SUM(dp.cantidad) AS 'suma'
		FROM tb_orden_pedido_detalle AS dp 
		JOIN orden_pedido AS cp 
          ON dp.idPedido = cp.idPedido 
		JOIN usuario AS u 
          ON u.iduser = cp.idusuario
		GROUP BY u.iduser,u.nombre,u.apellido,u.username,u.clave,u.email,u.fecnac,u.idpais;
	END;
    
    DELIMITER $$
	CREATE PROCEDURE f_listaItem()
	BEGIN
		SELECT i.iditem, i.nombreItem,i.precio,r.idrarity, r.descripcion, t.destipo 
          FROM item i
		  JOIN tipo t
		    ON i.idtipo = t.idtipo
		  JOIN rarity r
		    ON r.idrarity = i.idrarity;	
	END;
    
    DELIMITER $$
	CREATE PROCEDURE usp_compra_detalle 
    (
	p_idped INT ,
	p_idpavo INT,
	p_cantidad INT,
	p_prec DECIMAL(18,0)
    )
	BEGIN		
		INSERT INTO tb_orden_pedido_detalle VALUES (p_idped,p_idpavo,p_cantidad,p_prec);
	    
		UPDATE usuario u
	      JOIN orden_pedido AS op 
            ON op.idusuario = u.iduser
	       SET pavos= pavos + p_cantidad
		 WHERE op.idpedido = p_idped;
	END;
    
    DELIMITER $$
	CREATE PROCEDURE usp_compra_item1 
    (
    p_idcompra INT, 
    p_iditem INT, 
    p_precio DECIMAL(18,0)
    )
	BEGIN
		DECLARE v_pavos INT;
		SET v_pavos = (SELECT pavos FROM usuario AS u JOIN orden_item oi ON oi.idusuario = u.iduser WHERE oi.idcompra=p_idcompra);
		
		If v_pavos < p_precio 
			THEN SELECT 'No Corresponde al precio' AS mensaje;
		ELSE
			INSERT INTO  tb_orden_item_detalle  VALUES(p_idcompra,p_iditem,p_precio); 
			INSERT INTO Inventario VALUES ((SELECT oi.idusuario FROM orden_item oi WHERE oi.idcompra=p_idcompra),p_iditem);
			SELECT 'Los datos son correctos' AS mensaje;

			UPDATE orden_item AS oi 
			JOIN usuario AS u 
              ON oi.idusuario = u.iduser
			 SET pavos = pavos - p_precio
		   WHERE oi.idcompra = p_idcompra; 
		END IF;
	END;
    
    DELIMITER $$
	CREATE PROCEDURE usp_new_pass 
    (
	p_pass VARCHAR(50),
	p_email VARCHAR(50)
    )
    BEGIN
		UPDATE usuario
		   SET clave = p_pass
		 WHERE email = p_email;
	END;
    
    DELIMITER $$
	CREATE PROCEDURE usp_validar_correo 
    (
	p_email VARCHAR(100)
    )
	BEGIN
		SELECT * FROM usuario WHERE email = p_email;
	END;
	
	DELIMITER $$
	CREATE PROCEDURE autogenerar_item()
	BEGIN
	  SELECT count(*)
	  + 1 FROM orden_item;
	END;
    
    