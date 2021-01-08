FROM amazoncorretto:11

COPY ./gradlew .
COPY ./gradle gradle/
COPY ./settings.gradle.kts .
COPY ./build.gradle.kts .
COPY ./src/ src/

RUN ./gradlew clean build

CMD ["java", "-jar", "build/libs/graphql-api.jar"]
