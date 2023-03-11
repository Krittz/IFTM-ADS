CREATE SCHEMA IF NOT EXISTS `db2_ava2` DEFAULT CHARACTER SET utf8 ;

USE `db2_ava2` ;

/*
 Navicat MySQL Data Transfer
 Source Server         : Localhost
 Source Server Version : 50505
 Source Host           : localhost:3306
 Source Database       : eventos
 Target Server Type    : MYSQL
 Target Server Version : 50505
 File Encoding         : 65001
 Date: 2022-05-11 20:52:07
 */

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------

-- Table structure for `atividades`

-- ----------------------------

DROP TABLE IF EXISTS `atividades`;

CREATE TABLE
    `atividades` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `nome` varchar(250) NOT NULL,
        `descricao` text DEFAULT NULL,
        `limite` tinyint(4) NOT NULL,
        `numero_participantes` int(11) DEFAULT NULL,
        `data` date DEFAULT NULL,
        `hora_inicio` time DEFAULT NULL,
        `hora_final` time DEFAULT NULL,
        `duracao` tinyint(4) DEFAULT NULL,
        `sala_id` int(11) NOT NULL,
        `turno_id` int(11) NOT NULL,
        `palestrante` text DEFAULT NULL,
        `obs` text DEFAULT NULL,
        PRIMARY KEY (`id`),
        KEY `fk_atividades_salas_idx` (`sala_id`) USING BTREE,
        KEY `fk_atividades_turnos1_idx` (`turno_id`) USING BTREE,
        CONSTRAINT `atividades_ibfk_1` FOREIGN KEY (`sala_id`) REFERENCES `salas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
        CONSTRAINT `atividades_ibfk_2` FOREIGN KEY (`turno_id`) REFERENCES `turnos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
    ) ENGINE = InnoDB AUTO_INCREMENT = 33 DEFAULT CHARSET = utf8;

-- ----------------------------

-- Records of atividades

-- ----------------------------

INSERT INTO `atividades`
VALUES (
        '1',
        'Simulado ENEM',
        '',
        '0',
        null,
        '2018-10-04',
        '06:30:00',
        '12:00:00',
        '6',
        '23',
        '1',
        '',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '2',
        'Roda de conversa: Violência contra a mulher',
        'Discussão sobre o que é ser mulher na sociedade, os padrões impostos, os tipos de violência e o tráfico.',
        '1',
        '20',
        '2018-10-04',
        '08:00:00',
        '12:00:00',
        '4',
        '1',
        '1',
        'Isabele da Silva Souza, \r\nRenata Lima Bernardo, \r\nLetícia Destri Centrone e\r\nTatiane Martins Gomes',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '3',
        'Roda de Conversa: Meninas Digitais',
        'Nesta roda de conversa será discutido os desafios que as mulheres enfrentam ao empreender na área de informática/computação, sendo apresentadas histórias motivadoras e dicas para mulheres e jovens que desejam empreender na área. ',
        '1',
        '20',
        '2018-10-05',
        '15:30:00',
        '16:30:00',
        '1',
        '4',
        '3',
        'Esteic Janaina Santos Batista e\r\nConvidada: Natália Almeida de Deus Reis',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '4',
        'Minicurso: Unity3D - Desenvolva seu próprio Jogo',
        'Neste curso o estudante aprenderá desenvolver um jogo na game engine Unity3D, mostrando os recursos e principais conceitos para o desenvolvimento de jogos.',
        '1',
        '25',
        '2018-10-04',
        '07:30:00',
        '11:30:00',
        '4',
        '17',
        '1',
        'Natália Almeida de Deus Reis',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '5',
        'Palestra - Games Independentes: concepção e desenvolvimento',
        'A proposta da palestra é compartilhar algumas experiências sobre a carreira de desenvolvedor independente de jogos, falando um pouco de criação à viabilização dos projetos.\r\nO palestrante, André Santee é design e sócio proprietário da Asantee Games em Campo Grande, empresa em ascensão na área de games no estado.',
        '1',
        '120',
        '2018-10-04',
        '14:00:00',
        '15:30:00',
        '2',
        '3',
        '2',
        'André Monteiro Santee ',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '6',
        'Minicurso: Programação com Scratch',
        'Neste minicurso os estudantes aprenderão a manipular o Scratch, uma ferramenta de programação em blocos destinada à criação de histórias, animações e jogos 2D.',
        '1',
        '25',
        '2018-10-04',
        '07:30:00',
        '11:30:00',
        '4',
        '24',
        '1',
        'Diego Nunez (Monitores: João Carlos Peliçon, Caio Alves, Claudio Santos Oliveira, Istella Lira Conder e Quesia Araújo Santos)',
        'Não há pré-requisitos para este minicurso.'
    );

INSERT INTO `atividades`
VALUES (
        '7',
        'Minicurso: Computação Desplugada',
        'O objetivo deste minicurso é trabalhar conceitos e definições importantes na computação de forma simples através de atividades individuais e em grupo, com materiais comuns em nosso dia a dia. ',
        '1',
        '20',
        '2018-10-04',
        '13:30:00',
        '17:30:00',
        '4',
        '19',
        '2',
        'Nádia Maria Boeira Veron e Beatriz Câmara',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '8',
        'Minicurso: Demarcação de terraço',
        'Os cursistas aprenderão a fazer marcação de curvas de nível para a contenção de águas e construção de estradas',
        '1',
        '20',
        '2018-10-04',
        '07:30:00',
        '17:30:00',
        '8',
        '4',
        '4',
        'Tomaz Alves de Souza',
        '07:30 as 11:30 (teoria)\r\n13:30 as 17:30 (prática)'
    );

INSERT INTO `atividades`
VALUES (
        '9',
        'Minicurso: Currículo Lattes',
        'Neste minicurso o cursista aprenderá a criar e alimentar um currículo acadêmico no sistema Lattes da CNPq.',
        '1',
        '20',
        '2018-10-04',
        '08:00:00',
        '12:00:00',
        '4',
        '5',
        '1',
        'Joyce Ávila de Oliveira',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '10',
        'Palestra: Quero ser um desenvolvedor, o que faço?',
        '',
        '1',
        '120',
        '2018-10-05',
        '13:00:00',
        '14:00:00',
        '1',
        '3',
        '2',
        'Filipe Névola',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '11',
        'Palestra: A web no futuro - Progressivamente',
        '',
        '1',
        '120',
        '2018-10-05',
        '14:10:00',
        '15:00:00',
        '1',
        '3',
        '3',
        'Filipe Névola',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '12',
        'Minicurso: Impressão 3D',
        '',
        '1',
        '25',
        '2018-10-05',
        '07:30:00',
        '17:30:00',
        '8',
        '5',
        '4',
        'Evandro Falleiros',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '13',
        'Minicurso: Business Intelligence',
        '',
        '1',
        '25',
        '2018-10-05',
        '13:00:00',
        '17:00:00',
        '4',
        '24',
        '2',
        'Rafael Martins',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '14',
        'Minicurso: Softwares Educacionais',
        '',
        '1',
        '25',
        '2018-10-05',
        '13:30:00',
        '17:30:00',
        '4',
        '17',
        '2',
        'Mateus Soares Moraes e Josué de Paulo Bailo da Silva',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '15',
        'Minicurso:  Criatividade e processos de criação',
        '',
        '1',
        '15',
        '2018-10-05',
        '13:30:00',
        '17:30:00',
        '4',
        '1',
        '2',
        'Mariana Ardnt de Souza',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '16',
        'Aulão ENEM',
        'Aulão preparatório para o ENEM 2018.\r\n13:00-13:30: Credenciamento\r\n13:30-14:00: Abertura\r\n14:00-14:45: Matemática e suas Tecnologias \r\n14:45-15:30: Ciências Humanas e suas Tecnologias\r\n15:30-15:45: Relaxamento físico\r\n15:45-16:00: Intervalo/Lanche\r\n16:00-16:45: Ciências da Natureza e suas Tecnologias\r\n16:45-17:30: Linguagens, códigos e suas tecnologias\r\n17:30-17:45: Encerramento',
        '0',
        null,
        '2018-10-01',
        '13:00:00',
        '17:45:00',
        '5',
        '25',
        '2',
        'Professores do IFMS campus Ponta Porã',
        'Aberto ao público.'
    );

INSERT INTO `atividades`
VALUES (
        '17',
        'Abertura Oficial da Semana de Ciência e Tecnologia (SCT) 2018',
        'Abertura oficial da SCT 2018 com a palestra de abertura: \"Ciência para Redução das Desigualdades\" com o professor Jones Dari Goettert.\r\nJones possui graduação em História pela Universidade Federal de Mato Grosso (1997), mestrado em Geografia pela Universidade Estadual Paulista Júlio de Mesquita Filho (2000), doutorado em Geografia (Pres. Prudente) pela Universidade Estadual Paulista Júlio de Mesquita Filho (2004); pós-doutorado em Geografia pela Universidade Federal Fluminense (2010-2011) e especialização em Literatura: Tradição e Cânone Literário pela Universidade Federal da Grande Dourados (2012-2013). Atualmente é professor da Universidade Federal da Grande Dourados.',
        '0',
        null,
        '2018-10-01',
        '19:00:00',
        '21:00:00',
        '2',
        '25',
        '3',
        'Jones Dari Goettert',
        'Aberto ao público.'
    );

INSERT INTO `atividades`
VALUES (
        '18',
        'Roda de conversa: Pesquisa na Educação Básica',
        '',
        '0',
        null,
        '2018-10-03',
        '08:00:00',
        '17:00:00',
        '8',
        '26',
        '4',
        'Vinicius Bozano Nunes',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '19',
        'Minicurso: Regulagem de semeadoras',
        'Os cursistas aprenderão à regular a semeadora e adubadora para as culturas da soja e milho.',
        '1',
        '25',
        '2018-10-02',
        '08:00:00',
        '17:00:00',
        '8',
        '27',
        '4',
        'Everton dos Santos de Oliveira e Sergio André Tapparo',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '20',
        'Minicurso: Controle de Plantas Daninhas',
        'Os cursistas aprenderão sobre o uso de herbicidas para o controle de Plantas Daninhas com pulverizadores.',
        '1',
        '15',
        '2018-10-04',
        '08:00:00',
        '17:00:00',
        '8',
        '28',
        '4',
        'Elmo Pontes de Melo',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '21',
        'Minicurso:   A técnica fotográfica com câmeras DSLR',
        '',
        '1',
        '15',
        '2018-10-05',
        '07:30:00',
        '11:30:00',
        '4',
        '1',
        '1',
        'Mariana Ardnt de Souza',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '22',
        'Oficina: Propagação de Plantas',
        'Propagação sexuada\r\nPropagação assexuada: estaquia, borbulhia,  alporquia, mergulhia, enxertia, divisão de touceiras e plantio.\r\n\r\n',
        '1',
        '25',
        '2018-10-04',
        '08:00:00',
        '12:00:00',
        '4',
        '6',
        '1',
        'Willian Vieira Gonçalves',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '23',
        'Mostra dos projetos finalistas da Feira de Ciências da Fronteira (FECIFRON) - manhã',
        'Apresentação de banners dos projetos aprovados da FECIFRON.',
        '0',
        null,
        '2018-10-03',
        '08:00:00',
        '11:00:00',
        '3',
        '26',
        '1',
        '',
        'Aberto ao público. \r\nAcontecerá na quadra da escola, que fica localizada na Rua Tiradentes, em frente ao Colégio Total.'
    );

INSERT INTO `atividades`
VALUES (
        '24',
        'Mostra dos projetos finalistas da Feira de Ciências da Fronteira (FECIFRON) - manhã',
        'Apresentação de banners dos projetos aprovados da FECIFRON.',
        '0',
        null,
        '2018-10-02',
        '08:00:00',
        '11:00:00',
        '3',
        '26',
        '1',
        '',
        'Aberto ao público. \r\nAcontecerá na quadra da escola, que fica localizada na Rua Tiradentes, em frente ao Colégio Total.'
    );

INSERT INTO `atividades`
VALUES (
        '25',
        'Mostra dos projetos finalistas da Feira de Ciências da Fronteira (FECIFRON) - tarde',
        'Apresentação de banners dos projetos aprovados da FECIFRON.',
        '0',
        null,
        '2018-10-03',
        '13:30:00',
        '16:30:00',
        '3',
        '26',
        '2',
        '',
        'Aberto ao público. \r\nAcontecerá na quadra da escola, que fica localizada na Rua Tiradentes, em frente ao Colégio Total.'
    );

INSERT INTO `atividades`
VALUES (
        '26',
        'Mostra dos projetos finalistas da Feira de Ciências da Fronteira (FECIFRON)  - tarde',
        'Apresentação de banners dos projetos aprovados da FECIFRON.',
        '0',
        null,
        '2018-10-02',
        '13:30:00',
        '16:30:00',
        '3',
        '26',
        '2',
        '',
        'Aberto ao público. \r\nAcontecerá na quadra da escola, que fica localizada na Rua Tiradentes, em frente ao Colégio Total.'
    );

INSERT INTO `atividades`
VALUES (
        '27',
        'Encerramento e Premiação da FECIFRON',
        '',
        '0',
        null,
        '2018-10-03',
        '18:00:00',
        '20:00:00',
        '2',
        '26',
        '3',
        '',
        'Aberto ao público.'
    );

INSERT INTO `atividades`
VALUES (
        '28',
        'Minicurso: Libras - Vejo tuas mãos, aí escuto',
        '',
        '1',
        '20',
        '2018-10-04',
        '13:00:00',
        '17:00:00',
        '4',
        '29',
        '2',
        'Dariane Chita Martins Barcelos',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '30',
        'Minicurso: Libras - Vejo tuas mãos, aí escuto',
        '',
        '1',
        '20',
        '2018-10-05',
        '07:30:00',
        '11:00:00',
        '4',
        '29',
        '1',
        'Dariane Chita Martins Barcelos',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '31',
        'Minicurso: Unity3D - Desenvolva seu próprio Jogo',
        'Neste curso o estudante aprenderá desenvolver um jogo na game engine Unity3D, mostrando os recursos e principais conceitos p',
        '1',
        '25',
        '2018-10-04',
        '13:30:00',
        '16:30:00',
        '3',
        '17',
        '2',
        'Natália Almeida de Deus Reis',
        ''
    );

INSERT INTO `atividades`
VALUES (
        '32',
        'Oficina: Empreendedorismo na prática',
        '',
        '1',
        '35',
        '2018-10-05',
        '08:00:00',
        '11:00:00',
        '3',
        '1',
        '1',
        'Esteic Janaina Santos Batista',
        ''
    );

-- ----------------------------

-- Table structure for `dados`

-- ----------------------------

DROP TABLE IF EXISTS `dados`;

CREATE TABLE
    `dados` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `participante_id` int(11) NOT NULL,
        `horario_id` int(11) NOT NULL,
        `checkin` datetime DEFAULT NULL,
        `checkout` datetime DEFAULT NULL,
        PRIMARY KEY (`id`),
        KEY `fk_dados_horarios1_idx` (`horario_id`) USING BTREE,
        CONSTRAINT `dados_ibfk_1` FOREIGN KEY (`horario_id`) REFERENCES `horarios` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
    ) ENGINE = InnoDB AUTO_INCREMENT = 836 DEFAULT CHARSET = utf8;

-- ----------------------------

-- Records of dados

-- ----------------------------

INSERT INTO `dados`
VALUES (
        '1',
        '79',
        '1',
        '2018-10-01 13:16:05',
        '2018-10-01 18:43:43'
    );

INSERT INTO `dados`
VALUES (
        '2',
        '74',
        '1',
        '2018-10-01 13:16:11',
        '2018-10-01 18:44:00'
    );

INSERT INTO `dados`
VALUES (
        '3',
        '30',
        '1',
        '2018-10-01 13:16:43',
        null
    );

INSERT INTO `dados`
VALUES (
        '4',
        '6',
        '1',
        '2018-10-01 13:16:54',
        '2018-10-01 18:44:08'
    );

INSERT INTO `dados`
VALUES (
        '5',
        '83',
        '1',
        '2018-10-01 13:17:15',
        '2018-10-01 18:27:09'
    );

INSERT INTO `dados`
VALUES (
        '6',
        '82',
        '1',
        '2018-10-01 13:17:27',
        '2018-10-01 18:25:57'
    );

INSERT INTO `dados`
VALUES (
        '7',
        '89',
        '1',
        '2018-10-01 13:17:33',
        '2018-10-01 18:01:02'
    );

INSERT INTO `dados`
VALUES (
        '8',
        '50',
        '1',
        '2018-10-01 13:18:02',
        '2018-10-01 18:31:41'
    );

INSERT INTO `dados`
VALUES (
        '9',
        '189',
        '1',
        '2018-10-01 13:18:07',
        '2018-10-01 17:48:28'
    );

INSERT INTO `dados`
VALUES (
        '10',
        '201',
        '1',
        '2018-10-01 13:18:10',
        '2018-10-01 17:49:31'
    );

INSERT INTO `dados`
VALUES (
        '11',
        '190',
        '1',
        '2018-10-01 13:18:14',
        '2018-10-01 18:00:56'
    );

INSERT INTO `dados`
VALUES (
        '12',
        '78',
        '1',
        '2018-10-01 13:19:12',
        '2018-10-01 17:31:32'
    );

INSERT INTO `dados`
VALUES (
        '13',
        '76',
        '1',
        '2018-10-01 13:19:17',
        '2018-10-01 17:31:21'
    );

INSERT INTO `dados`
VALUES (
        '14',
        '111',
        '1',
        '2018-10-01 13:19:25',
        '2018-10-01 18:31:23'
    );

INSERT INTO `dados`
VALUES (
        '15',
        '113',
        '1',
        '2018-10-01 13:19:31',
        '2018-10-01 18:31:52'
    );

INSERT INTO `dados`
VALUES (
        '16',
        '20',
        '1',
        '2018-10-01 13:19:35',
        null
    );

INSERT INTO `dados`
VALUES (
        '17',
        '132',
        '1',
        '2018-10-01 13:19:56',
        null
    );

INSERT INTO `dados`
VALUES (
        '18',
        '48',
        '1',
        '2018-10-01 13:20:28',
        '2018-10-01 18:06:49'
    );

INSERT INTO `dados`
VALUES (
        '19',
        '31',
        '1',
        '2018-10-01 13:20:43',
        null
    );

INSERT INTO `dados`
VALUES (
        '20',
        '39',
        '1',
        '2018-10-01 13:21:22',
        '2018-10-01 18:01:49'
    );

INSERT INTO `dados`
VALUES (
        '21',
        '163',
        '1',
        '2018-10-01 13:22:29',
        '2018-10-01 18:28:06'
    );

INSERT INTO `dados`
VALUES (
        '22',
        '62',
        '1',
        '2018-10-01 13:22:36',
        '2018-10-01 18:27:42'
    );

INSERT INTO `dados`
VALUES (
        '23',
        '15',
        '1',
        '2018-10-01 13:22:39',
        '2018-10-01 18:27:39'
    );

INSERT INTO `dados`
VALUES (
        '24',
        '207',
        '1',
        '2018-10-01 13:22:54',
        null
    );

INSERT INTO `dados`
VALUES (
        '25',
        '64',
        '1',
        '2018-10-01 13:23:11',
        '2018-10-01 18:28:58'
    );

INSERT INTO `dados`
VALUES (
        '26',
        '112',
        '1',
        '2018-10-01 13:23:20',
        '2018-10-01 18:34:58'
    );

INSERT INTO `dados`
VALUES (
        '27',
        '100',
        '1',
        '2018-10-01 13:23:25',
        null
    );

INSERT INTO `dados`
VALUES (
        '28',
        '145',
        '1',
        '2018-10-01 13:23:28',
        '2018-10-01 18:43:16'
    );

INSERT INTO `dados`
VALUES (
        '29',
        '197',
        '1',
        '2018-10-01 13:23:34',
        null
    );

INSERT INTO `dados`
VALUES (
        '30',
        '27',
        '1',
        '2018-10-01 13:23:50',
        '2018-10-01 18:06:29'
    );

INSERT INTO `dados`
VALUES (
        '31',
        '208',
        '1',
        '2018-10-01 13:24:26',
        null
    );

INSERT INTO `dados`
VALUES (
        '32',
        '210',
        '1',
        '2018-10-01 13:24:48',
        '2018-10-01 18:06:46'
    );

INSERT INTO `dados`
VALUES (
        '33',
        '211',
        '1',
        '2018-10-01 13:26:09',
        null
    );

INSERT INTO `dados`
VALUES (
        '34',
        '118',
        '1',
        '2018-10-01 13:26:34',
        '2018-10-01 18:18:10'
    );

INSERT INTO `dados`
VALUES (
        '35',
        '137',
        '1',
        '2018-10-01 13:26:50',
        '2018-10-01 17:51:39'
    );

INSERT INTO `dados`
VALUES (
        '36',
        '160',
        '1',
        '2018-10-01 13:26:54',
        '2018-10-01 17:51:34'
    );

INSERT INTO `dados`
VALUES (
        '37',
        '54',
        '1',
        '2018-10-01 13:27:00',
        '2018-10-01 18:19:51'
    );

INSERT INTO `dados`
VALUES (
        '38',
        '174',
        '1',
        '2018-10-01 13:27:13',
        null
    );

INSERT INTO `dados`
VALUES (
        '39',
        '175',
        '1',
        '2018-10-01 13:27:18',
        null
    );

INSERT INTO `dados`
VALUES (
        '40',
        '214',
        '1',
        '2018-10-01 13:27:58',
        '2018-10-01 18:31:38'
    );

INSERT INTO `dados`
VALUES (
        '41',
        '147',
        '1',
        '2018-10-01 13:28:13',
        '2018-10-01 17:33:32'
    );

INSERT INTO `dados`
VALUES (
        '42',
        '77',
        '1',
        '2018-10-01 13:28:28',
        '2018-10-01 17:31:32'
    );

INSERT INTO `dados`
VALUES (
        '43',
        '213',
        '1',
        '2018-10-01 13:28:40',
        '2018-10-01 18:06:52'
    );

INSERT INTO `dados`
VALUES (
        '44',
        '216',
        '1',
        '2018-10-01 13:31:44',
        null
    );

INSERT INTO `dados`
VALUES (
        '45',
        '26',
        '1',
        '2018-10-01 13:31:57',
        '2018-10-01 17:45:37'
    );

INSERT INTO `dados`
VALUES (
        '46',
        '217',
        '1',
        '2018-10-01 13:32:34',
        '2018-10-01 17:30:28'
    );

INSERT INTO `dados`
VALUES (
        '47',
        '72',
        '1',
        '2018-10-01 13:32:56',
        '2018-10-01 17:30:58'
    );

INSERT INTO `dados`
VALUES (
        '48',
        '218',
        '1',
        '2018-10-01 13:33:09',
        '2018-10-01 17:30:58'
    );

INSERT INTO `dados`
VALUES (
        '49',
        '158',
        '1',
        '2018-10-01 13:33:36',
        '2018-10-01 17:41:34'
    );

INSERT INTO `dados`
VALUES (
        '50',
        '215',
        '1',
        '2018-10-01 13:33:52',
        '2018-10-01 17:33:36'
    );

INSERT INTO `dados`
VALUES (
        '51',
        '21',
        '1',
        '2018-10-01 13:34:08',
        null
    );

INSERT INTO `dados`
VALUES (
        '52',
        '220',
        '1',
        '2018-10-01 13:35:00',
        '2018-10-01 17:43:26'
    );

INSERT INTO `dados`
VALUES (
        '53',
        '63',
        '1',
        '2018-10-01 13:35:54',
        '2018-10-01 17:31:47'
    );

INSERT INTO `dados`
VALUES (
        '54',
        '221',
        '1',
        '2018-10-01 13:38:44',
        '2018-10-01 17:41:24'
    );

INSERT INTO `dados`
VALUES (
        '55',
        '162',
        '1',
        '2018-10-01 13:38:49',
        '2018-10-01 17:50:43'
    );

INSERT INTO `dados`
VALUES (
        '56',
        '222',
        '1',
        '2018-10-01 13:39:01',
        null
    );

INSERT INTO `dados`
VALUES (
        '57',
        '223',
        '1',
        '2018-10-01 13:43:10',
        '2018-10-01 17:52:04'
    );

INSERT INTO `dados`
VALUES (
        '58',
        '18',
        '1',
        '2018-10-01 15:19:53',
        null
    );

INSERT INTO `dados`
VALUES (
        '59',
        '28',
        '1',
        null,
        '2018-10-01 17:31:03'
    );

INSERT INTO `dados`
VALUES (
        '60',
        '131',
        '1',
        null,
        '2018-10-01 18:42:00'
    );

INSERT INTO `dados`
VALUES (
        '61',
        '152',
        '1',
        null,
        '2018-10-01 18:42:32'
    );

INSERT INTO `dados`
VALUES (
        '62',
        '137',
        '2',
        '2018-10-01 18:42:53',
        null
    );

INSERT INTO `dados`
VALUES (
        '63',
        '160',
        '2',
        '2018-10-01 18:42:55',
        null
    );

INSERT INTO `dados`
VALUES (
        '64',
        '223',
        '2',
        '2018-10-01 18:42:58',
        null
    );

INSERT INTO `dados`
VALUES (
        '65',
        '79',
        '2',
        '2018-10-01 18:43:53',
        '2018-10-01 20:41:30'
    );

INSERT INTO `dados`
VALUES (
        '66',
        '74',
        '2',
        '2018-10-01 18:44:18',
        null
    );

INSERT INTO `dados`
VALUES (
        '67',
        '73',
        '2',
        '2018-10-01 18:44:59',
        '2018-10-01 20:41:38'
    );

INSERT INTO `dados`
VALUES (
        '68',
        '9',
        '2',
        '2018-10-01 18:46:40',
        '2018-10-01 21:21:10'
    );

INSERT INTO `dados`
VALUES (
        '69',
        '139',
        '2',
        '2018-10-01 18:57:27',
        '2018-10-01 21:20:33'
    );

INSERT INTO `dados`
VALUES (
        '70',
        '153',
        '2',
        '2018-10-01 19:02:14',
        '2018-10-01 21:20:38'
    );

INSERT INTO `dados`
VALUES (
        '71',
        '171',
        '2',
        '2018-10-01 19:05:32',
        '2018-10-01 21:20:58'
    );

INSERT INTO `dados`
VALUES (
        '72',
        '234',
        '2',
        '2018-10-01 19:06:04',
        '2018-10-01 21:25:22'
    );

INSERT INTO `dados`
VALUES (
        '73',
        '235',
        '2',
        '2018-10-01 19:07:23',
        '2018-10-01 21:21:05'
    );

INSERT INTO `dados`
VALUES (
        '74',
        '10',
        '2',
        '2018-10-01 19:13:01',
        '2018-10-01 20:50:45'
    );

INSERT INTO `dados`
VALUES (
        '75',
        '7',
        '2',
        '2018-10-01 19:22:47',
        '2018-10-01 21:14:49'
    );

INSERT INTO `dados`
VALUES (
        '76',
        '167',
        '2',
        '2018-10-01 19:23:24',
        '2018-10-01 21:14:28'
    );

INSERT INTO `dados`
VALUES (
        '77',
        '2',
        '2',
        '2018-10-01 19:25:26',
        '2018-10-01 21:20:46'
    );

INSERT INTO `dados`
VALUES (
        '78',
        '110',
        '2',
        '2018-10-01 19:27:24',
        '2018-10-01 20:44:19'
    );

INSERT INTO `dados`
VALUES (
        '79',
        '237',
        '2',
        '2018-10-01 19:27:45',
        null
    );

INSERT INTO `dados`
VALUES (
        '80',
        '238',
        '2',
        '2018-10-01 19:32:28',
        '2018-10-01 21:20:20'
    );

INSERT INTO `dados`
VALUES (
        '81',
        '65',
        '2',
        '2018-10-01 19:34:12',
        '2018-10-01 21:15:33'
    );

INSERT INTO `dados`
VALUES (
        '82',
        '239',
        '2',
        '2018-10-01 19:34:43',
        '2018-10-01 21:21:25'
    );

INSERT INTO `dados`
VALUES (
        '83',
        '75',
        '2',
        '2018-10-01 19:42:04',
        '2018-10-01 20:50:15'
    );

INSERT INTO `dados`
VALUES (
        '84',
        '241',
        '2',
        '2018-10-01 19:45:29',
        '2018-10-01 20:44:14'
    );

INSERT INTO `dados`
VALUES (
        '85',
        '242',
        '2',
        '2018-10-01 19:50:07',
        '2018-10-01 20:44:37'
    );

INSERT INTO `dados`
VALUES (
        '86',
        '163',
        '2',
        null,
        '2018-10-01 21:25:35'
    );

INSERT INTO `dados`
VALUES (
        '87',
        '62',
        '3',
        '2018-10-02 07:57:12',
        '2018-10-02 11:06:15'
    );

INSERT INTO `dados`
VALUES (
        '88',
        '187',
        '3',
        '2018-10-02 07:57:24',
        '2018-10-02 11:03:55'
    );

INSERT INTO `dados`
VALUES (
        '89',
        '15',
        '3',
        '2018-10-02 07:57:39',
        '2018-10-02 11:05:46'
    );

INSERT INTO `dados`
VALUES (
        '90',
        '237',
        '3',
        '2018-10-02 07:57:50',
        '2018-10-02 11:23:28'
    );

INSERT INTO `dados`
VALUES (
        '91',
        '207',
        '3',
        '2018-10-02 07:58:03',
        '2018-10-02 11:06:16'
    );

INSERT INTO `dados`
VALUES (
        '92',
        '5',
        '3',
        '2018-10-02 07:58:04',
        '2018-10-02 11:01:46'
    );

INSERT INTO `dados`
VALUES (
        '93',
        '192',
        '3',
        '2018-10-02 07:59:10',
        '2018-10-02 11:00:52'
    );

INSERT INTO `dados`
VALUES (
        '94',
        '2',
        '3',
        '2018-10-02 07:59:20',
        '2018-10-02 11:06:37'
    );

INSERT INTO `dados`
VALUES (
        '95',
        '52',
        '3',
        '2018-10-02 07:59:41',
        '2018-10-02 11:07:34'
    );

INSERT INTO `dados`
VALUES (
        '96',
        '164',
        '3',
        '2018-10-02 08:00:13',
        '2018-10-02 11:00:35'
    );

INSERT INTO `dados`
VALUES (
        '97',
        '146',
        '3',
        '2018-10-02 08:00:30',
        '2018-10-02 11:23:52'
    );

INSERT INTO `dados`
VALUES (
        '98',
        '234',
        '3',
        '2018-10-02 08:00:43',
        '2018-10-02 11:03:15'
    );

