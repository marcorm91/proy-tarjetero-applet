
-- USE DATABASE bd_tarjetero
\c bd_tarjetero;
          
------------------------------ Table: empresa ------------------------------

ALTER TABLE empresa
  ADD CONSTRAINT "empresa_pkey" PRIMARY KEY (codempresa);
       
------------------------------ Table: comercial ------------------------------

ALTER TABLE comercial
  ADD CONSTRAINT "comercial_pkey" PRIMARY KEY (codcomercial);
  
ALTER TABLE comercial
  ADD CONSTRAINT "comercial_codEmpresa_fkey" FOREIGN KEY (codempresa) REFERENCES empresa (codempresa);

------------------------------ Table: etiquetas ------------------------------

ALTER TABLE etiquetas
 ADD CONSTRAINT "etiquetas_pkey" PRIMARY KEY (etiqueta);
