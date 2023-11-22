FROM eclipse-temurin:17 
COPY targer/destlProject.jar finalProject.jar
CMD [ "java", "-jar", "finalProject.jar" ]