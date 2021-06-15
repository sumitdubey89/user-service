# user-service

things did not work with second line in property file
so it was removed and .import was used
spring.config.import=optional:configserver:http://localhost:8888
#spring.cloud.config.uri=http://localhost:8888

application-<profile>.yml or properties

change profile by adding in application.properties
spring.profiles.active=test

then application-test.yml or properties will be used

with any Bean we can use
@Profile("production") or @Profile("dev") to use values for properties from that application-profile.properties

<spring-cloud.version>Greenwich.RELEASE</spring-cloud.version> is added to avoid mentioning the version 
for all dependencies and pick from the universal one

writing @EnableEurekaClient along with @springBootApplication is not required.
Just add the below dependency and you are good to go
<dependency>
<groupId>org.springframework.cloud</groupId>
<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>