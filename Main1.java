package pack2; // Declaring package

import pack1.Baseclass; // Importing the base class

public class Main {
    public static void main(String[] args) {
        Baseclass base = new Baseclass();
        Derivedclass derived = new Derivedclass();

        // Testing Access inside the same class
        base.testAccess(); 

        // Testing Access inside DerivedClass
        derived.testAccessInDerived();

        System.out.println("\nInside Main (Different Package, No Inheritance):");

        System.out.println(base.publicVar);   // ✅ Allowed (public)
        // System.out.println(base.protectedVar); // ❌ Not Allowed (protected not accessible without inheritance)
        // System.out.println(base.defaultVar);   // ❌ Not Allowed (default not accessible in different package)
        // System.out.println(base.privateVar);   // ❌ Not Allowed (private not accessible outside class)

        base.publicMethod();   // ✅ Allowed
        // base.protectedMethod(); // ❌ Not Allowed (protected not accessible without inheritance)
        // base.defaultMethod();   // ❌ Not Allowed (default method not accessible in different package)
        // base.privateMethod();   // ❌ Not Allowed (private method not accessible outside class)
    }
}
