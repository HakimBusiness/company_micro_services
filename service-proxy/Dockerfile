FROM openjdk
MAINTAINER Hakim Arhazzal <hakim.arhazzal@gmail.com>
ADD target/service-proxy.jar service-proxy.jar
ENTRYPOINT ["java", "-jar", "/service-proxy.jar"]
EXPOSE 8761