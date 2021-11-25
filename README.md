<!-- Listar imagene disponibles. -->
docker image ls

<!-- Listar contenedores activos. -->
docker ps -a

<!-- Detener contenedor. -->
docker rm ID_DOCKER

<!-- Compilar contenedor. -->
docker build . -t server-docker-spring-boot

<!-- Levantar contenedor. -->
docker run -it --rm -d -p 8080:8080 --name caramelo server-docker-spring-boot

<!-- docker run -it --rm -p 8080:8080 server-docker-spring-boot -->

<!-- Acceder al servidor, cualquier otra url muestra una pagina de error -->
http://localhost:8080/demo