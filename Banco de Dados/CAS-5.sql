-- Active: 1663734066246@@127.0.0.1@3306

CREATE DATABASE
    IF NOT EXISTS BDEmpresa DEFAULT CHARACTER SET = 'utf8mb4';

USE BDEmpresa;

CREATE TABLE
    Departamento (
        ID_Depto NUMERIC(2) NOT NULL,
        NomeDepto VARCHAR(30) NOT NULL,
        ID_Gerente NUMERIC(4) NOT NULL,
        CONSTRAINT pk_depto PRIMARY KEY (ID_Depto),
        CONSTRAINT uk_nome UNIQUE (NomeDepto)
    );

CREATE TABLE
    Funcionario (
        ID_Func NUMERIC(4) NOT NULL,
        NomeFunc VARCHAR(30) NOT NULL,
        Endereco VARCHAR(50) NOT NULL,
        DataNASc DATE NOT NULL,
        Sexo CHAR(1) NOT NULL,
        Salario NUMERIC(8, 2) NOT NULL,
        ID_Superv NUMERIC(4) NULL,
        ID_Depto NUMERIC(2) NOT NULL,
        CONSTRAINT pk_func PRIMARY KEY (ID_Func),
        CONSTRAINT ck_sexo CHECK (
            Sexo = 'M'
            or Sexo = 'F'
        )
    );

CREATE TABLE
    Projeto (
        ID_Proj NUMERIC(4) NOT NULL,
        NomeProj VARCHAR(30) NOT NULL,
        Localizacao VARCHAR(30) NULL,
        ID_Depto NUMERIC(2) NOT NULL,
        CONSTRAINT pk_proj PRIMARY KEY (ID_Proj),
        CONSTRAINT uk_nomeProj UNIQUE (NomeProj)
    );

CREATE TABLE
    Dependente (
        ID_Dep NUMERIC(6) NOT NULL,
        ID_Func NUMERIC(4) NOT NULL,
        NomeDep VARCHAR(30) NOT NULL,
        DataNASc DATE NOT NULL,
        Sexo CHAR(1) NOT NULL,
        Parentesco CHAR(15) NULL,
        CONSTRAINT pk_depend PRIMARY KEY (ID_Dep, ID_Func),
        CONSTRAINT ck_sexo_dep CHECK (
            Sexo = 'M'
            or Sexo = 'F'
        )
    );

CREATE TABLE
    Trabalha (
        ID_Func NUMERIC(4) NOT NULL,
        ID_Proj NUMERIC(4) NOT NULL,
        NumHorAS NUMERIC(6, 1) NULL,
        CONSTRAINT pk_trab PRIMARY KEY (ID_Func, ID_Proj)
    );

INSERT INTO Funcionario
VALUES (
        1,
        'Joao Silva',
        'R. Guaicui, 175',
        str_to_date('01/02/1955', "%d/%m/%Y"),
        'M',
        500,
        2,
        1
    );

INSERT INTO Funcionario
VALUES (
        2,
        'Frank Santos',
        'R. Gentios, 22',
        str_to_date('02/02/1966', "%d/%m/%Y"),
        'M',
        1000,
        8,
        1
    );

INSERT INTO Funcionario
VALUES (
        3,
        'Alice Pereira',
        'R. Curitiba, 11',
        str_to_date('15/05/1970', "%d/%m/%Y"),
        'F',
        700,
        4,
        3
    );

INSERT INTO Funcionario
VALUES (
        4,
        'Junia Mendes',
        'R. Espirito Santos, 123',
        str_to_date('06/07/1976', "%d/%m/%Y"),
        'F',
        1200,
        8,
        3
    );

INSERT INTO Funcionario
VALUES (
        5,
        'Jose Tavares',
        'R. Irai, 153',
        str_to_date('07/10/1975', "%d/%m/%Y"),
        'M',
        1500,
        2,
        1
    );

INSERT INTO Funcionario
VALUES (
        6,
        'Luciana Santos',
        'R. Irai, 175',
        str_to_date('07/10/1960', "%d/%m/%Y"),
        'F',
        600,
        2,
        1
    );

INSERT INTO Funcionario
VALUES (
        7,
        'Maria Ramos',
        'R. C. LINhares, 10',
        str_to_date('01/11/1965', "%d/%m/%Y"),
        'F',
        1000,
        4,
        3
    );

INSERT INTO Funcionario
VALUES (
        8,
        'Jaime Mendes',
        'R. Bahia, 111',
        str_to_date('25/11/1960', "%d/%m/%Y"),
        'M',
        2000,
        NULL,
        2
    );

INSERT INTO Departamento VALUES (1, 'Pesquisa', 2);

INSERT INTO Departamento VALUES (2, 'AdmINistracao', 8);

INSERT INTO Departamento VALUES (3, 'Construcao', 4);

INSERT INTO Dependente
VALUES (
        1,
        2,
        'Luciana',
        str_to_date('05/11/1990', "%d/%m/%Y"),
        'F',
        'Filha'
    );

INSERT INTO Dependente
VALUES (
        2,
        2,
        'Paulo',
        str_to_date('11/11/1992', "%d/%m/%Y"),
        'M',
        'Filho'
    );

INSERT INTO Dependente
VALUES (
        3,
        2,
        'Sandra',
        str_to_date('05/12/1996', "%d/%m/%Y"),
        'F',
        'Filha'
    );

INSERT INTO Dependente
VALUES (
        4,
        4,
        'Mike',
        str_to_date('05/11/1997', "%d/%m/%Y"),
        'M',
        'Filho'
    );

INSERT INTO Dependente
VALUES (
        5,
        1,
        'Max',
        str_to_date('11/05/1979', "%d/%m/%Y"),
        'M',
        'Filho'
    );

