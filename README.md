# spring-boot-rest-server
This is a spring boot rest server which delivers a simple html file

#create project
To create such a project, one can create it from intellij. For details check:
https://www.jetbrains.com/help/idea/spring-boot.html
We don't need any dependencies for this project yet.

##Start the application
###Magic Annotation @SpringBootApplication over the main Method
Tips to search for a file (Ctrl + Shift + N): Type Application!
When we open RestutorialApplication, we should see a green triangle on the left of the main Method there
we can click on it to start the application.
The application does nothing for now. We should see "Started RestutorialApplication in..."
This shows us that the application does nothing yet but has started successfully.

Congratulations. We have created an application with one step which is the base for very easy development.


Warning: I intentionally made a trap. The name of the project is false. It should be resttutorial with two "t"s.
The reason I have done this is to make sure you understand how important it is to "refactor" code and not "rename" code.

##create a simple Web Server
###Magic annotation @RestController over the class and @GetMapping over the method
For a software developer, this part is amazingly simple. We are going to create, with a very simple class, a server ;)
The objective of this part is to show that a browser can be connected to a custom server locally.

To create the rest Controller, just add @RestController over the Controller class and use the magic from intellij:
"alt + enter" while the cursor is on the RestController. This will automatically suggest to add a dependency, which are
the stuffs in the pom.xml file.

now the local server is called "localhost". The protocol it uses is "http" and the port it uses is 8080 per default.
(we can change the port if we want).
So, if we start the application at this level, there are two ways to see the call the server:
with a terminal command: curl http://localhost:8080, or we can simply enter http://localhost:8080 in a browser.

##Restful Service (next step)
This is an extended documentation of rest service: https://spring.io/guides/gs/rest-service/

