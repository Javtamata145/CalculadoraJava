# Requisitos de la Calculadora (solo multiplica)
 
## Requisitos funcionales
 
- **RF1:** El sistema debe permitir al usuario ingresar un número entero o decimal en un campo de texto.
- **RF2:** El sistema debe multiplicar el total acumulado por el número ingresado al presionar el botón "Multiply" y mostrar el resultado actualizado.
- **RF3:** El sistema debe mostrar el total acumulado en un campo de solo lectura, con valor inicial de 1.
- **RF4:** El sistema debe restablecer el total a su valor inicial (1) al presionar el botón "Clear".
- **RF5:** El sistema debe mostrar un mensaje de error cuando la entrada no sea un número entero o decimal válido, sin modificar el total.
## Requisitos no funcionales
 
- **RNF1:** El sistema debe separarse según el patrón MVC, conformándose por una clase modelo `CalcMode1`, una clase vista `CalcView` y una clase controlador `CalcController`.
 
