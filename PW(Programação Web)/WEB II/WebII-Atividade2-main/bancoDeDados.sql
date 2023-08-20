CREATE DATABASE IF NOT EXISTS cristian_web CHARACTER SET utf8mb4;
USE cristian_web;

CREATE TABLE usuario(
id int not null auto_increment primary key,
nome varchar(75) not null,
cpf varchar (15) not null,
email varchar (100) not null,
nascimento date not null,
ativo int
);

create table fornecedor(
id int not null auto_increment primary key,
nome varchar(75) not null,
ativo int
);
create table produto(
id int not null auto_increment primary key,
nome varchar(75) not null,
descricao text,
data_fab date not null,
marca varchar(75) not null,
valor double precision not null,
foto longblob ,
ativo int,
fk_fornecedor int not null,
FOREIGN KEY (fk_fornecedor) REFERENCES fornecedor(id)
);
-- 
create table produto_prova_relatorio (
    id int not null auto_increment primary key,
    nome varchar(60) not null,
    valor decimal(9, 2) not null,
    data_vencimento date not null,
    quantidade_em_estoque int not null
);

INSERT INTO produto_prova_relatorio VALUES
(null, 'Maçãs', 2.99, '2023-07-05', 6),
(null, 'Leite', 3.49, '2023-07-10', 8),
(null, 'Pão de forma', 5.99, '2023-07-07', 5),
(null, 'Iogurte', 2.79, '2023-07-15', 0),
(null, 'Cenouras', 1.99, '2023-07-06', 10),
(null, 'Café em pó', 9.99, '2023-07-20', 2),
(null, 'Macarrão', 2.49, '2023-07-12', 7),
(null, 'Queijo', 7.99, '2023-07-08', 0),
(null, 'Manteiga', 4.59, '2023-07-14', 9),
(null, 'Tomates', 3.29, '2023-07-09', 12),
(null, 'Bananas', 2.49, '2023-07-13', 15),
(null, 'Cereal', 6.99, '2023-07-18', 6),
(null, 'Suco de laranja', 4.99, '2023-07-07', 8),
(null, 'Abacaxis', 3.99, '2023-07-05', 5),
(null, 'Refrigerante', 2.99, '2023-07-10', 10),
(null, 'Frango', 8.99, '2023-07-25', 3),
(null, 'Arroz', 3.99, '2023-07-13', 7),
(null, 'Feijão', 2.79, '2023-07-15', 9),
(null, 'Cebolas', 1.99, '2023-07-07', 11),
(null, 'Pimentões', 2.49, '2023-07-12', 14),
(null, 'Batatas', 1.99, '2023-07-20', 10),
(null, 'Bolachas', 3.99, '2023-07-08', 6),
(null, 'Chocolate', 4.59, '2023-07-14', 0),
(null, 'Amendoim', 2.29, '2023-07-09', 9),
(null, 'Molho de tomate', 2.99, '2023-07-06', 12),
(null, 'Biscoitos', 1.99, '2023-07-11', 8),
(null, 'Suco de uva', 4.99, '2023-07-19', 6),
(null, 'Melão', 3.99, '2023-07-07', 7),
(null, 'Iogurte grego', 2.79, '2023-07-17', 4),
(null, 'Morangos', 3.29, '2023-07-10', 11),
(null, 'Alface', 1.49, '2023-07-06', 15);


