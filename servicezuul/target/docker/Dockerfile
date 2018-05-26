FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER linuxcali@gmail.com
ADD servicezuul-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 80
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]