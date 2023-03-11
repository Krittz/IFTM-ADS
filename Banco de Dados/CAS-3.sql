-- ------------------------QUESTÃO 01--------------------------

CREATE DATABASE IF NOT EXISTS banco_cliente DEFAULT CHARACTER SET utf8;
USE `banco_cliente`;

CREATE TABLE banco(
	codigo int not null primary key,
    nome varchar(45) not null
);
CREATE TABLE agencia(
	numero_agencia int not null primary key,
    endereco text not null,
    cod_banco int not null,
    FOREIGN KEY fk_banco(cod_banco) REFERENCES banco(codigo)
    ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE conta(
	numero_conta varchar(7) not null primary key,
    saldo decimal(14,2) not null,
    tipo_conta int not null,
    num_agencia int not null,
    FOREIGN KEY fk_agencia(num_agencia) REFERENCES agencia(numero_agencia)
    ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE cliente(
	cpf varchar(14) not null primary key,
    nome varchar(45) not null,
    sexo varchar(1) not null,
    endereco text
    
);
CREATE TABLE historico( 
	cpf_cliente varchar(14) not null primary key,
    num_conta varchar(7) not null,
    data_inicio date not null,
    FOREIGN KEY fk_cliente(cpf_cliente) REFERENCES cliente(cpf)
    ON UPDATE CASCADE ON DELETE RESTRICT
);
CREATE TABLE telefone_cliente(
	cpf_cli varchar(14) not null,
    telefone_cli varchar(13),
    FOREIGN KEY fk_cpf_cli(cpf_cli) REFERENCES cliente(cpf)
    ON UPDATE CASCADE ON DELETE RESTRICT
); 

-- ------------------------QUESTÃO 02--------------------------
INSERT INTO banco(codigo, nome)  VALUES(1, 'Banco do Brasil'), (4, 'CEF');

INSERT INTO agencia(numero_agencia, endereco, cod_banco) 
VALUES	(0562, 'Rua Joaquim Texeira Alves, 1555', 4),
		(3153, 'Av. Marcelino Pires, 1960', 1);

INSERT INTO cliente(cpf, nome, sexo, endereco)
VALUES	('111.222.333-44', 'Jennifer B Souza', 'F', 'Rua Cuiabá, 1050'),
		('666.777.888-99', 'Caetano K Lima', 'M', 'Rua Ivinhema, 87'),
        ('555.444.777-33', 'Silvia Macedo', 'F', 'Rua Estados Unidos, 735');
        
INSERT INTO conta(numero_conta, saldo, tipo_conta, num_agencia)
VALUES	 ('86340-2', 763.05, 2, 3153),
		 ('2358-7', 3879.12, 1, 0562);
         
     

INSERT INTO historico(cpf_cliente, num_conta, data_inicio)
VALUES   ('111.222.333-44', '23584-7', '1977-12-17'),
		 ('666.777.888-99', '23584-7', '1977-12-17'),
		 ('555.444.777-33', '86340-2', '2010-11-29');

INSERT INTO telefone_cliente(cpf_cli, telefone_cli)
VALUES	 ('111.222.333-44', '(67)3422-7788'),
		 ('666.777.888-99', '(67)3423-9900'),
         ('666.777.888-99', '(67)8121-8833');


-- ------------------------QUESTÃO 03--------------------------

-- #A
ALTER TABLE cliente ADD email varchar(45);

-- #B
UPDATE agencia SET numero_agencia = '6342' WHERE cod_banco = '4';

-- #C
UPDATE cliente SET email = 'caetanolima@gmail.com' WHERE cpf = '666.777.888-99';

-- #D
INSERT INTO agencia(numero_agencia, endereco, cod_banco)
	VALUES(1333, 'Rua João José da Silva, 486', 1);
    
-- #E
SELECT * FROM cliente WHERE sexo = 'M';

-- #F
SELECT * FROM agencia;

-- #G
SELECT * FROM conta WHERE saldo > 750.00;

-- #H
DELETE FROM conta WHERE numero_conta = '86340-2';

-- #I
SELECT cpf, endereco FROM cliente WHERE nome LIKE 'C%';

-- #J
UPDATE conta SET saldo = saldo + (saldo*0.10) WHERE numero_conta = '2358-7';


    