INSERT INTO `dados`
VALUES (
        '99',
        '58',
        '3',
        '2018-10-02 08:00:46',
        '2018-10-02 11:04:57'
    );

INSERT INTO `dados`
VALUES (
        '100',
        '53',
        '3',
        '2018-10-02 08:01:08',
        '2018-10-02 11:05:30'
    );

INSERT INTO `dados`
VALUES (
        '101',
        '57',
        '3',
        '2018-10-02 08:01:09',
        '2018-10-02 11:05:06'
    );

INSERT INTO `dados`
VALUES (
        '102',
        '238',
        '3',
        '2018-10-02 08:01:19',
        '2018-10-02 11:00:35'
    );

INSERT INTO `dados`
VALUES (
        '103',
        '196',
        '3',
        '2018-10-02 08:01:43',
        '2018-10-02 11:04:05'
    );

INSERT INTO `dados`
VALUES (
        '104',
        '3',
        '3',
        '2018-10-02 08:01:54',
        '2018-10-02 11:06:28'
    );

INSERT INTO `dados`
VALUES (
        '105',
        '149',
        '3',
        '2018-10-02 08:02:02',
        '2018-10-02 11:19:22'
    );

INSERT INTO `dados`
VALUES (
        '106',
        '261',
        '3',
        '2018-10-02 08:02:03',
        '2018-10-02 11:00:08'
    );

INSERT INTO `dados`
VALUES (
        '107',
        '218',
        '3',
        '2018-10-02 08:02:09',
        null
    );

INSERT INTO `dados`
VALUES (
        '108',
        '163',
        '3',
        '2018-10-02 08:02:24',
        '2018-10-02 11:06:56'
    );

INSERT INTO `dados`
VALUES (
        '109',
        '217',
        '3',
        '2018-10-02 08:02:28',
        null
    );

INSERT INTO `dados`
VALUES (
        '110',
        '54',
        '3',
        '2018-10-02 08:02:47',
        null
    );

INSERT INTO `dados`
VALUES (
        '111',
        '72',
        '3',
        '2018-10-02 08:03:52',
        null
    );

INSERT INTO `dados`
VALUES (
        '112',
        '262',
        '3',
        '2018-10-02 08:03:55',
        '2018-10-02 11:00:21'
    );

INSERT INTO `dados`
VALUES (
        '113',
        '49',
        '3',
        '2018-10-02 08:04:03',
        null
    );

INSERT INTO `dados`
VALUES (
        '114',
        '55',
        '3',
        '2018-10-02 08:04:13',
        '2018-10-02 11:11:37'
    );

INSERT INTO `dados`
VALUES (
        '115',
        '137',
        '3',
        '2018-10-02 08:04:15',
        '2018-10-02 11:08:08'
    );

INSERT INTO `dados`
VALUES (
        '116',
        '263',
        '3',
        '2018-10-02 08:05:42',
        null
    );

INSERT INTO `dados`
VALUES (
        '117',
        '264',
        '3',
        '2018-10-02 08:06:07',
        null
    );

INSERT INTO `dados`
VALUES (
        '118',
        '35',
        '3',
        '2018-10-02 08:07:08',
        null
    );

INSERT INTO `dados`
VALUES (
        '119',
        '38',
        '3',
        '2018-10-02 08:07:21',
        '2018-10-02 11:10:03'
    );

INSERT INTO `dados`
VALUES (
        '120',
        '265',
        '3',
        '2018-10-02 08:07:34',
        null
    );

INSERT INTO `dados`
VALUES (
        '121',
        '257',
        '3',
        '2018-10-02 08:07:49',
        '2018-10-02 11:05:21'
    );

INSERT INTO `dados`
VALUES (
        '122',
        '205',
        '3',
        '2018-10-02 08:07:57',
        '2018-10-02 11:03:05'
    );

INSERT INTO `dados`
VALUES (
        '123',
        '118',
        '3',
        '2018-10-02 08:08:33',
        '2018-10-02 11:04:09'
    );

INSERT INTO `dados`
VALUES (
        '124',
        '199',
        '3',
        '2018-10-02 08:08:39',
        '2018-10-02 11:03:29'
    );

INSERT INTO `dados`
VALUES (
        '125',
        '115',
        '3',
        '2018-10-02 08:11:17',
        '2018-10-02 11:06:08'
    );

INSERT INTO `dados`
VALUES (
        '126',
        '73',
        '3',
        '2018-10-02 08:13:04',
        '2018-10-02 11:10:08'
    );

INSERT INTO `dados`
VALUES (
        '127',
        '43',
        '3',
        '2018-10-02 08:13:37',
        '2018-10-02 11:11:27'
    );

INSERT INTO `dados`
VALUES (
        '128',
        '90',
        '3',
        '2018-10-02 08:15:04',
        '2018-10-02 11:04:33'
    );

INSERT INTO `dados`
VALUES (
        '129',
        '132',
        '3',
        '2018-10-02 08:15:43',
        '2018-10-02 11:03:34'
    );

INSERT INTO `dados`
VALUES (
        '130',
        '177',
        '3',
        '2018-10-02 08:15:54',
        null
    );

INSERT INTO `dados`
VALUES (
        '131',
        '212',
        '3',
        '2018-10-02 08:15:58',
        null
    );

INSERT INTO `dados`
VALUES (
        '132',
        '266',
        '3',
        '2018-10-02 08:22:39',
        null
    );

INSERT INTO `dados`
VALUES (
        '133',
        '160',
        '3',
        '2018-10-02 08:22:55',
        '2018-10-02 11:02:56'
    );

INSERT INTO `dados`
VALUES (
        '134',
        '223',
        '3',
        '2018-10-02 08:28:22',
        '2018-10-02 11:07:58'
    );

INSERT INTO `dados`
VALUES (
        '135',
        '267',
        '3',
        '2018-10-02 08:32:11',
        null
    );

INSERT INTO `dados`
VALUES (
        '136',
        '268',
        '3',
        '2018-10-02 08:38:08',
        '2018-10-02 11:03:06'
    );

INSERT INTO `dados`
VALUES (
        '137',
        '59',
        '3',
        '2018-10-02 08:38:46',
        null
    );

INSERT INTO `dados`
VALUES (
        '138',
        '211',
        '3',
        '2018-10-02 08:41:37',
        null
    );

INSERT INTO `dados`
VALUES (
        '139',
        '270',
        '3',
        '2018-10-02 08:41:43',
        '2018-10-02 11:09:58'
    );

INSERT INTO `dados`
VALUES (
        '140',
        '269',
        '3',
        '2018-10-02 08:41:50',
        '2018-10-02 11:02:32'
    );

INSERT INTO `dados`
VALUES (
        '141',
        '95',
        '3',
        '2018-10-02 08:42:17',
        '2018-10-02 11:15:45'
    );

INSERT INTO `dados`
VALUES (
        '142',
        '219',
        '3',
        '2018-10-02 08:43:31',
        null
    );

INSERT INTO `dados`
VALUES (
        '143',
        '229',
        '3',
        '2018-10-02 08:43:49',
        '2018-10-02 11:02:04'
    );

INSERT INTO `dados`
VALUES (
        '144',
        '271',
        '3',
        '2018-10-02 08:49:11',
        null
    );

INSERT INTO `dados`
VALUES (
        '145',
        '241',
        '3',
        '2018-10-02 08:49:35',
        '2018-10-02 11:18:55'
    );

INSERT INTO `dados`
VALUES (
        '146',
        '48',
        '3',
        null,
        '2018-10-02 11:00:30'
    );

INSERT INTO `dados`
VALUES (
        '147',
        '69',
        '3',
        null,
        '2018-10-02 11:04:19'
    );

INSERT INTO `dados`
VALUES (
        '148',
        '178',
        '3',
        null,
        '2018-10-02 11:04:44'
    );

INSERT INTO `dados`
VALUES (
        '149',
        '239',
        '3',
        null,
        '2018-10-02 11:06:35'
    );

INSERT INTO `dados`
VALUES (
        '150',
        '276',
        '3',
        null,
        '2018-10-02 11:08:55'
    );

INSERT INTO `dados`
VALUES (
        '151',
        '277',
        '3',
        null,
        '2018-10-02 11:09:29'
    );

INSERT INTO `dados`
VALUES (
        '152',
        '242',
        '4',
        '2018-10-02 12:52:40',
        '2018-10-02 16:49:54'
    );

INSERT INTO `dados`
VALUES (
        '153',
        '110',
        '4',
        '2018-10-02 12:52:51',
        '2018-10-02 16:50:29'
    );

INSERT INTO `dados`
VALUES (
        '154',
        '83',
        '4',
        '2018-10-02 12:53:08',
        '2018-10-02 16:32:14'
    );

INSERT INTO `dados`
VALUES (
        '155',
        '220',
        '4',
        '2018-10-02 12:53:28',
        null
    );

INSERT INTO `dados`
VALUES (
        '156',
        '38',
        '4',
        '2018-10-02 12:53:36',
        '2018-10-02 16:50:24'
    );

INSERT INTO `dados`
VALUES (
        '157',
        '163',
        '4',
        '2018-10-02 12:53:44',
        '2018-10-02 16:42:25'
    );

INSERT INTO `dados`
VALUES (
        '158',
        '79',
        '4',
        '2018-10-02 12:54:55',
        '2018-10-02 16:54:37'
    );

INSERT INTO `dados`
VALUES (
        '159',
        '236',
        '4',
        '2018-10-02 12:56:11',
        '2018-10-02 16:34:57'
    );

INSERT INTO `dados`
VALUES (
        '160',
        '174',
        '4',
        '2018-10-02 12:58:15',
        '2018-10-02 16:31:26'
    );

INSERT INTO `dados`
VALUES (
        '161',
        '172',
        '4',
        '2018-10-02 12:58:32',
        '2018-10-02 16:33:22'
    );

INSERT INTO `dados`
VALUES (
        '162',
        '178',
        '4',
        '2018-10-02 12:58:42',
        '2018-10-02 16:40:25'
    );

INSERT INTO `dados`
VALUES (
        '163',
        '69',
        '4',
        '2018-10-02 12:58:44',
        '2018-10-02 16:40:34'
    );

INSERT INTO `dados`
VALUES (
        '164',
        '49',
        '4',
        '2018-10-02 12:59:04',
        '2018-10-02 16:35:15'
    );

INSERT INTO `dados`
VALUES (
        '165',
        '4',
        '4',
        '2018-10-02 12:59:06',
        '2018-10-02 16:43:21'
    );

INSERT INTO `dados`
VALUES (
        '166',
        '285',
        '4',
        '2018-10-02 12:59:29',
        '2018-10-02 16:57:03'
    );

INSERT INTO `dados`
VALUES (
        '167',
        '118',
        '4',
        '2018-10-02 13:01:17',
        '2018-10-02 16:45:16'
    );

INSERT INTO `dados`
VALUES (
        '168',
        '264',
        '4',
        '2018-10-02 13:01:56',
        '2018-10-02 16:46:09'
    );

INSERT INTO `dados`
VALUES (
        '169',
        '263',
        '4',
        '2018-10-02 13:02:02',
        '2018-10-02 16:46:09'
    );

INSERT INTO `dados`
VALUES (
        '170',
        '207',
        '4',
        '2018-10-02 13:02:57',
        '2018-10-02 16:42:34'
    );

INSERT INTO `dados`
VALUES (
        '171',
        '266',
        '4',
        '2018-10-02 13:03:11',
        '2018-10-02 16:56:42'
    );

INSERT INTO `dados`
VALUES (
        '172',
        '89',
        '4',
        '2018-10-02 13:04:15',
        '2018-10-02 16:32:47'
    );

INSERT INTO `dados`
VALUES (
        '173',
        '96',
        '4',
        '2018-10-02 13:04:22',
        '2018-10-02 16:32:37'
    );

INSERT INTO `dados`
VALUES (
        '174',
        '99',
        '4',
        '2018-10-02 13:04:28',
        '2018-10-02 16:32:44'
    );

INSERT INTO `dados`
VALUES (
        '175',
        '223',
        '4',
        '2018-10-02 13:04:34',
        '2018-10-02 16:30:09'
    );

INSERT INTO `dados`
VALUES (
        '176',
        '137',
        '4',
        '2018-10-02 13:04:42',
        '2018-10-02 16:38:52'
    );

INSERT INTO `dados`
VALUES (
        '177',
        '160',
        '4',
        '2018-10-02 13:04:54',
        '2018-10-02 16:31:55'
    );

INSERT INTO `dados`
VALUES (
        '178',
        '189',
        '4',
        '2018-10-02 13:05:25',
        '2018-10-02 16:37:07'
    );

INSERT INTO `dados`
VALUES (
        '179',
        '132',
        '4',
        '2018-10-02 13:05:36',
        '2018-10-02 16:41:32'
    );

INSERT INTO `dados`
VALUES (
        '180',
        '286',
        '4',
        '2018-10-02 13:05:46',
        '2018-10-02 16:41:18'
    );

INSERT INTO `dados`
VALUES (
        '181',
        '268',
        '4',
        '2018-10-02 13:05:53',
        '2018-10-02 16:33:03'
    );

INSERT INTO `dados`
VALUES (
        '182',
        '50',
        '4',
        '2018-10-02 13:06:11',
        '2018-10-02 16:56:09'
    );

INSERT INTO `dados`
VALUES (
        '183',
        '175',
        '4',
        '2018-10-02 13:06:55',
        '2018-10-02 16:31:34'
    );

INSERT INTO `dados`
VALUES (
        '184',
        '276',
        '4',
        '2018-10-02 13:07:49',
        '2018-10-02 16:43:33'
    );

INSERT INTO `dados`
VALUES (
        '185',
        '156',
        '4',
        '2018-10-02 13:07:54',
        '2018-10-02 16:42:31'
    );

INSERT INTO `dados`
VALUES (
        '186',
        '214',
        '4',
        '2018-10-02 13:08:15',
        '2018-10-02 16:55:42'
    );

INSERT INTO `dados`
VALUES (
        '187',
        '74',
        '4',
        '2018-10-02 13:08:21',
        '2018-10-02 16:31:44'
    );

INSERT INTO `dados`
VALUES (
        '188',
        '277',
        '4',
        '2018-10-02 13:08:44',
        '2018-10-02 16:44:49'
    );

INSERT INTO `dados`
VALUES (
        '189',
        '287',
        '4',
        '2018-10-02 13:08:52',
        '2018-10-02 16:34:43'
    );

INSERT INTO `dados`
VALUES (
        '190',
        '288',
        '4',
        '2018-10-02 13:09:49',
        '2018-10-02 16:32:02'
    );

INSERT INTO `dados`
VALUES (
        '191',
        '270',
        '4',
        '2018-10-02 13:10:12',
        '2018-10-02 16:45:57'
    );

INSERT INTO `dados`
VALUES (
        '192',
        '201',
        '4',
        '2018-10-02 13:10:22',
        '2018-10-02 16:39:16'
    );

INSERT INTO `dados`
VALUES (
        '193',
        '59',
        '4',
        '2018-10-02 13:10:36',
        '2018-10-02 16:45:30'
    );

INSERT INTO `dados`
VALUES (
        '194',
        '272',
        '4',
        '2018-10-02 13:11:11',
        '2018-10-02 16:44:50'
    );

INSERT INTO `dados`
VALUES (
        '195',
        '52',
        '4',
        '2018-10-02 13:11:23',
        '2018-10-02 16:44:46'
    );

INSERT INTO `dados`
VALUES (
        '196',
        '3',
        '4',
        '2018-10-02 13:11:38',
        '2018-10-02 16:45:12'
    );

INSERT INTO `dados`
VALUES (
        '197',
        '146',
        '4',
        '2018-10-02 13:11:54',
        '2018-10-02 16:45:24'
    );

INSERT INTO `dados`
VALUES (
        '198',
        '2',
        '4',
        '2018-10-02 13:12:00',
        null
    );

INSERT INTO `dados`
VALUES (
        '199',
        '46',
        '4',
        '2018-10-02 13:12:14',
        null
    );

INSERT INTO `dados`
VALUES (
        '200',
        '289',
        '4',
        '2018-10-02 13:12:16',
        '2018-10-02 16:35:21'
    );

INSERT INTO `dados`
VALUES (
        '201',
        '238',
        '4',
        '2018-10-02 13:12:18',
        '2018-10-02 16:42:42'
    );

INSERT INTO `dados`
VALUES (
        '202',
        '7',
        '4',
        '2018-10-02 13:12:25',
        '2018-10-02 16:45:37'
    );

INSERT INTO `dados`
VALUES (
        '203',
        '167',
        '4',
        '2018-10-02 13:12:32',
        '2018-10-02 16:30:40'
    );

INSERT INTO `dados`
VALUES (
        '204',
        '217',
        '4',
        '2018-10-02 13:12:35',
        '2018-10-02 16:49:50'
    );

INSERT INTO `dados`
VALUES (
        '205',
        '72',
        '4',
        '2018-10-02 13:12:38',
        '2018-10-02 16:33:38'
    );

INSERT INTO `dados`
VALUES (
        '206',
        '187',
        '4',
        '2018-10-02 13:12:39',
        '2018-10-02 16:34:41'
    );

INSERT INTO `dados`
VALUES (
        '207',
        '218',
        '4',
        '2018-10-02 13:12:43',
        '2018-10-02 16:49:44'
    );

INSERT INTO `dados`
VALUES (
        '208',
        '54',
        '4',
        '2018-10-02 13:13:04',
        '2018-10-02 16:42:42'
    );

INSERT INTO `dados`
VALUES (
        '209',
        '211',
        '4',
        '2018-10-02 13:13:09',
        null
    );

INSERT INTO `dados`
VALUES (
        '210',
        '261',
        '4',
        '2018-10-02 13:13:44',
        '2018-10-02 16:30:04'
    );

INSERT INTO `dados`
VALUES (
        '211',
        '219',
        '4',
        '2018-10-02 13:14:45',
        '2018-10-02 16:40:16'
    );

INSERT INTO `dados`
VALUES (
        '212',
        '117',
        '4',
        '2018-10-02 13:15:50',
        '2018-10-02 16:43:53'
    );

INSERT INTO `dados`
VALUES (
        '213',
        '290',
        '4',
        '2018-10-02 13:16:42',
        '2018-10-02 16:42:58'
    );

INSERT INTO `dados`
VALUES (
        '214',
        '292',
        '4',
        '2018-10-02 13:16:59',
        '2018-10-02 16:53:53'
    );

INSERT INTO `dados`
VALUES (
        '215',
        '86',
        '4',
        '2018-10-02 13:17:37',
        '2018-10-02 16:36:03'
    );

INSERT INTO `dados`
VALUES (
        '216',
        '293',
        '4',
        '2018-10-02 13:17:45',
        '2018-10-02 16:34:55'
    );

INSERT INTO `dados`
VALUES (
        '217',
        '45',
        '4',
        '2018-10-02 13:17:54',
        '2018-10-02 16:31:41'
    );

INSERT INTO `dados`
VALUES (
        '218',
        '66',
        '4',
        '2018-10-02 13:18:10',
        '2018-10-02 16:32:52'
    );

INSERT INTO `dados`
VALUES (
        '219',
        '248',
        '4',
        '2018-10-02 13:18:11',
        null
    );

INSERT INTO `dados`
VALUES (
        '220',
        '98',
        '4',
        '2018-10-02 13:18:24',
        '2018-10-02 16:32:35'
    );

INSERT INTO `dados`
VALUES (
        '221',
        '141',
        '4',
        '2018-10-02 13:18:24',
        '2018-10-02 16:32:24'
    );

INSERT INTO `dados`
VALUES (
        '222',
        '140',
        '4',
        '2018-10-02 13:18:26',
        '2018-10-02 16:32:28'
    );

INSERT INTO `dados`
VALUES (
        '223',
        '295',
        '4',
        '2018-10-02 13:19:12',
        '2018-10-02 16:31:03'
    );

INSERT INTO `dados`
VALUES (
        '224',
        '15',
        '4',
        '2018-10-02 13:19:52',
        '2018-10-02 16:38:41'
    );

INSERT INTO `dados`
VALUES (
        '225',
        '62',
        '4',
        '2018-10-02 13:19:55',
        '2018-10-02 16:40:35'
    );

INSERT INTO `dados`
VALUES (
        '226',
        '94',
        '4',
        '2018-10-02 13:20:03',
        '2018-10-02 16:30:50'
    );

INSERT INTO `dados`
VALUES (
        '227',
        '116',
        '4',
        '2018-10-02 13:20:04',
        '2018-10-02 16:32:29'
    );

INSERT INTO `dados`
VALUES (
        '228',
        '101',
        '4',
        '2018-10-02 13:20:15',
        '2018-10-02 16:30:58'
    );

INSERT INTO `dados`
VALUES (
        '229',
        '222',
        '4',
        '2018-10-02 13:22:07',
        '2018-10-02 16:39:52'
    );

INSERT INTO `dados`
VALUES (
        '230',
        '234',
        '4',
        '2018-10-02 13:23:43',
        null
    );

INSERT INTO `dados`
VALUES (
        '231',
        '296',
        '4',
        '2018-10-02 13:24:13',
        null
    );

INSERT INTO `dados`
VALUES (
        '232',
        '31',
        '4',
        '2018-10-02 13:25:19',
        '2018-10-02 16:33:14'
    );

INSERT INTO `dados`
VALUES (
        '233',
        '30',
        '4',
        '2018-10-02 13:25:45',
        '2018-10-02 16:53:39'
    );

INSERT INTO `dados`
VALUES (
        '234',
        '39',
        '4',
        '2018-10-02 13:26:10',
        null
    );

INSERT INTO `dados`
VALUES (
        '235',
        '269',
        '4',
        '2018-10-02 13:26:10',
        '2018-10-02 16:56:48'
    );

INSERT INTO `dados`
VALUES (
        '236',
        '122',
        '4',
        '2018-10-02 13:26:34',
        '2018-10-02 16:55:38'
    );

INSERT INTO `dados`
VALUES (
        '237',
        '53',
        '4',
        '2018-10-02 13:26:37',
        '2018-10-02 16:49:55'
    );

INSERT INTO `dados`
VALUES (
        '238',
        '241',
        '4',
        '2018-10-02 13:26:44',
        '2018-10-02 17:00:12'
    );

INSERT INTO `dados`
VALUES (
        '239',
        '297',
        '4',
        '2018-10-02 13:27:04',
        '2018-10-02 16:35:45'
    );

INSERT INTO `dados`
VALUES (
        '240',
        '100',
        '4',
        '2018-10-02 13:27:23',
        '2018-10-02 16:43:50'
    );

INSERT INTO `dados`
VALUES (
        '241',
        '64',
        '4',
        '2018-10-02 13:27:55',
        '2018-10-02 16:40:15'
    );

INSERT INTO `dados`
VALUES (
        '242',
        '149',
        '4',
        '2018-10-02 13:32:55',
        '2018-10-02 16:42:16'
    );

INSERT INTO `dados`
VALUES (
        '243',
        '299',
        '4',
        '2018-10-02 13:36:10',
        null
    );

INSERT INTO `dados`
VALUES (
        '244',
        '196',
        '4',
        '2018-10-02 13:36:18',
        '2018-10-02 16:31:13'
    );

INSERT INTO `dados`
VALUES (
        '245',
        '239',
        '4',
        '2018-10-02 13:36:51',
        '2018-10-02 16:48:12'
    );

INSERT INTO `dados`
VALUES (
        '246',
        '145',
        '4',
        '2018-10-02 13:37:09',
        '2018-10-02 16:59:08'
    );

INSERT INTO `dados`
VALUES (
        '247',
        '298',
        '4',
        '2018-10-02 13:43:15',
        null
    );

INSERT INTO `dados`
VALUES (
        '248',
        '153',
        '4',
        '2018-10-02 13:43:51',
        '2018-10-02 16:49:59'
    );

INSERT INTO `dados`
VALUES (
        '249',
        '265',
        '4',
        '2018-10-02 13:44:04',
        '2018-10-02 16:49:44'
    );

INSERT INTO `dados`
VALUES (
        '250',
        '300',
        '4',
        '2018-10-02 13:44:31',
        '2018-10-02 16:43:19'
    );

INSERT INTO `dados`
VALUES (
        '251',
        '301',
        '4',
        '2018-10-02 13:46:57',
        '2018-10-02 16:42:21'
    );

INSERT INTO `dados`
VALUES (
        '252',
        '55',
        '4',
        '2018-10-02 13:48:57',
        '2018-10-02 16:55:23'
    );

INSERT INTO `dados`
VALUES (
        '253',
        '43',
        '4',
        '2018-10-02 13:50:25',
        '2018-10-02 16:57:47'
    );

INSERT INTO `dados`
VALUES (
        '254',
        '303',
        '4',
        '2018-10-02 13:50:32',
        '2018-10-02 16:32:02'
    );

INSERT INTO `dados`
VALUES (
        '255',
        '304',
        '4',
        '2018-10-02 13:51:11',
        '2018-10-02 16:30:30'
    );

INSERT INTO `dados`
VALUES (
        '256',
        '162',
        '4',
        null,
        '2018-10-02 16:30:13'
    );

INSERT INTO `dados`
VALUES (
        '257',
        '9',
        '4',
        null,
        '2018-10-02 16:30:20'
    );

INSERT INTO `dados`
VALUES (
        '258',
        '73',
        '4',
        null,
        '2018-10-02 16:31:34'
    );

INSERT INTO `dados`
VALUES (
        '259',
        '75',
        '4',
        null,
        '2018-10-02 16:31:48'
    );

INSERT INTO `dados`
VALUES (
        '260',
        '306',
        '4',
        null,
        '2018-10-02 16:33:40'
    );

INSERT INTO `dados`
VALUES (
        '261',
        '305',
        '4',
        null,
        '2018-10-02 16:33:59'
    );

INSERT INTO `dados`
VALUES (
        '262',
        '302',
        '4',
        null,
        '2018-10-02 16:34:15'
    );

INSERT INTO `dados`
VALUES (
        '263',
        '131',
        '4',
        null,
        '2018-10-02 16:34:39'
    );

INSERT INTO `dados`
VALUES (
        '264',
        '309',
        '4',
        null,
        '2018-10-02 16:35:09'
    );

INSERT INTO `dados`
VALUES (
        '265',
        '279',
        '4',
        null,
        '2018-10-02 16:39:21'
    );

INSERT INTO `dados`
VALUES (
        '266',
        '138',
        '4',
        null,
        '2018-10-02 16:41:49'
    );

INSERT INTO `dados`
VALUES (
        '267',
        '243',
        '4',
        null,
        '2018-10-02 16:42:05'
    );

INSERT INTO `dados`
VALUES (
        '268',
        '51',
        '4',
        null,
        '2018-10-02 16:43:02'
    );

INSERT INTO `dados`
VALUES (
        '269',
        '34',
        '4',
        null,
        '2018-10-02 16:44:18'
    );

INSERT INTO `dados`
VALUES (
        '270',
        '314',
        '4',
        null,
        '2018-10-02 16:47:24'
    );

INSERT INTO `dados`
VALUES (
        '271',
        '6',
        '4',
        null,
        '2018-10-02 16:48:42'
    );

INSERT INTO `dados`
VALUES (
        '272',
        '35',
        '4',
        null,
        '2018-10-02 16:50:31'
    );

INSERT INTO `dados`
VALUES (
        '273',
        '48',
        '4',
        null,
        '2018-10-02 16:52:58'
    );

INSERT INTO `dados`
VALUES (
        '274',
        '204',
        '4',
        null,
        '2018-10-02 16:53:02'
    );

INSERT INTO `dados`
VALUES (
        '275',
        '318',
        '4',
        null,
        '2018-10-02 16:54:29'
    );

INSERT INTO `dados`
VALUES (
        '276',
        '237',
        '5',
        '2018-10-03 07:30:03',
        '2018-10-03 11:00:09'
    );

INSERT INTO `dados`
VALUES (
        '277',
        '146',
        '5',
        '2018-10-03 07:30:08',
        '2018-10-03 11:00:38'
    );

INSERT INTO `dados`
VALUES (
        '278',
        '261',
        '5',
        '2018-10-03 07:30:45',
        '2018-10-03 11:04:46'
    );

INSERT INTO `dados`
VALUES (
        '279',
        '73',
        '5',
        '2018-10-03 07:30:59',
        '2018-10-03 11:02:17'
    );

INSERT INTO `dados`
VALUES (
        '280',
        '74',
        '5',
        '2018-10-03 07:31:09',
        '2018-10-03 11:01:23'
    );

INSERT INTO `dados`
VALUES (
        '281',
        '79',
        '5',
        '2018-10-03 07:31:27',
        '2018-10-03 11:00:57'
    );

INSERT INTO `dados`
VALUES (
        '282',
        '40',
        '5',
        '2018-10-03 07:31:40',
        null
    );

INSERT INTO `dados`
VALUES (
        '283',
        '180',
        '5',
        '2018-10-03 07:31:56',
        '2018-10-03 11:05:19'
    );

INSERT INTO `dados`
VALUES (
        '284',
        '29',
        '5',
        '2018-10-03 07:32:10',
        null
    );

INSERT INTO `dados`
VALUES (
        '285',
        '118',
        '5',
        '2018-10-03 07:32:20',
        '2018-10-03 11:02:47'
    );

INSERT INTO `dados`
VALUES (
        '286',
        '84',
        '5',
        '2018-10-03 07:32:30',
        '2018-10-03 11:05:30'
    );

INSERT INTO `dados`
VALUES (
        '287',
        '5',
        '5',
        '2018-10-03 07:32:39',
        '2018-10-03 11:02:03'
    );

INSERT INTO `dados`
VALUES (
        '288',
        '164',
        '5',
        '2018-10-03 07:32:52',
        '2018-10-03 11:02:38'
    );

INSERT INTO `dados`
VALUES (
        '289',
        '308',
        '5',
        '2018-10-03 07:33:08',
        '2018-10-03 11:02:10'
    );

INSERT INTO `dados`
VALUES (
        '290',
        '82',
        '5',
        '2018-10-03 07:34:03',
        '2018-10-03 11:02:38'
    );

INSERT INTO `dados`
VALUES (
        '291',
        '192',
        '5',
        '2018-10-03 07:35:45',
        '2018-10-03 11:02:25'
    );

INSERT INTO `dados`
VALUES (
        '292',
        '163',
        '5',
        '2018-10-03 07:37:39',
        '2018-10-03 11:06:10'
    );

INSERT INTO `dados`
VALUES (
        '293',
        '58',
        '5',
        '2018-10-03 07:37:51',
        '2018-10-03 11:01:11'
    );

