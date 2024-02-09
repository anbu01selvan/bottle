FROM eclipse-temurin:17
COPY target/bottle.jar bottle.jar
CMD ["java","-jar","bottle.jar"]