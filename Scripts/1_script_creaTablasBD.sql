--------------------------- Database: bd_tarjetero ---------------------------
DROP DATABASE IF EXISTS bd_tarjetero;

CREATE DATABASE bd_tarjetero;

-- USE DATABASE bd_tarjetero
\c bd_tarjetero;
          
------------------------------ Table: empresa ------------------------------

DROP TABLE IF EXISTS empresa;

CREATE TABLE empresa
(
  codempresa character varying,
  nombre character varying,
  cif character varying,
  direccion character varying,
  tlf1 character varying,
  tlf2 character varying,
  etiquetas character varying,
  logo bytea
);
       
------------------------------ Table: comercial ------------------------------

DROP TABLE IF EXISTS comercial;

CREATE TABLE comercial
(
  codcomercial character varying,
  codempresa character varying,
  nombre character varying,
  nif character varying,
  direccion character varying,
  tlf character varying,
  correo character varying
);
  
------------------------------ Table: etiquetas ------------------------------

DROP TABLE IF EXISTS etiquetas;

CREATE TABLE etiquetas
(
  etiqueta character varying
);
