# time-tracker
interview project
#TIME TRACKER

This application was developed using Java and the Spring Boot framework to make future integrations with other microservices easy to implement.Thymeleaf,which works well with Java, was used to develop the frontend with CSS and Bootstrap added for styling.MySQL server was used as a data store and MySQL WorkBench was used to view data and interact with the MySQL server. This application IS using Spring Data JPA.

Instructions to users
YOU MUST REPLACE CREDENTIALS FOR THE LOCAL MYSQL DATABASE WITH YOUR CREDENTIALS IN application.properties file and then manually insert your username and password and then save them in your database BEFORE logging in, otherwise you wont logg in
-The user must have at least the JDK 1.8 version installed on their machine (which is available on the Oracle website) and the java environment variables properly set.On a Windows 10 machine follow this path:control panel -> System and Security -> System -> Advanced System Settings ,then click on path and add the path to the bin file present in the JRE folder and the JDK folder to the Path variable. -The user must use a MySQL database as its drivers were used to connect to the database in this application -Should the user chooses another data store which is not MySQL then they should include a dependency for a driver corresponding to that specific database in the pom file of this application. -Users running on their local machine may simply download MySQL server community version and a NetBeans 8.2 IDE with JDK and then use the IDE to open and run the application -Please note that the credentials for connecting to the MySQL database MUST be replaced with the user's MySQL database credentials in the application.properties file which is in the path src/main/resources or replace with credentials for their prefered database.
