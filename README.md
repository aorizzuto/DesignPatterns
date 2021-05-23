# DesignPatterns

This repository was created in order to follow the uDemy course:

**Java Design Patterns & SOLID Design Principles**

## Overview

This course starts with SOLID Design Principles in Java. It will then provide a comprehensive introduction to Java Design patterns with practical, hands on exercises.

____________________

## SOLID Design Principles

SOLID design principles are almost a mandatory skill for every Java developer. These principles enable you to write most reusable & clean Java code in your projects. The SOLID Principles are:

* Single Responsibility Principle
* Open-Closed Principle
* Liskov Substitution Principle
* Interface Segregation Principle
* Dependency Inversion Principle

____________________

## Java Design Patterns

You'll find the following patterns:

* Creational Design Patterns: Simple Factory, Abstract Factory, Factory Method, Singleton, Builder, Prototype & Object Pool
* Structural Design Patterns: Object & Class Adapters, Decorator, Bridge, Facade, Static & Dynamic Proxy, Flyweight & Composite  
* Behavioral Design Patterns: Chain of Responsibility, Command, Interpreter, Mediator, Iterator, Memento, Observer, State, Strategy, Template Method, Visitor, & Null Object

____________________

### Creational Patterns

#### Abstract Factory

Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. This pattern provides one of the best ways to create an object.

In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.

#### Builder

Builder pattern builds a complex object using simple objects and using a step by step approach. This pattern provides one of the best ways to create an object.

A Builder class builds the final object step by step. This builder is independent of other objects.

#### Factory Method

The factory method pattern uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created.

#### Prototype

Prototype pattern refers to creating duplicate object while keeping performance in mind.

This pattern involves implementing a prototype interface which tells to create a clone of the current object. This pattern is used when creation of object directly is costly. For example, an object is to be created after a costly database operation. We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.

#### Simple Factory

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

#### Singleton

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.

____________________

### Behavioral Patterns

#### Chain of responsability

The chain of responsibility pattern creates a chain of receiver objects for a request. This pattern decouples sender and receiver of a request based on type of request. In this pattern, normally each receiver contains reference to another receiver. If one object cannot handle the request then it passes the same to the next receiver and so on.

#### Command

Command pattern is a data driven design pattern. A request is wrapped under an object as command and passed to invoker object. Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command.

#### Interpreter

Interpreter pattern provides a way to evaluate language grammar or expression. This pattern involves implementing an expression interface which tells to interpret a particular context. This pattern is used in SQL parsing, symbol processing engine etc.

#### Iterator

This pattern is used to get a way to access the elements of a collection object in sequential manner without any need to know its underlying representation.

#### Mediator

Mediator pattern is used to reduce communication complexity between multiple objects or classes. This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling.

#### Memento

Memento pattern is used to restore state of an object to a previous state.

#### Observer

Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically.

#### State

In State pattern a class behavior changes based on its state. We create objects which represent various states and a context object whose behavior varies as its state object changes.

#### Strategy

In Strategy pattern, a class behavior or its algorithm can be changed at run time. In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object. The strategy object changes the executing algorithm of the context object.

#### Template method

In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods. Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class.

#### Visitor

In Visitor pattern, we use a visitor class which changes the executing algorithm of an element class. By this way, execution algorithm of element can vary as and when visitor varies. As per the pattern, element object has to accept the visitor object so that visitor object handles the operation on the element object.

#### Null object

In Null Object pattern, a null object replaces check of NULL object instance. Instead of putting if check for a null value, Null Object reflects a do nothing relationship. Such Null object can also be used to provide default behaviour in case data is not available.

In Null Object pattern, we create an abstract class specifying various operations to be done, concrete classes extending this class and a null object class providing do nothing implemention of this class and will be used seemlessly where we need to check null value.

____________________

### Structural Patterns

#### Adapter / Wrapper

Adapter pattern works as a bridge between two incompatible interfaces. This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.

This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces. A real life example could be a case of card reader which acts as an adapter between memory card and a laptop. You plugin the memory card into card reader and card reader into the laptop so that memory card can be read via laptop.

We are demonstrating use of Adapter pattern via following example in which an audio player device can play mp3 files only and wants to use an advanced audio player capable of playing vlc and mp4 files.

#### Bridge

Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently. This pattern decouples implementation class and abstract class by providing a bridge structure between them.

This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes independent from interface implementer classes. Both types of classes can be altered structurally without affecting each other.

We are demonstrating use of Bridge pattern via following example in which a circle can be drawn in different colors using same abstract class method but different bridge implementer classes.

#### Composite

Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy. This pattern creates a tree structure of group of objects.

This pattern creates a class that contains group of its own objects. This class provides ways to modify its group of same objects.

We are demonstrating use of composite pattern via following example in which we will show employees hierarchy of an organization.

#### Decorator

Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This pattern acts as a wrapper to existing class.

This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

We are demonstrating the use of decorator pattern via following example in which we will decorate a shape with some color without alter shape class.

#### Facade

Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system. This pattern adds an interface to existing system to hide its complexities.

This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.

#### Flyweight

Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance. This pattern provides ways to decrease object count thus improving the object structure of application.

Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found. We will demonstrate this pattern by drawing 20 circles of different locations but we will create only 5 objects. Only 5 colors are available so color property is used to check already existing Circle objects.

#### Proxy

In proxy pattern, a class represents functionality of another class. In proxy pattern, we create object having original object to interface its functionality to outer world.

____________________

### What are Design Patterns & why should you care?

Design patterns represent solutions to common problems, which you face while doing programming. These solutions are reusable and can solve a wide variety of problems.
