# Resumen
Este proyecto es una aplicación de escritorio desarrollada en Java utilizando JavaFX. El objetivo fundamental del ejercicio es diseñar un formulario básico de registro que captura múltiples entradas del usuario (Nombre, Correo Electrónico y Contraseña) y realiza una validación conjunta para asegurar que no se envíen campos vacíos.

## Características
Captura de Datos Múltiple: Utiliza tres instancias independientes de TextField configuradas con sus respectivos textos de sugerencia (Prompt Text) para estructurar el formulario de manera intuitiva.

Validación Lógica Estricta: Implementa una condición booleana compuesta mediante el operador lógico || (OR) para impedir el procesamiento si tan solo uno de los campos se encuentra sin rellenar.

Notificación por Consola: Envía flujos de información a la terminal (System.out.println) actuando como un sistema de logs para notificar si el registro ha sido exitoso o si ha ocurrido un error de validación.

Organización Vertical Básica: Apila de manera secuencial los tres cuadros de texto y el botón de acción por medio de un contenedor de disposición VBox.
