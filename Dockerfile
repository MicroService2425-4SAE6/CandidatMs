FROM openjdk:17
EXPOSE 8083
ADD target/CandidatSAE6-0.0.1-SNAPSHOT.jar candidat.jar
ENTRYPOINT ["java", "-jar","candidat.jar"]