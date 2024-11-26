# Tricelium Network

Crearemos un sistema que permitira checar los estados de los medidores de agua

## Como obtener el codigo

```shell
#Para usuarios que no sean propietarios o que no tengan configurado la ssh key
$ git clone git@github.com:KevyJQ/TriPruebas.git
$ cd tricelium-network
```
Si tienes configurado la llave ssh, utiliza este comando

```shell
#Para el propietario y tienes la llave ssh
$ git clone git@github.com:KevyJQ/TriPruebas.git 
```

Este comando create un directory llamado `tricelium-network`.

> Nota: informacion de como configurar la llave ssh esta https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent 
## Como ver informacion del projecto

```shell
$ git branch
* main
$ git branch -va
* main                e5fca6a Descripcion del sistema
  remotes/origin/HEAD -> origin/main
  remotes/origin/main e5fca6a Descripcion del sistema`
```

> Nota: Para mover todos los archivos de una carpeta a la direcion pasada se usa el comando:
	$ mv * ../

## Para compilarlo y ejecutarlo

```shell
# Compilar y correr test
$ mvn package

# Compilar, correr test y generar jar con dependencias
$ mvn assembly:assembly -DdescriptorId=jar-with-dependencies


# Ver archivos en el jar
$ jar tf ./target/tricelium-network-0.0.1-SNAPSHOT-jar-with-dependencies.jar

$ cd intelligent-realestate	//ingresamos al directorio
$ java -cp target/tricelium-network-0.0.1-SNAPSHOT-jar-with-dependencies.jar \
       com.app.web.main.Main
```
> Nota: com.app.web.main  -> es el package donde se encuentra
>	SpringBootMain 	-> es el nombre de tu archivo Main
 

> Note: Las dependencias de maven estan en:
>
> Windows: C:\Users\<User_Name>\.m2

## Como conectarse a la base de datos

```shell
#Lo puedes checar en el archivo WebAlpplication.java
```
## Build and start spring-boot

```shell
# Build the project
$ mvn compile

# Start spring boot
$ mvn spring-boot:run

```
