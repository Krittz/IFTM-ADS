CREATE DATABASE IF NOT EXISTS pre_prova DEFAULT CHARACTER SET utf8;
use pre_prova;

CREATE TABLE categorias(
	id int auto_increment not null primary key,
    nome varchar(45) not null    
);

CREATE TABLE produtos(
	id int not null primary key,
    nome varchar(45) not null,
    valor decimal(15,2) not null,
    codigo varchar(13) not null,
    quantidade int not null,
    descricao text,
    categoria_id int not null,
    FOREIGN KEY fk_categorias(categoria_id) REFERENCES categorias(id)
);
INSERT INTO `categorias` VALUES ('1', 'Eletrônicos');
INSERT INTO `categorias` VALUES ('2', 'Smartphones');
INSERT INTO `categorias` VALUES ('3', 'Comidas');

INSERT INTO `produtos` VALUES ('1', 'xBox X', '4500.00', '789', '10', 'Video-game', '1');
INSERT INTO `produtos` VALUES ('2', 'iPhone 12 Pro Max 256gb', '7100.00', '654', '8', 'Smartphone', '2');
INSERT INTO `produtos` VALUES ('3', 'iPhone 13 Pro Max 256gb', '8000.00', '159', '5', 'Smartphone', '2');
INSERT INTO `produtos` VALUES ('4', 'iPhone 13 Pro Max 512gb', '8900.00', '357', '3', 'Smartphone', '2');
INSERT INTO `produtos` VALUES ('5', 'Motorola G10', '1500.00', '025', '7', 'Smartphone', '2');
INSERT INTO `produtos` VALUES ('6', 'PlayStation 5', '5600.00', '741', '9', 'Video-game', '1');
INSERT INTO `produtos` VALUES ('7', 'Brigadeiro', '3.00', '996', '50', 'Delícia', '3');
INSERT INTO `produtos` VALUES ('9', 'Pizza Portuguesa', '35.00', '144', '15', 'Ovos, cebola, azeitona, ervilha, queijo e presunto', '3');

-- -------------------------QUESTAO 01 ----------------------------
CREATE TABLE servicos(
	id int auto_increment not null primary key,
    titulo varchar(45) not null,
    texto text,
    valor decimal(15,2) not null
);

-- -----------------------QUESTÃO 02-----------------------------

-- #A
INSERT INTO servicos(titulo, valor, texto)
	VALUES('Limpeza', 100.00, 'Limpar a casa'),
		('Reparos Eletricos', 150.00, 'Reparo na rede elétrica');       
        select * from servicos;
        
-- #B 
ALTER TABLE servicos ADD telefone varchar(12);

-- #C 
SELECT * FROM produtos ORDER BY nome ASC;

-- 
SELECT nome, valor FROM produtos WHERE valor > 5000.00 ORDER BY valor DESC;

-- #E
SELECT * FROM produtos WHERE categoria_id = 3;

-- #F 
UPDATE produtos SET nome = 'Nintendo 3DS', codigo = 621, valor = 2400.00, categoria_id = 1 WHERE id =2;

-- #G
DELETE FROM produtos WHERE id = 9;


-- #H 
UPDATE servicos SET telefone = '389999-0000' WHERE id = 1;

select * from servicos





