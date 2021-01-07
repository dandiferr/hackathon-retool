FROM amazoncorretto:11 as build
WORKDIR /Bld

COPY ./gradlew .
COPY ./gradle gradle/
COPY ./build.gradle.kts .
COPY ./src/ src/

RUN ./gradlew build

FROM amazoncorretto:11 as runtime
WORKDIR /App
COPY --from=build /Bld/build/libs/*.jar app.jar

CMD ["java", "-jar", "app.jar"]