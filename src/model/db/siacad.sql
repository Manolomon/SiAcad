/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Deklok
 * Created: May 8, 2018
 */


CREATE TABLE Academia (
    idAcademia int NOT NULL auto_increment,
    nombre varchar(60),
    PRIMARY KEY (idAcademia)
);

CREATE TABLE ExperienciaEducativa (
    idExperienciaEducativa int NOT NULL auto_increment,
    nombre varchar(70),
    idAcademia int NOT NULL,
    PRIMARY KEY (idExperienciaEducativa),
    FOREIGN KEY (idAcademia) REFERENCES Academia(idAcademia)
);

CREATE TABLE Curso (
    idCurso int NOT NULL auto_increment,
    NRC varchar(15),
    programaEducativo varchar(50),
    bloque int,
    seccion int,
    idExperienciaEducativa int NOT NULL,
    PRIMARY KEY (idCurso),
    FOREIGN KEY (idExperienciaEducativa) REFERENCES ExperienciaEducativa(idExperienciaEducativa)
);

CREATE TABLE Rol (
    idRol int NOT NULL auto_increment,
    nombre varchar(20),
    PRIMARY KEY (idRol)
);

CREATE TABLE UsuarioAcademico (
    idUsuarioAcademico int NOT NULL auto_increment,
    nombre varchar(50),
    apellidos varchar(100),
    correo varchar(40),
    telefono varchar(10),
    username varchar(30),
    contrasena varchar(20),
    idRol int NOT NULL,
    PRIMARY KEY (idUsuarioAcademico),
    FOREIGN KEY (idRol) REFERENCES Rol(idRol)
);

CREATE TABLE Tipo (
    idTipo int NOT NULL auto_increment,
    nombre varchar(30),
    PRIMARY KEY (idTipo)
);

CREATE TABLE Maestro (
    idUsuarioAcademico int NOT NULL,
    noPersonal varchar(20),
    idTipo int NOT NULL,
    PRIMARY KEY (idUsuarioAcademico),
    FOREIGN KEY (idUsuarioAcademico) REFERENCES UsuarioAcademico(idUsuarioAcademico),
    FOREIGN KEY (idTipo) REFERENCES Tipo(idTipo)
);

CREATE TABLE PeriodoC (
    idPeriodo int NOT NULL auto_increment,
    idCurso int NOT NULL,
    idMaestro int NOT NULL,
    fechaInicio Date,
    fechaFin Date,
    PRIMARY KEY (idPeriodo,idCurso,idMaestro),
    FOREIGN KEY (idCurso) REFERENCES Curso(idCurso),
    FOREIGN KEY (idMaestro) REFERENCES Maestro(idUsuarioAcademico)
);

CREATE TABLE PlanDeTrabajo (
    idPlanDeTrabajo int NOT NULL auto_increment,
    formato varchar(50),
    fechaAprobacion Date,
    objetivoGeneral varchar(200),
    PRIMARY KEY (idPlanDeTrabajo)
);

CREATE TABLE EEPlanTrabajo (
    idEEPlanTrabajo int NOT NULL auto_increment,
    nombre varchar(70),
    herramientas varchar(300),
    idPlanDeTrabajo int NOT NULL,
    PRIMARY KEY (idEEPlanTrabajo),
    FOREIGN KEY (idPlanDeTrabajo) REFERENCES PlanDeTrabajo(idPlanDeTrabajo)
);

CREATE TABLE Tema (
    idTema int NOT NULL auto_increment,
    primerParcial varchar(500),
    segundoParcial varchar(500),
    resto varchar(500),
    idEEPlanTrabajo int NOT NULL,
    PRIMARY KEY (idTema),
    FOREIGN KEY (idEEPlanTrabajo) REFERENCES EEPlanTrabajo(idEEPlanTrabajo)
);

CREATE TABLE PlanDeCurso (
    idPlanDeCurso int NOT NULL auto_increment,
    formato varchar(50),
    objetivoGeneral varchar(1000),
    fecha Date,
    bibliografia varchar(3000),
    idCurso int,
    PRIMARY KEY (idPlanDeCurso)
    FOREIGN KEY (idCurso) REFERENCES Curso(idCurso)
);

CREATE TABLE Evaluacion (
    idEvaluacion int NOT NULL auto_increment,
    unidad int,
    fechas varchar(100),
    practicas varchar(1000),
    tecnicasDidacticas varchar(500),
    temas varchar(1000),
    idPlanDeTrabajo int,
    idPlanDeCurso int,
    PRIMARY KEY (idEvaluacion),
    FOREIGN KEY (idPlanDeTrabajo) REFERENCES PlanDeTrabajo(idPlanDeTrabajo),
    FOREIGN KEY (idPlanDeCurso) REFERENCES PlanDeCurso(idPlanDeCurso)
);


