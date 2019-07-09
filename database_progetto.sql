create database database_progetto;
use database_progetto;

create table utenti(
nome varchar(50),
cognome varchar(50),
indirizzo varchar(200),
CAP int,
telefono varchar(9),
email varchar(20),
pasword varchar(20),
libro_card int auto_increment primary key,
data_emissione date,
numero_punti int
);

create table libri(
titolo varchar(50),
casa_editrice varchar(50),
anno_pubblicazione year,
ISBN varchar(30) primary key,
genere varchar(20),
prezzo float,
descrizione varchar(100),
punti_card int,
copie_vendute int
);

create table ordine(
codice int primary key,
data_ordine date,
utente int,
nome varchar(50),
cognome varchar(50),
indirizzo varchar(200),
CAP int,
telefono varchar(9),
email varchar(20),
costo_totale int,
tipo_pagamento varchar(50),
punti_libro int,
foreign key (utente) references utenti(libro_card)
);

create table libri_ordine(
id int primary key,
codice_ordine int ,
ISBN varchar(30) ,
foreign key (codice_ordine) references ordine(codice),
foreign key (ISBN) references libri(ISBN));

create table responsabili(
username varchar(20) primary key,
pasword varchar(20));

create table autori(
codice int auto_increment primary key,
nome varchar(30));

create table autori_libri(
ISBN varchar(30),
codice int,
primary key(ISBN,codice),
foreign key (ISBN) references libri(ISBN),
foreign key (codice) references autori(codice));

create table generi(
id int auto_increment primary key,
nome varchar(20));

create table genere_libro(
ISBN varchar(30),
genere int,
primary key(ISBN,genere),
foreign key (ISBN) references libri(ISBN),
foreign key (genere) references generi(id));

create table classifica(
ISBN varchar(30) ,
genere int,
posizione int,
settimane int,
primary key(ISBN,genere),
foreign key (ISBN) references libri(ISBN),
foreign key (genere) references generi(id));