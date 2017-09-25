# PSL- LCD Exercise

## Método
La aplicación fue desarrollada desde 0.
 
## Objetivo
Crear un programa que imprime números en estilo de una pantalla LCD 

## Organización del proyecto
La solución planteada esta construida en Java. Posee 2 paquetes: util y main.

### Paquete util
Dentro de este paquete van las clases de comunicación. El paquete util contiene una única clase: LCDInputReader.  

#### LCDInputReader
Esta clase existe para recibir el input del usuario y permite, si así se desea, cambiar el input desde consola a otro medio alternativo de manera fácil y modular. Esta clase se encarga de entregar un input correcto y lanza excepción si el tamaño del número a imprimir no esta entre los límites establecidos (1 - 10).

### Paquete main
El paquete main contiene la lógica de la applicación. Contiene 3 clases: ImpresorLCD, NumbersConstructor, Number
#### ImpresorLCD
Es la clase encargada de procesar cada número a imprimir con su respectivo size. Para esto, construye cada una de las líneas completas del número, concatenando cada línea de cada digito en el número, usando un String Builder. Imprime cada línea el número de veces requerido, según el tamaño que entra por parametro. (abajo más explicación sobre que representa una línea completa)

#### NumbersConstructor
Es la clase encargada de crear cada número mediante su representación de líneas horizontales. Crea al inicio todos los números del 0 al 9 a través de la clase "Number". Posee 9 constantes. Cada una de las 9 constantes es el esquema para crear una línea compuesta de "-" o "|". Las distintas configuraciones de líneas que se pueden crear pueden formar, organizadas en el orden correcto, cada uno de los números del 1 al 9. 
Esta clase también se encarga de crear una línea a pedido de ImpresorLCD. El método que crea las líneas no necesita saber de que número hará parte la nueva línea, sino que tipo de linea se desea crear(debe ser una de las 9 constantes), y el tamaño de la línea.  

#### Number
Esta clase permite representar un número basado en una representación de 5 líneas horizontales. Es decir, cada número del 0 al 9 posee en su representación de clase "Number" 5 valores de tipo String. 

Esta clase surge de la siguiente observación:

La primera línea de un número únicamente contiene líneas horizontales o espacios, al igual que la última línea.
La línea del medio puede contener tanto espacios, líneas verticales u horizontales, pero si posee líneas verticales se encuentran en los extremos.
El resto de líneas que conforman el número solo poseen espacios o lineas verticales en alguno de los extremos o en ambos.

Regla de columnas: Dependiendo del tamaño a imprimir, los extremos de cada linea permanecen igual, sólo hay que rellenar el excedente para cumplir el size con " " o con "-" dependiendo del tipo de línea.
Esto para cumplir con la regla: size+2 columnas. Notece que las dos columnas se refiere a los extremos, y el espacio intermedio debe rellenarse, según el tipo de línea, con "size" relleno.

Regla de filas: Dependiendo del tamaño a imprimir, la primera línea se imprime una vez, al igual que la del medio y la última, pero las líneas intermedias se deben imprimir un número de veces igual al tamaño especificado por el usuario. 
Esto para cumplir con la regla: 2*size + 3 filas. Notece que el +3 filas hace referencia a la línea superior, intermedia e inferior, y el número de filas entre superior e intermedia, e intermedia e inferior, es de "size".

Ejemplo de del 8, con tamaño 2 representado con la clase Number: 

     --       Top Horizontal: La primera línea del número.Nunca contienen "|". Patrón: LINE_FULL_OF_HORIZONTALS 
    |  |      Top Vertical: Línea intermedia. Nunca contienen "-". Patrón: BOTH_VERTICALS (siempre el relleno son espacios)
    |  |      Esta línea es la segunda y última impresión de la línea intermedia de arriba, pues el size especificado fue 2.
    |--|      Middle: La línea del medio. Patrón: LINE_FULL_OF_HORIZONTALS_VERTICAL_START_AND_END (línea con extremos "|" y con "-" intermedios)
    |  |      Bot Vertical: Línea intermedia. Nunca contienen "-". Patrón: BOTH_VERTICALS (siempre el relleno son espacios) 
    |  |      Esta línea es la segunda y última impresión de la línea intermedia de arriba, pues el size especificado fue 2.
     --       Bot Horizontal: La última línea del número. .Nunca contienen "|". Patrón: LINE_FULL_OF_HORIZONTALS 



Entrada: La entrada contiene varias líneas. Cada línea contiene 2 números separados por coma. El primer número representa el tamaño de la impresión (entre 1 y 10, esta variable se llama “size”). El segundo número es el número a mostrar en la pantalla. Para terminar, se debe digitar 0,0. Esto terminará la aplicación.

Salida: Imprimir los números especificados usando el caracter “-“ para los caracteres horizontales, y “|” para los verticales. Cada dígito debe ocupar exactamente size+2 columnas y 2*size + 3 filas. 

Entre cada impresión debe haber una línea blanca. 
 
Ejemplo: 
Entrada:
2,1234
3,234567890
4,234567
0,0
   
Salida: 
```
      --   --       
   |    |    | |  | 
   |    |    | |  | 
   |  --   --|  --| 
   | |       |    | 
   | |       |    | 
      --   --       


 ---   ---         ---   ---   ---   ---   ---   ---  
    |     | |   | |     |         | |   | |   | |   | 
    |     | |   | |     |         | |   | |   | |   | 
    |     | |   | |     |         | |   | |   | |   | 
 ---   ---|  ---|  ---  |---      | |---|  ---| |   | 
|         |     |     | |   |     | |   |     | |   | 
|         |     |     | |   |     | |   |     | |   | 
|         |     |     | |   |     | |   |     | |   | 
 ---   ---         ---   ---         ---         ---  


 ----   ----          ----   ----   ----  
     |      | |    | |      |           | 
     |      | |    | |      |           | 
     |      | |    | |      |           | 
     |      | |    | |      |           | 
 ----   ----|  ----|  ----  |----       | 
|           |      |      | |    |      | 
|           |      |      | |    |      | 
|           |      |      | |    |      | 
|           |      |      | |    |      | 
 ----   ----          ----   ----         
```

## Consideraciones adicionales
- El ejemplo original de https://github.com/pslcorp/lcdrefactor no concuerda del todo con el enunciado, pues utiliza "_" y esto afecta el número de columnas. Se hizo caso omiso al ejemplo y se desarrollo tal cúal se exponía en el enunciado.


