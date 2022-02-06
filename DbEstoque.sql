create database estoque;

use estoque;

create table categorias (
idCategorias int primary key auto_increment,
nome varchar(100));

create table produto (
idProduto int primary key auto_increment,
nome varchar(100),
preco double,
quantidade int,
idCategorias int,
constraint fk_idCategorias foreign key (idCategorias) references categorias(idCategorias));


select * from categorias