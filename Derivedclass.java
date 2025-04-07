package pack2; // Declaring package

import pack1.Baseclass; // Importing the base class

// Derived class extending BaseClass
public class Derivedclass extends Baseclass {
    public void testAccessInDerived() {
        System.out.println("\nInside DerivedClass (Subclass in Different Package):");

        System.out.println(publicVar);   // ✅ Allowed (public)
        System.out.println(protectedVar); // ✅ Allowed (protected via inheritance)
        // System.out.println(defaultVar);   // ❌ Not Allowed (default not accessible in different package)
        // System.out.println(privateVar);   // ❌ Not Allowed (private not accessible outside class)

        publicMethod();   // ✅ Allowed
        protectedMethod(); // ✅ Allowed (protected via inheritance)
        // defaultMethod();   // ❌ Not Allowed (default method not accessible in different package)
        // privateMethod();   // ❌ Not Allowed (private method not accessible outside class)
    }
}
