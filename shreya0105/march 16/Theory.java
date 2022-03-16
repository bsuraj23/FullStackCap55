//1................what are iterators and cursor?
//Ans:An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator"
//because "iterating" is the technical term for looping.
//To use an Iterator, you must import it from the java.util package.

//A Cursor is a subclass of Object class and it can be defined as point or indicator on the screen.
//A Cursor is used to select the input from the system that the user operates with the mouse.

//2................what is list iterator,Enumerator?
//Ans:The ListIterator interface of the Java collections framework provides the functionality to access elements of a list. 
//It is bidirectional.
//This means it allows us to iterate elements of a list in both the direction. It extends the Iterator interface.

//Enumeration means a list of named constant. In Java, enumeration defines a class type. An Enumeration can have constructors, 
//methods and instance variables.
//It is created using enum keyword. Each enumeration constant is public, static and final by default.

//3................what are predefined function present in collections?
//Ans:emptysortedMap()
//emptySortedSet()
//Enumeration(collection<T>c)
//emptyList()

//4..................what are underlying data structure in array list,linked list,stack?
//Ans:Linked List contains a link element called first. Each link carries a data field(s) and a link field called next.
//Each link is linked with its next link using its next link.
//Last link carries a link as null to mark the end of the list.

//ArrayList is a resizable array implementation in java. The backing data structure of ArrayList is an array of Object class.
//When creating an ArrayList you can provide initial capacity then the array is declared with the given capacity. 
//The default capacity value is 10.

//Stack is a linear data structure which follows a particular order in which the operations are performed.
//The order may be LIFO(Last In First Out) or FILO(First In Last Out).
//There are many real-life examples of a stack.


//5.............Advantages and disadvantages of arraylist in java?
//Ans:Advantages:
//You can define ArrayList as re-sizable array. Size of the ArrayList is not fixed.
//ArrayList can grow and shrink dynamically.
//2) Elements can be inserted at or deleted from a particular position.

//Disadvantages:
//A possible disadvantage of ArrayList is that it holds only object types and not primitive types (eg, int ). 
//To use a primitive type in an ArrayList,
//put it inside an object or use of the wrapper classes.


//6.............understand the hierarchy of exceptions?
//Ans:The hierarchy of Exceptions in the Java programming language begins with the Throwable class –
//which comes from the Object class and is its direct subclass.
//whileThe Exception class presents all This Throwable class further branches into two subclasses – Error and Exception.

//7................java program on 5/0. what will be the error?
//Ans:Exceptional error occurs i.e Arithmetic Exception error.

//8..............what are format exceptions?
//Ans:A FormatException exception can be thrown for one of the following reasons:
//In a call to a method that converts a string to some other data type, the string doesn't conform to the required pattern.
//This typically occurs when calling some methods of the Convert class and the Parse and ParseExact methods of some types.


//9..................Is  ArrayIndexoutofbound and IndexOutofbound are same?
//Ans:IndexOutOfBoundsException is the super class of ArrayIndexOutOfBoundsException (thrown when accessing invalid index in a array) 
//and StringIndexOutOfBoundsException (thrown when accessing invalid index in a String).


//10......................can try block be return without catch?
//Ans:Yes, It is possible to have a try block without a catch block by using a final block.

//11...................... can catch block be return without try block?
//Ans:No, it is not possible because the catch block would be useless as there is no piece of code to throw an exception. 













