--  ---------- QUESTÃO 1 -----------

-- CREATE DATABASE IF NOT EXISTS bd2_aula_2 DEFAULT CHARACTER SET utf8;
--  USE `$bd2_aula_2`;
-- CREATE TABLE produtos(
--   produto_id int auto_increment not null primary key,
--   nome varchar(45) not null,
--   estoque int not null,
--   preco decimal(10, 2) not null,
--   categoria varchar(20) not null,
--   obs text
-- );
-- CREATE TABLE clientes(
--   cliente_id int auto_increment not null primary key,
--   nome varchar(40) not null,
--   telefone varchar(20) not null,
--   sexo char(1) not null,
--   renda decimal(10, 2),
--   data_nascimento date not null
-- );
-- CREATE TABLE vendas(
--   venda_id int not null auto_increment primary key,
--   data_venda date not null,
--   cliente int not null,
--   tipo varchar(15) not null,
--   FOREIGN KEY fk_cliente(cliente) REFERENCES clientes(cliente_id)
-- );
-- CREATE TABLE itens_vendidos(
--   item_vendido int not null primary key,
--   venda_id int not null,
--   produto_id int not null,
--   quantidade int not null,
--   valor_unidade decimal(10, 2) not null,
--   FOREIGN KEY fk_produto(produto_id) REFERENCES produtos(produto_id) ON UPDATE CASCADE ON DELETE RESTRICT,
--   FOREIGN KEY fk_venda(venda_id) REFERENCES vendas(venda_id) ON UPDATE CASCADE ON DELETE RESTRICT
-- );

-- ---------- QUESTÃO 2 -----------

-- #A
-- RENAME TABLE produtos TO produtos_loja;
-- -- #B
-- ALTER TABLE clientes ADD COLUMN email varchar(45) AFTER telefone;

-- -- #C
-- ALTER TABLE clientes ADD COLUMN cpf varchar(11) NOT NULL UNIQUE AFTER nome;

-- #D
-- ALTER TABLE produtos_loja RENAME COLUMN obs TO observacao;

-- #E
  -- ALTER TABLE clientes DROP COLUMN renda;

-- #F
--  ALTER TABLE clientes ADD CONSTRAINT email UNIQUE (email);

-- #G
   CREATE TABLE categoria(
     id_cat int auto_increment not null primary key,
     nome varchar(20) not null
   );

   ALTER TABLE produtos_loja ADD COLUMN categoria int not null,
   ADD FOREIGN KEY fk_categoria(categoria) REFERENCES categoria(id_cat) ON UPDATE CASCADE ON DELETE RESTRICT,
   ADD INDEX fk_categoria(categoria);
   

   