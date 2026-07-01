create database sensoresMedicoes;
use sensoresMedicoes;

create table sensor (
id int auto_increment primary key,
codigo varchar (30) not null,
tipo varchar (100),
localizacao varchar (100)
);

create table medicao (
id int auto_increment primary key,
valor double,
unidade int,
dataHora datetime
);



