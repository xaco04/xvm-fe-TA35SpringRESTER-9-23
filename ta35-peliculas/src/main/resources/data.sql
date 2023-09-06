DROP table IF EXISTS peliculas;
DROP table IF EXISTS salas;

CREATE TABLE peliculas(
	codigo int auto_increment,
    nombre nvarchar(100),
    calificacion_edad int,
    PRIMARY KEY(codigo)
);

CREATE TABLE salas(
	codigo int auto_increment,
    nombre nvarchar(100),
    pelicula int,
    PRIMARY KEY(codigo),
    FOREIGN KEY(pelicula) REFERENCES peliculas (codigo)
    ON DELETE cascade
    ON UPDATE cascade
);

INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('Citizen Kane', 3);
INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('The Wizard of Oz', 16);
INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('The Quiet Man', NULL);
INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('North by Northwest', NULL);
INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('The Last Tango in Paris', 18);
INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('Some Like it Hot', 13);
INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('A Night at the Opera', NULL);
INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('Citizen King', 6);

INSERT INTO salas (nombre, pelicula) VALUES ('Odeon', 5);
INSERT INTO salas (nombre, pelicula) VALUES ('Imperial', 1);
INSERT INTO salas (nombre, pelicula) VALUES ('Majestic', NULL);
INSERT INTO salas (nombre, pelicula) VALUES ('Royale', 6);
INSERT INTO salas (nombre, pelicula) VALUES ('Paraiso', 3);
INSERT INTO salas (nombre, pelicula) VALUES ('Nickelodeon', NULL);