INSERT INTO `dados`
VALUES (
        '294',
        '52',
        '5',
        '2018-10-03 07:38:02',
        '2018-10-03 11:07:44'
    );

INSERT INTO `dados`
VALUES (
        '295',
        '272',
        '5',
        '2018-10-03 07:38:14',
        '2018-10-03 11:07:42'
    );

INSERT INTO `dados`
VALUES (
        '296',
        '277',
        '5',
        '2018-10-03 07:38:26',
        '2018-10-03 11:07:37'
    );

INSERT INTO `dados`
VALUES (
        '297',
        '156',
        '5',
        '2018-10-03 07:38:39',
        '2018-10-03 11:06:25'
    );

INSERT INTO `dados`
VALUES (
        '298',
        '3',
        '5',
        '2018-10-03 07:38:56',
        '2018-10-03 11:00:23'
    );

INSERT INTO `dados`
VALUES (
        '299',
        '207',
        '5',
        '2018-10-03 07:39:08',
        '2018-10-03 11:02:00'
    );

INSERT INTO `dados`
VALUES (
        '300',
        '321',
        '5',
        '2018-10-03 07:39:20',
        '2018-10-03 11:04:59'
    );

INSERT INTO `dados`
VALUES (
        '301',
        '59',
        '5',
        '2018-10-03 07:39:52',
        null
    );

INSERT INTO `dados`
VALUES (
        '302',
        '270',
        '5',
        '2018-10-03 07:40:07',
        null
    );

INSERT INTO `dados`
VALUES (
        '303',
        '54',
        '5',
        '2018-10-03 07:41:39',
        '2018-10-03 11:05:11'
    );

INSERT INTO `dados`
VALUES (
        '304',
        '137',
        '5',
        '2018-10-03 07:41:55',
        '2018-10-03 11:02:21'
    );

INSERT INTO `dados`
VALUES (
        '305',
        '122',
        '5',
        '2018-10-03 07:42:10',
        '2018-10-03 11:05:00'
    );

INSERT INTO `dados`
VALUES (
        '306',
        '334',
        '5',
        '2018-10-03 07:42:23',
        '2018-10-03 11:04:25'
    );

INSERT INTO `dados`
VALUES (
        '307',
        '335',
        '5',
        '2018-10-03 07:42:35',
        '2018-10-03 11:04:32'
    );

INSERT INTO `dados`
VALUES (
        '308',
        '332',
        '5',
        '2018-10-03 07:42:47',
        '2018-10-03 11:04:29'
    );

INSERT INTO `dados`
VALUES (
        '309',
        '95',
        '5',
        '2018-10-03 07:43:03',
        '2018-10-03 11:01:01'
    );

INSERT INTO `dados`
VALUES (
        '310',
        '16',
        '5',
        '2018-10-03 07:43:23',
        '2018-10-03 11:02:56'
    );

INSERT INTO `dados`
VALUES (
        '311',
        '69',
        '5',
        '2018-10-03 07:43:36',
        '2018-10-03 11:04:04'
    );

INSERT INTO `dados`
VALUES (
        '312',
        '234',
        '5',
        '2018-10-03 07:43:48',
        null
    );

INSERT INTO `dados`
VALUES (
        '313',
        '55',
        '5',
        '2018-10-03 07:43:58',
        null
    );

INSERT INTO `dados`
VALUES (
        '314',
        '4',
        '5',
        '2018-10-03 07:44:10',
        '2018-10-03 11:07:22'
    );

INSERT INTO `dados`
VALUES (
        '315',
        '72',
        '5',
        '2018-10-03 07:44:27',
        '2018-10-03 11:01:43'
    );

INSERT INTO `dados`
VALUES (
        '316',
        '49',
        '5',
        '2018-10-03 07:44:39',
        '2018-10-03 11:01:38'
    );

INSERT INTO `dados`
VALUES (
        '317',
        '39',
        '5',
        '2018-10-03 07:44:51',
        '2018-10-03 11:07:43'
    );

INSERT INTO `dados`
VALUES (
        '318',
        '276',
        '5',
        '2018-10-03 07:45:05',
        '2018-10-03 11:05:27'
    );

INSERT INTO `dados`
VALUES (
        '319',
        '208',
        '5',
        '2018-10-03 07:45:17',
        '2018-10-03 11:02:07'
    );

INSERT INTO `dados`
VALUES (
        '320',
        '115',
        '5',
        '2018-10-03 07:45:51',
        '2018-10-03 11:04:47'
    );

INSERT INTO `dados`
VALUES (
        '321',
        '214',
        '5',
        '2018-10-03 07:46:09',
        '2018-10-03 11:08:02'
    );

INSERT INTO `dados`
VALUES (
        '322',
        '50',
        '5',
        '2018-10-03 07:46:22',
        '2018-10-03 11:07:50'
    );

INSERT INTO `dados`
VALUES (
        '323',
        '333',
        '5',
        '2018-10-03 07:46:36',
        '2018-10-03 11:02:13'
    );

INSERT INTO `dados`
VALUES (
        '324',
        '2',
        '5',
        '2018-10-03 07:46:48',
        null
    );

INSERT INTO `dados`
VALUES (
        '325',
        '268',
        '5',
        '2018-10-03 07:48:02',
        null
    );

INSERT INTO `dados`
VALUES (
        '326',
        '68',
        '5',
        '2018-10-03 07:48:36',
        '2018-10-03 11:05:28'
    );

INSERT INTO `dados`
VALUES (
        '327',
        '43',
        '5',
        '2018-10-03 07:49:47',
        '2018-10-03 11:07:16'
    );

INSERT INTO `dados`
VALUES (
        '328',
        '15',
        '5',
        '2018-10-03 07:50:13',
        '2018-10-03 11:05:04'
    );

INSERT INTO `dados`
VALUES (
        '329',
        '262',
        '5',
        '2018-10-03 07:50:23',
        '2018-10-03 11:02:54'
    );

INSERT INTO `dados`
VALUES (
        '330',
        '238',
        '5',
        '2018-10-03 07:50:40',
        '2018-10-03 11:04:26'
    );

INSERT INTO `dados`
VALUES (
        '331',
        '248',
        '5',
        '2018-10-03 07:50:55',
        '2018-10-03 11:06:17'
    );

INSERT INTO `dados`
VALUES (
        '332',
        '7',
        '5',
        '2018-10-03 07:51:25',
        '2018-10-03 11:07:02'
    );

INSERT INTO `dados`
VALUES (
        '333',
        '167',
        '5',
        '2018-10-03 07:51:41',
        '2018-10-03 11:06:54'
    );

INSERT INTO `dados`
VALUES (
        '334',
        '35',
        '5',
        '2018-10-03 07:52:18',
        '2018-10-03 11:06:51'
    );

INSERT INTO `dados`
VALUES (
        '335',
        '38',
        '5',
        '2018-10-03 07:52:31',
        '2018-10-03 11:06:44'
    );

INSERT INTO `dados`
VALUES (
        '336',
        '132',
        '5',
        '2018-10-03 07:52:46',
        '2018-10-03 11:01:53'
    );

INSERT INTO `dados`
VALUES (
        '337',
        '266',
        '5',
        '2018-10-03 07:53:04',
        null
    );

INSERT INTO `dados`
VALUES (
        '338',
        '336',
        '5',
        '2018-10-03 07:54:05',
        '2018-10-03 11:04:10'
    );

INSERT INTO `dados`
VALUES (
        '339',
        '292',
        '5',
        '2018-10-03 07:54:26',
        '2018-10-03 11:03:32'
    );

INSERT INTO `dados`
VALUES (
        '340',
        '290',
        '5',
        '2018-10-03 07:54:36',
        '2018-10-03 11:03:59'
    );

INSERT INTO `dados`
VALUES (
        '341',
        '239',
        '5',
        '2018-10-03 07:54:49',
        '2018-10-03 11:03:30'
    );

INSERT INTO `dados`
VALUES (
        '342',
        '265',
        '5',
        '2018-10-03 07:55:00',
        '2018-10-03 11:07:37'
    );

INSERT INTO `dados`
VALUES (
        '343',
        '65',
        '5',
        '2018-10-03 07:55:47',
        '2018-10-03 11:08:54'
    );

INSERT INTO `dados`
VALUES (
        '344',
        '177',
        '5',
        '2018-10-03 07:55:59',
        null
    );

INSERT INTO `dados`
VALUES (
        '345',
        '293',
        '5',
        '2018-10-03 07:56:03',
        '2018-10-03 11:02:18'
    );

INSERT INTO `dados`
VALUES (
        '346',
        '212',
        '5',
        '2018-10-03 07:57:12',
        '2018-10-03 11:06:17'
    );

INSERT INTO `dados`
VALUES (
        '347',
        '174',
        '5',
        '2018-10-03 07:59:39',
        '2018-10-03 11:03:23'
    );

INSERT INTO `dados`
VALUES (
        '348',
        '53',
        '5',
        '2018-10-03 08:00:33',
        '2018-10-03 11:05:14'
    );

INSERT INTO `dados`
VALUES (
        '349',
        '178',
        '5',
        '2018-10-03 08:01:34',
        '2018-10-03 11:04:49'
    );

INSERT INTO `dados`
VALUES (
        '350',
        '83',
        '5',
        '2018-10-03 08:01:39',
        '2018-10-03 11:01:46'
    );

INSERT INTO `dados`
VALUES (
        '351',
        '297',
        '5',
        '2018-10-03 08:02:15',
        '2018-10-03 11:10:54'
    );

INSERT INTO `dados`
VALUES (
        '352',
        '175',
        '5',
        '2018-10-03 08:06:11',
        '2018-10-03 11:03:27'
    );

INSERT INTO `dados`
VALUES (
        '353',
        '153',
        '5',
        '2018-10-03 08:07:32',
        '2018-10-03 11:03:38'
    );

INSERT INTO `dados`
VALUES (
        '354',
        '303',
        '5',
        '2018-10-03 08:08:13',
        '2018-10-03 11:01:38'
    );

INSERT INTO `dados`
VALUES (
        '355',
        '152',
        '5',
        '2018-10-03 08:08:23',
        '2018-10-03 11:01:46'
    );

INSERT INTO `dados`
VALUES (
        '356',
        '204',
        '5',
        '2018-10-03 08:08:32',
        '2018-10-03 11:11:25'
    );

INSERT INTO `dados`
VALUES (
        '357',
        '318',
        '5',
        '2018-10-03 08:08:36',
        '2018-10-03 11:11:28'
    );

INSERT INTO `dados`
VALUES (
        '358',
        '285',
        '5',
        '2018-10-03 08:08:52',
        '2018-10-03 11:03:49'
    );

INSERT INTO `dados`
VALUES (
        '359',
        '205',
        '5',
        '2018-10-03 08:14:06',
        '2018-10-03 11:03:46'
    );

INSERT INTO `dados`
VALUES (
        '360',
        '199',
        '5',
        '2018-10-03 08:14:10',
        '2018-10-03 11:03:41'
    );

INSERT INTO `dados`
VALUES (
        '361',
        '111',
        '5',
        '2018-10-03 08:14:44',
        '2018-10-03 11:03:51'
    );

INSERT INTO `dados`
VALUES (
        '362',
        '263',
        '5',
        '2018-10-03 08:17:29',
        '2018-10-03 11:04:20'
    );

INSERT INTO `dados`
VALUES (
        '363',
        '269',
        '5',
        '2018-10-03 08:18:01',
        '2018-10-03 11:06:06'
    );

INSERT INTO `dados`
VALUES (
        '364',
        '93',
        '5',
        '2018-10-03 08:20:44',
        '2018-10-03 11:01:58'
    );

INSERT INTO `dados`
VALUES (
        '365',
        '184',
        '5',
        '2018-10-03 08:21:10',
        '2018-10-03 11:02:30'
    );

INSERT INTO `dados`
VALUES (
        '366',
        '229',
        '5',
        '2018-10-03 08:22:03',
        '2018-10-03 11:00:42'
    );

INSERT INTO `dados`
VALUES (
        '367',
        '172',
        '5',
        '2018-10-03 08:22:55',
        '2018-10-03 11:04:30'
    );

INSERT INTO `dados`
VALUES (
        '368',
        '220',
        '5',
        '2018-10-03 08:23:00',
        null
    );

INSERT INTO `dados`
VALUES (
        '369',
        '223',
        '5',
        '2018-10-03 08:23:19',
        '2018-10-03 11:02:26'
    );

INSERT INTO `dados`
VALUES (
        '370',
        '181',
        '5',
        '2018-10-03 08:23:36',
        '2018-10-03 11:06:00'
    );

INSERT INTO `dados`
VALUES (
        '371',
        '51',
        '5',
        '2018-10-03 08:24:46',
        '2018-10-03 11:04:35'
    );

INSERT INTO `dados`
VALUES (
        '372',
        '339',
        '5',
        '2018-10-03 08:25:37',
        '2018-10-03 11:03:15'
    );

INSERT INTO `dados`
VALUES (
        '373',
        '210',
        '5',
        '2018-10-03 08:28:09',
        '2018-10-03 11:03:10'
    );

INSERT INTO `dados`
VALUES (
        '374',
        '217',
        '5',
        '2018-10-03 08:32:04',
        null
    );

INSERT INTO `dados`
VALUES (
        '375',
        '218',
        '5',
        '2018-10-03 08:32:06',
        null
    );

INSERT INTO `dados`
VALUES (
        '376',
        '264',
        '5',
        '2018-10-03 08:32:07',
        '2018-10-03 11:04:17'
    );

INSERT INTO `dados`
VALUES (
        '377',
        '57',
        '5',
        '2018-10-03 08:32:22',
        '2018-10-03 11:01:05'
    );

INSERT INTO `dados`
VALUES (
        '378',
        '110',
        '5',
        '2018-10-03 08:33:03',
        '2018-10-03 11:04:02'
    );

INSERT INTO `dados`
VALUES (
        '379',
        '242',
        '5',
        '2018-10-03 08:33:10',
        '2018-10-03 11:03:50'
    );

INSERT INTO `dados`
VALUES (
        '380',
        '1',
        '5',
        '2018-10-03 08:33:47',
        null
    );

INSERT INTO `dados`
VALUES (
        '381',
        '32',
        '5',
        '2018-10-03 08:34:04',
        null
    );

INSERT INTO `dados`
VALUES (
        '382',
        '202',
        '5',
        '2018-10-03 08:38:36',
        null
    );

INSERT INTO `dados`
VALUES (
        '383',
        '158',
        '5',
        '2018-10-03 08:39:41',
        '2018-10-03 11:02:47'
    );

INSERT INTO `dados`
VALUES (
        '384',
        '221',
        '5',
        '2018-10-03 08:39:45',
        '2018-10-03 11:02:42'
    );

INSERT INTO `dados`
VALUES (
        '385',
        '75',
        '5',
        null,
        '2018-10-03 11:01:29'
    );

INSERT INTO `dados`
VALUES (
        '386',
        '183',
        '5',
        null,
        '2018-10-03 11:02:26'
    );

INSERT INTO `dados`
VALUES (
        '387',
        '149',
        '5',
        null,
        '2018-10-03 11:03:02'
    );

INSERT INTO `dados`
VALUES (
        '388',
        '131',
        '5',
        null,
        '2018-10-03 11:03:10'
    );

INSERT INTO `dados`
VALUES (
        '389',
        '176',
        '5',
        null,
        '2018-10-03 11:04:10'
    );

INSERT INTO `dados`
VALUES (
        '390',
        '160',
        '5',
        null,
        '2018-10-03 11:04:14'
    );

INSERT INTO `dados`
VALUES (
        '391',
        '306',
        '5',
        null,
        '2018-10-03 11:04:17'
    );

INSERT INTO `dados`
VALUES (
        '392',
        '305',
        '5',
        null,
        '2018-10-03 11:04:20'
    );

INSERT INTO `dados`
VALUES (
        '393',
        '302',
        '5',
        null,
        '2018-10-03 11:04:30'
    );

INSERT INTO `dados`
VALUES (
        '394',
        '211',
        '5',
        null,
        '2018-10-03 11:05:08'
    );

INSERT INTO `dados`
VALUES (
        '395',
        '48',
        '5',
        null,
        '2018-10-03 11:07:33'
    );

INSERT INTO `dados`
VALUES (
        '396',
        '168',
        '5',
        null,
        '2018-10-03 11:12:19'
    );

INSERT INTO `dados`
VALUES (
        '397',
        '79',
        '6',
        '2018-10-03 12:43:54',
        null
    );

INSERT INTO `dados`
VALUES (
        '398',
        '82',
        '6',
        '2018-10-03 12:44:01',
        '2018-10-03 16:30:52'
    );

INSERT INTO `dados`
VALUES (
        '399',
        '115',
        '6',
        '2018-10-03 12:44:07',
        null
    );

INSERT INTO `dados`
VALUES (
        '400',
        '16',
        '6',
        '2018-10-03 12:44:47',
        '2018-10-03 16:31:37'
    );

INSERT INTO `dados`
VALUES (
        '401',
        '287',
        '6',
        '2018-10-03 12:44:53',
        '2018-10-03 16:32:47'
    );

INSERT INTO `dados`
VALUES (
        '402',
        '301',
        '6',
        '2018-10-03 12:45:09',
        null
    );

INSERT INTO `dados`
VALUES (
        '403',
        '234',
        '6',
        '2018-10-03 12:45:24',
        '2018-10-03 16:54:26'
    );

INSERT INTO `dados`
VALUES (
        '404',
        '285',
        '6',
        '2018-10-03 12:45:52',
        '2018-10-03 16:55:25'
    );

INSERT INTO `dados`
VALUES (
        '405',
        '269',
        '6',
        '2018-10-03 12:46:12',
        '2018-10-03 16:34:37'
    );

INSERT INTO `dados`
VALUES (
        '406',
        '34',
        '6',
        '2018-10-03 12:46:25',
        '2018-10-03 16:35:03'
    );

INSERT INTO `dados`
VALUES (
        '407',
        '306',
        '6',
        '2018-10-03 12:47:03',
        null
    );

INSERT INTO `dados`
VALUES (
        '408',
        '305',
        '6',
        '2018-10-03 12:47:09',
        null
    );

INSERT INTO `dados`
VALUES (
        '409',
        '348',
        '6',
        '2018-10-03 12:47:39',
        '2018-10-03 16:55:41'
    );

INSERT INTO `dados`
VALUES (
        '410',
        '168',
        '6',
        '2018-10-03 12:47:41',
        '2018-10-03 16:55:36'
    );

INSERT INTO `dados`
VALUES (
        '411',
        '268',
        '6',
        '2018-10-03 12:47:53',
        null
    );

INSERT INTO `dados`
VALUES (
        '412',
        '132',
        '6',
        '2018-10-03 12:47:57',
        null
    );

INSERT INTO `dados`
VALUES (
        '413',
        '35',
        '6',
        '2018-10-03 12:50:45',
        null
    );

INSERT INTO `dados`
VALUES (
        '414',
        '304',
        '6',
        '2018-10-03 12:53:44',
        '2018-10-03 16:33:09'
    );

INSERT INTO `dados`
VALUES (
        '415',
        '4',
        '6',
        '2018-10-03 12:54:16',
        '2018-10-03 16:55:25'
    );

INSERT INTO `dados`
VALUES (
        '416',
        '236',
        '6',
        '2018-10-03 12:56:59',
        '2018-10-03 16:32:49'
    );

INSERT INTO `dados`
VALUES (
        '417',
        '343',
        '6',
        '2018-10-03 12:57:03',
        '2018-10-03 16:32:43'
    );

INSERT INTO `dados`
VALUES (
        '418',
        '214',
        '6',
        '2018-10-03 12:57:34',
        '2018-10-03 16:36:51'
    );

INSERT INTO `dados`
VALUES (
        '419',
        '261',
        '6',
        '2018-10-03 12:57:54',
        '2018-10-03 16:37:44'
    );

INSERT INTO `dados`
VALUES (
        '420',
        '43',
        '6',
        '2018-10-03 12:57:55',
        '2018-10-03 16:54:25'
    );

INSERT INTO `dados`
VALUES (
        '421',
        '55',
        '6',
        '2018-10-03 12:58:07',
        '2018-10-03 16:55:06'
    );

INSERT INTO `dados`
VALUES (
        '422',
        '318',
        '6',
        '2018-10-03 12:58:33',
        '2018-10-03 16:51:00'
    );

INSERT INTO `dados`
VALUES (
        '423',
        '204',
        '6',
        '2018-10-03 12:58:38',
        '2018-10-03 16:55:40'
    );

INSERT INTO `dados`
VALUES (
        '424',
        '189',
        '6',
        '2018-10-03 12:58:46',
        '2018-10-03 16:32:48'
    );

INSERT INTO `dados`
VALUES (
        '425',
        '276',
        '6',
        '2018-10-03 12:58:53',
        '2018-10-03 16:35:21'
    );

INSERT INTO `dados`
VALUES (
        '426',
        '38',
        '6',
        '2018-10-03 12:59:07',
        '2018-10-03 16:35:15'
    );

INSERT INTO `dados`
VALUES (
        '427',
        '52',
        '6',
        '2018-10-03 12:59:08',
        '2018-10-03 16:32:19'
    );

INSERT INTO `dados`
VALUES (
        '428',
        '272',
        '6',
        '2018-10-03 12:59:15',
        '2018-10-03 16:32:22'
    );

INSERT INTO `dados`
VALUES (
        '429',
        '223',
        '6',
        '2018-10-03 12:59:17',
        '2018-10-03 16:34:55'
    );

INSERT INTO `dados`
VALUES (
        '430',
        '57',
        '6',
        '2018-10-03 12:59:28',
        null
    );

INSERT INTO `dados`
VALUES (
        '431',
        '277',
        '6',
        '2018-10-03 12:59:33',
        '2018-10-03 16:34:23'
    );

INSERT INTO `dados`
VALUES (
        '432',
        '58',
        '6',
        '2018-10-03 12:59:48',
        null
    );

INSERT INTO `dados`
VALUES (
        '433',
        '237',
        '6',
        '2018-10-03 13:00:54',
        '2018-10-03 16:41:03'
    );

INSERT INTO `dados`
VALUES (
        '434',
        '147',
        '6',
        '2018-10-03 13:01:05',
        '2018-10-03 16:35:31'
    );

INSERT INTO `dados`
VALUES (
        '435',
        '146',
        '6',
        '2018-10-03 13:01:18',
        null
    );

INSERT INTO `dados`
VALUES (
        '436',
        '215',
        '6',
        '2018-10-03 13:01:23',
        '2018-10-03 16:35:52'
    );

INSERT INTO `dados`
VALUES (
        '437',
        '229',
        '6',
        '2018-10-03 13:01:23',
        '2018-10-03 16:40:53'
    );

INSERT INTO `dados`
VALUES (
        '438',
        '24',
        '6',
        '2018-10-03 13:01:41',
        '2018-10-03 17:29:17'
    );

INSERT INTO `dados`
VALUES (
        '439',
        '263',
        '6',
        '2018-10-03 13:01:50',
        '2018-10-03 16:35:58'
    );

INSERT INTO `dados`
VALUES (
        '440',
        '207',
        '6',
        '2018-10-03 13:02:00',
        '2018-10-03 16:55:01'
    );

INSERT INTO `dados`
VALUES (
        '441',
        '160',
        '6',
        '2018-10-03 13:02:22',
        '2018-10-03 16:32:34'
    );

INSERT INTO `dados`
VALUES (
        '442',
        '137',
        '6',
        '2018-10-03 13:02:25',
        '2018-10-03 16:35:33'
    );

INSERT INTO `dados`
VALUES (
        '443',
        '293',
        '6',
        '2018-10-03 13:02:29',
        '2018-10-03 16:32:07'
    );

INSERT INTO `dados`
VALUES (
        '444',
        '238',
        '6',
        '2018-10-03 13:02:33',
        '2018-10-03 16:34:31'
    );

INSERT INTO `dados`
VALUES (
        '445',
        '352',
        '6',
        '2018-10-03 13:02:36',
        '2018-10-03 16:32:00'
    );

INSERT INTO `dados`
VALUES (
        '446',
        '281',
        '6',
        '2018-10-03 13:03:37',
        '2018-10-03 16:33:20'
    );

INSERT INTO `dados`
VALUES (
        '447',
        '193',
        '6',
        '2018-10-03 13:03:56',
        null
    );

INSERT INTO `dados`
VALUES (
        '448',
        '353',
        '6',
        '2018-10-03 13:04:15',
        '2018-10-03 16:31:47'
    );

INSERT INTO `dados`
VALUES (
        '449',
        '264',
        '6',
        '2018-10-03 13:04:27',
        '2018-10-03 16:36:07'
    );

INSERT INTO `dados`
VALUES (
        '450',
        '49',
        '6',
        '2018-10-03 13:05:02',
        '2018-10-03 16:34:11'
    );

INSERT INTO `dados`
VALUES (
        '451',
        '69',
        '6',
        '2018-10-03 13:05:11',
        '2018-10-03 16:34:47'
    );

INSERT INTO `dados`
VALUES (
        '452',
        '178',
        '6',
        '2018-10-03 13:05:17',
        '2018-10-03 16:37:07'
    );

INSERT INTO `dados`
VALUES (
        '453',
        '15',
        '6',
        '2018-10-03 13:05:21',
        '2018-10-03 16:33:49'
    );

INSERT INTO `dados`
VALUES (
        '454',
        '303',
        '6',
        '2018-10-03 13:05:25',
        '2018-10-03 16:30:38'
    );

INSERT INTO `dados`
VALUES (
        '455',
        '75',
        '6',
        '2018-10-03 13:05:29',
        '2018-10-03 16:31:07'
    );

INSERT INTO `dados`
VALUES (
        '456',
        '152',
        '6',
        '2018-10-03 13:05:37',
        null
    );

INSERT INTO `dados`
VALUES (
        '457',
        '13',
        '6',
        '2018-10-03 13:05:44',
        '2018-10-03 16:43:21'
    );

INSERT INTO `dados`
VALUES (
        '458',
        '156',
        '6',
        '2018-10-03 13:05:44',
        '2018-10-03 16:35:05'
    );

INSERT INTO `dados`
VALUES (
        '459',
        '51',
        '6',
        '2018-10-03 13:05:55',
        '2018-10-03 16:34:02'
    );

INSERT INTO `dados`
VALUES (
        '460',
        '290',
        '6',
        '2018-10-03 13:06:01',
        '2018-10-03 16:37:21'
    );

INSERT INTO `dados`
VALUES (
        '461',
        '245',
        '6',
        '2018-10-03 13:06:03',
        '2018-10-03 16:37:35'
    );

INSERT INTO `dados`
VALUES (
        '462',
        '205',
        '6',
        '2018-10-03 13:06:09',
        '2018-10-03 16:31:32'
    );

INSERT INTO `dados`
VALUES (
        '463',
        '199',
        '6',
        '2018-10-03 13:06:14',
        '2018-10-03 16:31:23'
    );

INSERT INTO `dados`
VALUES (
        '464',
        '101',
        '6',
        '2018-10-03 13:06:17',
        '2018-10-03 16:43:26'
    );

INSERT INTO `dados`
VALUES (
        '465',
        '213',
        '6',
        '2018-10-03 13:06:21',
        '2018-10-03 16:31:19'
    );

INSERT INTO `dados`
VALUES (
        '466',
        '94',
        '6',
        '2018-10-03 13:06:21',
        '2018-10-03 16:31:28'
    );

INSERT INTO `dados`
VALUES (
        '467',
        '219',
        '6',
        '2018-10-03 13:06:29',
        '2018-10-03 16:31:38'
    );

INSERT INTO `dados`
VALUES (
        '468',
        '86',
        '6',
        '2018-10-03 13:06:42',
        '2018-10-03 16:31:03'
    );

INSERT INTO `dados`
VALUES (
        '469',
        '292',
        '6',
        '2018-10-03 13:07:11',
        '2018-10-03 16:33:38'
    );

INSERT INTO `dados`
VALUES (
        '470',
        '289',
        '6',
        '2018-10-03 13:07:27',
        '2018-10-03 16:37:27'
    );

INSERT INTO `dados`
VALUES (
        '471',
        '100',
        '6',
        '2018-10-03 13:07:45',
        '2018-10-03 16:32:38'
    );

INSERT INTO `dados`
VALUES (
        '472',
        '6',
        '6',
        '2018-10-03 13:07:50',
        '2018-10-03 16:36:40'
    );

INSERT INTO `dados`
VALUES (
        '473',
        '92',
        '6',
        '2018-10-03 13:07:54',
        '2018-10-03 16:34:04'
    );

INSERT INTO `dados`
VALUES (
        '474',
        '295',
        '6',
        '2018-10-03 13:08:55',
        '2018-10-03 16:30:59'
    );

INSERT INTO `dados`
VALUES (
        '475',
        '149',
        '6',
        '2018-10-03 13:09:01',
        '2018-10-03 16:30:26'
    );

INSERT INTO `dados`
VALUES (
        '476',
        '131',
        '6',
        '2018-10-03 13:09:23',
        '2018-10-03 16:30:14'
    );

INSERT INTO `dados`
VALUES (
        '477',
        '54',
        '6',
        '2018-10-03 13:11:13',
        '2018-10-03 16:35:12'
    );

INSERT INTO `dados`
VALUES (
        '478',
        '208',
        '6',
        '2018-10-03 13:11:20',
        '2018-10-03 16:36:04'
    );

INSERT INTO `dados`
VALUES (
        '479',
        '339',
        '6',
        '2018-10-03 13:11:24',
        '2018-10-03 16:36:01'
    );

INSERT INTO `dados`
VALUES (
        '480',
        '93',
        '6',
        '2018-10-03 13:11:27',
        '2018-10-03 16:44:09'
    );

INSERT INTO `dados`
VALUES (
        '481',
        '53',
        '6',
        '2018-10-03 13:11:28',
        '2018-10-03 16:35:29'
    );

INSERT INTO `dados`
VALUES (
        '482',
        '241',
        '6',
        '2018-10-03 13:11:35',
        '2018-10-03 16:54:10'
    );

INSERT INTO `dados`
VALUES (
        '483',
        '118',
        '6',
        '2018-10-03 13:12:10',
        '2018-10-03 16:34:44'
    );

INSERT INTO `dados`
VALUES (
        '484',
        '163',
        '6',
        '2018-10-03 13:12:53',
        '2018-10-03 16:54:52'
    );

INSERT INTO `dados`
VALUES (
        '485',
        '296',
        '6',
        '2018-10-03 13:15:10',
        '2018-10-03 16:55:37'
    );

INSERT INTO `dados`
VALUES (
        '486',
        '145',
        '6',
        '2018-10-03 13:15:57',
        '2018-10-03 16:33:11'
    );

