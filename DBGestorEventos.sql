drop database if exists gestor_eventos;
create database gestor_eventos;
use gestor_eventos;

CREATE TABLE Organizador (
    id_organizador int,
    nombre_empresa varchar(255) not null,
    correo_contacto varchar(255) not null,
    primary key pk_id_organizador (id_organizador)
);

CREATE TABLE Evento (
    id_evento int,
    nombre varchar(255) not null,
    descripcion TEXT,
    fecha datetime not null,
    ubicacion varchar(255),
    id_organizador int,
    primary key pk_id_evento (id_evento),
    constraint fk_Evento_Organizador foreign key (id_organizador) 
		references Organizador(id_organizador)
);

CREATE TABLE Usuario (
    id_usuario int,
    nombre_usuario varchar(255) not null,
    correo_electronico varchar(255) not null unique,
    primary key pk_id_usuario (id_usuario)
);

CREATE TABLE Ticket (
    id_ticket int,
    codigo_qr varchar(255) not null unique,
    precio decimal(10, 2) not null,
    estado enum('Vendido', 'Usado') not null,
    id_evento int,
    id_usuario int,
    primary key pk_id_ticket (id_ticket),
    constraint fk_Ticket_Evento foreign key (id_evento) 
		references Evento(id_evento),
    constraint fk_Ticket_Usuario foreign key (id_usuario) 
		references Usuario(id_usuario)
);
 