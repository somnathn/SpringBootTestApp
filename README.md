# File upload demo using Spring Boot , Swagger and Augular JS    

This is a basic web application built using Spring Boot , Swagger and AngularJS to showcase uploading and downloading of files to and from a database.    

### Building and Running Project  

To Build and Run Server App using gradle wrapper  

1) gradlew build   
2) java -jar build\libs\ServerAppFileUpload-0.1.0.jar  

To Run Client Side App   

Either you can open index.html in chrome  

or   

Install   

npm http-server     
http-server -o    
 
http://localhost:8081/  

Demo Steps  

1) Click on drop pane     
2) Select file to be uploaded    
3) Upload File using upload button     
4) Reload Table to view uploaded files details     
5) Reset Pane  

Server Side APIs are available at Swagger UI    

http://localhost:8080/swagger-ui.html  

Embedded database H2 is available at  

http://localhost:8080/console/  

JDBC URL:	 jdbc:h2:./FileStoreDB  
User Name:   sa  
Password:    pass  
