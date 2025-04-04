import java.util.*;
		public class Student {
		    String name;
		    int age;
		    String course;

		    // Constructor 1: Default Constructor (No Parameters)
		    public Student() {
		        this.name = "Unknown";
		        this.age = 0;
		        this.course = "Not Enrolled";
		    }

		    // Constructor 2: Constructor with Name and Age
		    public Student(String name, int age) {
		        this.name = name;
		        this.age = age;
		        this.course = "General Course";
		    }

		    // Constructor 3: Constructor with Name, Age, and Course
		    public Student(String name, int age, String course) {
		        this.name = name;
		        this.age = age;
		        this.course = course;
		    }

		    // Method to Display Student Details
		    public void displayInfo() {
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		        System.out.println("Course: " + course);
		        System.out.println("----------------------------");
		    }

		    public static void main(String[] args) {
		        // Using Default Constructor
		        Student s1 = new Student();
		        
		        // Using Constructor with Name and Age
		        Student s2 = new Student("Bhumika", 20);

		        // Using Constructor with Name, Age, and Course
		        Student s3 = new Student("Satyam", 22, "Computer Science");

		        // Displaying Information
		        s1.displayInfo();
		        s2.displayInfo();
		        s3.displayInfo();
		    }
		}
