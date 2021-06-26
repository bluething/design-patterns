## Observer Pattern

A good analogy for this pattern is that of a newspaper publisher.  
The publisher is the one in the relationship, and the subscribers are the many.  
The publisher will notify each of the subscribers of a new edition. As long as you remain a subscriber, you get new newspapers.  
Translated into the Observer pattern the Publisher is known as the Subject, and the subscribers are the observers.   
The subject notifies the observers of changes in its state.

`**Publishers + Subscribers = Observer Pattern**`

![observer pattern](https://github.com/bluething/design-patterns/blob/main/images/observerpattern.png?raw=true)  
The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

![class diagram](https://github.com/bluething/design-patterns/blob/main/images/observerpatternclassdiagram.png?raw=true)

#### The difference with Publish-Subscribe Pattern

In publish-subscribe pattern subscriber allowed expressing interest in different types of messages and further separates publishers from subscribers. It is often used in middleware systems.

#### Loose coupling

A loosely coupled designs will give us a lot of flexibility. It won't break easily and easy to change. Loose coupling means our object doesn't know or care too much about the details of another object.

Why observer pattern give us a loose coupling design?  
1. Subject only know that an observer will implement a certain interface (the Observer interface).  
2. Observer can be added at any time. No need to modify the subject. Because subject only care about observer interface.  
3. Subjects or observers can be reused independently.  
4. Changes to either the subject, or an observer will not affect the other.

#### Design Principle

**`Strive for loosely coupled designs between objects that interact`**

Loosely coupled designs allow us to build flexible OO systems that can handle change because they minimize the interdependency between objects.

**`Favor composition over inheritance`**

The observer pattern uses composition to compose any number of Observers with their Subject.

**`Program to an interface, not an implementation`**

Both Subject and Observer implement an interface. The subject keep track of objects implementing the observer interface, while observers register with, and get notified by the subject interface.

**`Identify the aspects of your application that vary and separate them from what stays the same`**

The thing that varies in observer pattern is the state of the subject, and the number and type of observers. With observer pattern, we can vary the object that are dependent on the state of the subject without having to change the subject.

#### Use case

Changing in one object leads to a change in other objects.

### Reference

Elisabeth Freeman, Eric Freeman, Bert Bates, and Kathy Sierra. 2004. <i>Head First Design Patterns</i>. O' Reilly &amp; Associates, Inc.  
[java-design-patterns/observer/](https://github.com/bluething/java-design-patterns/tree/master/observer)