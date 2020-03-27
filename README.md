# Arep-LambdaGateway

Esta aplicación crea un servicio que recibe un parametro numerico y retorna el cuadrado del número, usando Amazon Gateway Y lambda. 
La aplicación se utiliza en una maquina virtual de AWS y un grupo de autoescalabilidad, los archivos se guardan en s3.


## Getting Started

Para utilizar este proyecto, primero clone este repositorio o descargue el proyecto.

Luego acceda a la dirección donde se encuentra el proyecto y ejecuta los siguientes comandos

```
mvn compile
mvn package
mvn install
```
Para generar la documentación del proyecto utilice el comando

```
mvn javadoc:javadoc
```
Este comando generará la documentación en la carpeta 
```
 /target/site/apidocs/
 ```

Para ejecutar la aplicación localmente, ejecute el siguiente comando en su consola:

```
mvn exec:java -DexecainClass="edu.escuelaing.arep.WebApp"

```

### Proccedure




### Prerequisites

Para usar este programa es necesario tener java y maven en la máquina donde se ejecute.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Spark](http://sparkjava.com/) - Java micro Framework
* [AWS](https://aws.amazon.com/) - Cloud Computing Services


## Authors

* **Valentina Siabatto** - *Escuela Colombiana de Ingeniería Julio Garavito* 

See also the list of [contributors](https://github.com/Siabell/AREP-lab1-introduccion/graphs/contributors) who participated in this project.

## License

This project is licensed under the GNU General Public License v3.0 - see the [LICENSE.txt](LICENSE.txt) file for details


