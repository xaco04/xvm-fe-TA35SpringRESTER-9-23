DROP table IF EXISTS almacenes;
DROP table IF EXISTS cajas;

CREATE TABLE almacenes(
	codigo int auto_increment,
    lugar nvarchar(100),
    capacidad int,
    PRIMARY KEY(codigo)
);

CREATE TABLE cajas(
	num_referencia char(5),
    contenido nvarchar(100),
    valor int,
    almacen int,
    PRIMARY KEY(num_referencia),
    FOREIGN KEY(almacen) REFERENCES almacenes (codigo)
    ON DELETE cascade
    ON UPDATE cascade
);

INSERT INTO almacenes (lugar, capacidad) VALUES ('Valencia', 3);
INSERT INTO almacenes (lugar, capacidad) VALUES ('Barcelona', 4);
INSERT INTO almacenes (lugar, capacidad) VALUES ('Bilbao', 7);
INSERT INTO almacenes (lugar, capacidad) VALUES ('Los Angeles', 2);
INSERT INTO almacenes (lugar, capacidad) VALUES ('San Francisco', 8);

INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('0MN7', 'Rocks', 180, 3);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('4H8P', 'Rocks', 250, 1);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('4RT3', 'Scissors', 190, 4);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('7G3H', 'Rocks', 200, 1);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('8JN6', 'Papers', 75, 1);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('8Y6U', 'Papers', 50, 3);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('9J6F', 'Papers', 175, 2);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('LL08', 'Rocks', 140, 4);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('P0H6', 'Scissors', 125, 1);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('P2T6', 'Scissors', 150, 2);
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES ('TU55', 'Papers', 90, 5);