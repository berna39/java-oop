package com.terminator.intermediate;

/*
 * Polymorphism allows us to perform a single action in different ways. 
 * IE polymorphism allows you to define one interface and have multiple implementations.
 */

// 1. Compile-Time Polymorphism [ overriding & overloading ]

interface ICloud {

    void computeService();
}

class Gcp implements ICloud {

    @Override
    public void computeService() {
        System.out.println("Compute Engine");
    }

    // overloading
    public void computeService(String region) {
         System.out.println(String.format("Google CE - new Available region %s", region));
    }
}

class Aws implements ICloud {

    @Override
    public void computeService() {
        System.out.println("Elastic Computing");
    }
}

// 2. Run-time polymorphism

/*
 *  a process that resolves a call to an overridden method at runtime. The process involves 
 *  the use of the reference variable of a superclass to call for an overridden method.
 */

// A Java program to illustrate Dynamic Method
// Dispatch using hierarchical inheritance
class A
{
	void m1()
	{
		System.out.println("Inside A's m1 method");
	}
}

class B extends A
{
	// overriding m1()
	void m1()
	{
		System.out.println("Inside B's m1 method");
	}
}

class C extends A
{
	// overriding m1()
	void m1()
	{
		System.out.println("Inside C's m1 method");
	}
}

// Driver class
class Dispatch
{
	public static void main(String args[])
	{
		// object of type A
		A a = new A();

		// object of type B
		B b = new B();

		// object of type C
		C c = new C();

		// obtain a reference of type A
		A ref;
		
		// ref refers to an A object
		ref = a;

		// calling A's version of m1()
		ref.m1();

		// now ref refers to a B object
		ref = b;

		// calling B's version of m1()
		ref.m1();

		// now ref refers to a C object
		ref = c;

		// calling C's version of m1()
		ref.m1();
	}
}

