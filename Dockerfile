FROM amazoncorretto:21
LABEL authors="envite_consulting_gmbh"
COPY target/envite-bpm-ai-hackday-0.8.15-SNAPSHOT.jar envite-bpm-ai-hackday-0.8.15-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/envite-bpm-ai-hackday-0.8.15-SNAPSHOT.jar"]