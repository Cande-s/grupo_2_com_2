-- Elimina la tabla 'users' si ya existe para asegurar un inicio limpio
DROP TABLE IF EXISTS users;

-- Crea la tabla 'users' con los campos originales, adaptados para SQLite
CREATE TABLE users (
    id INTEGER PRIMARY KEY AUTOINCREMENT, -- Clave primaria autoincremental para SQLite
    name TEXT NOT NULL UNIQUE,          -- Nombre de usuario (TEXT es el tipo de cadena recomendado para SQLite), con restricción UNIQUE
    password TEXT NOT NULL           -- Contraseña hasheada (TEXT es el tipo de cadena recomendado para SQLite)
);

CREATE TABLE persons (
    id_per INTEGER,
    dni INTEGER NOT NULL UNIQUE,
    nombre varchar(20) NOT NULL,
    apellido varchar(20) NOT NULL,
    direccion varchar(50),
    telefono INTEGER,
    correo varchar(255) NOT NULL UNIQUE,
    id_per INTEGER,
    CONSTRAINT id_fk FOREIGN KEY id_per REFERENCES users(id)
);

CREATE TABLE professors (
    id_prof
    legajo INTEGER,
    cargo varchar(20),
    CONSTRAINT id_p_fk FOREIGN KEY id_prof REFERENCES persons(id_per)
);