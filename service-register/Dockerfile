FROM openjdk
MAINTAINER Hakim Arhazzal <hakim.arhazzal@gmail.com>
ADD target/service-register.jar service-register.jar
ENTRYPOINT ["java", "-jar", "/service-register.jar"]
EXPOSE 8765