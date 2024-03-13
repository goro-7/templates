FROM --platform=linux/amd64 eclipse-temurin:21-jre
VOLUME /tmp
COPY build/libs/*.jar app.jar
#ARG JAVA_OPTS="-XX:TieredStopAtLevel=1 -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote=true -Djava.rmi.server.hostname=216.24.57.3 -Dcom.sun.management.jmxremote.port=9090 -Dcom.sun.management.jmxremote.rmi.port=9091  -Dcom.sun.management.jmxremote.local.only=false -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Dspring.jmx.enabled=true -Dspring.liveBeansView.mbeanDomain -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8"
ARG JAVA_OPTS="-XX:TieredStopAtLevel=1"
EXPOSE 443 443
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app.jar"]