INSERT INTO `dados`
VALUES (
        '487',
        '117',
        '6',
        '2018-10-03 13:17:31',
        '2018-10-03 16:39:07'
    );

INSERT INTO `dados`
VALUES (
        '488',
        '113',
        '6',
        '2018-10-03 13:17:40',
        '2018-10-03 16:38:55'
    );

INSERT INTO `dados`
VALUES (
        '489',
        '251',
        '6',
        '2018-10-03 13:18:39',
        '2018-10-03 16:31:09'
    );

INSERT INTO `dados`
VALUES (
        '490',
        '252',
        '6',
        '2018-10-03 13:18:45',
        '2018-10-03 16:31:14'
    );

INSERT INTO `dados`
VALUES (
        '491',
        '7',
        '6',
        '2018-10-03 13:20:47',
        '2018-10-03 16:34:40'
    );

INSERT INTO `dados`
VALUES (
        '492',
        '167',
        '6',
        '2018-10-03 13:20:51',
        '2018-10-03 16:34:50'
    );

INSERT INTO `dados`
VALUES (
        '493',
        '239',
        '6',
        '2018-10-03 13:22:21',
        '2018-10-03 16:31:53'
    );

INSERT INTO `dados`
VALUES (
        '494',
        '162',
        '6',
        '2018-10-03 13:22:56',
        '2018-10-03 16:32:27'
    );

INSERT INTO `dados`
VALUES (
        '495',
        '3',
        '6',
        '2018-10-03 13:23:13',
        '2018-10-03 16:54:36'
    );

INSERT INTO `dados`
VALUES (
        '496',
        '256',
        '6',
        '2018-10-03 13:24:48',
        '2018-10-03 16:30:53'
    );

INSERT INTO `dados`
VALUES (
        '497',
        '136',
        '6',
        '2018-10-03 13:24:56',
        null
    );

INSERT INTO `dados`
VALUES (
        '498',
        '243',
        '6',
        '2018-10-03 13:25:15',
        '2018-10-03 16:33:08'
    );

INSERT INTO `dados`
VALUES (
        '499',
        '9',
        '6',
        '2018-10-03 13:25:16',
        '2018-10-03 16:31:02'
    );

INSERT INTO `dados`
VALUES (
        '500',
        '309',
        '6',
        '2018-10-03 13:26:08',
        '2018-10-03 16:32:52'
    );

INSERT INTO `dados`
VALUES (
        '501',
        '265',
        '6',
        '2018-10-03 13:26:11',
        '2018-10-03 16:35:15'
    );

INSERT INTO `dados`
VALUES (
        '502',
        '39',
        '6',
        '2018-10-03 13:26:15',
        null
    );

INSERT INTO `dados`
VALUES (
        '503',
        '77',
        '6',
        '2018-10-03 13:26:24',
        null
    );

INSERT INTO `dados`
VALUES (
        '504',
        '59',
        '6',
        '2018-10-03 13:26:30',
        '2018-10-03 16:35:42'
    );

INSERT INTO `dados`
VALUES (
        '505',
        '270',
        '6',
        '2018-10-03 13:27:02',
        '2018-10-03 16:36:34'
    );

INSERT INTO `dados`
VALUES (
        '506',
        '217',
        '6',
        '2018-10-03 13:27:06',
        '2018-10-03 16:34:21'
    );

INSERT INTO `dados`
VALUES (
        '507',
        '72',
        '6',
        '2018-10-03 13:27:12',
        '2018-10-03 16:34:17'
    );

INSERT INTO `dados`
VALUES (
        '508',
        '218',
        '6',
        '2018-10-03 13:27:12',
        '2018-10-03 16:34:28'
    );

INSERT INTO `dados`
VALUES (
        '509',
        '176',
        '6',
        '2018-10-03 13:28:49',
        '2018-10-03 16:32:01'
    );

INSERT INTO `dados`
VALUES (
        '510',
        '10',
        '6',
        '2018-10-03 13:29:22',
        '2018-10-03 16:31:08'
    );

INSERT INTO `dados`
VALUES (
        '511',
        '191',
        '6',
        '2018-10-03 13:29:35',
        '2018-10-03 16:30:58'
    );

INSERT INTO `dados`
VALUES (
        '512',
        '198',
        '6',
        '2018-10-03 13:29:46',
        '2018-10-03 16:30:53'
    );

INSERT INTO `dados`
VALUES (
        '513',
        '280',
        '6',
        '2018-10-03 13:29:50',
        '2018-10-03 16:33:48'
    );

INSERT INTO `dados`
VALUES (
        '514',
        '200',
        '6',
        '2018-10-03 13:30:17',
        '2018-10-03 16:31:41'
    );

INSERT INTO `dados`
VALUES (
        '515',
        '201',
        '6',
        '2018-10-03 13:31:57',
        '2018-10-03 16:32:05'
    );

INSERT INTO `dados`
VALUES (
        '516',
        '279',
        '6',
        '2018-10-03 13:32:00',
        null
    );

INSERT INTO `dados`
VALUES (
        '517',
        '172',
        '6',
        '2018-10-03 13:32:26',
        '2018-10-03 16:30:49'
    );

INSERT INTO `dados`
VALUES (
        '518',
        '2',
        '6',
        '2018-10-03 13:34:29',
        '2018-10-03 16:54:30'
    );

INSERT INTO `dados`
VALUES (
        '519',
        '31',
        '6',
        '2018-10-03 13:34:31',
        '2018-10-03 16:41:22'
    );

INSERT INTO `dados`
VALUES (
        '520',
        '212',
        '6',
        '2018-10-03 13:35:03',
        '2018-10-03 16:36:56'
    );

INSERT INTO `dados`
VALUES (
        '521',
        '50',
        '6',
        '2018-10-03 13:35:30',
        '2018-10-03 16:36:38'
    );

INSERT INTO `dados`
VALUES (
        '522',
        '30',
        '6',
        '2018-10-03 13:35:33',
        '2018-10-03 16:36:13'
    );

INSERT INTO `dados`
VALUES (
        '523',
        '282',
        '6',
        '2018-10-03 13:37:30',
        '2018-10-03 16:33:35'
    );

INSERT INTO `dados`
VALUES (
        '524',
        '359',
        '6',
        '2018-10-03 13:41:40',
        '2018-10-03 16:32:15'
    );

INSERT INTO `dados`
VALUES (
        '525',
        '321',
        '6',
        '2018-10-03 13:41:49',
        '2018-10-03 16:35:21'
    );

INSERT INTO `dados`
VALUES (
        '526',
        '299',
        '6',
        '2018-10-03 13:43:43',
        '2018-10-03 16:32:44'
    );

INSERT INTO `dados`
VALUES (
        '527',
        '300',
        '6',
        '2018-10-03 13:43:59',
        '2018-10-03 16:33:04'
    );

INSERT INTO `dados`
VALUES (
        '528',
        '28',
        '6',
        '2018-10-03 13:44:43',
        null
    );

INSERT INTO `dados`
VALUES (
        '529',
        '122',
        '6',
        '2018-10-03 13:45:00',
        '2018-10-03 16:54:41'
    );

INSERT INTO `dados`
VALUES (
        '530',
        '29',
        '6',
        null,
        '2018-10-03 16:31:52'
    );

INSERT INTO `dados`
VALUES (
        '531',
        '329',
        '6',
        null,
        '2018-10-03 16:32:34'
    );

INSERT INTO `dados`
VALUES (
        '532',
        '25',
        '6',
        null,
        '2018-10-03 16:32:36'
    );

INSERT INTO `dados`
VALUES (
        '533',
        '344',
        '6',
        null,
        '2018-10-03 16:32:50'
    );

INSERT INTO `dados`
VALUES (
        '534',
        '138',
        '6',
        null,
        '2018-10-03 16:33:14'
    );

INSERT INTO `dados`
VALUES (
        '535',
        '21',
        '6',
        null,
        '2018-10-03 16:35:56'
    );

INSERT INTO `dados`
VALUES (
        '536',
        '248',
        '6',
        null,
        '2018-10-03 16:36:52'
    );

INSERT INTO `dados`
VALUES (
        '537',
        '63',
        '6',
        null,
        '2018-10-03 16:51:09'
    );

INSERT INTO `dados`
VALUES (
        '538',
        '48',
        '6',
        null,
        '2018-10-03 16:55:32'
    );

INSERT INTO `dados`
VALUES (
        '539',
        '218',
        '7',
        '2018-10-04 06:47:15',
        '2018-10-04 11:28:03'
    );

INSERT INTO `dados`
VALUES (
        '540',
        '70',
        '7',
        '2018-10-04 06:51:08',
        '2018-10-04 11:43:41'
    );

INSERT INTO `dados`
VALUES (
        '541',
        '189',
        '7',
        '2018-10-04 06:51:21',
        '2018-10-04 10:41:48'
    );

INSERT INTO `dados`
VALUES (
        '542',
        '65',
        '7',
        '2018-10-04 06:52:56',
        null
    );

INSERT INTO `dados`
VALUES (
        '543',
        '208',
        '7',
        '2018-10-04 06:52:58',
        '2018-10-04 11:42:28'
    );

INSERT INTO `dados`
VALUES (
        '544',
        '117',
        '7',
        '2018-10-04 06:53:10',
        '2018-10-04 11:42:53'
    );

INSERT INTO `dados`
VALUES (
        '545',
        '246',
        '7',
        '2018-10-04 06:53:11',
        '2018-10-04 11:02:50'
    );

INSERT INTO `dados`
VALUES (
        '546',
        '262',
        '7',
        '2018-10-04 06:53:21',
        '2018-10-04 11:01:40'
    );

INSERT INTO `dados`
VALUES (
        '547',
        '49',
        '7',
        '2018-10-04 06:53:26',
        '2018-10-04 10:34:00'
    );

INSERT INTO `dados`
VALUES (
        '548',
        '139',
        '7',
        '2018-10-04 06:53:38',
        '2018-10-04 11:33:33'
    );

INSERT INTO `dados`
VALUES (
        '549',
        '39',
        '7',
        '2018-10-04 06:53:39',
        '2018-10-04 10:50:45'
    );

INSERT INTO `dados`
VALUES (
        '550',
        '185',
        '7',
        '2018-10-04 06:53:46',
        null
    );

INSERT INTO `dados`
VALUES (
        '551',
        '72',
        '7',
        '2018-10-04 06:53:51',
        '2018-10-04 10:51:12'
    );

INSERT INTO `dados`
VALUES (
        '552',
        '367',
        '7',
        '2018-10-04 06:53:52',
        null
    );

INSERT INTO `dados`
VALUES (
        '553',
        '261',
        '7',
        '2018-10-04 06:53:58',
        null
    );

INSERT INTO `dados`
VALUES (
        '554',
        '217',
        '7',
        '2018-10-04 06:54:04',
        '2018-10-04 11:47:37'
    );

INSERT INTO `dados`
VALUES (
        '555',
        '132',
        '7',
        '2018-10-04 06:54:07',
        '2018-10-04 11:04:00'
    );

INSERT INTO `dados`
VALUES (
        '556',
        '93',
        '7',
        '2018-10-04 06:54:22',
        null
    );

INSERT INTO `dados`
VALUES (
        '557',
        '45',
        '7',
        '2018-10-04 06:54:32',
        '2018-10-04 11:46:15'
    );

INSERT INTO `dados`
VALUES (
        '558',
        '41',
        '7',
        '2018-10-04 06:54:38',
        '2018-10-04 11:46:42'
    );

INSERT INTO `dados`
VALUES (
        '559',
        '348',
        '7',
        '2018-10-04 06:54:44',
        '2018-10-04 11:17:46'
    );

INSERT INTO `dados`
VALUES (
        '560',
        '296',
        '7',
        '2018-10-04 06:54:49',
        '2018-10-04 10:39:21'
    );

INSERT INTO `dados`
VALUES (
        '561',
        '118',
        '7',
        '2018-10-04 06:55:00',
        null
    );

INSERT INTO `dados`
VALUES (
        '562',
        '69',
        '7',
        '2018-10-04 06:55:15',
        '2018-10-04 11:54:15'
    );

INSERT INTO `dados`
VALUES (
        '563',
        '113',
        '7',
        '2018-10-04 06:55:17',
        '2018-10-04 11:47:01'
    );

INSERT INTO `dados`
VALUES (
        '564',
        '111',
        '7',
        '2018-10-04 06:55:27',
        '2018-10-04 11:43:54'
    );

INSERT INTO `dados`
VALUES (
        '565',
        '245',
        '7',
        '2018-10-04 06:55:28',
        '2018-10-04 11:53:56'
    );

INSERT INTO `dados`
VALUES (
        '566',
        '138',
        '7',
        '2018-10-04 06:55:37',
        '2018-10-04 11:53:42'
    );

INSERT INTO `dados`
VALUES (
        '567',
        '14',
        '7',
        '2018-10-04 06:55:50',
        '2018-10-04 11:42:16'
    );

INSERT INTO `dados`
VALUES (
        '568',
        '66',
        '7',
        '2018-10-04 06:57:06',
        '2018-10-04 11:46:27'
    );

INSERT INTO `dados`
VALUES (
        '569',
        '91',
        '7',
        '2018-10-04 06:57:26',
        '2018-10-04 11:44:47'
    );

INSERT INTO `dados`
VALUES (
        '570',
        '5',
        '7',
        '2018-10-04 06:57:37',
        '2018-10-04 10:34:26'
    );

INSERT INTO `dados`
VALUES (
        '571',
        '166',
        '7',
        '2018-10-04 06:57:45',
        '2018-10-04 10:31:33'
    );

INSERT INTO `dados`
VALUES (
        '572',
        '165',
        '7',
        '2018-10-04 06:58:01',
        '2018-10-04 11:53:23'
    );

INSERT INTO `dados`
VALUES (
        '573',
        '370',
        '7',
        '2018-10-04 07:00:28',
        '2018-10-04 10:32:25'
    );

INSERT INTO `dados`
VALUES (
        '574',
        '335',
        '7',
        '2018-10-04 07:01:09',
        null
    );

INSERT INTO `dados`
VALUES (
        '575',
        '176',
        '7',
        '2018-10-04 07:01:20',
        '2018-10-04 11:43:17'
    );

INSERT INTO `dados`
VALUES (
        '576',
        '20',
        '7',
        '2018-10-04 07:01:20',
        '2018-10-04 10:41:31'
    );

INSERT INTO `dados`
VALUES (
        '577',
        '158',
        '7',
        '2018-10-04 07:01:30',
        '2018-10-04 11:02:26'
    );

INSERT INTO `dados`
VALUES (
        '578',
        '332',
        '7',
        '2018-10-04 07:01:35',
        null
    );

INSERT INTO `dados`
VALUES (
        '579',
        '238',
        '7',
        '2018-10-04 07:01:36',
        '2018-10-04 10:34:42'
    );

INSERT INTO `dados`
VALUES (
        '580',
        '334',
        '7',
        '2018-10-04 07:01:42',
        null
    );

INSERT INTO `dados`
VALUES (
        '581',
        '7',
        '7',
        '2018-10-04 07:01:49',
        '2018-10-04 11:47:25'
    );

INSERT INTO `dados`
VALUES (
        '582',
        '197',
        '7',
        '2018-10-04 07:01:49',
        '2018-10-04 11:56:35'
    );

INSERT INTO `dados`
VALUES (
        '583',
        '50',
        '7',
        '2018-10-04 07:02:03',
        null
    );

INSERT INTO `dados`
VALUES (
        '584',
        '248',
        '7',
        '2018-10-04 07:02:07',
        '2018-10-04 10:35:52'
    );

INSERT INTO `dados`
VALUES (
        '585',
        '214',
        '7',
        '2018-10-04 07:02:15',
        '2018-10-04 11:09:03'
    );

INSERT INTO `dados`
VALUES (
        '586',
        '48',
        '7',
        '2018-10-04 07:02:19',
        null
    );

INSERT INTO `dados`
VALUES (
        '587',
        '144',
        '7',
        '2018-10-04 07:02:29',
        '2018-10-04 11:55:09'
    );

INSERT INTO `dados`
VALUES (
        '588',
        '82',
        '7',
        '2018-10-04 07:03:37',
        '2018-10-04 11:48:21'
    );

INSERT INTO `dados`
VALUES (
        '589',
        '115',
        '7',
        '2018-10-04 07:03:50',
        '2018-10-04 11:09:19'
    );

INSERT INTO `dados`
VALUES (
        '590',
        '75',
        '7',
        '2018-10-04 07:03:53',
        '2018-10-04 11:45:59'
    );

INSERT INTO `dados`
VALUES (
        '591',
        '268',
        '7',
        '2018-10-04 07:03:58',
        '2018-10-04 10:33:31'
    );

INSERT INTO `dados`
VALUES (
        '592',
        '289',
        '7',
        '2018-10-04 07:04:00',
        '2018-10-04 11:27:14'
    );

INSERT INTO `dados`
VALUES (
        '593',
        '43',
        '7',
        '2018-10-04 07:04:10',
        null
    );

INSERT INTO `dados`
VALUES (
        '594',
        '221',
        '7',
        '2018-10-04 07:04:12',
        '2018-10-04 11:01:54'
    );

INSERT INTO `dados`
VALUES (
        '595',
        '24',
        '7',
        '2018-10-04 07:04:22',
        '2018-10-04 11:44:11'
    );

INSERT INTO `dados`
VALUES (
        '596',
        '90',
        '7',
        '2018-10-04 07:04:26',
        '2018-10-04 11:44:21'
    );

INSERT INTO `dados`
VALUES (
        '597',
        '1',
        '7',
        '2018-10-04 07:08:27',
        null
    );

INSERT INTO `dados`
VALUES (
        '598',
        '79',
        '7',
        '2018-10-04 07:08:59',
        '2018-10-04 11:50:26'
    );

INSERT INTO `dados`
VALUES (
        '599',
        '178',
        '7',
        '2018-10-04 07:09:06',
        '2018-10-04 11:51:20'
    );

INSERT INTO `dados`
VALUES (
        '600',
        '63',
        '7',
        '2018-10-04 07:09:35',
        '2018-10-04 11:51:04'
    );

INSERT INTO `dados`
VALUES (
        '601',
        '62',
        '7',
        '2018-10-04 07:09:49',
        '2018-10-04 11:56:21'
    );

INSERT INTO `dados`
VALUES (
        '602',
        '21',
        '7',
        '2018-10-04 07:10:14',
        '2018-10-04 11:45:46'
    );

INSERT INTO `dados`
VALUES (
        '603',
        '19',
        '7',
        '2018-10-04 07:10:22',
        '2018-10-04 11:42:05'
    );

INSERT INTO `dados`
VALUES (
        '604',
        '16',
        '7',
        '2018-10-04 07:10:53',
        '2018-10-04 11:48:33'
    );

INSERT INTO `dados`
VALUES (
        '605',
        '15',
        '7',
        '2018-10-04 07:11:30',
        '2018-10-04 11:56:10'
    );

INSERT INTO `dados`
VALUES (
        '606',
        '80',
        '7',
        '2018-10-04 07:14:27',
        '2018-10-04 11:43:29'
    );

INSERT INTO `dados`
VALUES (
        '607',
        '269',
        '7',
        '2018-10-04 07:17:39',
        '2018-10-04 11:27:55'
    );

INSERT INTO `dados`
VALUES (
        '608',
        '285',
        '7',
        '2018-10-04 07:17:52',
        '2018-10-04 11:48:07'
    );

INSERT INTO `dados`
VALUES (
        '609',
        '55',
        '7',
        '2018-10-04 07:17:58',
        null
    );

INSERT INTO `dados`
VALUES (
        '610',
        '186',
        '7',
        '2018-10-04 07:20:51',
        '2018-10-04 11:42:41'
    );

INSERT INTO `dados`
VALUES (
        '611',
        '153',
        '7',
        '2018-10-04 07:21:00',
        '2018-10-04 11:47:59'
    );

INSERT INTO `dados`
VALUES (
        '612',
        '188',
        '7',
        '2018-10-04 07:21:21',
        '2018-10-04 11:44:34'
    );

INSERT INTO `dados`
VALUES (
        '613',
        '336',
        '7',
        '2018-10-04 07:26:03',
        '2018-10-04 11:02:38'
    );

INSERT INTO `dados`
VALUES (
        '614',
        '371',
        '7',
        '2018-10-04 07:26:08',
        '2018-10-04 11:45:35'
    );

INSERT INTO `dados`
VALUES (
        '615',
        '143',
        '7',
        '2018-10-04 07:27:14',
        null
    );

INSERT INTO `dados`
VALUES (
        '616',
        '227',
        '7',
        '2018-10-04 07:28:02',
        null
    );

INSERT INTO `dados`
VALUES (
        '617',
        '154',
        '7',
        '2018-10-04 07:36:41',
        null
    );

INSERT INTO `dados`
VALUES (
        '618',
        '136',
        '7',
        '2018-10-04 07:36:52',
        null
    );

INSERT INTO `dados`
VALUES (
        '619',
        '256',
        '7',
        '2018-10-04 07:36:58',
        '2018-10-04 11:56:48'
    );

INSERT INTO `dados`
VALUES (
        '620',
        '26',
        '7',
        null,
        '2018-10-04 10:31:15'
    );

INSERT INTO `dados`
VALUES (
        '621',
        '225',
        '7',
        null,
        '2018-10-04 10:32:14'
    );

INSERT INTO `dados`
VALUES (
        '622',
        '180',
        '7',
        null,
        '2018-10-04 10:32:42'
    );

INSERT INTO `dados`
VALUES (
        '623',
        '123',
        '7',
        null,
        '2018-10-04 10:32:57'
    );

INSERT INTO `dados`
VALUES (
        '624',
        '27',
        '7',
        null,
        '2018-10-04 10:33:08'
    );

INSERT INTO `dados`
VALUES (
        '625',
        '31',
        '7',
        null,
        '2018-10-04 10:34:13'
    );

INSERT INTO `dados`
VALUES (
        '626',
        '84',
        '7',
        null,
        '2018-10-04 10:34:57'
    );

INSERT INTO `dados`
VALUES (
        '627',
        '181',
        '7',
        null,
        '2018-10-04 10:36:06'
    );

INSERT INTO `dados`
VALUES (
        '628',
        '298',
        '7',
        null,
        '2018-10-04 11:35:52'
    );

INSERT INTO `dados`
VALUES (
        '629',
        '145',
        '7',
        null,
        '2018-10-04 11:36:08'
    );

INSERT INTO `dados`
VALUES (
        '630',
        '366',
        '7',
        null,
        '2018-10-04 11:43:04'
    );

INSERT INTO `dados`
VALUES (
        '631',
        '364',
        '7',
        null,
        '2018-10-04 11:45:01'
    );

INSERT INTO `dados`
VALUES (
        '632',
        '351',
        '7',
        null,
        '2018-10-04 11:45:23'
    );

INSERT INTO `dados`
VALUES (
        '633',
        '109',
        '7',
        null,
        '2018-10-04 11:47:15'
    );

INSERT INTO `dados`
VALUES (
        '634',
        '87',
        '7',
        null,
        '2018-10-04 11:52:58'
    );

INSERT INTO `dados`
VALUES (
        '635',
        '275',
        '7',
        null,
        '2018-10-04 11:54:22'
    );

INSERT INTO `dados`
VALUES (
        '636',
        '284',
        '7',
        null,
        '2018-10-04 11:54:33'
    );

INSERT INTO `dados`
VALUES (
        '637',
        '142',
        '7',
        null,
        '2018-10-04 11:54:48'
    );

INSERT INTO `dados`
VALUES (
        '638',
        '173',
        '7',
        null,
        '2018-10-04 11:55:20'
    );

INSERT INTO `dados`
VALUES (
        '639',
        '149',
        '7',
        null,
        '2018-10-04 11:55:22'
    );

INSERT INTO `dados`
VALUES (
        '640',
        '296',
        '8',
        '2018-10-04 12:43:28',
        '2018-10-04 17:01:50'
    );

INSERT INTO `dados`
VALUES (
        '641',
        '132',
        '8',
        '2018-10-04 12:43:40',
        '2018-10-04 17:03:28'
    );

INSERT INTO `dados`
VALUES (
        '642',
        '93',
        '8',
        '2018-10-04 12:43:52',
        '2018-10-04 17:03:44'
    );

INSERT INTO `dados`
VALUES (
        '643',
        '329',
        '8',
        '2018-10-04 12:45:41',
        '2018-10-04 17:02:17'
    );

INSERT INTO `dados`
VALUES (
        '644',
        '286',
        '8',
        '2018-10-04 12:45:52',
        '2018-10-04 17:02:55'
    );

INSERT INTO `dados`
VALUES (
        '645',
        '285',
        '8',
        '2018-10-04 12:46:42',
        null
    );

INSERT INTO `dados`
VALUES (
        '646',
        '69',
        '8',
        '2018-10-04 12:47:19',
        '2018-10-04 17:02:47'
    );

INSERT INTO `dados`
VALUES (
        '647',
        '245',
        '8',
        '2018-10-04 12:47:26',
        '2018-10-04 17:01:04'
    );

INSERT INTO `dados`
VALUES (
        '648',
        '63',
        '8',
        '2018-10-04 12:47:39',
        null
    );

INSERT INTO `dados`
VALUES (
        '649',
        '26',
        '8',
        '2018-10-04 12:47:53',
        null
    );

INSERT INTO `dados`
VALUES (
        '650',
        '117',
        '8',
        '2018-10-04 12:50:37',
        null
    );

INSERT INTO `dados`
VALUES (
        '651',
        '114',
        '8',
        '2018-10-04 12:51:24',
        null
    );

INSERT INTO `dados`
VALUES (
        '652',
        '110',
        '8',
        '2018-10-04 12:51:52',
        '2018-10-04 17:13:34'
    );

INSERT INTO `dados`
VALUES (
        '653',
        '115',
        '8',
        '2018-10-04 12:51:52',
        null
    );

INSERT INTO `dados`
VALUES (
        '654',
        '113',
        '8',
        '2018-10-04 12:52:15',
        null
    );

INSERT INTO `dados`
VALUES (
        '655',
        '91',
        '8',
        '2018-10-04 12:52:16',
        '2018-10-04 17:15:05'
    );

INSERT INTO `dados`
VALUES (
        '656',
        '176',
        '8',
        '2018-10-04 12:52:30',
        null
    );

INSERT INTO `dados`
VALUES (
        '657',
        '116',
        '8',
        '2018-10-04 12:52:46',
        null
    );

INSERT INTO `dados`
VALUES (
        '658',
        '188',
        '8',
        '2018-10-04 12:52:59',
        null
    );

INSERT INTO `dados`
VALUES (
        '659',
        '366',
        '8',
        '2018-10-04 12:53:13',
        null
    );

INSERT INTO `dados`
VALUES (
        '660',
        '300',
        '8',
        '2018-10-04 12:53:40',
        '2018-10-04 17:06:12'
    );

INSERT INTO `dados`
VALUES (
        '661',
        '145',
        '8',
        '2018-10-04 12:53:44',
        '2018-10-04 17:06:08'
    );

INSERT INTO `dados`
VALUES (
        '662',
        '298',
        '8',
        '2018-10-04 12:53:48',
        '2018-10-04 17:06:22'
    );

INSERT INTO `dados`
VALUES (
        '663',
        '344',
        '8',
        '2018-10-04 12:53:59',
        '2018-10-04 17:06:20'
    );

INSERT INTO `dados`
VALUES (
        '664',
        '104',
        '8',
        '2018-10-04 12:54:22',
        '2018-10-04 17:13:48'
    );

INSERT INTO `dados`
VALUES (
        '665',
        '289',
        '8',
        '2018-10-04 12:55:56',
        null
    );

INSERT INTO `dados`
VALUES (
        '666',
        '189',
        '8',
        '2018-10-04 12:57:37',
        '2018-10-04 17:00:07'
    );

INSERT INTO `dados`
VALUES (
        '667',
        '304',
        '8',
        '2018-10-04 12:57:46',
        '2018-10-04 17:00:15'
    );

INSERT INTO `dados`
VALUES (
        '668',
        '16',
        '8',
        '2018-10-04 12:59:01',
        '2018-10-04 17:01:30'
    );

INSERT INTO `dados`
VALUES (
        '669',
        '293',
        '8',
        '2018-10-04 13:00:26',
        '2018-10-04 17:07:25'
    );

INSERT INTO `dados`
VALUES (
        '670',
        '213',
        '8',
        '2018-10-04 13:01:20',
        '2018-10-04 16:59:53'
    );

INSERT INTO `dados`
VALUES (
        '671',
        '21',
        '8',
        '2018-10-04 13:01:42',
        null
    );

INSERT INTO `dados`
VALUES (
        '672',
        '73',
        '8',
        '2018-10-04 13:01:44',
        '2018-10-04 17:02:38'
    );

INSERT INTO `dados`
VALUES (
        '673',
        '14',
        '8',
        '2018-10-04 13:01:55',
        '2018-10-04 17:01:16'
    );

INSERT INTO `dados`
VALUES (
        '674',
        '246',
        '8',
        '2018-10-04 13:04:38',
        null
    );

INSERT INTO `dados`
VALUES (
        '675',
        '238',
        '8',
        '2018-10-04 13:04:41',
        '2018-10-04 17:02:08'
    );

INSERT INTO `dados`
VALUES (
        '676',
        '210',
        '8',
        '2018-10-04 13:04:52',
        null
    );

INSERT INTO `dados`
VALUES (
        '677',
        '5',
        '8',
        '2018-10-04 13:04:56',
        null
    );

INSERT INTO `dados`
VALUES (
        '678',
        '181',
        '8',
        '2018-10-04 13:05:03',
        null
    );

INSERT INTO `dados`
VALUES (
        '679',
        '248',
        '8',
        '2018-10-04 13:05:09',
        '2018-10-04 17:02:02'
    );

INSERT INTO `dados`
VALUES (
        '680',
        '200',
        '8',
        '2018-10-04 13:06:26',
        '2018-10-04 16:59:30'
    );

INSERT INTO `dados`
VALUES (
        '681',
        '191',
        '8',
        '2018-10-04 13:06:36',
        '2018-10-04 17:05:09'
    );

INSERT INTO `dados`
VALUES (
        '682',
        '10',
        '8',
        '2018-10-04 13:06:40',
        '2018-10-04 17:05:24'
    );

INSERT INTO `dados`
VALUES (
        '683',
        '331',
        '8',
        '2018-10-04 13:07:16',
        '2018-10-04 17:05:41'
    );

INSERT INTO `dados`
VALUES (
        '684',
        '13',
        '8',
        '2018-10-04 13:07:20',
        '2018-10-04 17:00:33'
    );

