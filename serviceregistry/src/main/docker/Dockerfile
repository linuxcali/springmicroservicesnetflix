FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER isaiaslopez.ti@gmail.com
ADD serviceregistry-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8090
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]