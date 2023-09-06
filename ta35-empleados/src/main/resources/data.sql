DROP table IF EXISTS departamentos;
DROP table IF EXISTS empleados;

CREATE TABLE departamentos(
	codigo int auto_increment,
    nombre nvarchar(100),
    presupuesto int,
    PRIMARY KEY(codigo)
);

CREATE TABLE empleados(
	dni varchar(8),
    nombre nvarchar(100),
    apellidos nvarchar(255),
    departamento int,
    PRIMARY KEY(dni),
    FOREIGN KEY(departamento) REFERENCES departamentos (codigo)
    ON DELETE cascade
    ON UPDATE cascade
);

INSERT INTO departamentos VALUES (14, 'IT', 65000);
INSERT INTO departamentos VALUES (37, 'Accounting', 15000);
INSERT INTO departamentos VALUES (59, 'Human Resources', 240000);
INSERT INTO departamentos VALUES (77, 'Research', 55000);

INSERT INTO empleados VALUES (12323487, 'Michael', 'Rogers', 14);
INSERT INTO empleados VALUES (15293448, 'Anand', 'Manikutty', 14);
INSERT INTO empleados VALUES (22236488, 'Carol', 'Smith', 37);
INSERT INTO empleados VALUES (32658741, 'Joe', 'Stevens', 37);
INSERT INTO empleados VALUES (33215471, 'Mary-Anne', 'Foster', 14);
INSERT INTO empleados VALUES (54652347, 'John', 'Doe', 59);
INSERT INTO empleados VALUES (63123148, 'David', 'Smith', 77);
INSERT INTO empleados VALUES (65487321, 'Zacary', 'Efron', 59);
INSERT INTO empleados VALUES (74568521, 'Eric', 'Goldsmith', 59);
INSERT INTO empleados VALUES (84565723, 'Luis', 'López', 14);
INSERT INTO empleados VALUES (84565724, 'Elizabeth', 'Doe', 14);
INSERT INTO empleados VALUES (84565725, 'Kumar', 'Swamy', 14);
INSERT INTO empleados VALUES (84565726, 'Jose', 'Pérez', 77);