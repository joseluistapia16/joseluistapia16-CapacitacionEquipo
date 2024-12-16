create database fichas_medicas_desarrollo;

DROP TABLE IF EXISTS `area`;

CREATE TABLE `area` (
  `id_area` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `id_usuario`varchar(100) DEFAULT NULL,
  `estado` char(1) DEFAULT 'A',
  PRIMARY KEY (`id_area`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `area_ibfk_1` FOREIGN KEY (`id_usuario`) 
  REFERENCES `usuario` (`username`)
) ;

CREATE TABLE `correo` (
  `id_correo` int NOT NULL AUTO_INCREMENT,
  `correo` varchar(100) NOT NULL,
  `id_persona` varchar(20) DEFAULT NULL,
  `id_usuario` varchar(100) DEFAULT NULL,
  `estado` char(1) DEFAULT 'A',
  PRIMARY KEY (`id_correo`),
  KEY `id_usuario` (`id_usuario`),
  KEY `id_persona` (`id_persona`),
  CONSTRAINT `correo_ibfk_1` FOREIGN KEY (`id_usuario`) 
  REFERENCES `usuario` (`username`),
  CONSTRAINT `correo_ibfk_2` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`cedula`)
) ;



CREATE TABLE `estado_civil` (
  `id_estado_civil` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `id_usuario` varchar(100) DEFAULT NULL,
  `estado` char(1) DEFAULT 'A',
  PRIMARY KEY (`id_estado_civil`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `estado_civil_ibfk_1` FOREIGN KEY (`id_usuario`)
  REFERENCES `usuario` (`username`)
) ;


CREATE TABLE `ficha_medica` (
  `id_ficha_medica` int NOT NULL AUTO_INCREMENT,
  `fecha_registro` date DEFAULT NULL,
  `id_persona` varchar(20) DEFAULT NULL,
  `antecedentes_patologicos_personales` text,
  `antecedentes_patologicos_familiares` text,
  `habito` text,
  `estado_actual` text,
  `examen_fisico` text,
  `examen_complementario` text,
  `firma` varchar(100) DEFAULT NULL,
  `foto` text,
  `id_usuario` varchar(100) DEFAULT NULL,
  `estado` char(1) DEFAULT 'A',
  PRIMARY KEY (`id_ficha_medica`),
  KEY `id_persona` (`id_persona`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `ficha_medica_ibfk_1` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`cedula`),
  CONSTRAINT `ficha_medica_ibfk_2` FOREIGN KEY (`id_usuario`) 
  REFERENCES `usuario` (`username`)
) ;

CREATE TABLE `grupo_sanguineo` (
  `id_grupo_sanguineo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `id_usuario` varchar(100) DEFAULT NULL,
  `estado` char(1) DEFAULT 'A',
  PRIMARY KEY (`id_grupo_sanguineo`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `grupo_sanguineo_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`username`)
) ;




CREATE TABLE `parte_diario` (
  `id_parte_diario` int NOT NULL AUTO_INCREMENT,
  `fecha_registro` date DEFAULT NULL,
  `hora_entrada` time DEFAULT NULL,
  `id_persona` varchar(20) DEFAULT NULL,
  `diagnostico` text,
  `tratamiento` text,
  `obervacion` text,
  `permisos` text,
  `hora_salida` time DEFAULT NULL,
  `id_usuario` varchar(100) DEFAULT NULL,
  `estado` char(1) DEFAULT 'A',
  PRIMARY KEY (`id_parte_diario`),
  KEY `id_persona` (`id_persona`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `parte_diario_ibfk_1` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`cedula`),
  CONSTRAINT `parte_diario_ibfk_2` FOREIGN KEY (`id_usuario`)
  REFERENCES `usuario` (`username`)
) ;



CREATE TABLE `persona` (
  `cedula` varchar(20) NOT NULL,
  `nombres` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `n_hijos` int DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `id_grupo_sanguineo` int DEFAULT NULL,
  `id_estado_civil` int DEFAULT NULL,
  `id_area` int DEFAULT NULL,
  `id_usuario` varchar(100) DEFAULT NULL,
  `estado` char(1) DEFAULT 'A',
  PRIMARY KEY (`cedula`),
  KEY `id_grupo_sanguineo` (`id_grupo_sanguineo`),
  KEY `id_estado_civil` (`id_estado_civil`),
  KEY `id_area` (`id_area`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `persona_ibfk_1` FOREIGN KEY (`id_grupo_sanguineo`) REFERENCES `grupo_sanguineo` (`id_grupo_sanguineo`),
  CONSTRAINT `persona_ibfk_2` FOREIGN KEY (`id_estado_civil`) REFERENCES `estado_civil` (`id_estado_civil`),
  CONSTRAINT `persona_ibfk_3` FOREIGN KEY (`id_area`) REFERENCES `area` (`id_area`),
  CONSTRAINT `persona_ibfk_4` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`username`)
);


--

CREATE TABLE `roles` (
  `id_rol` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `id_usuario` varchar(100) NULL,
  `estado` char(1) DEFAULT 'A',
  PRIMARY KEY (`id_rol`)
) ;

--
-- Dumping data for table `roles`


CREATE TABLE `usuario` (
  `username` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL,
  `id_rol` int DEFAULT NULL,
  `id_usuario_registro` varchar(100) DEFAULT NULL,
  `estado` char(1) DEFAULT 'A',
  PRIMARY KEY (`username`),
  KEY `id_rol` (`id_rol`),
  CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_rol`) REFERENCES `roles` (`id_rol`)
) ;
