-- ---------------------- QUESTÃO 01 ------------------------
CREATE DATABASE IF NOT EXISTS vinicola_cristian DEFAULT CHARACTER SET utf8;
USE `vinicola_cristian`;

CREATE TABLE regiao(
regiao_id int not null auto_increment primary key,
nome_regiao varchar(45) not null,
descricao_regiao text 
 );
 
CREATE TABLE vinicola(
vinicola_id int not null auto_increment primary key,
nome_vinicola varchar(45) not null,
cidade_vinicola varchar(45),
fone_vinicola varchar(45) not null,
regiao_id int not null,
FOREIGN KEY fk_regiao(regiao_id) REFERENCES regiao(regiao_id)

);

CREATE TABLE vinho(
vinho_id int not null auto_increment primary key,
nome_vinho varchar(45) not null,
tipo_vinho varchar(45) not null,
ano_vinho int not null,
descricao_vinho text,
vinicola_id int not null,
FOREIGN KEY fk_vinicola(vinicola_id) REFERENCES vinicola(vinicola_id)
);

-- ---------------------- QUESTÃO 02 ------------------------

INSERT INTO regiao VALUES(1, 'Serra Gaucha', 'Serra do Rio Grande do Sul');
INSERT INTO regiao VALUES(2, 'Sul de Minas', 'Sul do Estado de Minas Gerais');

INSERT INTO vinicola VALUES(1, 'Cave Geisse', 'Pinto Banderia, RS', '(61) 99999-0000', 1);
INSERT INTO vinicola VALUES(NULL, 'Vinícola Miolo', 'Vale dos Vinhedos, RS', '(61) 99999-0000', 1);
INSERT INTO vinicola VALUES (NULL, 'Casa Valduga', 'Vale dos Vinhedos, RS', '(61) 99999-0000', 1);
INSERT INTO vinicola VALUES (NULL, 'Pizzato', 'Vale dos Vinhedos, RS', '(61) 99999-0000', 1);
INSERT INTO vinicola VALUES (NULL, 'Peterlongo', 'Garibaldi, RS', '(61) 99999-0000', 1);
INSERT INTO vinicola VALUES (NULL, 'Luiz Porto', 'Cordislândia, MG', '(32) 99999-0000', 2);
INSERT INTO vinicola VALUES (NULL, 'Primeira Estrada', 'Três Corações, MG', '(32) 99999-0000', 2);

INSERT INTO vinho (vinho_id, nome_vinho, tipo_vinho, ano_vinho, vinicola_id) VALUES(1, 'Cave Geisse', 'tinto', '2009', 1);
INSERT INTO vinho (vinho_id, nome_vinho, tipo_vinho, ano_vinho, vinicola_id) VALUES(NULL, 'Miolo', 'tinto', '2001', 2);
INSERT INTO vinho (vinho_id, nome_vinho, tipo_vinho, ano_vinho, vinicola_id) VALUES(NULL, 'Valduga', 'branco', '1988', 3);
INSERT INTO vinho (vinho_id, nome_vinho, tipo_vinho, ano_vinho, vinicola_id) VALUES(NULL, 'Pizzato', 'branco', '1995', 4);
INSERT INTO vinho (vinho_id, nome_vinho, tipo_vinho, ano_vinho, vinicola_id) VALUES(NULL, 'Peterlongo', 'rose', '2007', 5);
INSERT INTO vinho (vinho_id, nome_vinho, tipo_vinho, ano_vinho, vinicola_id) VALUES(NULL, 'Luiz Porto', 'tinto', '2004', 6);
INSERT INTO vinho (vinho_id, nome_vinho, tipo_vinho, ano_vinho, vinicola_id) VALUES(NULL, 'Primeira Estrada', 'rose', '2015', 7);
-- -- ---------------------- QUESTÃO 03 ------------------------
-- #A
UPDATE vinicola SET fone_vinicola = '(61)98888-0000' WHERE vinicola_id = 5;
select fone_vinicola from vinicola where vinicola_id = 5;

-- #B
UPDATE vinicola SET cidade_vinicola = 'Sete Lagos, MG' WHERE vinicola_id = 5;
select cidade_vinicola from vinicola where vinicola_id = 5;

-- #C
UPDATE vinho SET nome_vinho = 'Mioranza', vinicola_id = 6 WHERE vinho_id = 2;
select * from vinho where vinho_id = 2;

-- #D
DELETE FROM vinho WHERE vinho_id = 7;
select * from vinho;

-- #E
SELECT * FROM vinicola;

-- #F 
SELECT * FROM vinho order by nome_vinho;

-- #G
SELECT * FROM vinho WHERE ano_vinho >=2000 AND ano_vinho <=2010;

-- #H
SELECT vinho_id, nome_vinho, ano_vinho FROM vinho WHERE tipo_vinho = 'branco' ORDER BY nome_vinho;

-- #I
SELECT DISTINCT tipo_vinho from vinho;

