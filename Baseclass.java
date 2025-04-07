package pack1;
public class Baseclass {
    public String publicVar = "Public Variable";       // Accessible everywhere
    protected String protectedVar = "Protected Variable"; // Accessible in subclass (even if in different package)
    String defaultVar = "Default Variable";           // Accessible only within the same package
    private String privateVar = "Private Variable";   // Accessible only within this class

    // Public method (accessible everywhere)
    public void publicMethod() {
        System.out.println("Public Method: Accessible everywhere");
    }

    // Protected method (accessible within package & subclasses)
    protected void protectedMethod() {
        System.out.println("Protected Method: Accessible within the package & subclasses");
    }

    // Default method (accessible within the same package only)
    void defaultMethod() {
        System.out.println("Default Method: Accessible within the same package only");
    }

    // Private method (accessible only inside this class)
    private void privateMethod() {
        System.out.println("Private Method: Accessible only within this class");
    }

    // Method to test access inside the same class
    public void testAccess() {
        System.out.println("\nInside BaseClass:");
        System.out.println(publicVar);   // ✅ Allowed
        System.out.println(protectedVar); // ✅ Allowed
        System.out.println(defaultVar);   // ✅ Allowed
        System.out.println(privateVar);   // ✅ Allowed
        publicMethod();   // ✅ Allowed
        protectedMethod(); // ✅ Allowed
        defaultMethod();   // ✅ Allowed
        privateMethod();   // ✅ Allowed
    }
}
