## jasper-scriptlet-demo

El proyecto es un archetipo maven básico que **importa** la librería de JasperReports.

La misma contiene una clase llamada *MyScriptletDemo* que extiende la clase JRDefaultScriptlet (que permite que el motor del Jasper pueda ejecutar sus métodos en los informes).

Una vez definidos los métodos (en el demo *padLeftWithCharacter* y *padLeftZeros*) se compila y ya esta listo para utilizarse.
> mvn clean install

### Como utilizar en el Jasper Studio

Se incluye en el build path del JasperStudio, para poder utilizarlo en el entorno de desarrollo del informe.
![Paso 1](https://github.com/claspina/jasper-scriptlet-demo/blob/main/images/paso1.png?raw=true)
![Paso 2](https://github.com/claspina/jasper-scriptlet-demo/blob/main/images/paso2.png?raw=true)

### Como importar en el reporte (JRXML)

Para utilizar los métodos del scriptlet necesitamos importar el mismo dentro del informe.
> Previa importación en el build path

![Paso 3](https://github.com/claspina/jasper-scriptlet-demo/blob/main/images/paso3.png?raw=true)
![Paso 4](https://github.com/claspina/jasper-scriptlet-demo/blob/main/images/paso4.png?raw=true)
![Paso 5](https://github.com/claspina/jasper-scriptlet-demo/blob/main/images/paso5.png?raw=true)
![Paso 6](https://github.com/claspina/jasper-scriptlet-demo/blob/main/images/paso6.png?raw=true)

### Como utilizar en tu proyecto

Para utilizar en el proyecto donde se ejecuta el informe solo es necesario agregarlo como dependencia

    <dependency>
        <groupId>py.com.claspina</groupId>
        <artifactId>jasper-utils</artifactId>
        <version>1.0</version>
    </dependency>


#### Se incluye al proyecto el archivo jrxml de muestra *Blank_A4.jrxml*