INSERT INTO Dependente
VALUES (
        6,
        1,
        'Rita',
        str_to_date('07/11/1985', "%d/%m/%Y"),
        'F',
        'Filha'
    );

INSERT INTO Dependente
VALUES (
        7,
        1,
        'Bety',
        str_to_date('15/12/1960', "%d/%m/%Y"),
        'F',
        'Esposa'
    );

INSERT INTO Projeto VALUES (1, 'ProdX', 'SavASsi', 1);

INSERT INTO Projeto VALUES (2, 'ProdY', 'Luxemburgo', 1);

INSERT INTO Projeto VALUES (3, 'ProdZ', 'Centro', 1);

INSERT INTO Projeto VALUES (10, 'Computacao', 'C. Nova', 3);

INSERT INTO Projeto VALUES (20, 'Organizacao', 'Luxemburgo', 2);

INSERT INTO Projeto VALUES (30, 'N. Beneficios', 'C. Nova', 1);

INSERT INTO Trabalha VALUES (1, 1, 32.5);

INSERT INTO Trabalha VALUES (1, 2, 7.5);

INSERT INTO Trabalha VALUES (5, 3, 40.0);

INSERT INTO Trabalha VALUES (6, 1, 20.0);

INSERT INTO Trabalha VALUES (6, 2, 20.0);

INSERT INTO Trabalha VALUES (2, 2, 10.0);

INSERT INTO Trabalha VALUES (2, 3, 10.0);

INSERT INTO Trabalha VALUES (2, 10, 10.0);

INSERT INTO Trabalha VALUES (2, 20, 10.0);

INSERT INTO Trabalha VALUES (3, 30, 30.0);

INSERT INTO Trabalha VALUES (3, 10, 10.0);

INSERT INTO Trabalha VALUES (7, 10, 35.0);

INSERT INTO Trabalha VALUES (7, 30, 5.0);

INSERT INTO Trabalha VALUES (4, 20, 15.0);

INSERT INTO Trabalha VALUES (8, 20, NULL);

ALTER TABLE Funcionario
ADD
    CONSTRAINT fk_func_depto FOREIGN KEY (ID_Depto) REFERENCES Departamento (ID_Depto);

ALTER TABLE Funcionario
ADD
    CONSTRAINT fk_func_superv FOREIGN KEY (ID_Superv) REFERENCES Funcionario (ID_Func);

ALTER TABLE Departamento
ADD
    CONSTRAINT fk_depto_func FOREIGN KEY (ID_Gerente) REFERENCES Funcionario (ID_Func);

ALTER TABLE Projeto
ADD
    CONSTRAINT fk_proj_depto FOREIGN KEY (ID_Depto) REFERENCES Departamento (ID_Depto);

ALTER TABLE Dependente
ADD
    CONSTRAINT fk_dep_func FOREIGN KEY (ID_Func) REFERENCES Funcionario (ID_Func) ON DELETE CASCADE;

ALTER TABLE Trabalha
ADD
    CONSTRAINT fk_trab_func FOREIGN KEY (ID_Func) REFERENCES Funcionario (ID_Func) ON DELETE CASCADE;

ALTER TABLE Trabalha
ADD
    CONSTRAINT fk_trab_proj FOREIGN KEY (ID_Proj) REFERENCES Projeto (ID_Proj) ON DELETE CASCADE;

-- ---------------------|Questão 01|---------------------

-- #A

SELECT
    NomeFunc AS Nome,
    DATE_FORMAT(DataNASc, '%d/%m/%y') AS NAScimento
FROM Funcionario
WHERE NomeFunc = 'João Silva';

-- #B

SELECT
    NomeFunc AS Nome,
    Endereco AS Endereço
FROM Funcionario
WHERE ID_Depto = (
        SELECT ID_Depto
        FROM Departamento
        WHERE
            NomeDepto = 'Pesquisa'
    );

-- #C

SELECT
    Projeto.ID_Proj,
    Projeto.ID_Depto,
    Departamento.NomeDepto AS Departamento,
    Funcionario.Endereco AS Endereco_Gerente,
    DATE_FORMAT(
        Funcionario.DataNASc,
        '%d - %m - %Y'
    ) AS NASc_Gerente
FROM
    Projeto,
    Departamento,
    Funcionario
WHERE
    Localizacao LIKE "%Luxemburgo%" && Funcionario.ID_Func = Departamento.ID_Gerente;

-- #D

SELECT e.NomeFunc, s.NomeFunc
FROM
    Funcionario e,
    Funcionario s
WHERE s.ID_Func = e.ID_Superv;

-- #E

SELECT NomeFunc FROM Funcionario WHERE ID_Depto = 1;

-- #F

SELECT distINct Salario FROM Funcionario;

-- #G

SELECT * FROM Funcionario WHERE Endereco LIKE "%Irai%";

-- #H

SELECT ID_Proj AS Num_Projeto
FROM Projeto
WHERE ID_Depto IN (
        SELECT ID_Gerente
        FROM Departamento
        WHERE ID_Gerente IN (
                SELECT ID_Func
                FROM Funcionario
                WHERE
                    NomeFunc LIKE "%Santos%"
            )
    );

-- #I

SELECT
    Salario * 1.2 AS Salario_Aumentado
FROM Funcionario
WHERE ID_Func IN (
        SELECT ID_Func
        FROM Trabalha
        WHERE ID_Proj IN(
                SELECT ID_Proj
                FROM Projeto
                WHERE
                    NomeProj LIKE "%ProdX%"
            )
    );

-- #J

SELECT *
FROM Funcionario
WHERE
    ID_Depto = 3
    AND Salario BETWEEN 800 AND 1200;