# Creational Patterns

## Abstract Factory

Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. This pattern provides one of the best ways to create an object.

In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.

## Builder

Builder pattern builds a complex object using simple objects and using a step by step approach. This pattern provides one of the best ways to create an object.

A Builder class builds the final object step by step. This builder is independent of other objects.

## Factory Method

The factory method pattern uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created.

## Prototype

Prototype pattern refers to creating duplicate object while keeping performance in mind.

This pattern involves implementing a prototype interface which tells to create a clone of the current object. This pattern is used when creation of object directly is costly. For example, an object is to be created after a costly database operation. We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.

## Simple Factory

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

## Singleton

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
