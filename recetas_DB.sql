-- Script de prueba para el esquema recetasdb

USE recetasdb;

-- Insertar ingredientes
INSERT INTO ingrediente (nombre, tipo) VALUES ('Tomate', 'Verdura');
INSERT INTO ingrediente (nombre, tipo) VALUES ('Pollo', 'Carne');
INSERT INTO ingrediente (nombre, tipo) VALUES ('Aceite de oliva', 'Aceite');

-- Insertar usuarios
INSERT INTO usuario (nombre, apellidos, password, email, nick, direccion, rol)
VALUES ('Juan', 'Pérez', '1234', 'juan@example.com', 'juanp', 'Calle Falsa 123', 'admin');
INSERT INTO usuario (nombre, apellidos, password, email, nick, direccion, rol)
VALUES ('Ana', 'García', 'abcd', 'ana@example.com', 'anag', 'Avenida Real 456', 'usuario');

-- Insertar recetas
INSERT INTO receta (nombre, descripcion, dificultad, origen, comensales, usuario_id_usuario)
VALUES ('Ensalada de tomate', 'Ensalada fresca con tomate y aceite de oliva', 1, 'España', 2, 1);
INSERT INTO receta (nombre, descripcion, dificultad, origen, comensales, usuario_id_usuario)
VALUES ('Pollo al horno', 'Pollo asado con especias', 2, 'México', 4, 2);

-- Insertar relación receta_has_ingrediente
INSERT INTO receta_has_ingrediente (receta_id_receta, ingrediente_id_ingrediente, cantidad, unidad_medida)
VALUES (1, 1, 2, 'unidad');
INSERT INTO receta_has_ingrediente (receta_id_receta, ingrediente_id_ingrediente, cantidad, unidad_medida)
VALUES (1, 3, 10, 'ml');
INSERT INTO receta_has_ingrediente (receta_id_receta, ingrediente_id_ingrediente, cantidad, unidad_medida)
VALUES (2, 2, 1, 'kg');
INSERT INTO receta_has_ingrediente (receta_id_receta, ingrediente_id_ingrediente, cantidad, unidad_medida)
VALUES (2, 3, 20, 'ml');

-- Insertar pasos de preparación
INSERT INTO pasos_preparacion (id_pasos_preparacion, orden, descripcion, receta_id_receta)
VALUES (1, '1', 'Lavar los tomates', 1);
INSERT INTO pasos_preparacion (id_pasos_preparacion, orden, descripcion, receta_id_receta)
VALUES (2, '2', 'Cortar los tomates', 1);
INSERT INTO pasos_preparacion (id_pasos_preparacion, orden, descripcion, receta_id_receta)
VALUES (3, '1', 'Preparar el pollo', 2);
INSERT INTO pasos_preparacion (id_pasos_preparacion, orden, descripcion, receta_id_receta)
VALUES (4, '2', 'Meter al horno', 2);

-- Insertar reseñas
INSERT INTO resenia (comentario, valoracion, usuario_id_usuario, receta_id_receta)
VALUES ('Muy buena ensalada', 5, 2, 1);
INSERT INTO resenia (comentario, valoracion, usuario_id_usuario, receta_id_receta)
VALUES ('El pollo estaba jugoso', 4, 1, 2);

-- Consultas de prueba
SELECT * FROM ingrediente;
SELECT * FROM usuario;
SELECT * FROM receta;
SELECT * FROM receta_has_ingrediente;
SELECT * FROM pasos_preparacion;
SELECT * FROM resenia;