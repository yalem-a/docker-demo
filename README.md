### Do maven install to generate jar file
Navigate to mvn and double click on install
OR run the following command 
   ```
./mvnw clean package -DskipTests
   ```

### Create Dockerfile

   ```
   FROM openjdk:17-alpine
   LABEL Yalew A
   COPY target/demo-0.0.1-SNAPSHOT.jar spring-boot-sample-api.jar
   ENTRYPOINT ["java","-jar","/spring-boot-sample-api.jar"]
   ```
### Build docker image
   ```
   docker build --tag=spring-boot-demo:v1 .
   ```

### Run the image
   ```
docker run -p8887:8080 spring-boot-demo:v1
   ```

### Steps for installing postgresql
   ```
docker run --name postgresql -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=admin123 -p 5432:5432 -v C:\Safaricom\Safaricom_2023\Projects\spring-security\security\postgres-db-data:/var/lib/postgresql/data -d postgres
   ```
