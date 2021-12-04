FROM openjdk:11
EXPOSE 8080
ADD target/springboot-new-images.jar springboot-new-images.jar
ENTRYPOINT ["java","-jar","springboot-new-images.jar"]