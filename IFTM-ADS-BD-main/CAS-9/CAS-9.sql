CREATE DATABASE auladml;
USE auladml;

CREATE TABLE banco (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(45)
);

CREATE TABLE agencia (
    numero_agencia INT NOT NULL,
    cod_banco INT NOT NULL,
    endereco VARCHAR(100),
    CONSTRAINT PRIMARY KEY (numero_agencia , cod_banco),
    CONSTRAINT fk_banco FOREIGN KEY (cod_banco)
        REFERENCES banco (codigo)
);

CREATE TABLE cliente (
    cpf VARCHAR(14) NOT NULL PRIMARY KEY,
    nome VARCHAR(45) NOT NULL,
    endereco VARCHAR(100),
    sexo CHAR(1)
);

CREATE TABLE conta (
    num_conta VARCHAR(7) PRIMARY KEY,
    saldo FLOAT NOT NULL DEFAULT 0,
    tipo_conta INT,
    num_agencia INT,
    CONSTRAINT fk_agencia FOREIGN KEY (num_agencia)
        REFERENCES agencia (numero_agencia)
);

CREATE TABLE historico (
    cpf VARCHAR(14) NOT NULL,
    num_conta VARCHAR(7),
    data_inicio DATE,
    CONSTRAINT PRIMARY KEY (cpf , num_conta),
    CONSTRAINT fk_cpf FOREIGN KEY (cpf)
        REFERENCES cliente (cpf),
    CONSTRAINT fk_numconta FOREIGN KEY (num_conta)
        REFERENCES conta (num_conta)
);

CREATE TABLE telefone_cliente (
    cpf_cli VARCHAR(14) NOT NULL,
    telefone VARCHAR(20),
    CONSTRAINT PRIMARY KEY (cpf_cli , telefone),
    CONSTRAINT fk_cpf_cliente FOREIGN KEY (cpf_cli)
        REFERENCES cliente (cpf)
);

/*---------------------------------------------------*/
INSERT INTO banco VALUES (1, "Banco do Brasil");
INSERT INTO banco VALUES (4, "CEF");
INSERT INTO banco VALUES (NULL, "Bradesco");

INSERT INTO agencia VALUES (0582, 4, "Rua Joaquim Teixeira, 1555");
INSERT INTO agencia VALUES (3153, 1, "Av Marcelino Pires, 1960");

INSERT INTO cliente VALUES ("111.222.333-44", "Jennifer B Souza", "Rua Cuiabá, 1050", "F");
INSERT INTO cliente VALUES ("666.777.888-99", "Caetano K lima", "Rua Invinhema, 879", "M");
INSERT INTO cliente VALUES ("555.444.777-33", "Silva Macedo", "Rua Estados Unidos, 735", "F");

INSERT INTO conta VALUES("86340-2", 763.05, 2, 3153);
INSERT INTO conta VALUES("23584-7", 3879.12, 1, 0582);

INSERT INTO historico VALUES ("111.222.333-44", "23584-7", STR_TO_DATE("17-12-1997", "%d-%m-%Y"));
INSERT INTO historico VALUES ("666.777.888-99", "23584-7", STR_TO_DATE("17-12-1997", "%d-%m-%Y"));
INSERT INTO historico VALUES ("555.444.777-33", "86340-2", STR_TO_DATE("29-11-2010", "%d-%m-%Y"));
 
INSERT INTO telefone_cliente VALUES ("111.222.333-44", "(67)3422-7788" );
INSERT INTO telefone_cliente VALUES ("666.777.888-99", "(67)3423-9900" );
INSERT INTO telefone_cliente VALUES ("666.777.888-99", "(67)8121-8833" );


/*-----------------------------------------------------------------*/

-- --------------QUESTÃO 01---------------

-- #A
SELECT h.cpf as CPF, TIMESTAMPDIFF(YEAR, h.data_inicio, current_date)as ANOS,
TIMESTAMPDIFF(MONTH, h.data_inicio + INTERVAL TIMESTAMPDIFF(YEAR, h.data_inicio, current_date)YEAR, current_date) as MESES,
TIMESTAMPDIFF(DAY, h.data_inicio + INTERVAL TIMESTAMPDIFF(MONTH, h.data_inicio, current_date)MONTH, current_date) as DIAS
 FROM historico h;


-- #B 
	SELECT extract(month FROM now()) as MES_ATUAL;
    
-- #C 
	SELECT SUBSTRING(c.num_conta, 1 , 5 ) as conta_sem_digito FROM conta c;
    
-- #D 
DELIMITER //
CREATE TRIGGER inserir_telefone
AFTER INSERT ON cliente
FOR EACH ROW
BEGIN
INSERT INTO telefone_cliente (telefone)
	VALUES
		('(00)0 0000-0000');
END
    //
    
-- #E 
DELIMITER //
CREATE TRIGGER deletar_cliente
BEFORE DELETE ON cliente
	FOR EACH ROW
    BEGIN 
    DELETE FROM telefone_cliente WHERE cpf_cli = old.cpf;
END
	//

-- #F 
CREATE TABLE registro(
	codigo INT NOT NULL auto_increment PRIMARY KEY,
    num_conta
);

DROP TABLE log;
