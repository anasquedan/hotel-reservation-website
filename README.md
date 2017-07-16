# hotel-reservation-website
Hotel Reservation Website

Create account on Heroku with below signup link .
https://signup.heroku.com/dc

Open Command Prompt and login on Heroku
C:\> heroku login

Make sure that your application is build on maven.
Add WebApp Runner that allows you to launch an application in a Tomcat (Web Application Server) container on any computer that has a JRE installed. No previous steps to install Tomcat are required when using Webapp Runner. It’s just a jar file that can be executed and configured using the java command.

Deploy website  to Heroku
 
Create a Procfile
You declare how you want your application executed in Procfile in the project root. Create this file with a single line:
      web:    java $JAVA_OPTS -jar target/dependency/webapp-runner.jar --port $PORT target/*.war
      
  Commit your changes to Git:

$ git init
$ git add .
$ git commit -m "Ready to deploy"     
      
Create the app:

$ heroku create hotel-reservation-website

It will show message like this:

Creating hotel-reservation-website... done, stack is cedar-14
https://hotel-reservation-website.herokuapp.com/ | https://git.heroku.com/hotel-reservation-website.git


Deploy your code:

$ git push heroku master

The application is now deployed. Ensure that at least one instance of the app is running:

$ heroku ps:scale web=1

Congratulations! Your web app should now be up and running on Heroku. Open it in your browser with:

$ heroku open     
      


 
