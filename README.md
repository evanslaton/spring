# Lab 12: Spring and REST

## Challenge
* Create an Album model.
* An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
* A user should be able to see information about all the albums on the site.
* A user should be able to add albums to the site.

## Instructions
* Clone repo from github: https://github.com/evanslaton/spring
* Create a database called album_app
* Create an application.properties file inside of the resources directory and add the following:
    * spring.datasource.platform=postgres
    * spring.datasource.url=jdbc:postgresql://localhost:<DATABASE>/album_app
    * spring.datasource.username=<USERNAME>
    * spring.datasource.password=<PASSWORD>

    * spring.jpa.generate-ddl=true // Add this line if it doesn't work the first time you run the app
    * spring.jpq.hibernate.ddl-auto=create
* Gradle command to run:  ./gradlew bootrun

