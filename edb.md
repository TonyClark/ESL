# EDB

EDB is the development environment for ESL applications and simulations. The following screen-shot shows EDB after loading and running a simple hello-world application:

![](/assets/EDB.jpeg)

The key buttons are:

![](/assets/stop.png)stop a running application.

![](/assets/init.png) initialise a loaded application.

![](/assets/run.png) run an initialised application.

A new file can be created from the file browser on the left of the tool. It should be named SOMETHING.esl and can then be loaded into the file editor by double mouse-click. The file editor supports free text editing and will check the syntax of the ESL as you type and will also type-check the file once it is syntactically correct. You can also hover with the mouse over syntax elements to get information on them. For example, hovering over the variable `limit` in the body of `main` will tell you its type \(`Int`\) and where it was defined in the file.

To run an application you right-click on the file editor and select `load`. The application is ready for initialisation via the appropriate button. Initialisation creates the `main` actor. Once initialised, execution start by pressing the run button which starts sending messages to all available actors. The application stops when the operation `stopAll()` is called or when the stop button is pressed.

Output from the application is sent to the console window.

