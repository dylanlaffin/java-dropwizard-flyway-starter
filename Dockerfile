FROM maven:latest
#set maven dependency to specific version?

WORKDIR /src

COPY . /src

ARG DB_HOST
ARG DB_PASSWORD
ARG DB_USERNAME
ARG DB_NAME

ENV DB_HOST ${DB_HOST}
ENV DB_PASSWORD ${DB_PASSWORD}
ENV DB_USERNAME ${DB_USERNAME}
ENV DB_NAME ${DB_NAME}

RUN mvn clean install -DskipTests=true

EXPOSE 8080

CMD ["java","-jar", "target/java-dropwizard-flyway-starter-1.0-SNAPSHOT.jar", "server", "/src/config.yml"]