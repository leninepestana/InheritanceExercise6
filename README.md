# InheritanceExercise6
Working with Polymorphism

## Java Abstraction

`Abstract Classes and Methods`

Data abstraction is the process of hiding certain details and showing only essential information to the user.\
Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).

The abstract keyword is a non-access modifier, used for classes and methods:
- Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
- Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

![class-diagram-polymorphism](https://user-images.githubusercontent.com/22635013/130362329-9c178ce8-a6a9-4081-a1f7-8794a539771a.png)

### Why do we create abstract classes?

To reuse the code\
Superclass Polymorphism standardizes account types. Equal attributes are in the superclass. We can put all account types in a collection.

`abstractTestOne branch`

In the abstractTestOne branch, we create another possible implementation example with abstract classes.\
Using the abstract class Account we create a list in which we deposit 10.00 on all accounts. This type of operation is easier to implement in generic classes.