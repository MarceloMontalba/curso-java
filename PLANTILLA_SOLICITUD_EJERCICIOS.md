# Plantilla para Solicitar Ejercicios Java

## Descripción
Este documento sirve como plantilla para solicitar la creación de ejercicios Java basados en el contenido que hayas aprendido en tus archivos de estudio.

---

## Prompt Mejorado y Estructurado

```
Necesito que revises la carpeta "[NOMBRE_CARPETA]" donde tengo archivos de estudio de Java.

Basándote ÚNICAMENTE en los conceptos y comandos que aparecen en los archivos dentro de la carpeta "src", quiero que:

1. Crees una carpeta llamada "[NOMBRE_CARPETA_EJERCICIOS]" dentro de "src"

2. Dentro de esa carpeta, crees [NÚMERO] clases Java, donde cada una:
   - Tenga un nombre descriptivo del ejercicio
   - Esté completamente vacía (solo la estructura básica)
   - Contenga un comentario explicando el ejercicio a resolver

3. Los ejercicios deben cumplir con:
   - Estar basados en los conceptos vistos en mis archivos de estudio
   - Mencionar explícitamente qué comandos/métodos deben utilizarse
   - Incluir un ejemplo de salida esperada
   - Indicar los requisitos específicos

4. Los comentarios dentro de cada clase deben incluir:
   - Descripción clara del objetivo
   - Lista de requisitos técnicos
   - Métodos/comandos que deben usarse (Scanner, Integer.parseInt(), etc.)
   - Ejemplo de salida esperada
   - Pistas sobre estructuras de control si es necesario (try-catch, comparaciones, etc.)

Ejemplo de estructura de comentario:
   /*
    * EJERCICIO [N]: [Nombre del Ejercicio]
    * 
    * [Descripción clara del qué hacer]
    * 
    * Requisitos:
    * - [Requisito 1]
    * - [Requisito 2]
    * 
    * Métodos a usar:
    * - [Método 1]
    * - [Método 2]
    * 
    * Ejemplo de salida esperada:
    * [Mostrar ejemplo]
    */
```

---

## Notas Importantes

- **"SOLO basado en lo que he estado viendo"**: Asegúrate de que todos los ejercicios usen solo conceptos que aparezcan en tus archivos de estudio.
- **No incluyas conceptos avanzados** como Arrays, POO avanzada, Métodos customizados, etc., a menos que ya los hayas estudiado.
- **Usa variables claras** en el prompt (entre corchetes) para hacer la solicitud reutilizable.
- **Sé específico con los métodos**: Menciona exactamente qué métodos de Java deseas que se practiquen.

---

## Ejemplos de Variables a Reemplazar

```
[NOMBRE_CARPETA] → "tipos_variables", "objetos", "colecciones", etc.
[NOMBRE_CARPETA_EJERCICIOS] → "ejercicios", "tareas", "practica", etc.
[NÚMERO] → 3, 5, 10, etc.
```

---

## Versión Compacta (para Futuras Solicitudes)

Si prefieres una versión más concisa, puedes usar:

```
Revisa la carpeta [NOMBRE_CARPETA]. Basándote SOLO en los conceptos de los archivos en "src", 
crea una carpeta llamada "[NOMBRE_CARPETA_EJERCICIOS]" y dentro [NÚMERO] clases Java con 
ejercicios comentados. Cada clase debe:
- Tener un nombre descriptivo
- Estar vacía (solo estructura)
- Incluir comentario con objetivo, requisitos, métodos a usar y ejemplo de salida
- Usar SOLO los comandos que ya he aprendido
```

