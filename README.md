# S1.4-Testing

## 📄 **Description**


### **Level 01 : JUnit**

**Exercise 01 Subject**

    Create a Java class to manage a collection of books in a library.
    The class should allow adding books, retrieving the list of books,
    getting a specific book by its position, adding a book at a specific
    position, and removing a book by title.

    Implement the following functionalities:

        The class should allow adding books to the collection.
        It should be possible to retrieve the complete list of books.
        It should be possible to get the title of a book given its position.
        It should be possible to add a book at a specific position.
        It should be possible to remove a book by title.


    Verify its correct operation with JUnit:
    
        Verify that the list of books is not null after creating a new object.
        Confirm that the list has the expected size after inserting several books.
        Ensure that the list contains a specific book in its correct position.
        Verify that there are no duplicate book titles in the list.
        Check that it is possible to retrieve the title of a book given a specific position.
        Ensure that adding a book correctly modifies the list.
        Confirm that removing a book decreases the size of the list.
        Verify that the list remains sorted alphabetically after adding or removing a book.


**Exercise 01 - Observations**

The subject of this exercise asks to alphabetically sort books by title, but in the same
time it asks to add books at a certain position. I've decided to sort books in any case
of addition. So tests will also always check sorted results.

**Exercise 02**


    Create a class called CalculoDni that calculates the letter of the DNI (Spanish ID) when given the number as a 
    parameter.Create a JUnit class to verify its correct operation, parameterizing it so that the test receives a 
    wide spectrum of data and validates whether the calculation is correct for 10 predefined DNI numbers.


**Exercise 03**


    Create a class with a method that throws an ArrayIndexOutOfBoundsException.
    Verify its correct functioning with a JUnit test.


### **Level 02: AssertJ**

Create Java classes and/or tests that demonstrate the following:

**Exercise 01**

    An assertion that demonstrates that the value of two integer objects is equal,
    and another that shows that it is not.

**Exercise 02**

    An assertion that demonstrates that the reference to one object is the same as
    another, and another that shows they are different.

**Exercise 03**

    An assertion that shows that two arrays of integers are identical.

**Exercise 04**

    Create an ArrayList containing various types of objects (create those objects as well).
    Write an assertion to verify the order of the objects in the ArrayList as they were inserted.

        Now verify that the previous list contains the objects in any order.
        Check that, in the previous list, one of the objects has been added only once.
        Leave one of the elements out, and verify that the list does not contain that last one.

**Exercise 05** 

    Create a map and verify that it contains one of the keys you added.

**Exercise 06**

    Cause an ArrayIndexOutOfBoundsException in any class.
    Write an assertion that validates that the exception is thrown when appropriate

**Exercise 07**

    Create an empty Optional object. Write the correct assertion to verify
    that it is indeed empty.


## 💻 **Used technologies**

- Java
- Git

## 📋 **Requirements**

- Oracle OpenJDK 21.0.8

## 🛠️ **Install**

1. Clone this repo: **>  [git clone](https://github.com/mirexan/S1.2-Exceptions.git)**
2. Acces to the directories in: S1.3-Java-Collections