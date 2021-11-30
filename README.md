<!-- List available images. -->
docker image ls

<!-- List active containers. -->
docker ps -a

<!-- Stop container. -->
docker rm CONTAINER_ID

<!-- Get container information. -->
docker inspect CONTAINER_ID

<!-- Get container ip. -->
docker inspect -f '{{.NetworkSettings.IPAddress}}' CONTAINER_ID


<!-- Compile container. -->
docker build . -t server-docker-spring-boot

<!-- Lift container. -->
docker run -it --rm -d -p 8080:8080 --name caramelo server-docker-spring-boot

<!-- docker run -it --rm -p 8080:8080 server-docker-spring-boot -->

<!-- Access the server, any other url shows an error page -->
http://localhost:8080/demo