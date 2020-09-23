# Container build
FROM java:8-alpine

COPY build/libs/*.jar ./app.jar
CMD ["java","-jar","app.jar"]]