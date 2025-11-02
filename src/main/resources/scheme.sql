-- Elimina la tabla 'users' si ya existe para asegurar un inicio limpio
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS PROFESSORS;

-- Crea la tabla 'users' con los campos originales, adaptados para SQLite
CREATE TABLE users (
    id INTEGER PRIMARY KEY AUTOINCREMENT, -- Clave primaria autoincremental para SQLite
    name TEXT NOT NULL UNIQUE,          -- Nombre de usuario (TEXT es el tipo de cadena recomendado para SQLite), con restricción UNIQUE
    password TEXT NOT NULL           -- Contraseña hasheada (TEXT es el tipo de cadena recomendado para SQLite)
);
    

CREATE TABLE professors (
    id_prof INTEGER PRIMARY KEY,
    dni INTEGER NOT NULL UNIQUE,
    legajo INTEGER NOT NULL UNIQUE,
    nombre TEXT NOT NULL,
    apellido TEXT NOT NULL,
    direccion TEXT,
    telefono INTEGER,
    correo TEXT NOT NULL UNIQUE,
    cargo TEXT,
    CONSTRAINT id_p_fk FOREIGN KEY id_prof REFERENCES users(id)
);