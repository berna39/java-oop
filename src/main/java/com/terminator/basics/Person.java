package com.terminator.basics;


/*
 * when defining a class
 * 
 *   - Modifiers: A class can be public or have default access.
 *   - Class name: The class name [CamelCase]
 *   - Superclass (if any): The name of the class’s parent (superclass), if any, preceded by the
 *                       keyword extends. A class can only extend (subclass) one parent.
 *   - Interfaces (if any): A comma-separated list of interfaces implemented by the class, if any, 
 *                       preceded by the keyword implements. A class can implement more than one interface.
 *   - Body: The class body is surrounded by braces, { }.
 * 
 */
public class Person {
    /*
     * Technically, in encapsulation, the variables or the data in a class is hidden from any other class
     * and can be accessed only through any member function of the class in which they are declared.
     * 
     * Encapsulation can be achieved by declaring all the variables in a class as private and writing public
     * methods in the class to set and get the values of the variables.
     * 
     */
    private String name;
    private String country;
    private int age;

    //Default Constructor
    public Person() {
    }

    // Parameterized Constructor
    public Person(String name, String country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    // deep copy constructor -> used to copy an object's values
    // PS: shallow copying is used to copy object reference
    public Person(Person p1) {
        this.name = p1.name;
        this.country = p1.country;
        this.age = p1.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }    

    /*
     * the method declaration consists of six components:
     *  - access modifier:
     *         * private: Accessible only within the class in which it is defined.
     *         * default (declared/defined without using any modifier): Accessible within the same class 
     *           and package within which its class is defined.
     *         * protected: Accessible within the package in which it is defined and in its subclass(es)
     *           (including subclasses declared outside the package).
     *         * public: Accessible in all classes in your application.
     *  - The return type: The data type of the value returned by the method or void if it does not return a value.
     *  - Method Name: The rules for field names apply to method names as well, but the convention is a little different.
     *  - Parameter list: Comma-separated list of the input parameters that are defined, preceded by their data type, 
     *    within the enclosed parentheses. If there are no parameters, you must use empty parentheses ().
     *  - Exception list: The exceptions you expect the method to throw. You can specify these exception(s).
     *  - Method body: It is the block of code, enclosed between braces, that you need to execute to perform your intended operations.
     * 
     */
    
    public void speak() {
        System.out.println("Hey there!");
    }
}
