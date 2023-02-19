# Compiladores I - Proyecto MiniPascal / ANTLR4
- Catedratico: Ing. Roman Arturo Pineda. 
- Alumnos: Alejandro Davila, Julio David y Oscar Sanchez.

## Contenido
- Archivos generados para ANTLR4 con la gramatica desarollada ya compilada.

## Ejecucion de Gramatica
- Se debe ubicar en la carpeta raiz del proyecto y posteriormente hacer uso de los siguientes comandos:

- Identificar el archivo que contiene las reglas gramaticales:
```bash
antlr4 MiniPascalGrammar.g4 
```

- Compilar la gramatica
```bash
javac MiniPascalGrammar*.java
```
- O su variante
```bash
compile MiniPascalGrammar*.java
```
- Ejecutar el entorno grafico del arbol generado:
```bash
grun MiniPascalGrammar program -gui {archivo_test}
```