INSERT INTO `dados`
VALUES (
        '685',
        '172',
        '8',
        '2018-10-04 13:07:38',
        '2018-10-04 17:00:21'
    );

INSERT INTO `dados`
VALUES (
        '686',
        '297',
        '8',
        '2018-10-04 13:07:49',
        null
    );

INSERT INTO `dados`
VALUES (
        '687',
        '64',
        '8',
        '2018-10-04 13:07:54',
        null
    );

INSERT INTO `dados`
VALUES (
        '688',
        '100',
        '8',
        '2018-10-04 13:08:05',
        '2018-10-04 17:13:15'
    );

INSERT INTO `dados`
VALUES (
        '689',
        '18',
        '8',
        '2018-10-04 13:08:08',
        null
    );

INSERT INTO `dados`
VALUES (
        '690',
        '92',
        '8',
        '2018-10-04 13:08:35',
        '2018-10-04 17:03:08'
    );

INSERT INTO `dados`
VALUES (
        '691',
        '236',
        '8',
        '2018-10-04 13:12:51',
        null
    );

INSERT INTO `dados`
VALUES (
        '692',
        '140',
        '8',
        '2018-10-04 13:13:02',
        null
    );

INSERT INTO `dados`
VALUES (
        '693',
        '98',
        '8',
        '2018-10-04 13:13:13',
        null
    );

INSERT INTO `dados`
VALUES (
        '694',
        '287',
        '8',
        '2018-10-04 13:13:26',
        null
    );

INSERT INTO `dados`
VALUES (
        '695',
        '252',
        '8',
        '2018-10-04 13:14:26',
        '2018-10-04 16:59:47'
    );

INSERT INTO `dados`
VALUES (
        '696',
        '251',
        '8',
        '2018-10-04 13:14:35',
        null
    );

INSERT INTO `dados`
VALUES (
        '697',
        '222',
        '8',
        '2018-10-04 13:15:12',
        '2018-10-04 17:01:46'
    );

INSERT INTO `dados`
VALUES (
        '698',
        '220',
        '8',
        '2018-10-04 13:15:27',
        '2018-10-04 17:01:58'
    );

INSERT INTO `dados`
VALUES (
        '699',
        '74',
        '8',
        '2018-10-04 13:16:43',
        '2018-10-04 17:02:27'
    );

INSERT INTO `dados`
VALUES (
        '700',
        '95',
        '8',
        '2018-10-04 13:32:42',
        null
    );

INSERT INTO `dados`
VALUES (
        '701',
        '350',
        '8',
        '2018-10-04 13:33:25',
        '2018-10-04 17:00:27'
    );

INSERT INTO `dados`
VALUES (
        '702',
        '25',
        '8',
        '2018-10-04 13:34:55',
        '2018-10-04 16:59:38'
    );

INSERT INTO `dados`
VALUES (
        '703',
        '149',
        '8',
        null,
        '2018-10-04 17:04:30'
    );

INSERT INTO `dados`
VALUES (
        '704',
        '112',
        '8',
        null,
        '2018-10-04 17:13:03'
    );

INSERT INTO `dados`
VALUES (
        '705',
        '176',
        '9',
        '2018-10-05 06:56:24',
        null
    );

INSERT INTO `dados`
VALUES (
        '706',
        '55',
        '9',
        '2018-10-05 06:59:37',
        '2018-10-05 11:03:22'
    );

INSERT INTO `dados`
VALUES (
        '707',
        '53',
        '9',
        '2018-10-05 07:00:02',
        '2018-10-05 11:02:51'
    );

INSERT INTO `dados`
VALUES (
        '708',
        '69',
        '9',
        '2018-10-05 07:00:22',
        '2018-10-05 11:00:24'
    );

INSERT INTO `dados`
VALUES (
        '709',
        '14',
        '9',
        '2018-10-05 07:00:47',
        '2018-10-05 11:05:07'
    );

INSERT INTO `dados`
VALUES (
        '710',
        '74',
        '9',
        '2018-10-05 07:00:59',
        '2018-10-05 11:01:12'
    );

INSERT INTO `dados`
VALUES (
        '711',
        '73',
        '9',
        '2018-10-05 07:01:11',
        '2018-10-05 11:01:20'
    );

INSERT INTO `dados`
VALUES (
        '712',
        '20',
        '9',
        '2018-10-05 07:01:28',
        '2018-10-05 11:07:06'
    );

INSERT INTO `dados`
VALUES (
        '713',
        '22',
        '9',
        '2018-10-05 07:01:44',
        '2018-10-05 11:05:21'
    );

INSERT INTO `dados`
VALUES (
        '714',
        '215',
        '9',
        '2018-10-05 07:02:07',
        '2018-10-05 11:01:38'
    );

INSERT INTO `dados`
VALUES (
        '715',
        '297',
        '9',
        '2018-10-05 07:05:03',
        null
    );

INSERT INTO `dados`
VALUES (
        '716',
        '82',
        '9',
        '2018-10-05 07:05:17',
        '2018-10-05 11:06:56'
    );

INSERT INTO `dados`
VALUES (
        '717',
        '75',
        '9',
        '2018-10-05 07:05:28',
        '2018-10-05 11:02:26'
    );

INSERT INTO `dados`
VALUES (
        '718',
        '370',
        '9',
        '2018-10-05 07:05:40',
        '2018-10-05 11:20:46'
    );

INSERT INTO `dados`
VALUES (
        '719',
        '118',
        '9',
        '2018-10-05 07:05:51',
        '2018-10-05 11:04:20'
    );

INSERT INTO `dados`
VALUES (
        '720',
        '280',
        '9',
        '2018-10-05 07:06:04',
        '2018-10-05 11:11:10'
    );

INSERT INTO `dados`
VALUES (
        '721',
        '237',
        '9',
        '2018-10-05 07:06:19',
        '2018-10-05 11:00:51'
    );

INSERT INTO `dados`
VALUES (
        '722',
        '24',
        '9',
        '2018-10-05 07:06:20',
        '2018-10-05 11:04:51'
    );

INSERT INTO `dados`
VALUES (
        '723',
        '90',
        '9',
        '2018-10-05 07:06:32',
        '2018-10-05 11:04:41'
    );

INSERT INTO `dados`
VALUES (
        '724',
        '147',
        '9',
        '2018-10-05 07:06:32',
        '2018-10-05 11:01:58'
    );

INSERT INTO `dados`
VALUES (
        '725',
        '21',
        '9',
        '2018-10-05 07:06:42',
        '2018-10-05 11:04:34'
    );

INSERT INTO `dados`
VALUES (
        '726',
        '210',
        '9',
        '2018-10-05 07:06:46',
        '2018-10-05 11:28:33'
    );

INSERT INTO `dados`
VALUES (
        '727',
        '132',
        '9',
        '2018-10-05 07:06:58',
        '2018-10-05 11:19:11'
    );

INSERT INTO `dados`
VALUES (
        '728',
        '221',
        '9',
        '2018-10-05 07:07:02',
        '2018-10-05 11:18:03'
    );

INSERT INTO `dados`
VALUES (
        '729',
        '9',
        '9',
        '2018-10-05 07:07:21',
        null
    );

INSERT INTO `dados`
VALUES (
        '730',
        '36',
        '9',
        '2018-10-05 07:07:27',
        null
    );

INSERT INTO `dados`
VALUES (
        '731',
        '188',
        '9',
        '2018-10-05 07:08:21',
        null
    );

INSERT INTO `dados`
VALUES (
        '732',
        '96',
        '9',
        '2018-10-05 07:08:34',
        null
    );

INSERT INTO `dados`
VALUES (
        '733',
        '248',
        '9',
        '2018-10-05 07:08:40',
        '2018-10-05 11:25:37'
    );

INSERT INTO `dados`
VALUES (
        '734',
        '92',
        '9',
        '2018-10-05 07:08:44',
        '2018-10-05 11:05:13'
    );

INSERT INTO `dados`
VALUES (
        '735',
        '19',
        '9',
        '2018-10-05 07:08:53',
        '2018-10-05 11:05:30'
    );

INSERT INTO `dados`
VALUES (
        '736',
        '16',
        '9',
        '2018-10-05 07:09:00',
        '2018-10-05 11:02:58'
    );

INSERT INTO `dados`
VALUES (
        '737',
        '83',
        '9',
        '2018-10-05 07:09:02',
        '2018-10-05 11:05:38'
    );

INSERT INTO `dados`
VALUES (
        '738',
        '245',
        '9',
        '2018-10-05 07:09:18',
        '2018-10-05 11:00:44'
    );

INSERT INTO `dados`
VALUES (
        '739',
        '15',
        '9',
        '2018-10-05 07:11:16',
        '2018-10-05 11:09:17'
    );

INSERT INTO `dados`
VALUES (
        '740',
        '153',
        '9',
        '2018-10-05 07:12:13',
        null
    );

INSERT INTO `dados`
VALUES (
        '741',
        '285',
        '9',
        '2018-10-05 07:12:34',
        null
    );

INSERT INTO `dados`
VALUES (
        '742',
        '382',
        '9',
        '2018-10-05 07:12:44',
        null
    );

INSERT INTO `dados`
VALUES (
        '743',
        '381',
        '9',
        '2018-10-05 07:12:56',
        '2018-10-05 11:22:09'
    );

INSERT INTO `dados`
VALUES (
        '744',
        '289',
        '9',
        '2018-10-05 07:13:01',
        '2018-10-05 11:05:51'
    );

INSERT INTO `dados`
VALUES (
        '745',
        '79',
        '9',
        '2018-10-05 07:13:17',
        '2018-10-05 11:11:08'
    );

INSERT INTO `dados`
VALUES (
        '746',
        '41',
        '9',
        '2018-10-05 07:14:58',
        '2018-10-05 11:09:35'
    );

INSERT INTO `dados`
VALUES (
        '747',
        '47',
        '9',
        '2018-10-05 07:15:15',
        '2018-10-05 11:09:50'
    );

INSERT INTO `dados`
VALUES (
        '748',
        '181',
        '9',
        '2018-10-05 07:20:33',
        '2018-10-05 11:19:22'
    );

INSERT INTO `dados`
VALUES (
        '749',
        '257',
        '9',
        '2018-10-05 07:20:51',
        '2018-10-05 11:22:00'
    );

INSERT INTO `dados`
VALUES (
        '750',
        '38',
        '9',
        '2018-10-05 07:23:34',
        '2018-10-05 11:04:35'
    );

INSERT INTO `dados`
VALUES (
        '751',
        '163',
        '9',
        '2018-10-05 07:24:55',
        null
    );

INSERT INTO `dados`
VALUES (
        '752',
        '156',
        '9',
        '2018-10-05 07:30:12',
        null
    );

INSERT INTO `dados`
VALUES (
        '753',
        '276',
        '9',
        '2018-10-05 07:30:22',
        '2018-10-05 11:02:22'
    );

INSERT INTO `dados`
VALUES (
        '754',
        '383',
        '9',
        '2018-10-05 07:31:00',
        null
    );

INSERT INTO `dados`
VALUES (
        '755',
        '43',
        '9',
        '2018-10-05 07:31:06',
        '2018-10-05 11:03:39'
    );

INSERT INTO `dados`
VALUES (
        '756',
        '30',
        '9',
        '2018-10-05 07:39:08',
        null
    );

INSERT INTO `dados`
VALUES (
        '757',
        '27',
        '9',
        '2018-10-05 07:39:38',
        '2018-10-05 11:25:28'
    );

INSERT INTO `dados`
VALUES (
        '758',
        '115',
        '9',
        '2018-10-05 07:41:15',
        '2018-10-05 11:03:54'
    );

INSERT INTO `dados`
VALUES (
        '759',
        '26',
        '9',
        '2018-10-05 07:50:56',
        '2018-10-05 11:25:12'
    );

INSERT INTO `dados`
VALUES (
        '760',
        '54',
        '9',
        null,
        '2018-10-05 11:03:06'
    );

INSERT INTO `dados`
VALUES (
        '761',
        '4',
        '9',
        null,
        '2018-10-05 11:06:02'
    );

INSERT INTO `dados`
VALUES (
        '762',
        '50',
        '9',
        null,
        '2018-10-05 11:07:51'
    );

INSERT INTO `dados`
VALUES (
        '763',
        '49',
        '9',
        null,
        '2018-10-05 11:08:12'
    );

INSERT INTO `dados`
VALUES (
        '764',
        '39',
        '9',
        null,
        '2018-10-05 11:08:23'
    );

INSERT INTO `dados`
VALUES (
        '765',
        '64',
        '9',
        null,
        '2018-10-05 11:09:06'
    );

INSERT INTO `dados`
VALUES (
        '766',
        '191',
        '10',
        '2018-10-05 12:33:53',
        null
    );

INSERT INTO `dados`
VALUES (
        '767',
        '200',
        '10',
        '2018-10-05 12:34:10',
        null
    );

INSERT INTO `dados`
VALUES (
        '768',
        '304',
        '10',
        '2018-10-05 12:34:21',
        null
    );

INSERT INTO `dados`
VALUES (
        '769',
        '380',
        '10',
        '2018-10-05 12:34:36',
        '2018-10-05 16:38:28'
    );

INSERT INTO `dados`
VALUES (
        '770',
        '45',
        '10',
        '2018-10-05 12:34:46',
        '2018-10-05 16:42:33'
    );

INSERT INTO `dados`
VALUES (
        '771',
        '281',
        '10',
        '2018-10-05 12:34:57',
        '2018-10-05 16:34:07'
    );

INSERT INTO `dados`
VALUES (
        '772',
        '282',
        '10',
        '2018-10-05 12:35:13',
        '2018-10-05 16:38:18'
    );

INSERT INTO `dados`
VALUES (
        '773',
        '296',
        '10',
        '2018-10-05 12:35:28',
        '2018-10-05 16:30:44'
    );

INSERT INTO `dados`
VALUES (
        '774',
        '7',
        '10',
        '2018-10-05 12:35:40',
        '2018-10-05 16:45:06'
    );

INSERT INTO `dados`
VALUES (
        '775',
        '167',
        '10',
        '2018-10-05 12:35:47',
        '2018-10-05 16:49:02'
    );

INSERT INTO `dados`
VALUES (
        '776',
        '91',
        '10',
        '2018-10-05 12:35:59',
        '2018-10-05 16:41:44'
    );

INSERT INTO `dados`
VALUES (
        '777',
        '101',
        '10',
        '2018-10-05 12:36:25',
        '2018-10-05 16:42:21'
    );

INSERT INTO `dados`
VALUES (
        '778',
        '344',
        '10',
        '2018-10-05 12:36:40',
        '2018-10-05 16:31:42'
    );

INSERT INTO `dados`
VALUES (
        '779',
        '145',
        '10',
        '2018-10-05 12:37:00',
        '2018-10-05 16:31:27'
    );

INSERT INTO `dados`
VALUES (
        '780',
        '300',
        '10',
        '2018-10-05 12:37:14',
        '2018-10-05 16:31:32'
    );

INSERT INTO `dados`
VALUES (
        '781',
        '116',
        '10',
        '2018-10-05 12:37:52',
        null
    );

INSERT INTO `dados`
VALUES (
        '782',
        '242',
        '10',
        '2018-10-05 12:38:08',
        null
    );

INSERT INTO `dados`
VALUES (
        '783',
        '113',
        '10',
        '2018-10-05 12:38:24',
        null
    );

INSERT INTO `dados`
VALUES (
        '784',
        '110',
        '10',
        '2018-10-05 12:38:49',
        '2018-10-05 16:31:16'
    );

INSERT INTO `dados`
VALUES (
        '785',
        '132',
        '10',
        '2018-10-05 12:38:58',
        '2018-10-05 16:34:38'
    );

INSERT INTO `dados`
VALUES (
        '786',
        '280',
        '10',
        '2018-10-05 12:39:12',
        null
    );

INSERT INTO `dados`
VALUES (
        '787',
        '131',
        '10',
        '2018-10-05 12:39:34',
        '2018-10-05 16:47:40'
    );

INSERT INTO `dados`
VALUES (
        '788',
        '163',
        '10',
        '2018-10-05 12:40:27',
        '2018-10-05 16:32:07'
    );

INSERT INTO `dados`
VALUES (
        '789',
        '118',
        '10',
        '2018-10-05 12:40:34',
        '2018-10-05 16:32:33'
    );

INSERT INTO `dados`
VALUES (
        '790',
        '115',
        '10',
        '2018-10-05 12:40:48',
        '2018-10-05 16:33:23'
    );

INSERT INTO `dados`
VALUES (
        '791',
        '117',
        '10',
        '2018-10-05 12:44:39',
        '2018-10-05 16:31:14'
    );

INSERT INTO `dados`
VALUES (
        '792',
        '188',
        '10',
        '2018-10-05 12:44:50',
        null
    );

INSERT INTO `dados`
VALUES (
        '793',
        '16',
        '10',
        '2018-10-05 12:50:44',
        null
    );

INSERT INTO `dados`
VALUES (
        '794',
        '69',
        '10',
        '2018-10-05 12:50:47',
        null
    );

INSERT INTO `dados`
VALUES (
        '795',
        '25',
        '10',
        '2018-10-05 12:54:48',
        '2018-10-05 17:21:16'
    );

INSERT INTO `dados`
VALUES (
        '796',
        '108',
        '10',
        '2018-10-05 12:57:07',
        null
    );

INSERT INTO `dados`
VALUES (
        '797',
        '92',
        '10',
        '2018-10-05 13:01:20',
        '2018-10-05 16:46:45'
    );

INSERT INTO `dados`
VALUES (
        '798',
        '289',
        '10',
        '2018-10-05 13:01:33',
        '2018-10-05 16:31:09'
    );

INSERT INTO `dados`
VALUES (
        '799',
        '140',
        '10',
        '2018-10-05 13:02:39',
        '2018-10-05 16:48:13'
    );

INSERT INTO `dados`
VALUES (
        '800',
        '98',
        '10',
        '2018-10-05 13:02:47',
        '2018-10-05 16:48:26'
    );

INSERT INTO `dados`
VALUES (
        '801',
        '141',
        '10',
        '2018-10-05 13:02:52',
        '2018-10-05 16:48:02'
    );

INSERT INTO `dados`
VALUES (
        '802',
        '13',
        '10',
        '2018-10-05 13:04:04',
        '2018-10-05 16:34:43'
    );

INSERT INTO `dados`
VALUES (
        '803',
        '298',
        '10',
        '2018-10-05 13:04:17',
        '2018-10-05 16:31:28'
    );

INSERT INTO `dados`
VALUES (
        '804',
        '122',
        '10',
        '2018-10-05 13:04:17',
        null
    );

INSERT INTO `dados`
VALUES (
        '805',
        '112',
        '10',
        '2018-10-05 13:04:28',
        '2018-10-05 16:47:46'
    );

INSERT INTO `dados`
VALUES (
        '806',
        '172',
        '10',
        '2018-10-05 13:04:33',
        '2018-10-05 16:30:19'
    );

INSERT INTO `dados`
VALUES (
        '807',
        '63',
        '10',
        '2018-10-05 13:04:41',
        '2018-10-05 16:44:58'
    );

INSERT INTO `dados`
VALUES (
        '808',
        '160',
        '10',
        '2018-10-05 13:04:46',
        '2018-10-05 17:04:00'
    );

INSERT INTO `dados`
VALUES (
        '809',
        '77',
        '10',
        '2018-10-05 13:04:56',
        '2018-10-05 16:48:41'
    );

INSERT INTO `dados`
VALUES (
        '810',
        '309',
        '10',
        '2018-10-05 13:04:56',
        '2018-10-05 17:04:06'
    );

INSERT INTO `dados`
VALUES (
        '811',
        '19',
        '10',
        '2018-10-05 13:05:48',
        '2018-10-05 16:45:26'
    );

INSERT INTO `dados`
VALUES (
        '812',
        '215',
        '10',
        '2018-10-05 13:06:10',
        '2018-10-05 17:22:39'
    );

INSERT INTO `dados`
VALUES (
        '813',
        '147',
        '10',
        '2018-10-05 13:08:21',
        '2018-10-05 17:22:17'
    );

INSERT INTO `dados`
VALUES (
        '814',
        '222',
        '10',
        '2018-10-05 13:13:19',
        '2018-10-05 16:30:51'
    );

INSERT INTO `dados`
VALUES (
        '815',
        '220',
        '10',
        '2018-10-05 13:13:19',
        '2018-10-05 16:30:32'
    );

INSERT INTO `dados`
VALUES (
        '816',
        '343',
        '10',
        '2018-10-05 13:17:18',
        '2018-10-05 16:30:37'
    );

INSERT INTO `dados`
VALUES (
        '817',
        '236',
        '10',
        '2018-10-05 13:17:28',
        '2018-10-05 16:48:52'
    );

INSERT INTO `dados`
VALUES (
        '818',
        '305',
        '10',
        '2018-10-05 13:20:14',
        null
    );

INSERT INTO `dados`
VALUES (
        '819',
        '302',
        '10',
        '2018-10-05 13:20:18',
        null
    );

INSERT INTO `dados`
VALUES (
        '820',
        '306',
        '10',
        '2018-10-05 13:20:25',
        null
    );

INSERT INTO `dados`
VALUES (
        '821',
        '4',
        '10',
        '2018-10-05 13:21:56',
        '2018-10-05 16:45:47'
    );

INSERT INTO `dados`
VALUES (
        '822',
        '152',
        '10',
        '2018-10-05 13:26:56',
        '2018-10-05 16:42:04'
    );

INSERT INTO `dados`
VALUES (
        '823',
        '229',
        '10',
        '2018-10-05 13:31:16',
        '2018-10-05 16:30:11'
    );

INSERT INTO `dados`
VALUES (
        '824',
        '55',
        '10',
        '2018-10-05 13:33:19',
        '2018-10-05 16:31:24'
    );

INSERT INTO `dados`
VALUES (
        '825',
        '43',
        '10',
        '2018-10-05 13:33:21',
        '2018-10-05 16:32:18'
    );

INSERT INTO `dados`
VALUES (
        '826',
        '162',
        '10',
        '2018-10-05 13:36:55',
        '2018-10-05 16:31:03'
    );

INSERT INTO `dados`
VALUES (
        '827',
        '100',
        '10',
        null,
        '2018-10-05 16:30:25'
    );

INSERT INTO `dados`
VALUES (
        '828',
        '176',
        '10',
        null,
        '2018-10-05 16:30:48'
    );

INSERT INTO `dados`
VALUES (
        '829',
        '38',
        '10',
        null,
        '2018-10-05 16:30:59'
    );

INSERT INTO `dados`
VALUES (
        '830',
        '73',
        '10',
        null,
        '2018-10-05 16:36:36'
    );

INSERT INTO `dados`
VALUES (
        '831',
        '74',
        '10',
        null,
        '2018-10-05 16:36:52'
    );

INSERT INTO `dados`
VALUES (
        '832',
        '149',
        '10',
        null,
        '2018-10-05 16:41:48'
    );

INSERT INTO `dados`
VALUES (
        '833',
        '28',
        '10',
        null,
        '2018-10-05 16:45:15'
    );

INSERT INTO `dados`
VALUES (
        '834',
        '276',
        '10',
        null,
        '2018-10-05 17:20:57'
    );

INSERT INTO `dados`
VALUES (
        '835',
        '1',
        '11',
        '2019-05-01 14:47:11',
        null
    );

-- ----------------------------

-- Table structure for `horarios`

-- ----------------------------

DROP TABLE IF EXISTS `horarios`;

CREATE TABLE
    `horarios` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `evento` varchar(45) NOT NULL,
        `data` date NOT NULL,
        `checkin_inicio` time NOT NULL,
        `checkin_final` time NOT NULL,
        `checkout_inicio` time NOT NULL,
        `checkout_final` time NOT NULL,
        PRIMARY KEY (`id`)
    ) ENGINE = InnoDB AUTO_INCREMENT = 12 DEFAULT CHARSET = utf8;

-- ----------------------------

-- Records of horarios

-- ----------------------------

INSERT INTO `horarios`
VALUES (
        '1',
        'SC&T - Segunda-feira - Tarde',
        '2018-10-01',
        '12:00:00',
        '13:50:00',
        '17:00:00',
        '19:00:00'
    );

INSERT INTO `horarios`
VALUES (
        '2',
        'SC&T - Segunda-feira - Noite',
        '2018-10-01',
        '18:30:00',
        '20:00:00',
        '20:40:00',
        '23:30:30'
    );

INSERT INTO `horarios`
VALUES (
        '3',
        'SC&T - Terça-feira - Manhã ',
        '2018-10-02',
        '07:30:00',
        '09:00:00',
        '11:00:00',
        '12:00:00'
    );

INSERT INTO `horarios`
VALUES (
        '4',
        'SC&T - Terça-feira - Tarde',
        '2018-10-02',
        '12:40:00',
        '13:55:00',
        '16:30:00',
        '18:00:00'
    );

INSERT INTO `horarios`
VALUES (
        '5',
        'SC&T - Quarta-feira - Manhã',
        '2018-10-03',
        '07:30:00',
        '09:00:00',
        '11:00:00',
        '12:00:00'
    );

INSERT INTO `horarios`
VALUES (
        '6',
        'SC&T - Quarta-feira - Tarde',
        '2018-10-03',
        '12:30:00',
        '13:45:00',
        '16:30:00',
        '18:30:00'
    );

INSERT INTO `horarios`
VALUES (
        '7',
        'SC&T - Quinta-feira - Manhã',
        '2018-10-04',
        '06:30:00',
        '08:00:00',
        '10:30:00',
        '12:00:00'
    );

INSERT INTO `horarios`
VALUES (
        '8',
        'SC&T - Quinta-feira - Tarde',
        '2018-10-04',
        '12:30:00',
        '14:00:00',
        '16:30:00',
        '18:30:00'
    );

INSERT INTO `horarios`
VALUES (
        '9',
        'SC&T - Sexta-feira - Manhã',
        '2018-10-05',
        '06:40:00',
        '08:00:00',
        '11:00:00',
        '12:00:00'
    );

INSERT INTO `horarios`
VALUES (
        '10',
        'SC&T - Sexta-feira - Tarde',
        '2018-10-05',
        '12:30:00',
        '14:00:00',
        '16:30:00',
        '18:30:00'
    );

INSERT INTO `horarios`
VALUES (
        '11',
        'SC&T - Segunda-feira - Tarde',
        '2019-05-01',
        '14:00:00',
        '15:30:00',
        '16:30:00',
        '18:30:00'
    );

-- ----------------------------

-- Table structure for `participantes`

-- ----------------------------

DROP TABLE IF EXISTS `participantes`;

CREATE TABLE
    `participantes` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `nome` varchar(45) NOT NULL,
        `ra` varchar(7) DEFAULT NULL,
        PRIMARY KEY (`id`)
    ) ENGINE = InnoDB AUTO_INCREMENT = 386 DEFAULT CHARSET = utf8;

-- ----------------------------

-- Records of participantes

-- ----------------------------

INSERT INTO `participantes`
VALUES (
        '1',
        'Maria Aparecida Serafim Bezerra',
        null
    );

INSERT INTO `participantes`
VALUES (
        '2',
        'MILENE NAMI MAEDA',
        '014399'
    );

INSERT INTO `participantes`
VALUES (
        '3',
        'ISABELLA TOSTA BENITES',
        '014409'
    );

INSERT INTO `participantes`
VALUES (
        '4',
        'THALIA RAQUEL ROQUE RAMIREZ',
        '008394'
    );

INSERT INTO `participantes`
VALUES (
        '5',
        'BRUNA IFRAN DE FREITAS',
        '014501'
    );

INSERT INTO `participantes`
VALUES (
        '6',
        'JOAO VICTOR MESSAS DA ROCHA',
        '014525'
    );

INSERT INTO `participantes`
VALUES (
        '7',
        'ALLAN RODRIGO CACERES GAMARRA',
        '024754'
    );

INSERT INTO `participantes`
VALUES (
        '8',
        'EMANUELE MARIAN',
        '024882'
    );

INSERT INTO `participantes`
VALUES (
        '9',
        'GABRIELA VERAO DE ALMEIDA FARIAS',
        '024933'
    );

INSERT INTO `participantes`
VALUES (
        '10',
        'KAROLINE DE ALMEIDA MACEDO',
        '024934'
    );

INSERT INTO `participantes`
VALUES (
        '11',
        'MI HWA MIRNA DA SILVA',
        '005451'
    );

INSERT INTO `participantes`
VALUES (
        '12',
        'MI SON KARINE PASSOS DA SILVA',
        '008282'
    );

INSERT INTO `participantes`
VALUES (
        '13',
        'MILENA BEATRIZ PEREIRA FERRO',
        '017408'
    );

INSERT INTO `participantes`
VALUES (
        '14',
        'CHRISTIAN EMANUEL CRISTALDO VILHALBA',
        '017424'
    );

INSERT INTO `participantes`
VALUES (
        '15',
        'LAUZEZIO SOUZA BARCELOS NETO',
        '014532'
    );

INSERT INTO `participantes`
VALUES (
        '16',
        'JOICE BEATRIZ PAIM SANCHEZ',
        '017291'
    );

INSERT INTO `participantes`
VALUES (
        '17',
        'ARIANNY CASTRO GONCALVES',
        '024883'
    );

INSERT INTO `participantes`
VALUES (
        '18',
        'MARCIO GABRIEL DA SILVA ESTEVAM',
        '014540'
    );

INSERT INTO `participantes`
VALUES (
        '19',
        'IGOR DANIEL PEREIRA DE OLIVEIRA',
        '017411'
    );

INSERT INTO `participantes`
VALUES (
        '20',
        'MANUELA MACENA DOS SANTOS',
        '018214'
    );

INSERT INTO `participantes` VALUES ('21', 'RAFAEL CABRAL', '017362');

INSERT INTO `participantes`
VALUES (
        '22',
        'EDUARDO RODRIGUES JUNIOR',
        '017387'
    );

INSERT INTO `participantes`
VALUES (
        '23',
        'VINICIUS DUARTE ANTENOR',
        '014541'
    );

INSERT INTO `participantes`
VALUES (
        '24',
        'JOAO MARCOS SAYAO DE OLIVEIRA CORREA',
        '017277'
    );

INSERT INTO `participantes`
VALUES (
        '25',
        'CARLA MENDOZA BOGADO',
        '017367'
    );

INSERT INTO `participantes`
VALUES (
        '26',
        'RAFAELA RUIZ MACHADO',
        '014484'
    );

INSERT INTO `participantes`
VALUES (
        '27',
        'ALEXANDRE SARACHO CAPO',
        '014490'
    );

INSERT INTO `participantes`
VALUES (
        '28',
        'LUIS HENRIQUE MARTINEZ DE MELO',
        '014539'
    );

