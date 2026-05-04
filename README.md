# Gestión de Contenido Audiovisual - Unidad 2

## Objetivo de la Tarea
Ampliar y mejorar un proyecto Java utilizando conceptos avanzados de Programación Orientada a Objetos (POO), tales como herencia, asociación, agregación, y composición. Al final de esta actividad, se habrá integrado nuevas clases en un proyecto existente y desarrollado un sistema funcional. También aprenderemos a gestionar proyectos en GitHub.

## Nuevas Funcionalidades (Etapa 4)
He añadido dos nuevas subclases con relaciones específicas:
- **Podcast:** Utiliza una relación de **Composición** con la clase `Temporada`.
- **VideoJuego:** Utiliza una relación de **Asociación** con la clase `Actor`.
- **Mejora en Documental:** Implementación de **Agregación** para asignar un `Investigador`.

## Estructura de Carpetas
Siguiendo los estándares de desarrollo:
- `src/main/java/uni1a`: Clases de negocio y lógica de contenidos.
- `src/main/java/poo`: Clase principal de ejecución y pruebas.

## Instrucciones de Instalación y Uso
1. **Clonación:** Copia el enlace del repositorio y usa el comando `git clone` o descarga el ZIP.
2. **Importación:** En Eclipse, ve a *File > Import > Existing Projects into Workspace*.
3. **Ejecución:** Ejecuta el archivo `PruebaAudioVisual.java` ubicado en el paquete `poo`.

## Mejoras Implementadas
- Implementación de **IDs automáticos** en la clase padre.
- Uso de **Colecciones Dinámicas (ArrayList)** para manejar actores y temporadas, optimizando el uso de memoria frente a arreglos fijos.
