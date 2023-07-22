FROM openjdk:8

WORKDIR /application

COPY . /application/

RUN javac App.java

ENTRYPOINT [ "java", "App" ]
