FROM registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift
COPY target/*.jar /home/jboss/test.jar
ENTRYPOINT ["java", "-jar", "/home/jboss/test.jar"]