INSERT INTO `participantes`
VALUES (
        '29',
        'RICARDO APARECIDO ALVES CHAVES',
        '014219'
    );

INSERT INTO `participantes`
VALUES (
        '30',
        'MIRIAM GRAZIELA PAVON SANGUINA',
        '014479'
    );

INSERT INTO `participantes`
VALUES (
        '31',
        'JULIANE CRISTINA LUI LOPES',
        '014529'
    );

INSERT INTO `participantes`
VALUES (
        '32',
        'LUCAS BARBOSA RIBEIRO',
        '014426'
    );

INSERT INTO `participantes`
VALUES (
        '33',
        'CAMILA ORTIZ DORNELES',
        '014211'
    );

INSERT INTO `participantes`
VALUES (
        '34',
        'MAIRA BREINAIDER RUSSO',
        '024846'
    );

INSERT INTO `participantes`
VALUES (
        '35',
        'DANILO RODRIGUES DA SILVA',
        '008247'
    );

INSERT INTO `participantes`
VALUES (
        '36',
        'CAMILA RODRIGUES BATISTA',
        '025349'
    );

INSERT INTO `participantes`
VALUES (
        '37',
        'KARIN LOPES FERREIRA',
        '025619'
    );

INSERT INTO `participantes`
VALUES (
        '38',
        'MARIA LEONOR ENCINA PINAZO',
        '014363'
    );

INSERT INTO `participantes`
VALUES (
        '39',
        'GABRIELY VILHALVA MENDONCA',
        '014518'
    );

INSERT INTO `participantes`
VALUES (
        '40',
        'BRUNO GLOMBOWSKY NETO',
        '014207'
    );

INSERT INTO `participantes`
VALUES (
        '41',
        'LARISSA VITÓRIA VAZQUEZ VALENZUELA',
        '024831'
    );

INSERT INTO `participantes`
VALUES (
        '42',
        'MARCOS VINICIUS PAVON NIZ',
        '024848'
    );

INSERT INTO `participantes`
VALUES (
        '43',
        'RODRIGO GABRIEL GALEANO DA SILVA',
        '014365'
    );

INSERT INTO `participantes`
VALUES (
        '44',
        'LAION RAMOS ORTIZ',
        '014427'
    );

INSERT INTO `participantes`
VALUES (
        '45',
        'PAULO VITOR DOS SANTOS DELEON',
        '024936'
    );

INSERT INTO `participantes`
VALUES (
        '46',
        'REYNALDO ABEL CARBALLAR DA COSTA',
        '014304'
    );

INSERT INTO `participantes`
VALUES (
        '47',
        'NAYADE LIZETH CRISTALDO MARQUES',
        '024970'
    );

INSERT INTO `participantes`
VALUES (
        '48',
        'DAVI ENRIQUE ESPINOLA RODRIGUES',
        '014514'
    );

INSERT INTO `participantes`
VALUES (
        '49',
        'JOAO GUILHERME DUTRA CLARO',
        '014520'
    );

INSERT INTO `participantes`
VALUES (
        '50',
        'LETICIA HANSEN HORST',
        '014534'
    );

INSERT INTO `participantes`
VALUES (
        '51',
        'MARIA CAROLINA GOMES KLEINE',
        '024847'
    );

INSERT INTO `participantes`
VALUES (
        '52',
        'JOAO ANTONIO GONCALVES MARTINEZ',
        '014384'
    );

INSERT INTO `participantes` VALUES ('53', 'LUCAS MARTINS', '014425');

INSERT INTO `participantes`
VALUES (
        '54',
        'IGOR GABRIEL GODOY MARECO',
        '014291'
    );

INSERT INTO `participantes`
VALUES (
        '55',
        'RENATO EUBANK DE ALMEIDA',
        '014361'
    );

INSERT INTO `participantes`
VALUES (
        '56',
        'AMANDA DE SOUZA FERREIRA',
        '014493'
    );

INSERT INTO `participantes`
VALUES (
        '57',
        'MELISSA GALEANO PARREIRA',
        '014387'
    );

INSERT INTO `participantes`
VALUES (
        '58',
        'RAFAEL CERESER VILHAR',
        '014377'
    );

INSERT INTO `participantes`
VALUES (
        '59',
        'CARLOS AUGUSTO VIEIRA CONRADO',
        '014270'
    );

INSERT INTO `participantes`
VALUES (
        '60',
        'Bruna dos Santos Paes',
        null
    );

INSERT INTO `participantes` VALUES ('61', 'SYU SIAO YIN', '014221');

INSERT INTO `participantes`
VALUES (
        '62',
        'VINICIUS AGUILERA VAREIRO',
        '014498'
    );

INSERT INTO `participantes`
VALUES (
        '63',
        'WILLIAN DUTRA PEREIRA',
        '014545'
    );

INSERT INTO `participantes`
VALUES (
        '64',
        'ELTON ACOSTA CABREIRA',
        '014480'
    );

INSERT INTO `participantes`
VALUES (
        '65',
        'RODOLFO WOLFGANG DE ALMEIDA REICHARDT',
        '018076'
    );

INSERT INTO `participantes`
VALUES (
        '66',
        'FERNANDO FABIO MARTINS GONCALVES',
        '024865'
    );

INSERT INTO `participantes`
VALUES (
        '67',
        'Lorrayne Rodrigues Gimenes',
        null
    );

INSERT INTO `participantes`
VALUES (
        '68',
        'GEOVANNA GUERREIRO COINETE',
        '017891'
    );

INSERT INTO `participantes`
VALUES (
        '69',
        'GUILHERME SOUZA BARCELO',
        '017258'
    );

INSERT INTO `participantes`
VALUES (
        '70',
        'IGOR RAMAO REBELO ZAHLER',
        '017329'
    );

INSERT INTO `participantes`
VALUES (
        '71',
        'LUAN GONCALVES DE OLIVEIRA',
        '017319'
    );

INSERT INTO `participantes`
VALUES (
        '72',
        'ANA CLARA CERZOSIMO DERZI',
        '014497'
    );

INSERT INTO `participantes`
VALUES (
        '73',
        'TIAGO KENDI HOTTA COLMAN',
        '017320'
    );

INSERT INTO `participantes`
VALUES (
        '74',
        'CLARICE GABRIELA LEAO MARTINZ',
        '017267'
    );

INSERT INTO `participantes`
VALUES (
        '75',
        'RONALDO GONCALVES DE SOUZA',
        '017377'
    );

INSERT INTO `participantes`
VALUES (
        '76',
        'ANA CLAUDIA OLARTECHEA VERON',
        '008234'
    );

INSERT INTO `participantes`
VALUES (
        '77',
        'EMANUELE CAMILE MATTOSO ACOSTA',
        '008589'
    );

INSERT INTO `participantes`
VALUES (
        '78',
        'SAMARA OLARTECHEA VERON',
        '017371'
    );

INSERT INTO `participantes`
VALUES (
        '79',
        'ESTEFANI ARCE AGUAYO',
        '017331'
    );

INSERT INTO `participantes`
VALUES (
        '80',
        'LUCAS CRESPO RECALDE',
        '017306'
    );

INSERT INTO `participantes`
VALUES (
        '81',
        'ANDERSON ALVES DA CUNHA',
        '025401'
    );

INSERT INTO `participantes`
VALUES (
        '82',
        'KETHELYN RODRIGUES SANTOS',
        '017287'
    );

INSERT INTO `participantes`
VALUES (
        '83',
        'ALINE GONZALES SILVA',
        '017261'
    );

INSERT INTO `participantes`
VALUES (
        '84',
        'RAIANE SANTOS FUCHS',
        '017372'
    );

INSERT INTO `participantes`
VALUES (
        '85',
        'GABRIELA PASSONE KIELING',
        '017883'
    );

INSERT INTO `participantes`
VALUES (
        '86',
        'DANIEL DE SOUZA BAPTISTA',
        '025328'
    );

INSERT INTO `participantes`
VALUES (
        '87',
        'SHIRLEI ACOSTA CABREIRA',
        '014482'
    );

INSERT INTO `participantes`
VALUES (
        '88',
        'GISLAINE DUARTE GALEANO',
        '026023'
    );

INSERT INTO `participantes`
VALUES (
        '89',
        'IASMIN DE CASSIA URBIETA GONZALES',
        '024889'
    );

INSERT INTO `participantes`
VALUES (
        '90',
        'VICTOR HUGO YOSHIHARU OGAWA',
        '017395'
    );

INSERT INTO `participantes`
VALUES (
        '91',
        'LUCAS VENDITE MACEDO',
        '025429'
    );

INSERT INTO `participantes`
VALUES (
        '92',
        'MARIA EDUARDA LOPES DE SOUZA',
        '024901'
    );

INSERT INTO `participantes`
VALUES (
        '93',
        'ISABELLE DOS SANTOS RODRIGUES',
        '025244'
    );

INSERT INTO `participantes`
VALUES (
        '94',
        'JOÃO VITOR BRANDÃO REIS SALDANHA',
        '025543'
    );

INSERT INTO `participantes`
VALUES (
        '95',
        'EDSON MATHEUS HAAS',
        '024962'
    );

INSERT INTO `participantes`
VALUES (
        '96',
        'RAFAELA SOUZA E SOUZA',
        '024908'
    );

INSERT INTO `participantes`
VALUES (
        '97',
        'EDUARDA SARAVY AJALA',
        '025327'
    );

INSERT INTO `participantes`
VALUES (
        '98',
        'THAISSA GONZALEZ CARVALLO',
        '025582'
    );

INSERT INTO `participantes`
VALUES (
        '99',
        'BIANKA RIBEIRO JESUINO',
        '024895'
    );

INSERT INTO `participantes`
VALUES (
        '100',
        'KAUANE DE MATOS GONÇALVES',
        '025613'
    );

INSERT INTO `participantes`
VALUES (
        '101',
        'ROBERTO APARECIDO FERNANDES JUNIOR',
        '024897'
    );

INSERT INTO `participantes`
VALUES (
        '102',
        'JOAO LUCAS DE SOUZA MATOSO',
        '025574'
    );

INSERT INTO `participantes`
VALUES (
        '103',
        'César Henrique Rodrigues',
        null
    );

INSERT INTO `participantes`
VALUES (
        '104',
        'KAUAN BRITES PEREIRA',
        '025620'
    );

INSERT INTO `participantes` VALUES ('105', 'Gabriel Santos', null);

INSERT INTO `participantes`
VALUES (
        '106',
        'Gabriel Reimann Smaniotto',
        null
    );

INSERT INTO `participantes`
VALUES (
        '107',
        'Verania Raquel Flores',
        null
    );

INSERT INTO `participantes`
VALUES (
        '108',
        'JOAO GABRIEL DE MATOS PINHEIRO',
        '025537'
    );

INSERT INTO `participantes`
VALUES (
        '109',
        'BRUNO HENRIQUE CERVANTES COPINI',
        '025273'
    );

INSERT INTO `participantes`
VALUES (
        '110',
        'MARCO ANTONIO AYALA DE MATOS FREITAS',
        '025614'
    );

INSERT INTO `participantes`
VALUES (
        '111',
        'ERIC ANTONIO MEDINA',
        '024870'
    );

INSERT INTO `participantes`
VALUES (
        '112',
        'VITORIA RIVERO SANDOVAL',
        '024838'
    );

INSERT INTO `participantes`
VALUES (
        '113',
        'LEONARDO DE CARVALHO BANG',
        '024904'
    );

INSERT INTO `participantes`
VALUES (
        '114',
        'FILIPE GAMARRA CÁCERES',
        '025242'
    );

INSERT INTO `participantes`
VALUES (
        '115',
        'GABRIEL CAVALHEIRO FREITAS',
        '024974'
    );

INSERT INTO `participantes`
VALUES (
        '116',
        'LUIS FELIPE SALCEDO MOREIRA',
        '024907'
    );

INSERT INTO `participantes`
VALUES (
        '117',
        'PEDRO BATISTA GODOY NETO',
        '024947'
    );

INSERT INTO `participantes`
VALUES (
        '118',
        'GIOVANA ARAUJO KERKHOFF',
        '014404'
    );

INSERT INTO `participantes`
VALUES (
        '119',
        'JEAN CARLOS CORREA LOPES',
        '024784'
    );

INSERT INTO `participantes`
VALUES (
        '120',
        'ALISSON FAGNER VERON RODRIGUES',
        '024973'
    );

INSERT INTO `participantes`
VALUES (
        '121',
        'FLAVIO HENRIQUE PAIVA FERNANDEZ',
        '024948'
    );

INSERT INTO `participantes`
VALUES (
        '122',
        'ALAN MATIAS DA SILVA PERALTA',
        '014268'
    );

INSERT INTO `participantes`
VALUES (
        '123',
        'GIOVANA VALENTINA CARDENAS MARTINEZ',
        '017366'
    );

INSERT INTO `participantes`
VALUES (
        '124',
        'Jenifer Paola Jara Salinas',
        null
    );

INSERT INTO `participantes`
VALUES (
        '125',
        'MICHELI BRITEZ CAVANHA',
        null
    );

INSERT INTO `participantes`
VALUES (
        '126',
        'Bruna Gabrieli Romeiro Rojas',
        null
    );

INSERT INTO `participantes`
VALUES (
        '127',
        'Bruna Rabrieli Romeiro Rojas',
        null
    );

INSERT INTO `participantes`
VALUES (
        '128',
        'MANUELLA ALVES TEIXEIRA',
        '017888'
    );

INSERT INTO `participantes`
VALUES (
        '129',
        'CARLOS RECALDE ZARATE JUNIOR',
        '009968'
    );

INSERT INTO `participantes`
VALUES (
        '130',
        'ALAN DE ANDRADE BARRETO',
        '025878'
    );

INSERT INTO `participantes`
VALUES (
        '131',
        'INGRID FRAGA DA SILVA',
        '024867'
    );

INSERT INTO `participantes`
VALUES (
        '132',
        'MARIA EDUARDA MANGINI DE ARRUDA',
        '024755'
    );

INSERT INTO `participantes`
VALUES (
        '133',
        'MARIANA ROMAN DIAS ANDRADE',
        '025535'
    );

INSERT INTO `participantes` VALUES ('134', 'Franz ', null);

INSERT INTO `participantes`
VALUES (
        '135',
        'THALISON DIEGO DOS SANTOS ROSSO',
        '024938'
    );

INSERT INTO `participantes`
VALUES (
        '136',
        'BRUNO RAFAEL SCHINAIDER DOS SANTOS',
        '017391'
    );

INSERT INTO `participantes`
VALUES (
        '137',
        'VINICIUS ROOSEVELT SANTOS DIAS',
        '017336'
    );

INSERT INTO `participantes`
VALUES (
        '138',
        'MARCIO VINICIUS BISPO DUARTE',
        '020949'
    );

INSERT INTO `participantes`
VALUES (
        '139',
        'LEANDRO SOUZA DE LIMA',
        '024812'
    );

INSERT INTO `participantes`
VALUES (
        '140',
        'BIANCA RICARDI CAIMAR',
        '025302'
    );

INSERT INTO `participantes`
VALUES (
        '141',
        'MARIANA ALICE BENITES BARBOZA',
        '025702'
    );

INSERT INTO `participantes`
VALUES (
        '142',
        'DAVI FLORIANO GONCALVES',
        '017284'
    );

INSERT INTO `participantes`
VALUES (
        '143',
        'ALEXANDRE EIDT FILHO',
        '017885'
    );

INSERT INTO `participantes`
VALUES (
        '144',
        'JENIFER LARROQUE RODRIGUES',
        '017275'
    );

INSERT INTO `participantes`
VALUES (
        '145',
        'GABRIELY LIMA BEZERRA',
        '024860'
    );

INSERT INTO `participantes`
VALUES (
        '146',
        'SILENE TAMIRES BENITES FARINHA',
        '014407'
    );

INSERT INTO `participantes`
VALUES (
        '147',
        'JAMILE SALVATINI FAKIR',
        '017398'
    );

INSERT INTO `participantes`
VALUES (
        '148',
        'SAMARA ATANAGILDO OLIVEIRA',
        '025539'
    );

INSERT INTO `participantes`
VALUES (
        '149',
        'AUGUSTO SOUZA MARQUES',
        '024790'
    );

INSERT INTO `participantes`
VALUES (
        '150',
        'KASSIA SANCHES XAVIER',
        '017427'
    );

INSERT INTO `participantes`
VALUES (
        '151',
        'VINICIUS RODRIGO FREITAS AGUILAR',
        '024923'
    );

INSERT INTO `participantes`
VALUES (
        '152',
        'CRIS LORRAINE ORTELHADO DE BRUM',
        '024944'
    );

INSERT INTO `participantes`
VALUES (
        '153',
        'THAINARA RODRIGUES DE ALENCAR',
        '024919'
    );

INSERT INTO `participantes`
VALUES (
        '154',
        'CHRISTIAN MOREIRA MORESCO',
        '017426'
    );

INSERT INTO `participantes`
VALUES (
        '155',
        'LUCAS MORAES DERZI',
        '017870'
    );

INSERT INTO `participantes`
VALUES (
        '156',
        'LUCAS LOURENCO SILVA',
        '014412'
    );

INSERT INTO `participantes`
VALUES (
        '157',
        'Douglas Viana Barone',
        null
    );

INSERT INTO `participantes`
VALUES (
        '158',
        'NATAN AUGUSTO BRAGA MORAES',
        '025252'
    );

INSERT INTO `participantes`
VALUES (
        '159',
        'MIRIELI BENITES ROLON',
        '024885'
    );

INSERT INTO `participantes`
VALUES (
        '160',
        'JOSE FELIPE DUARTE ANTUNES COLMAN',
        '017393'
    );

INSERT INTO `participantes`
VALUES (
        '161',
        'ANDERSON GUERRERO MILTOS',
        '016415'
    );

INSERT INTO `participantes`
VALUES (
        '162',
        'ROBERT ARIEL SCARPELLINI',
        '017313'
    );

INSERT INTO `participantes`
VALUES (
        '163',
        'CRISTIANO HAAS FRETES',
        '014402'
    );

INSERT INTO `participantes`
VALUES (
        '164',
        'MARCOS VINICIUS FREITAS HERTER',
        '020853'
    );

INSERT INTO `participantes`
VALUES (
        '165',
        'IAN RODRIGUES XAVIER',
        '020856'
    );

INSERT INTO `participantes`
VALUES (
        '166',
        'JULIAN KALEBE XAVIER BATISTA',
        '020791'
    );

INSERT INTO `participantes`
VALUES (
        '167',
        'ANNE YASMIN ORTIZ BRITEZ',
        '024779'
    );

INSERT INTO `participantes`
VALUES (
        '168',
        'GELDA MARIANI FREITAS SARACHO',
        '025321'
    );

INSERT INTO `participantes`
VALUES (
        '169',
        'JOAO LUCAS MANFRIM CENCI',
        '025357'
    );

INSERT INTO `participantes`
VALUES (
        '170',
        'Janaina de Souza Batista',
        null
    );

INSERT INTO `participantes`
VALUES (
        '171',
        'DAVI SOARES MORAES',
        '024977'
    );

INSERT INTO `participantes`
VALUES (
        '172',
        'GEOVANNA QUEIROZ DOS SANTOS',
        '017363'
    );

INSERT INTO `participantes`
VALUES (
        '173',
        'ANA CAROLINA SOARES BATISTA',
        '020944'
    );

INSERT INTO `participantes`
VALUES (
        '174',
        'ELOISA HORST DA SILVA',
        '017839'
    );

INSERT INTO `participantes`
VALUES (
        '175',
        'LUCAS AMARILLA SAUCEDO',
        '017394'
    );

INSERT INTO `participantes`
VALUES (
        '176',
        'ALLAN MORAES CORREA',
        '024972'
    );

INSERT INTO `participantes`
VALUES (
        '177',
        'VERONICA ARGUELLO PETERSEN',
        '014495'
    );

INSERT INTO `participantes`
VALUES (
        '178',
        'BRUNO ALAN OCAMPOS LOPES',
        '017326'
    );

INSERT INTO `participantes`
VALUES (
        '179',
        'CARLOS FABIANO MOREL MARTINEZ',
        '024802'
    );

INSERT INTO `participantes`
VALUES (
        '180',
        'ANTONIO OSCAR VINCLES MARTINEZ MATTOSO',
        '017867'
    );

INSERT INTO `participantes`
VALUES (
        '181',
        'TIAGO MATIAS MOREL SARACHO',
        '017281'
    );

INSERT INTO `participantes`
VALUES (
        '182',
        'ROSANGELA CARDOSO RIOS',
        '025599'
    );

INSERT INTO `participantes`
VALUES (
        '183',
        'BRENDA MARTINS SIQUERI',
        '024796'
    );

INSERT INTO `participantes`
VALUES (
        '184',
        'LUCAS MATEUS DOS SANTOS MACHADO',
        '024851'
    );

INSERT INTO `participantes`
VALUES (
        '185',
        'VICTOR AUGUSTO TEIXEIRA MOTA',
        '024956'
    );

INSERT INTO `participantes`
VALUES (
        '186',
        'GABRIEL HARRY NUNES DOS SANTOS',
        '024963'
    );

INSERT INTO `participantes`
VALUES (
        '187',
        'VITORIA FABIA GARCIA ALVES',
        '024794'
    );

INSERT INTO `participantes`
VALUES (
        '188',
        'LEONARDO ISAAC CELESTE',
        '024910'
    );

INSERT INTO `participantes`
VALUES (
        '189',
        'TAMIRES OLIVEIRA DE ARRUDA',
        '017354'
    );

INSERT INTO `participantes`
VALUES (
        '190',
        'JONATHAN GABRIEL MARTINES INSFRAN',
        '025350'
    );

INSERT INTO `participantes`
VALUES (
        '191',
        'THAMIRES ELOISE PAGAMUNCI',
        '024899'
    );

INSERT INTO `participantes`
VALUES (
        '192',
        'LINDA RAFAELA DA CRUZ NANTES BITENCOURT',
        '024894'
    );

INSERT INTO `participantes`
VALUES (
        '193',
        'JULIANA DIAZ LOPES',
        '024971'
    );

INSERT INTO `participantes`
VALUES (
        '194',
        'Rainier Benitez Freitas Filho',
        null
    );

INSERT INTO `participantes`
VALUES (
        '195',
        'MARLON VENICIUS DE SOUZA',
        '024896'
    );

INSERT INTO `participantes`
VALUES (
        '196',
        'EDUARDO PEREIRA DE SOUZA',
        '017417'
    );

INSERT INTO `participantes`
VALUES (
        '197',
        'VITOR RAFAEL MOURA',
        '014543'
    );

INSERT INTO `participantes`
VALUES (
        '198',
        'ISABELA BERNARDINO RODRIGUES',
        '024950'
    );

INSERT INTO `participantes`
VALUES (
        '199',
        'PAULO VINICIUS BAIOTTO MONTEIRO',
        '017312'
    );

INSERT INTO `participantes`
VALUES (
        '200',
        'ANA JULIA MARQUES SANTANA',
        '024835'
    );

INSERT INTO `participantes`
VALUES (
        '201',
        'MARCO ANTONIO RIOS OLIVER',
        '024772'
    );

INSERT INTO `participantes`
VALUES (
        '202',
        'ERIC GONÇALVES ORTIZ',
        '024964'
    );

INSERT INTO `participantes`
VALUES (
        '203',
        'Jean Barbosa Siqueira',
        null
    );

INSERT INTO `participantes`
VALUES (
        '204',
        'MARISTELA GIMENES RIBAS',
        '014362'
    );

INSERT INTO `participantes`
VALUES (
        '205',
        'NADLA MARTINS ARAUJO',
        '017305'
    );

INSERT INTO `participantes`
VALUES (
        '206',
        'JESSICA PAOLA JARA BENITES',
        '020849'
    );

INSERT INTO `participantes`
VALUES (
        '207',
        'TALITA BARROS MIRANDA',
        '014391'
    );

INSERT INTO `participantes`
VALUES (
        '208',
        'HELOYSE TOURO DE LIMA',
        '025379'
    );

INSERT INTO `participantes`
VALUES (
        '209',
        'GUSTAVO RAFAEL ESPINOLA ARREDONDO',
        '008364'
    );

INSERT INTO `participantes`
VALUES (
        '210',
        'GIULIA RAMIRES NEVES',
        '024758'
    );

INSERT INTO `participantes`
VALUES (
        '211',
        'ISABELA WRUCK BATISTA',
        '008269'
    );

INSERT INTO `participantes`
VALUES (
        '212',
        'VITORIA EDUARDA MACHADO ICASSATTI',
        '014367'
    );

INSERT INTO `participantes`
VALUES (
        '213',
        'LUIS FELIPE GONZALEZ DE LEMOS',
        '024833'
    );

INSERT INTO `participantes`
VALUES (
        '214',
        'GIOVANA KIELING LER',
        '014406'
    );

INSERT INTO `participantes`
VALUES (
        '215',
        'GUSTAVO VARGAS TORRES',
        '017274'
    );

INSERT INTO `participantes`
VALUES (
        '216',
        'DIANA LIZ JIMENEZ ROLAO',
        '008248'
    );

INSERT INTO `participantes`
VALUES (
        '217',
        'MARCO AURELIO FERNANDES IBANHES',
        '014401'
    );

INSERT INTO `participantes`
VALUES (
        '218',
        'FELIPE AZEREDO COUTINHO RODRIGUES',
        '014410'
    );

INSERT INTO `participantes`
VALUES (
        '219',
        'JOSE RODRIGO DUARTE ANTENOR',
        '020748'
    );

INSERT INTO `participantes`
VALUES (
        '220',
        'TAMIRIS FRAGA MARQUES',
        '017401'
    );

INSERT INTO `participantes`
VALUES (
        '221',
        'JOAQUIM DOMINGUES BAZAN',
        '025395'
    );

INSERT INTO `participantes`
VALUES (
        '222',
        'DEBORA RIBAS VIEIRA',
        '020854'
    );

INSERT INTO `participantes`
VALUES (
        '223',
        'JEAN CARLOS MASCARI DINIZ',
        '020943'
    );

INSERT INTO `participantes`
VALUES (
        '224',
        'WILLIAN RODRIGUES DE ALMEIDA',
        '014317'
    );

INSERT INTO `participantes`
VALUES (
        '225',
        'JHON GABRIEL DENIZ OVELAR',
        '014414'
    );

INSERT INTO `participantes`
VALUES (
        '226',
        'GILBERTO ALEXANDRE SOUZA SPERONI',
        '017364'
    );

INSERT INTO `participantes`
VALUES (
        '227',
        'GIOVANI DE OLIVEIRA  SANTOS',
        '017416'
    );

INSERT INTO `participantes`
VALUES (
        '228',
        'DIEGO IZIDRO DE SOUSA GOMES',
        null
    );

INSERT INTO `participantes`
VALUES (
        '229',
        'LUANA NOVAES PEREIRA',
        '017271'
    );

INSERT INTO `participantes`
VALUES (
        '230',
        'Gabrieli Valdez Martins',
        null
    );

INSERT INTO `participantes` VALUES ('231', 'Jennifer paola', null);

INSERT INTO `participantes`
VALUES (
        '232',
        'Ana Letícia Almeida Duarte',
        null
    );

INSERT INTO `participantes`
VALUES (
        '233',
        'Maria Cecilia Gaona',
        null
    );

INSERT INTO `participantes`
VALUES (
        '234',
        'BEATRIZ OLIVEIRA ABRAHAO',
        '014366'
    );

INSERT INTO `participantes`
VALUES (
        '235',
        'PEDRO LUCAS PADILHA DE JESUS',
        '024759'
    );

INSERT INTO `participantes`
VALUES (
        '236',
        'THIAGO VERDI MATOS',
        '025580'
    );

INSERT INTO `participantes`
VALUES (
        '237',
        'ABRAAO RODRIGUES DE LIMA WINCKLER BENITES',
        '014388'
    );

INSERT INTO `participantes`
VALUES (
        '238',
        'DANIEL SCHNEIDER',
        '024763'
    );

INSERT INTO `participantes`
VALUES (
        '239',
        'DANIEL GONCALVES CAMARGO',
        '003432'
    );

INSERT INTO `participantes`
VALUES (
        '240',
        'Taiane Oliveira de Almeida ',
        null
    );

INSERT INTO `participantes`
VALUES (
        '241',
        'STANIER ALVES GOMES JUNIOR',
        '014383'
    );

INSERT INTO `participantes`
VALUES (
        '242',
        'JOAO VITOR DE ASSIS MARTINS',
        '025454'
    );

INSERT INTO `participantes`
VALUES (
        '243',
        'ALEXANDRE GONCALVES SSATTI',
        '018143'
    );

INSERT INTO `participantes`
VALUES (
        '244',
        'SAVIO VINICIUS ALBIERI BARONE CANTERO',
        '016439'
    );

INSERT INTO `participantes`
VALUES (
        '245',
        'RAFAEL CRISTALDO VILHALBA',
        '017316'
    );

INSERT INTO `participantes`
VALUES (
        '246',
        'JOSE TIAGO SIQUEIRA DE SOUZA',
        '024840'
    );

INSERT INTO `participantes`
VALUES (
        '247',
        'JOÃO GABRIEL CARNAVALE SANDRI',
        '024955'
    );

INSERT INTO `participantes`
VALUES (
        '248',
        'WILLY GONCALVES DE MOURA',
        '008407'
    );

INSERT INTO `participantes`
VALUES (
        '249',
        'Roseli da Silva Martinez',
        null
    );

INSERT INTO `participantes`
VALUES (
        '250',
        'Lucielen Moreira de Oliveira ',
        null
    );

INSERT INTO `participantes`
VALUES (
        '251',
        'RAUL DOS SANTOS SILVA',
        '025356'
    );

INSERT INTO `participantes`
VALUES (
        '252',
        'DIEGO MAIDANA DA SILVA',
        '025355'
    );

INSERT INTO `participantes`
VALUES (
        '253',
        'Kelly Camila Maciel ',
        null
    );

INSERT INTO `participantes`
VALUES (
        '254',
        'Albert Vinicius Rodrigues Ribeiro',
        null
    );

INSERT INTO `participantes`
VALUES (
        '255',
        'Mateus Elieser Camargo Julião Dos Santos ',
        null
    );

INSERT INTO `participantes`
VALUES (
        '256',
        'FABIANO MOREIRA MORESCO',
        '025557'
    );

INSERT INTO `participantes`
VALUES (
        '257',
        'LUCAS HUMBERTO CABALLERO DACUNHA',
        '017314'
    );

INSERT INTO `participantes`
VALUES (
        '258',
        'Alexsandro Pereira da Silva',
        null
    );

