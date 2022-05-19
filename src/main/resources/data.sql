DROP table IF EXISTS fabricantes;;
DROP table IF EXISTS articulos;

create table fabricante(
	id int auto_increment PRIMARY KEY,
	nombre varchar(250));
create table articulos (
	id int auto_increment PRIMARY KEY,
	nombre varchar(250),
	precio int,
	fabricante_id int,
	CONSTRAINT fabricante_fk FOREIGN KEY(fabricante_id) REFERENCES fabricante (id));

insert into fabricante (nombre) values ('Gerard');
insert into fabricante (nombre) values ('Aida');
insert into fabricante (nombre) values ('Constan');

insert into articulos (nombre,precio,fabricante_id) values ('Joan',15, 1);
insert into articulos (nombre,precio,fabricante_id) values ('Marc',40, 2);
insert into articulos (nombre,precio,fabricante_id) values ('Veronika',90, 3)
