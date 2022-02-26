DROP TABLE IF EXISTS Proveedor;
DROP TABLE IF EXISTS Localidad;
DROP TABLE IF EXISTS Provincia;
DROP TABLE IF EXISTS Tarifa;

CREATE TABLE Tarifa
(
    id              INT PRIMARY KEY,
    descripcion     VARCHAR(250) NOT NULL,
    inicio_vigencia VARCHAR(250) NOT NULL,
    fin_vigencia    VARCHAR(250) NOT NULL,
    categoria       VARCHAR(250) NOT NULL,
    sub_categoria   VARCHAR(250) NOT NULL,
    escala_consumo  VARCHAR(250),
    cargo_fijo      FLOAT        NOT NULL,
    cargo_variable  FLOAT        NOT NULL,
    tipo_energia  VARCHAR(250)
);

CREATE TABLE Proveedor
(
    id           INT PRIMARY KEY,
    nombre       VARCHAR(250) NOT NULL,
    cuit         VARCHAR(250) NOT NULL,
    email        VARCHAR(250) NOT NULL,
    tipo_energia VARCHAR(250) NOT NULL,
    tarifa_id    INT,
    FOREIGN KEY (tarifa_id) REFERENCES Tarifa
);

CREATE TABLE Provincia
(
    id     INT PRIMARY KEY,
    nombre VARCHAR(250) NOT NULL
);

CREATE TABLE Localidad
(
    id           INT PRIMARY KEY,
    nombre       VARCHAR(250) NOT NULL,
    cod_postal   VARCHAR(250) NOT NULL,
    provincia_id INT,
    FOREIGN KEY (provincia_id) REFERENCES Provincia
);

CREATE TABLE Proveedor_Localidad
(
    proveedor_id INT,
    localidad_id INT,
    PRIMARY KEY (proveedor_id, localidad_id),
    FOREIGN KEY (proveedor_id) REFERENCES Proveedor,
    FOREIGN KEY (localidad_id) REFERENCES Localidad
);

INSERT INTO Proveedor (id, nombre, cuit, email, tipo_energia)
VALUES (1, 'ABACA', '20-17637537-3', 'abc1@gmail.com', 'ELECTRICIDAD'),
       (2, 'COSSOCO', '20-17637548-3', 'abc2@gmail.com', 'GAS'),
       (3, 'LETO SA', '30-17637778-5', 'abc3@gmail.com', 'ELECTRICIDAD'),
       (4, 'PEREZ SA', '30-17233288-5', 'abc3@gmail.com', 'GAS');



INSERT INTO Tarifa (id, descripcion, inicio_vigencia, fin_vigencia, categoria, sub_categoria, escala_consumo,
                    cargo_fijo, cargo_variable, tipo_energia)
VALUES (1, 'Electricidad Residencial', '20/03/21', '20/03/25', 'R', '2', NULL, '100.50', '15.50', 'ELECTRICIDAD'),
       (2, 'Electricidad Comercial', '20/03/21', '20/03/25', 'G', '2', NULL, '400.50', '33.50', 'ELECTRICIDAD'),
       (3, 'Gas Comercial', '20/06/21', '20/09/25', 'C', 'P1', '0 a 1000m3', '780.50', '67.50', 'GAS'),
       (4, 'Gas Residencial', '20/06/21', '20/09/25', 'T', 'P2', '0 a 1000m3', '380.50', '37.50', 'GAS');


INSERT INTO Localidad (id, nombre, cod_postal)
VALUES (1, 'La Plata', '1900'),
       (2, 'Chascomus', '7130'),
       (3, 'Dolores', '7100'),
       (4, 'Castelli', '3705');



INSERT INTO Provincia (id, nombre)
VALUES (1, 'Buenos Aires'),
       (2, 'Santa Fe'),
       (3, 'Tucumán'),
       (4, 'La Rioja');

INSERT INTO Proveedor_Localidad (proveedor_id, localidad_id)

VALUES (1, 1),
       (1, 2),
       (2, 1),
       (2, 2),
       (3, 3),
       (3, 4),
       (4, 3),
       (4, 4)