INSERT INTO `participantes`
VALUES (
        '259',
        'Gabrieli herrero dahmer',
        null
    );

INSERT INTO `participantes`
VALUES (
        '260',
        'Cristian Gabriel da Silva ozuna',
        null
    );

INSERT INTO `participantes`
VALUES (
        '261',
        'MASAO MURAOKA NETO',
        '006622'
    );

INSERT INTO `participantes`
VALUES (
        '262',
        'CAROLINA SOUTO FREITAS',
        '024879'
    );

INSERT INTO `participantes`
VALUES (
        '263',
        'GABRIELA MORAES ESQUIVEL',
        '014418'
    );

INSERT INTO `participantes`
VALUES (
        '264',
        'ABIGAIL BARRIOS BRANDI',
        '014423'
    );

INSERT INTO `participantes` VALUES ('265', 'PAULA PORTES', '014375');

INSERT INTO `participantes`
VALUES (
        '266',
        'ERICK FERNANDES FERREIRA LIMA',
        '008251'
    );

INSERT INTO `participantes`
VALUES (
        '267',
        'EVERTON VIEIRA CERUTTI',
        '016528'
    );

INSERT INTO `participantes`
VALUES (
        '268',
        'BRUNA LENIA DA ROSA MOURA',
        '014503'
    );

INSERT INTO `participantes`
VALUES (
        '269',
        'BRUNO PEREIRA SANABRIA',
        '014371'
    );

INSERT INTO `participantes`
VALUES (
        '270',
        'ANDRE GUSTAVO NEVES DA SILVA',
        '014269'
    );

INSERT INTO `participantes`
VALUES (
        '271',
        'FABRICIO CABRERA SILVA',
        '017265'
    );

INSERT INTO `participantes`
VALUES (
        '272',
        'GABRIEL DAROLD CORDEIRO',
        '008260'
    );

INSERT INTO `participantes`
VALUES (
        '273',
        'Lucas Luan Gonçalves Benites ',
        null
    );

INSERT INTO `participantes`
VALUES (
        '274',
        'Sandra Paola Moreira',
        null
    );

INSERT INTO `participantes`
VALUES (
        '275',
        'VITOR GABRIEL DA PAZ BARROS',
        '025892'
    );

INSERT INTO `participantes`
VALUES (
        '276',
        'ULYSSES OLIVEIRA BENITES FERREIRA',
        '014369'
    );

INSERT INTO `participantes`
VALUES (
        '277',
        'MATEUS SOUZA RODRIGUES DE ABREU',
        '014389'
    );

INSERT INTO `participantes`
VALUES (
        '278',
        'Júlio César de Lima Costa',
        null
    );

INSERT INTO `participantes`
VALUES (
        '279',
        'MARCOS BERNAL GONZALEZ',
        '024915'
    );

INSERT INTO `participantes`
VALUES (
        '280',
        'LARA LEONELA AJALA MORAL',
        '017266'
    );

INSERT INTO `participantes`
VALUES (
        '281',
        'ALANA SURUDAIK DANTAS',
        '017324'
    );

INSERT INTO `participantes`
VALUES (
        '282',
        'DEIVID DIAS PORTILHO',
        '024903'
    );

INSERT INTO `participantes`
VALUES (
        '283',
        'Ellen Rosana Baez Ferreira  ',
        null
    );

INSERT INTO `participantes`
VALUES (
        '284',
        'JOSE VINICIUS BRITO FERREIRA',
        '025969'
    );

INSERT INTO `participantes`
VALUES (
        '285',
        'GABRIEL ALMEIDA',
        '014368'
    );

INSERT INTO `participantes`
VALUES (
        '286',
        'FLAVIA DE OLIVEIRA BEZERRA',
        '024898'
    );

INSERT INTO `participantes`
VALUES (
        '287',
        'JOSSARA SALINAS FREITAS',
        '024916'
    );

INSERT INTO `participantes`
VALUES (
        '288',
        'MARINA DE ALMEIDA TRINDADE',
        '017396'
    );

INSERT INTO `participantes`
VALUES (
        '289',
        'MICHELE SU LEE',
        '007088'
    );

INSERT INTO `participantes`
VALUES (
        '290',
        'RODRIGO ORBIETA GOMEZ',
        '006057'
    );

INSERT INTO `participantes`
VALUES (
        '291',
        'Fabricio Baruc Benites Domingues Cano',
        null
    );

INSERT INTO `participantes`
VALUES (
        '292',
        'TSENG HSIN HAN',
        '006990'
    );

INSERT INTO `participantes`
VALUES (
        '293',
        'RAFAEL BARCZYSCZYN VILHANUEVA',
        '006655'
    );

INSERT INTO `participantes`
VALUES (
        '294',
        'Rafael viana nunes ',
        null
    );

INSERT INTO `participantes`
VALUES (
        '295',
        'GABRIEL BONOTTO CORREIA',
        '024967'
    );

INSERT INTO `participantes`
VALUES (
        '296',
        'BRENDA RODRIGUES MARCELINO ALEXANDRE',
        '017303'
    );

INSERT INTO `participantes`
VALUES (
        '297',
        'ANA CAROLINA VIEIRA',
        '014494'
    );

INSERT INTO `participantes`
VALUES (
        '298',
        'Dyule Soares dos Santos',
        null
    );

INSERT INTO `participantes`
VALUES (
        '299',
        'MILENA ISABELY MACENA DE OLIVEIRA',
        '024940'
    );

INSERT INTO `participantes`
VALUES (
        '300',
        'INGRID LENCINA GARCIA',
        '025246'
    );

INSERT INTO `participantes`
VALUES (
        '301',
        'VIVIAN MARIEL PRIETO CACERES',
        '024925'
    );

INSERT INTO `participantes`
VALUES (
        '302',
        'CRISTIANE RUSSO DE SOUSA',
        '025326'
    );

INSERT INTO `participantes`
VALUES (
        '303',
        'NAIRA GABRIELI GIMENES GONCALVES',
        '017263'
    );

INSERT INTO `participantes`
VALUES (
        '304',
        'LAURA SANCHEZ DE SOUZA',
        '024874'
    );

INSERT INTO `participantes`
VALUES (
        '305',
        'AMANDA GABRIELLI GONCALVES RAMOS',
        '024799'
    );

INSERT INTO `participantes`
VALUES (
        '306',
        'JANAINA DA SILVA MARTINE',
        '024957'
    );

INSERT INTO `participantes`
VALUES (
        '307',
        'Kevin Luís Borges de Freitas',
        null
    );

INSERT INTO `participantes`
VALUES (
        '308',
        'SARA GABRIELA FREITAS DE VARGAS',
        '024828'
    );

INSERT INTO `participantes`
VALUES (
        '309',
        'LUCAS GABRIEL ESTEOCLE SARABIA',
        '021493'
    );

INSERT INTO `participantes`
VALUES (
        '310',
        'Nathan Gabriel Gracia Leite',
        null
    );

INSERT INTO `participantes`
VALUES (
        '311',
        'Valeria Raquel Mendes ',
        null
    );

INSERT INTO `participantes`
VALUES (
        '312',
        'Abrão de Oliveira Lopez',
        null
    );

INSERT INTO `participantes`
VALUES (
        '313',
        'Maria Elenice Freitas de Oliveira ',
        null
    );

INSERT INTO `participantes`
VALUES (
        '314',
        'LUCAS BATISTA SCHEFFER',
        '017853'
    );

INSERT INTO `participantes`
VALUES (
        '315',
        'Elisama da Silva dos Santos ',
        null
    );

INSERT INTO `participantes`
VALUES (
        '316',
        'Daniela Bispo dos Santos ',
        null
    );

INSERT INTO `participantes`
VALUES (
        '317',
        'Franciely palacio',
        null
    );

INSERT INTO `participantes`
VALUES (
        '318',
        'DALILA LOPEZ DE SOUZA',
        '014408'
    );

INSERT INTO `participantes`
VALUES (
        '319',
        'Daniela Bispo dos santos',
        null
    );

INSERT INTO `participantes`
VALUES (
        '320',
        'Joao Emanuel Olmedo Neves',
        null
    );

INSERT INTO `participantes`
VALUES (
        '321',
        'RENAN PAIM PINTO',
        '014313'
    );

INSERT INTO `participantes`
VALUES (
        '322',
        'Maria clareti gimenez gonzalez',
        null
    );

INSERT INTO `participantes`
VALUES (
        '323',
        'Nelson Antônio Ortiz Duarte',
        null
    );

INSERT INTO `participantes`
VALUES (
        '324',
        'Fernanda Fernandes cardoso',
        null
    );

INSERT INTO `participantes`
VALUES (
        '325',
        'FERNANDES GONÇALVES FILHO',
        null
    );

INSERT INTO `participantes`
VALUES (
        '326',
        'Luana Duarte Mercado',
        null
    );

INSERT INTO `participantes`
VALUES (
        '327',
        'Andy Kamila Venialgo ',
        null
    );

INSERT INTO `participantes`
VALUES (
        '328',
        'Eduardo Ferreira Juracheke',
        null
    );

INSERT INTO `participantes`
VALUES (
        '329',
        'TABITA ESTER MITTANCK TAVARES',
        '017323'
    );

INSERT INTO `participantes`
VALUES (
        '330',
        'Cristian Henrique Freitas Maciel ',
        null
    );

INSERT INTO `participantes`
VALUES (
        '331',
        'MATEUS MARTINS ESPINOZA',
        '024839'
    );

INSERT INTO `participantes`
VALUES (
        '332',
        'SABRINA MATIAS DE AZEVEDO',
        '025369'
    );

INSERT INTO `participantes`
VALUES (
        '333',
        'GABRIELLE ANTUNES RAHAL',
        '025245'
    );

INSERT INTO `participantes`
VALUES (
        '334',
        'DANIELLA NOGUEIRA BOBADILHA',
        '024878'
    );

INSERT INTO `participantes`
VALUES (
        '335',
        'LETICIA URBANO DA SILVA',
        '024852'
    );

INSERT INTO `participantes`
VALUES (
        '336',
        'BRUNA DE JESUS PAIN',
        '024823'
    );

INSERT INTO `participantes`
VALUES (
        '337',
        'Guilherme Dornellas',
        null
    );

INSERT INTO `participantes`
VALUES (
        '338',
        'Angelo Danilo Souza Salinas',
        null
    );

INSERT INTO `participantes`
VALUES (
        '339',
        'CIBELLE DA ROSA SILVA',
        '024819'
    );

INSERT INTO `participantes`
VALUES (
        '340',
        'Cleiciane Antunes de Amorim',
        null
    );

INSERT INTO `participantes`
VALUES (
        '341',
        'Thiago Junior Godoy Mareco',
        null
    );

INSERT INTO `participantes`
VALUES (
        '342',
        'CARLOS MARTINS ESPINOZA FILHO',
        '024841'
    );

INSERT INTO `participantes`
VALUES (
        '343',
        'TAINA ROBERTI',
        '024917'
    );

INSERT INTO `participantes`
VALUES (
        '344',
        'GABRIELE DA SILVA BORGES',
        '024906'
    );

INSERT INTO `participantes`
VALUES (
        '345',
        'PHELIPE VELLOZO BERTTIM',
        null
    );

INSERT INTO `participantes`
VALUES (
        '346',
        'Ariela Uemura Andrade',
        null
    );

INSERT INTO `participantes`
VALUES (
        '347',
        'Josias de oliveira Maldonado ',
        null
    );

INSERT INTO `participantes`
VALUES (
        '348',
        'EDUARDA GARCIA DA SILVA MATOZO',
        '025361'
    );

INSERT INTO `participantes`
VALUES (
        '349',
        'Ian Danilo Cavalheiro Insfran ',
        null
    );

INSERT INTO `participantes`
VALUES (
        '350',
        'RAIELY KARINE ZANATTA',
        '025547'
    );

INSERT INTO `participantes`
VALUES (
        '351',
        'LUIS FERNANDO MARTINEZ MACIEL',
        '024926'
    );

INSERT INTO `participantes`
VALUES (
        '352',
        'ARIEL APARECIDO ROMERO DE SOUZA',
        '025286'
    );

INSERT INTO `participantes`
VALUES (
        '353',
        'VANDERSON FRANCISCO FRANCO GREFF',
        '024951'
    );

INSERT INTO `participantes`
VALUES (
        '354',
        'Amanda camila peixoto afonso',
        null
    );

INSERT INTO `participantes`
VALUES (
        '355',
        'samara campos areco',
        null
    );

INSERT INTO `participantes`
VALUES (
        '356',
        'Glauce Fernanda Ruiz dos Santos',
        null
    );

INSERT INTO `participantes`
VALUES (
        '357',
        'Cristiane Candia Gonçalves',
        null
    );

INSERT INTO `participantes`
VALUES (
        '358',
        'Lucas Araujo Valdez',
        null
    );

INSERT INTO `participantes`
VALUES (
        '359',
        'RONAN CUENETE DE CAMPOS',
        '024810'
    );

INSERT INTO `participantes`
VALUES (
        '360',
        'Lucas Gimenez Duarte',
        null
    );

INSERT INTO `participantes`
VALUES (
        '361',
        'Ualisson rolon da rocha',
        null
    );

INSERT INTO `participantes`
VALUES (
        '362',
        'Cibele DA Rocha Morilho',
        null
    );

INSERT INTO `participantes`
VALUES (
        '363',
        'Glendha Nayara Martins  Morilho',
        null
    );

INSERT INTO `participantes`
VALUES (
        '364',
        'JULIANO BOGARIM DA SILVEIRA',
        '025284'
    );

INSERT INTO `participantes`
VALUES (
        '365',
        'Thiago Vellozo Berttim',
        null
    );

INSERT INTO `participantes`
VALUES (
        '366',
        'RODRIGO RICARDO MERCADO MALDONADO',
        '024862'
    );

INSERT INTO `participantes`
VALUES (
        '367',
        'EDSON MARTINS SOUZA SILVA',
        '024912'
    );

INSERT INTO `participantes`
VALUES (
        '368',
        'Jessica Manueli Moraes',
        null
    );

INSERT INTO `participantes`
VALUES (
        '369',
        'PAOLA RODRIGUEZ DE JESUS',
        '014481'
    );

INSERT INTO `participantes`
VALUES (
        '370',
        'JULIO CESAR DEALIS MOURA',
        '008275'
    );

INSERT INTO `participantes`
VALUES (
        '371',
        'CRISTIAN MARTINS SANCHES',
        '025261'
    );

INSERT INTO `participantes`
VALUES (
        '372',
        'REGINA BRITO GIMENES',
        '024976'
    );

INSERT INTO `participantes`
VALUES (
        '373',
        'JEAN CARLOS PEREIRA DE ALMEIDA JUNIOR',
        null
    );

INSERT INTO `participantes`
VALUES (
        '374',
        'ANA GABRIELA DA SILVA',
        null
    );

INSERT INTO `participantes` VALUES ('375', 'Rafael Vinicius', null);

INSERT INTO `participantes`
VALUES (
        '376',
        'Istella Lira Conder',
        null
    );

INSERT INTO `participantes`
VALUES (
        '377',
        'Ailton Jimenez Ferreira',
        null
    );

INSERT INTO `participantes`
VALUES (
        '378',
        'jeferson moraes dutra',
        null
    );

INSERT INTO `participantes`
VALUES (
        '379',
        'Leila Mariceli Ortiz Bravo',
        null
    );

INSERT INTO `participantes`
VALUES (
        '380',
        'FABIO ADOLFO QUEVEDO',
        '024849'
    );

INSERT INTO `participantes`
VALUES (
        '381',
        'GABRIEL VICTOR GONCALVES AFONSO',
        '020615'
    );

INSERT INTO `participantes`
VALUES (
        '382',
        'DIEGO NAIRAN RICARDI INSFRAN',
        '025358'
    );

INSERT INTO `participantes`
VALUES (
        '383',
        'ELYSÉE ARANTES',
        '008250'
    );

INSERT INTO `participantes` VALUES ('384', 'Beta Tester1', null);

INSERT INTO `participantes`
VALUES (
        '385',
        'ALISON NOGUEIRA STRADA',
        '017304'
    );

-- ----------------------------

-- Table structure for `participantes_atividades`

-- ----------------------------

DROP TABLE IF EXISTS `participantes_atividades`;

CREATE TABLE
    `participantes_atividades` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `participante_id` int(11) NOT NULL,
        `atividade_id` int(11) NOT NULL,
        `presente` tinyint(1) DEFAULT NULL,
        PRIMARY KEY (`id`),
        KEY `fk_participantes_atividades_participantes1_idx` (`participante_id`) USING BTREE,
        KEY `fk_participantes_atividades_atividades1_idx` (`atividade_id`) USING BTREE,
        CONSTRAINT `participantes_atividades_ibfk_1` FOREIGN KEY (`atividade_id`) REFERENCES `atividades` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION,
        CONSTRAINT `participantes_atividades_ibfk_2` FOREIGN KEY (`participante_id`) REFERENCES `participantes` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION
    ) ENGINE = InnoDB AUTO_INCREMENT = 770 DEFAULT CHARSET = utf8;

-- ----------------------------

-- Records of participantes_atividades

-- ----------------------------

INSERT INTO `participantes_atividades` VALUES ('2', '1', '4', '1');

INSERT INTO `participantes_atividades` VALUES ('3', '1', '3', '0');

INSERT INTO `participantes_atividades` VALUES ('5', '2', '9', '0');

INSERT INTO `participantes_atividades` VALUES ('6', '3', '2', '1');

INSERT INTO `participantes_atividades` VALUES ('8', '4', '13', '0');

INSERT INTO `participantes_atividades` VALUES ('10', '6', '9', '0');

INSERT INTO `participantes_atividades` VALUES ('11', '9', '2', '0');

