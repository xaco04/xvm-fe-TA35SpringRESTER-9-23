DROP TABLE IF EXISTS fabricantes;
DROP TABLE IF EXISTS articulos;

CREATE TABLE articulos(
	codigo INT AUTO_INCREMENT,
    nombre NVARCHAR(100),
    precio INT,
    fabricante INT,
    PRIMARY KEY(codigo),
    FOREIGN KEY(fabricante) REFERENCES fabricantes (codigo)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE fabricantes(
	codigo INT AUTO_INCREMENT,
    nombre NVARCHAR(100),
    PRIMARY KEY(codigo)
);


INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Laptop',800,4);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Smartphone',400,2);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Tablet',300,1);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Desktop PC',700,5);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Printer',150,6);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('External Hard Drive',120,3);
INSERT INTO articulos (nombre, precio, fabricante) VALUES ('Monitor',200,4);

INSERT INTO fabricantes (nombre) VALUES ('Apple');
INSERT INTO fabricantes (nombre) VALUES ('Samsung');
INSERT INTO fabricantes (nombre) VALUES ('Microsoft');
INSERT INTO fabricantes (nombre) VALUES ('Lenovo');
INSERT INTO fabricantes (nombre) VALUES ('Dell');
INSERT INTO fabricantes (nombre) VALUES ('HP');
