
-- USE DATABASE bd_tarjetero
\c bd_tarjetero;

------------------------------ Table: comercial ------------------------------

ALTER TABLE comercial
  DROP CONSTRAINT "comercial_pkey";
  
ALTER TABLE comercial
  DROP CONSTRAINT "comercial_codEmpresa_fkey";
          
------------------------------ Table: empresa ------------------------------

ALTER TABLE empresa
  DROP CONSTRAINT "empresa_pkey";
       

------------------------------ Table: etiquetas ------------------------------

ALTER TABLE etiquetas
 DROP CONSTRAINT "etiquetas_pkey";

