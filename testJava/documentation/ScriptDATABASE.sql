drop database if exists gestionproyectos;
create database if not exists gestionproyectos;
use gestionproyectos;

create table Cliente (ID int primary key auto_increment, nombre varchar(50), representante varchar(50), correo varchar(100), telefono varchar(13),
direccion varchar(20), sector enum('Tecnologia', 'salud', 'Educacion', 'Comercio', 'Manufactura'));


create table Servicio (ID int primary key auto_increment, nombre varchar(50), descripcion varchar(100), PrecioPorHora decimal(10, 2), 
Categoría enum("TI", "Limpieza", "Seguridad", "Administracion"));


create table Contrato (ID int primary key auto_increment, ID_Cliente int, ID_Servicio int, FechaInicio date, FechaFin date, CostoTotal decimal(10,2),
Estado enum("Activo", "En espera", "Finalizado"), foreign key (ID_Cliente) references Cliente(ID), foreign key (ID_Servicio) references Servicio(ID));


create table Proyecto (ID int primary key auto_increment, ID_Cliente int, nombre varchar(50), FechaInicio date, FechaFin date,
estado enum("En curso", "Completado", "Cancelado"), foreign key (ID_Cliente) references Cliente(ID));


create table Empleado (ID int primary key auto_increment, nombre varchar(50), cargo varchar(50), Salario decimal(10, 2), 
Especialidad enum("TI", "Administracion", "Limpieza", "Seguridad"), ID_Proyecto int, foreign key (ID_Proyecto) references Proyecto(ID));


create table Asignacion (ID int primary key auto_increment, ID_Proyecto int, HorasTrabajadas int, FechaAsignacion date, foreign key(ID_Proyecto)
references Proyecto(ID));