FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY src ./src

RUN javac -d out src/com/example/customer/*.java

ENTRYPOINT ["java", "-cp", "out", "com.example.customer.CustomerApp"]