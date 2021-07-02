## Strategy Pattern

Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently of the clients that use it.  
The Strategy pattern suggests that you take a class that does something specific in a lot of different ways and extract all of these algorithms into separate classes called strategies.  
The original class, called context, must have a field for storing a reference to one of the strategies. The context delegates the work to a linked strategy object instead of executing it on its own.  
The context isn’t responsible for selecting an appropriate algorithm for the job. Instead, the client passes the desired strategy to the context.

![strategy pattern](https://github.com/bluething/design-patterns/blob/main/images/strategypattern.png?raw=true)

#### Reference:

[java-design-patterns strategy](https://github.com/iluwatar/java-design-patterns/tree/master/strategy)  
[Strategy](https://refactoring.guru/design-patterns/strategy)