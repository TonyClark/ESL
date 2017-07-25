# ESL

ESL is an actor language that has been designed to run applications and simulations that require information-rich processing by autonomous computational units. Each actor runs in its own thread of control and communicates with other actors using asynchronous messages. ESL supports pattern-matching, data locks and higher-order functions. Applications in ESL are highly concurrent and are driven by system generated time-events. ESL can support sense-making of applications and simulations by generating state histories that record computation steps; once generated, a history can be interrogated using a temporal-logic based query language. ESL has a static type system that includes parametric polymorphism.

ESL application development is supported by a tool called EDB that provides real-time support for syntax and type checking. EDB can be used to create and manage an ESL application including its execution, debugging and history management. EDB allows ESL to generate graphical representations of running applications and of their histories.

ESL source code is compiled to run on a virtual machine implemented in Java and provides support for Java classes to be integrated with ESL applications by implementing an actor interface. EDB is implemented in Swing and uses a collection of open source libraries in addition to JxBrowser for HTML and SVG support. Both ESL and EDB are available via GPLv3. The use of JxBrowser is governed by JxBrowser Product Licence Agreement [http://www.teamdev.com/jxbrowser-licence-agreement](http://www.teamdev.com/jxbrowser-licence-agreement). If you would like to use JxBrowser in your development, please contact TeamDev.

---