INSERT INTO `participantes_atividades` VALUES ('14', '9', '21', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('20', '15', '22', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('23', '15', '12', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('26', '19', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('27', '20', '21', '1');

INSERT INTO `participantes_atividades` VALUES ('28', '19', '4', '1');

INSERT INTO `participantes_atividades` VALUES ('29', '16', '3', '0');

INSERT INTO `participantes_atividades` VALUES ('31', '21', '4', '1');

INSERT INTO `participantes_atividades` VALUES ('33', '14', '4', '1');

INSERT INTO `participantes_atividades` VALUES ('35', '24', '4', '1');

INSERT INTO `participantes_atividades` VALUES ('39', '21', '5', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('41', '22', '21', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('42', '24', '21', '1');

INSERT INTO `participantes_atividades` VALUES ('43', '18', '9', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('45', '18', '12', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('46', '18', '19', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('48', '26', '20', '1');

INSERT INTO `participantes_atividades` VALUES ('50', '14', '5', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('51', '26', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('54', '29', '20', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('55', '29', '19', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('56', '28', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('57', '32', '19', '0');

INSERT INTO `participantes_atividades` VALUES ('58', '31', '2', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('59', '28', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('60', '34', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('61', '40', '19', '1');

INSERT INTO `participantes_atividades` VALUES ('65', '41', '9', '1');

INSERT INTO `participantes_atividades` VALUES ('68', '39', '9', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('70', '39', '21', '1');

INSERT INTO `participantes_atividades` VALUES ('71', '46', '4', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('73', '38', '12', '1');

INSERT INTO `participantes_atividades` VALUES ('74', '45', '9', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('75', '46', '21', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('76', '44', '19', '1');

INSERT INTO `participantes_atividades` VALUES ('78', '43', '4', '1');

INSERT INTO `participantes_atividades` VALUES ('79', '43', '5', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('80', '43', '12', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('82', '47', '21', '1');

INSERT INTO `participantes_atividades` VALUES ('83', '49', '9', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('84', '49', '21', '1');

INSERT INTO `participantes_atividades` VALUES ('85', '48', '9', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('86', '50', '21', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('87', '46', '13', '0');

INSERT INTO `participantes_atividades` VALUES ('89', '53', '9', '0');

INSERT INTO `participantes_atividades` VALUES ('90', '54', '9', '0');

INSERT INTO `participantes_atividades` VALUES ('92', '55', '4', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('93', '53', '12', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('94', '54', '12', '1');

INSERT INTO `participantes_atividades` VALUES ('95', '55', '5', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('97', '55', '12', '1');

INSERT INTO `participantes_atividades` VALUES ('99', '53', '5', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('100', '54', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('101', '48', '21', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('102', '56', '21', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('103', '27', '9', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('106', '41', '21', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('107', '56', '9', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('110', '59', '4', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('111', '60', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('112', '61', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('113', '61', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('114', '62', '22', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('116', '60', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('117', '64', '22', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('118', '64', '12', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('119', '63', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('120', '63', '4', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('121', '65', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('122', '63', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('123', '65', '20', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('128', '70', '4', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('130', '73', '12', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('131', '74', '12', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('132', '75', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('134', '77', '2', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('135', '76', '2', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('138', '77', '15', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('140', '79', '4', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('141', '80', '4', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('142', '81', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('143', '84', '22', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('144', '81', '20', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('145', '88', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('146', '88', '20', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('147', '87', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('148', '87', '12', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('150', '90', '4', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('153', '91', '4', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('155', '93', '2', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('156', '92', '12', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('158', '97', '2', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('160', '93', '12', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('163', '91', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('165', '97', '12', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('173', '100', '15', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('174', '103', '12', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('175', '104', '4', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('177', '104', '15', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('178', '105', '20', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('181', '108', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('182', '110', '4', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('183', '109', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('184', '111', '4', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('185', '113', '4', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('186', '110', '5', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('190', '110', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('195', '107', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('196', '113', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('197', '114', '4', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('198', '106', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('199', '113', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('200', '107', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('202', '114', '5', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('203', '106', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('204', '109', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('205', '116', '5', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('206', '112', '3', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('207', '115', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('208', '116', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('209', '114', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('210', '112', '15', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('213', '118', '12', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('214', '120', '6', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('216', '123', '22', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('218', '125', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('221', '125', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('226', '129', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('227', '126', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('229', '129', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('230', '124', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('231', '130', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('233', '131', '2', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('234', '131', '15', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('235', '132', '2', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('237', '126', '2', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('238', '134', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('239', '136', '20', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('243', '138', '22', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('246', '140', '15', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('248', '142', '22', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('250', '136', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('251', '144', '22', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('252', '92', '7', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('254', '141', '15', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('257', '148', '28', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('258', '148', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('260', '149', '9', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('261', '149', '15', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('262', '149', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('263', '122', '5', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('264', '122', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('266', '154', '20', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('267', '154', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('268', '155', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('269', '155', '20', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('273', '157', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('274', '157', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('277', '160', '15', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('280', '163', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('281', '163', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('285', '103', '7', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('288', '166', '20', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('290', '7', '13', '0');

INSERT INTO `participantes_atividades` VALUES ('292', '7', '2', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('293', '165', '22', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('294', '167', '2', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('295', '167', '15', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('296', '168', '15', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('297', '169', '5', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('298', '170', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('300', '10', '3', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('301', '10', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('304', '173', '22', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('306', '176', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('307', '176', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('308', '178', '22', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('309', '179', '22', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('310', '180', '22', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('314', '183', '30', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('317', '67', '21', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('320', '185', '30', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('321', '186', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('323', '139', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('325', '189', '7', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('326', '191', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('327', '69', '22', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('328', '69', '30', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('336', '193', '30', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('337', '194', '20', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('338', '143', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('339', '143', '20', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('341', '195', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('342', '195', '22', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('343', '184', '30', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('344', '197', '22', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('345', '197', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('346', '83', '30', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('348', '182', '19', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('349', '182', '8', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('351', '190', '30', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('352', '200', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('353', '200', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('355', '201', '22', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('357', '203', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('358', '203', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('359', '1', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('360', '213', '30', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('361', '212', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('362', '215', '12', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('363', '224', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('364', '224', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('365', '212', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('366', '225', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('367', '225', '22', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('368', '17', '30', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('369', '27', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('370', '83', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('371', '72', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('372', '76', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('373', '74', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('374', '163', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('375', '48', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('376', '222', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('377', '216', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('378', '174', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('379', '64', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('380', '77', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('381', '111', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('382', '79', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('383', '218', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('384', '145', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('385', '39', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('386', '118', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('387', '214', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('388', '210', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('389', '215', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('390', '208', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('391', '89', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('392', '54', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('393', '211', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('395', '223', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('396', '6', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('397', '221', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('398', '190', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('399', '160', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('400', '31', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('401', '100', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('402', '82', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('403', '15', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('404', '113', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('405', '50', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('406', '175', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('407', '213', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('408', '20', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('409', '18', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('410', '201', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('411', '132', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('412', '30', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('413', '158', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('414', '21', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('415', '26', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('416', '162', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('417', '78', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('418', '207', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('419', '189', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('420', '220', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('421', '62', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('422', '137', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('423', '197', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('424', '112', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('425', '63', '16', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('426', '129', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('427', '129', '3', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('431', '245', '22', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('432', '246', '20', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('433', '248', '30', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('435', '187', '30', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('436', '213', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('437', '251', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('438', '251', '30', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('439', '252', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('440', '252', '30', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('441', '210', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('442', '191', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('443', '210', '30', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('444', '253', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('445', '253', '28', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('447', '254', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('451', '256', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('462', '279', '19', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('464', '279', '8', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('465', '281', '22', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('466', '280', '22', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('467', '281', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('468', '280', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('469', '282', '22', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('470', '282', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('471', '37', '28', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('476', '291', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('478', '291', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('479', '278', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('481', '284', '22', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('482', '294', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('483', '275', '22', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('484', '291', '30', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('485', '278', '30', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('487', '294', '30', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('491', '310', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('492', '315', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('503', '313', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('507', '313', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('508', '319', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('509', '319', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('510', '319', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('511', '320', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('513', '249', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('514', '258', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('516', '258', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('517', '259', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('519', '322', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('520', '66', '9', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('523', '323', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('524', '250', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('525', '323', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('526', '250', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('528', '305', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('529', '302', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('531', '325', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('533', '325', '3', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('534', '286', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('535', '286', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('536', '173', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('538', '144', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('540', '327', '3', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('543', '329', '3', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('544', '329', '7', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('545', '329', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('546', '329', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('549', '331', '7', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('551', '330', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('554', '340', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('556', '341', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('560', '306', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('561', '343', '7', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('562', '120', '28', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('563', '344', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('564', '120', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('565', '258', '31', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('566', '310', '31', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('568', '260', '31', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('569', '345', '31', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('570', '345', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('571', '294', '31', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('572', '260', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('573', '260', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('574', '346', '31', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('575', '228', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('577', '311', '31', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('578', '346', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('579', '278', '31', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('580', '233', '31', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('582', '317', '31', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('584', '347', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('585', '317', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('586', '311', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('587', '161', '31', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('588', '307', '31', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('589', '349', '31', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('590', '254', '31', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('592', '349', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('593', '350', '31', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('594', '307', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('595', '273', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('598', '283', '31', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('599', '291', '31', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('600', '312', '31', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('603', '240', '31', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('604', '240', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('605', '356', '31', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('606', '355', '31', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('607', '356', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('608', '355', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('609', '117', '5', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('610', '304', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('611', '360', '12', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('613', '337', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('614', '315', '31', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('615', '362', '3', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('617', '362', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('618', '82', '4', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('619', '363', '3', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('626', '365', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('627', '365', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('629', '232', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('630', '366', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('631', '228', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('632', '75', '9', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('633', '367', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('636', '325', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('637', '325', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('638', '368', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('639', '368', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('640', '368', '30', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('641', '368', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('642', '176', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('643', '342', '7', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('644', '342', '2', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('645', '188', '5', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('646', '188', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('647', '162', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('648', '162', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('649', '91', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('650', '91', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('651', '188', '4', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('652', '117', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('653', '117', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('654', '17', '6', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('657', '172', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('659', '172', '15', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('661', '366', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('662', '261', '31', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('663', '371', '9', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('665', '351', '9', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('666', '364', '9', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('667', '102', '15', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('668', '372', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('669', '370', '12', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('671', '373', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('672', '373', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('673', '245', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('674', '374', '7', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('675', '374', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('676', '374', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('677', '375', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('678', '375', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('679', '375', '4', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('680', '357', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('681', '357', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('682', '357', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('683', '357', '3', '0');

INSERT INTO `participantes_atividades` VALUES ('685', '4', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('686', '347', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('687', '259', '5', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('689', '138', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('690', '344', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('691', '344', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('692', '145', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('693', '145', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('694', '298', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('695', '298', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('696', '376', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('697', '25', '3', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('698', '25', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('699', '25', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('700', '25', '7', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('702', '379', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('705', '101', '10', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('706', '101', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('707', '360', '31', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('709', '19', '32', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('710', '75', '21', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('711', '147', '12', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('712', '21', '32', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('713', '383', '4', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('714', '21', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('716', '82', '30', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('717', '259', '30', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('718', '16', '30', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('719', '14', '32', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('721', '259', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('722', '14', '13', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('723', '379', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('724', '90', '21', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('725', '304', '11', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('726', '233', '14', '0');

INSERT INTO
    `participantes_atividades`
VALUES ('728', '39', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('729', '23', '19', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('730', '298', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('731', '293', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('732', '145', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('733', '300', '28', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('734', '16', '5', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('735', '69', '5', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('736', '366', '5', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('737', '74', '5', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('738', '16', '4', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('739', '347', '4', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('740', '161', '4', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('741', '261', '4', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('742', '278', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('743', '139', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('744', '250', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('745', '116', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('746', '313', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('747', '323', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('748', '294', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('749', '366', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('750', '185', '6', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('751', '78', '2', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('752', '107', '2', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('753', '208', '2', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('754', '197', '9', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('755', '87', '9', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('756', '248', '20', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('757', '238', '20', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('758', '181', '20', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('759', '132', '21', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('760', '276', '21', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('761', '30', '21', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('762', '131', '21', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('763', '245', '30', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('764', '347', '30', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('765', '313', '30', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('766', '75', '12', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('767', '383', '12', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('768', '79', '12', '1');

INSERT INTO
    `participantes_atividades`
VALUES ('769', '384', '5', '0');

-- ----------------------------

-- Table structure for `participantes_turmas`

-- ----------------------------

DROP TABLE IF EXISTS `participantes_turmas`;

CREATE TABLE
    `participantes_turmas` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `participante_id` int(11) NOT NULL,
        `turma_id` int(11) NOT NULL,
        PRIMARY KEY (`id`),
        KEY `fk_participantes_has_turmas_turmas1_idx` (`turma_id`) USING BTREE,
        KEY `fk_participantes_has_turmas_participantes1_idx` (`participante_id`) USING BTREE,
        CONSTRAINT `participantes_turmas_ibfk_1` FOREIGN KEY (`participante_id`) REFERENCES `participantes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
        CONSTRAINT `participantes_turmas_ibfk_2` FOREIGN KEY (`turma_id`) REFERENCES `turmas` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
    ) ENGINE = InnoDB AUTO_INCREMENT = 280 DEFAULT CHARSET = utf8;

-- ----------------------------

-- Records of participantes_turmas

-- ----------------------------

INSERT INTO `participantes_turmas` VALUES ('1', '2', '15');

INSERT INTO `participantes_turmas` VALUES ('2', '2', '3');

INSERT INTO `participantes_turmas` VALUES ('3', '3', '3');

INSERT INTO `participantes_turmas` VALUES ('4', '4', '8');

INSERT INTO `participantes_turmas` VALUES ('5', '5', '9');

INSERT INTO `participantes_turmas` VALUES ('6', '6', '9');

INSERT INTO `participantes_turmas` VALUES ('7', '7', '5');

INSERT INTO `participantes_turmas` VALUES ('8', '8', '5');

INSERT INTO `participantes_turmas` VALUES ('9', '9', '5');

INSERT INTO `participantes_turmas` VALUES ('10', '10', '5');

INSERT INTO `participantes_turmas` VALUES ('11', '11', '3');

INSERT INTO `participantes_turmas` VALUES ('12', '12', '3');

INSERT INTO `participantes_turmas` VALUES ('13', '13', '6');

INSERT INTO `participantes_turmas` VALUES ('14', '14', '6');

INSERT INTO `participantes_turmas` VALUES ('15', '15', '9');

INSERT INTO `participantes_turmas` VALUES ('16', '16', '6');

INSERT INTO `participantes_turmas` VALUES ('17', '17', '5');

INSERT INTO `participantes_turmas` VALUES ('18', '19', '6');

INSERT INTO `participantes_turmas` VALUES ('19', '20', '6');

INSERT INTO `participantes_turmas` VALUES ('20', '21', '6');

INSERT INTO `participantes_turmas` VALUES ('21', '22', '6');

INSERT INTO `participantes_turmas` VALUES ('22', '23', '9');

INSERT INTO `participantes_turmas` VALUES ('23', '24', '6');

INSERT INTO `participantes_turmas` VALUES ('24', '26', '9');

INSERT INTO `participantes_turmas` VALUES ('25', '27', '9');

INSERT INTO `participantes_turmas` VALUES ('26', '28', '9');

INSERT INTO `participantes_turmas` VALUES ('27', '29', '9');

INSERT INTO `participantes_turmas` VALUES ('28', '30', '9');

INSERT INTO `participantes_turmas` VALUES ('29', '31', '9');

INSERT INTO `participantes_turmas` VALUES ('30', '32', '9');

INSERT INTO `participantes_turmas` VALUES ('31', '33', '9');

INSERT INTO `participantes_turmas` VALUES ('32', '34', '10');

INSERT INTO `participantes_turmas` VALUES ('33', '35', '4');

INSERT INTO `participantes_turmas` VALUES ('34', '36', '5');

INSERT INTO `participantes_turmas` VALUES ('35', '37', '5');

INSERT INTO `participantes_turmas` VALUES ('36', '38', '4');

INSERT INTO `participantes_turmas` VALUES ('37', '39', '9');

INSERT INTO `participantes_turmas` VALUES ('38', '40', '9');

INSERT INTO `participantes_turmas` VALUES ('39', '41', '10');

INSERT INTO `participantes_turmas` VALUES ('40', '42', '10');

INSERT INTO `participantes_turmas` VALUES ('41', '43', '4');

INSERT INTO `participantes_turmas` VALUES ('42', '44', '9');

INSERT INTO `participantes_turmas` VALUES ('43', '45', '10');

INSERT INTO `participantes_turmas` VALUES ('44', '46', '4');

INSERT INTO `participantes_turmas` VALUES ('45', '47', '10');

INSERT INTO `participantes_turmas` VALUES ('46', '48', '9');

INSERT INTO `participantes_turmas` VALUES ('47', '49', '9');

INSERT INTO `participantes_turmas` VALUES ('48', '50', '9');

INSERT INTO `participantes_turmas` VALUES ('49', '51', '10');

INSERT INTO `participantes_turmas` VALUES ('50', '52', '3');

INSERT INTO `participantes_turmas` VALUES ('51', '53', '4');

INSERT INTO `participantes_turmas` VALUES ('52', '54', '4');

INSERT INTO `participantes_turmas` VALUES ('53', '55', '4');

INSERT INTO `participantes_turmas` VALUES ('54', '56', '9');

INSERT INTO `participantes_turmas` VALUES ('55', '57', '4');

INSERT INTO `participantes_turmas` VALUES ('56', '58', '4');

INSERT INTO `participantes_turmas` VALUES ('57', '59', '4');

INSERT INTO `participantes_turmas` VALUES ('58', '61', '9');

INSERT INTO `participantes_turmas` VALUES ('59', '62', '9');

INSERT INTO `participantes_turmas` VALUES ('60', '64', '9');

INSERT INTO `participantes_turmas` VALUES ('61', '65', '8');

INSERT INTO `participantes_turmas` VALUES ('62', '66', '10');

INSERT INTO `participantes_turmas` VALUES ('63', '68', '8');

INSERT INTO `participantes_turmas` VALUES ('64', '69', '8');

INSERT INTO `participantes_turmas` VALUES ('65', '70', '6');

INSERT INTO `participantes_turmas` VALUES ('66', '71', '6');

INSERT INTO `participantes_turmas` VALUES ('67', '72', '9');

INSERT INTO `participantes_turmas` VALUES ('68', '73', '6');

INSERT INTO `participantes_turmas` VALUES ('69', '74', '6');

INSERT INTO `participantes_turmas` VALUES ('70', '75', '8');

INSERT INTO `participantes_turmas` VALUES ('71', '76', '4');

INSERT INTO `participantes_turmas` VALUES ('72', '77', '4');

INSERT INTO `participantes_turmas` VALUES ('73', '78', '6');

INSERT INTO `participantes_turmas` VALUES ('74', '79', '6');

INSERT INTO `participantes_turmas` VALUES ('75', '80', '6');

INSERT INTO `participantes_turmas` VALUES ('76', '81', '23');

INSERT INTO `participantes_turmas` VALUES ('77', '82', '6');

INSERT INTO `participantes_turmas` VALUES ('78', '83', '6');

INSERT INTO `participantes_turmas` VALUES ('79', '84', '8');

INSERT INTO `participantes_turmas` VALUES ('80', '85', '8');

INSERT INTO `participantes_turmas` VALUES ('81', '86', '10');

INSERT INTO `participantes_turmas` VALUES ('82', '87', '9');

INSERT INTO `participantes_turmas` VALUES ('83', '88', '23');

INSERT INTO `participantes_turmas` VALUES ('84', '89', '1');

INSERT INTO `participantes_turmas` VALUES ('85', '90', '6');

INSERT INTO `participantes_turmas` VALUES ('86', '91', '1');

INSERT INTO `participantes_turmas` VALUES ('87', '92', '1');

INSERT INTO `participantes_turmas` VALUES ('88', '93', '1');

INSERT INTO `participantes_turmas` VALUES ('89', '94', '1');

INSERT INTO `participantes_turmas` VALUES ('90', '95', '1');

INSERT INTO `participantes_turmas` VALUES ('91', '97', '1');

INSERT INTO `participantes_turmas` VALUES ('92', '98', '1');

INSERT INTO `participantes_turmas` VALUES ('93', '99', '1');

INSERT INTO `participantes_turmas` VALUES ('94', '100', '1');

INSERT INTO `participantes_turmas` VALUES ('95', '104', '1');

INSERT INTO `participantes_turmas` VALUES ('96', '108', '1');

INSERT INTO `participantes_turmas` VALUES ('97', '109', '1');

INSERT INTO `participantes_turmas` VALUES ('98', '110', '1');

INSERT INTO `participantes_turmas` VALUES ('99', '111', '1');

INSERT INTO `participantes_turmas` VALUES ('100', '112', '1');

INSERT INTO `participantes_turmas` VALUES ('101', '113', '1');

INSERT INTO `participantes_turmas` VALUES ('102', '114', '1');

INSERT INTO `participantes_turmas` VALUES ('103', '115', '1');

INSERT INTO `participantes_turmas` VALUES ('104', '116', '1');

INSERT INTO `participantes_turmas` VALUES ('105', '117', '5');

INSERT INTO `participantes_turmas` VALUES ('106', '118', '4');

INSERT INTO `participantes_turmas` VALUES ('107', '119', '5');

INSERT INTO `participantes_turmas` VALUES ('108', '120', '5');

INSERT INTO `participantes_turmas` VALUES ('109', '121', '1');

INSERT INTO `participantes_turmas` VALUES ('110', '122', '4');

INSERT INTO `participantes_turmas` VALUES ('111', '123', '8');

INSERT INTO `participantes_turmas` VALUES ('112', '128', '8');

INSERT INTO `participantes_turmas` VALUES ('113', '130', '23');

INSERT INTO `participantes_turmas` VALUES ('114', '131', '5');

INSERT INTO `participantes_turmas` VALUES ('115', '132', '5');

INSERT INTO `participantes_turmas` VALUES ('116', '133', '5');

INSERT INTO `participantes_turmas` VALUES ('117', '135', '5');

INSERT INTO `participantes_turmas` VALUES ('118', '136', '8');

INSERT INTO `participantes_turmas` VALUES ('119', '137', '2');

INSERT INTO `participantes_turmas` VALUES ('120', '138', '8');

INSERT INTO `participantes_turmas` VALUES ('121', '139', '5');

INSERT INTO `participantes_turmas` VALUES ('122', '140', '1');

INSERT INTO `participantes_turmas` VALUES ('123', '141', '1');

INSERT INTO `participantes_turmas` VALUES ('124', '142', '8');

INSERT INTO `participantes_turmas` VALUES ('125', '143', '8');

INSERT INTO `participantes_turmas` VALUES ('126', '144', '8');

INSERT INTO `participantes_turmas` VALUES ('127', '145', '10');

INSERT INTO `participantes_turmas` VALUES ('128', '146', '3');

INSERT INTO `participantes_turmas` VALUES ('129', '147', '6');

INSERT INTO `participantes_turmas` VALUES ('130', '148', '24');

INSERT INTO `participantes_turmas` VALUES ('131', '149', '5');

INSERT INTO `participantes_turmas` VALUES ('132', '150', '6');

INSERT INTO `participantes_turmas` VALUES ('133', '151', '5');

INSERT INTO `participantes_turmas` VALUES ('134', '152', '5');

INSERT INTO `participantes_turmas` VALUES ('135', '153', '5');

INSERT INTO `participantes_turmas` VALUES ('136', '155', '8');

INSERT INTO `participantes_turmas` VALUES ('137', '156', '3');

INSERT INTO `participantes_turmas` VALUES ('138', '158', '5');

INSERT INTO `participantes_turmas` VALUES ('139', '159', '5');

INSERT INTO `participantes_turmas` VALUES ('140', '160', '2');

INSERT INTO `participantes_turmas` VALUES ('141', '161', '24');

INSERT INTO `participantes_turmas` VALUES ('142', '162', '2');

INSERT INTO `participantes_turmas` VALUES ('143', '163', '3');

INSERT INTO `participantes_turmas` VALUES ('144', '164', '8');

INSERT INTO `participantes_turmas` VALUES ('145', '165', '8');

INSERT INTO `participantes_turmas` VALUES ('146', '166', '8');

INSERT INTO `participantes_turmas` VALUES ('147', '167', '10');

INSERT INTO `participantes_turmas` VALUES ('148', '169', '1');

INSERT INTO `participantes_turmas` VALUES ('149', '171', '5');

INSERT INTO `participantes_turmas` VALUES ('150', '172', '11');

INSERT INTO `participantes_turmas` VALUES ('151', '173', '8');

INSERT INTO `participantes_turmas` VALUES ('152', '174', '6');

INSERT INTO `participantes_turmas` VALUES ('153', '175', '6');

INSERT INTO `participantes_turmas` VALUES ('154', '176', '5');

INSERT INTO `participantes_turmas` VALUES ('155', '177', '9');

INSERT INTO `participantes_turmas` VALUES ('156', '179', '7');

INSERT INTO `participantes_turmas` VALUES ('157', '180', '8');

INSERT INTO `participantes_turmas` VALUES ('158', '182', '23');

INSERT INTO `participantes_turmas` VALUES ('159', '184', '1');

INSERT INTO `participantes_turmas` VALUES ('160', '185', '5');

INSERT INTO `participantes_turmas` VALUES ('161', '186', '5');

INSERT INTO `participantes_turmas` VALUES ('162', '187', '5');

INSERT INTO `participantes_turmas` VALUES ('163', '188', '5');

INSERT INTO `participantes_turmas` VALUES ('164', '189', '2');

INSERT INTO `participantes_turmas` VALUES ('165', '190', '1');

INSERT INTO `participantes_turmas` VALUES ('166', '191', '10');

INSERT INTO `participantes_turmas` VALUES ('167', '193', '1');

INSERT INTO `participantes_turmas` VALUES ('168', '195', '10');

INSERT INTO `participantes_turmas` VALUES ('169', '196', '8');

INSERT INTO `participantes_turmas` VALUES ('170', '197', '9');

INSERT INTO `participantes_turmas` VALUES ('171', '198', '10');

INSERT INTO `participantes_turmas` VALUES ('172', '199', '11');

INSERT INTO `participantes_turmas` VALUES ('173', '200', '10');

INSERT INTO `participantes_turmas` VALUES ('174', '201', '7');

INSERT INTO `participantes_turmas` VALUES ('175', '202', '7');

INSERT INTO `participantes_turmas` VALUES ('176', '204', '4');

INSERT INTO `participantes_turmas` VALUES ('177', '206', '8');

INSERT INTO `participantes_turmas` VALUES ('178', '207', '3');

INSERT INTO `participantes_turmas` VALUES ('179', '208', '5');

INSERT INTO `participantes_turmas` VALUES ('180', '209', '9');

INSERT INTO `participantes_turmas` VALUES ('181', '212', '3');

INSERT INTO `participantes_turmas` VALUES ('182', '213', '10');

INSERT INTO `participantes_turmas` VALUES ('183', '214', '3');

INSERT INTO `participantes_turmas` VALUES ('184', '215', '6');

INSERT INTO `participantes_turmas` VALUES ('185', '217', '3');

INSERT INTO `participantes_turmas` VALUES ('186', '218', '3');

INSERT INTO `participantes_turmas` VALUES ('187', '219', '8');

INSERT INTO `participantes_turmas` VALUES ('188', '220', '8');

INSERT INTO `participantes_turmas` VALUES ('189', '221', '5');

INSERT INTO `participantes_turmas` VALUES ('190', '222', '8');

INSERT INTO `participantes_turmas` VALUES ('191', '223', '2');

INSERT INTO `participantes_turmas` VALUES ('192', '224', '3');

INSERT INTO `participantes_turmas` VALUES ('193', '225', '3');

INSERT INTO `participantes_turmas` VALUES ('194', '226', '8');

INSERT INTO `participantes_turmas` VALUES ('195', '227', '8');

INSERT INTO `participantes_turmas` VALUES ('196', '229', '2');

INSERT INTO `participantes_turmas` VALUES ('197', '234', '3');

INSERT INTO `participantes_turmas` VALUES ('198', '235', '7');

INSERT INTO `participantes_turmas` VALUES ('199', '236', '7');

INSERT INTO `participantes_turmas` VALUES ('200', '237', '3');

INSERT INTO `participantes_turmas` VALUES ('201', '238', '7');

INSERT INTO `participantes_turmas` VALUES ('202', '239', '6');

INSERT INTO `participantes_turmas` VALUES ('203', '241', '4');

INSERT INTO `participantes_turmas` VALUES ('204', '242', '1');

INSERT INTO `participantes_turmas` VALUES ('205', '243', '6');

INSERT INTO `participantes_turmas` VALUES ('206', '244', '3');

INSERT INTO `participantes_turmas` VALUES ('207', '245', '8');

INSERT INTO `participantes_turmas` VALUES ('208', '246', '7');

INSERT INTO `participantes_turmas` VALUES ('209', '247', '7');

INSERT INTO `participantes_turmas` VALUES ('210', '248', '8');

INSERT INTO `participantes_turmas` VALUES ('211', '251', '10');

INSERT INTO `participantes_turmas` VALUES ('212', '252', '10');

INSERT INTO `participantes_turmas` VALUES ('213', '256', '7');

INSERT INTO `participantes_turmas` VALUES ('214', '257', '6');

INSERT INTO `participantes_turmas` VALUES ('215', '261', '4');

INSERT INTO `participantes_turmas` VALUES ('216', '262', '7');

INSERT INTO `participantes_turmas` VALUES ('217', '263', '3');

INSERT INTO `participantes_turmas` VALUES ('218', '264', '3');

INSERT INTO `participantes_turmas` VALUES ('219', '265', '3');

INSERT INTO `participantes_turmas` VALUES ('220', '267', '15');

INSERT INTO `participantes_turmas` VALUES ('221', '268', '9');

INSERT INTO `participantes_turmas` VALUES ('222', '269', '3');

INSERT INTO `participantes_turmas` VALUES ('223', '270', '4');

INSERT INTO `participantes_turmas` VALUES ('224', '271', '8');

INSERT INTO `participantes_turmas` VALUES ('225', '272', '3');

INSERT INTO `participantes_turmas` VALUES ('226', '275', '7');

INSERT INTO `participantes_turmas` VALUES ('227', '277', '4');

INSERT INTO `participantes_turmas` VALUES ('228', '279', '7');

INSERT INTO `participantes_turmas` VALUES ('229', '280', '8');

INSERT INTO `participantes_turmas` VALUES ('230', '281', '11');

INSERT INTO `participantes_turmas` VALUES ('231', '282', '10');

INSERT INTO `participantes_turmas` VALUES ('232', '284', '7');

INSERT INTO `participantes_turmas` VALUES ('233', '285', '3');

INSERT INTO `participantes_turmas` VALUES ('234', '286', '5');

INSERT INTO `participantes_turmas` VALUES ('235', '287', '7');

INSERT INTO `participantes_turmas` VALUES ('236', '289', '11');

INSERT INTO `participantes_turmas` VALUES ('237', '290', '3');

INSERT INTO `participantes_turmas` VALUES ('238', '292', '3');

INSERT INTO `participantes_turmas` VALUES ('239', '293', '6');

INSERT INTO `participantes_turmas` VALUES ('240', '295', '10');

INSERT INTO `participantes_turmas` VALUES ('241', '296', '8');

INSERT INTO `participantes_turmas` VALUES ('242', '299', '10');

INSERT INTO `participantes_turmas` VALUES ('243', '300', '10');

INSERT INTO `participantes_turmas` VALUES ('244', '301', '7');

INSERT INTO `participantes_turmas` VALUES ('245', '302', '7');

INSERT INTO `participantes_turmas` VALUES ('246', '303', '8');

INSERT INTO `participantes_turmas` VALUES ('247', '304', '10');

INSERT INTO `participantes_turmas` VALUES ('248', '305', '7');

INSERT INTO `participantes_turmas` VALUES ('249', '306', '7');

INSERT INTO `participantes_turmas` VALUES ('250', '308', '7');

INSERT INTO `participantes_turmas` VALUES ('251', '309', '2');

INSERT INTO `participantes_turmas` VALUES ('252', '314', '8');

INSERT INTO `participantes_turmas` VALUES ('253', '318', '4');

INSERT INTO `participantes_turmas` VALUES ('254', '321', '3');

INSERT INTO `participantes_turmas` VALUES ('255', '329', '2');

INSERT INTO `participantes_turmas` VALUES ('256', '331', '7');

INSERT INTO `participantes_turmas` VALUES ('257', '333', '7');

INSERT INTO `participantes_turmas` VALUES ('258', '334', '7');

INSERT INTO `participantes_turmas` VALUES ('259', '335', '10');

INSERT INTO `participantes_turmas` VALUES ('260', '336', '7');

INSERT INTO `participantes_turmas` VALUES ('261', '339', '5');

INSERT INTO `participantes_turmas` VALUES ('262', '342', '7');

INSERT INTO `participantes_turmas` VALUES ('263', '343', '7');

INSERT INTO `participantes_turmas` VALUES ('264', '344', '10');

INSERT INTO `participantes_turmas` VALUES ('265', '348', '7');

INSERT INTO `participantes_turmas` VALUES ('266', '351', '10');

INSERT INTO `participantes_turmas` VALUES ('267', '352', '10');

INSERT INTO `participantes_turmas` VALUES ('268', '359', '10');

INSERT INTO `participantes_turmas` VALUES ('269', '364', '10');

INSERT INTO `participantes_turmas` VALUES ('270', '367', '5');

INSERT INTO `participantes_turmas` VALUES ('271', '369', '9');

INSERT INTO `participantes_turmas` VALUES ('272', '370', '9');

INSERT INTO `participantes_turmas` VALUES ('273', '371', '10');

INSERT INTO `participantes_turmas` VALUES ('274', '372', '7');

INSERT INTO `participantes_turmas` VALUES ('275', '380', '10');

INSERT INTO `participantes_turmas` VALUES ('276', '381', '6');

INSERT INTO `participantes_turmas` VALUES ('277', '382', '5');

INSERT INTO `participantes_turmas` VALUES ('278', '383', '4');

INSERT INTO `participantes_turmas` VALUES ('279', '385', '3');

-- ----------------------------

-- Table structure for `salas`

-- ----------------------------

DROP TABLE IF EXISTS `salas`;

CREATE TABLE
    `salas` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `local` varchar(45) NOT NULL,
        PRIMARY KEY (`id`)
    ) ENGINE = InnoDB AUTO_INCREMENT = 30 DEFAULT CHARSET = utf8;

-- ----------------------------

-- Records of salas

-- ----------------------------

INSERT INTO `salas` VALUES ('1', 'IFMS - Sala 201');

INSERT INTO `salas` VALUES ('2', 'IFMS - Sala 104');

INSERT INTO `salas` VALUES ('3', 'IFMS - Auditório');

INSERT INTO `salas` VALUES ('4', 'IFMS - Sala 101');

INSERT INTO `salas` VALUES ('5', 'IFMS - Lab. 4');

INSERT INTO `salas` VALUES ('6', 'IFMS - Lab. de Solos');

INSERT INTO `salas` VALUES ('7', 'IFMS - Lab. de Química');

INSERT INTO `salas`
VALUES (
        '8',
        'IFMS - Laboratório de Agroindustrialização'
    );

INSERT INTO `salas` VALUES ('9', 'IFMS - Casa de Vegetação');

INSERT INTO `salas` VALUES ('10', 'IFMS - Lago');

INSERT INTO `salas` VALUES ('11', 'Embrapa');

INSERT INTO `salas` VALUES ('12', 'Parque dos Ervais');

INSERT INTO `salas` VALUES ('13', 'Magsul');

INSERT INTO `salas`
VALUES (
        '14',
        '4º Grupamento de Bombeiros Militar'
    );

INSERT INTO `salas` VALUES ('15', 'Empresa Oeste Verde');

INSERT INTO `salas` VALUES ('16', 'IFMS - Pátio');

INSERT INTO `salas` VALUES ('17', 'IFMS - Lab. 3');

INSERT INTO `salas` VALUES ('18', 'IFMS');

INSERT INTO `salas` VALUES ('19', 'IFMS - Sala 202');

INSERT INTO `salas`
VALUES (
        '21',
        'Horto florestal entrada da trilha'
    );

INSERT INTO `salas`
VALUES (
        '22',
        '11º Regimento de Cavalaria Mecanizada'
    );

INSERT INTO `salas`
VALUES (
        '23',
        'IFMS - Salas 205 à 208 e 105 à 107'
    );

INSERT INTO `salas` VALUES ('24', 'IFMS - Lab. 1');

INSERT INTO `salas`
VALUES (
        '25',
        'Centro de convenções Miguel Gomez'
    );

INSERT INTO `salas`
VALUES (
        '26',
        'Escola Municipal Orlando Mendes Gonçalves'
    );

INSERT INTO `salas`
VALUES (
        '27',
        'IFMS - Laboratório de Mecanização'
    );

INSERT INTO `salas`
VALUES (
        '28',
        'IFMS - Laboratório de Entemologia'
    );

INSERT INTO `salas` VALUES ('29', 'IFMS - Sala 205');

-- ----------------------------

-- Table structure for `turmas`

-- ----------------------------

DROP TABLE IF EXISTS `turmas`;

CREATE TABLE
    `turmas` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `turma` varchar(100) DEFAULT NULL,
        PRIMARY KEY (`id`)
    ) ENGINE = InnoDB AUTO_INCREMENT = 25 DEFAULT CHARSET = utf8;

-- ----------------------------

-- Records of turmas

-- ----------------------------

INSERT INTO `turmas` VALUES ('1', 'TEC. INFO - 2 - Vespertino');

INSERT INTO `turmas` VALUES ('2', 'TEC. INFO - 4 - Vespertino');

INSERT INTO `turmas` VALUES ('3', 'TEC. INFO - 6 - A - Matutino');

INSERT INTO `turmas` VALUES ('4', 'TEC. INFO - 6 - B - Matutino');

INSERT INTO `turmas` VALUES ('5', 'TEC. INFO - 2 - Matutino');

INSERT INTO `turmas` VALUES ('6', 'TEC. INFO - 4 - Matutino');

INSERT INTO `turmas` VALUES ('7', 'TEC. AGRI - 2 - Matutino');

INSERT INTO `turmas` VALUES ('8', 'TEC. AGRI - 4 - Matutino');

INSERT INTO `turmas` VALUES ('9', 'TEC. AGRI - 6 - Matutino');

INSERT INTO `turmas` VALUES ('10', 'TEC. AGRI - 2 - Vespertino');

INSERT INTO `turmas` VALUES ('11', 'TEC. AGRI - 4 - Vespertino');

INSERT INTO `turmas` VALUES ('12', 'TEC. AGRI - 6 - Vespertino');

INSERT INTO `turmas` VALUES ('13', 'Bacharelado em Agronomia - 2');

INSERT INTO `turmas` VALUES ('14', 'Bacharelado em Agronomia - 4');

INSERT INTO `turmas` VALUES ('15', 'Bacharelado em Agronomia - 6');

INSERT INTO `turmas` VALUES ('16', 'Bacharelado em Agronomia - 8');

INSERT INTO `turmas` VALUES ('17', 'Tecnologia em Agronegócio - 2');

INSERT INTO `turmas` VALUES ('18', 'Tecnologia em Agronegócio - 3');

INSERT INTO `turmas` VALUES ('19', 'Tecnologia em Agronegócio - 4');

INSERT INTO `turmas` VALUES ('20', 'Tecnologia em Agronegócio - 5');

INSERT INTO `turmas` VALUES ('21', 'Tecnologia em Agronegócio - 6');

INSERT INTO `turmas` VALUES ('22', 'Tecnologia em Agronegócio - 7');

INSERT INTO `turmas`
VALUES (
        '23',
        'Técnico em Agricultura - Subsequente - 2'
    );

INSERT INTO `turmas`
VALUES (
        '24',
        'Técnico em Informática para Internet - Subsequente - 2'
    );

-- ----------------------------

-- Table structure for `turnos`

-- ----------------------------

DROP TABLE IF EXISTS `turnos`;

CREATE TABLE
    `turnos` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `periodo` varchar(45) NOT NULL,
        PRIMARY KEY (`id`)
    ) ENGINE = InnoDB AUTO_INCREMENT = 5 DEFAULT CHARSET = utf8;

-- ----------------------------

-- Records of turnos

-- ----------------------------

INSERT INTO `turnos` VALUES ('1', 'Matutino');

INSERT INTO `turnos` VALUES ('2', 'Vespertino');

INSERT INTO `turnos` VALUES ('3', 'Noturno');

INSERT INTO `turnos` VALUES ('4', 'Integral');

SET FOREIGN_KEY_CHECKS=1;

-- ---------------- ----------/Trabalho Final/--------------- ---------------------

-- ------------------Questão 01--------------------------------

-- Visualizar participantes, o evento e a data do mesmo
CREATE VIEW participante_evento as
	select p.id as participante_id, p.nome as nome, h.evento, h.data FROM participantes p
		join dados d on d.participante_id = p.id
		join horarios h on h.id = d.horario_id
		group by p.id;
        

-- Visualizar participantes presentes nas atividades e a localização das mesmas
CREATE VIEW participante_presentes as
	select p.id, p.nome, a.nome as Atividade, s.local, t.periodo from participantes p
		join participantes_atividades pa on p.id = pa.participante_id
		join atividades a on a.id = pa.atividade_id
		join salas s on s.id = a.sala_id
		join turnos t on t.id = a.turno_id
			where pa.presente !=0
			group by p.id; 
            

-- Visualizar alunos e suas respectivas turmas
CREATE VIEW alunos_turmas as
	select p.id, p.nome, t.turma from participantes p
		join participantes_turmas pt on pt.participante_id = p.id
		join turmas t on t.id = pt.turma_id;


-- ------------------Questão 02--------------------------------

DELIMITER //
CREATE TRIGGER deletar_aluno_turma
BEFORE DELETE ON participantes
	FOR EACH ROW
    BEGIN 
    DELETE FROM participantes_turmas WHERE participante_id = old.id;
END    //
DELIMITER ;

DELIMITER //
CREATE TRIGGER deletar_turma
BEFORE DELETE ON turmas
	FOR EACH ROW
    BEGIN 
    DELETE FROM participantes_turmas WHERE turma_id = old.id;
END    //
DELIMITER ;

-- ------------------Questão 03--------------------------------
-- Exibe tudo sobre as atividades de uma determinada data
DELIMITER //
create procedure atividade_data(in data_atv date)
begin
	select * from atividades
		where data = data_atv ;
    end //
    DELIMITER ;
    
    -- Exibie todos os alunos presentes em atividades de uma determinada data em um determinado periodo
    DELIMITER //
    create procedure participante_data_periodo(in periodo_atv varchar(20), data_atv date )
    begin
		select p.nome, t.periodo, a.data, pa.presente from participantes p
			join participantes_atividades pa on pa.participante_id = p.id
			join atividades a on a.id = pa.atividade_id
			join turnos t on t.id = a.turno_id
			where t.periodo = periodo_atv and a.data = data_atv and pa.presente !=0;
    end //
    DELIMITER ;

-- ------------------Questão 04--------------------------------
    
    create user 'krittz'@'localhost' identified by '123';
    grant select on db2_ava2.participantes to 'krittz'@'localhost';
    grant select on db2_ava2.participantes_turmas to 'krittz'@'localhost';
   

