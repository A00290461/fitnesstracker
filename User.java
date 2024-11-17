// Class definition
public class User {

    // Fields (Attributes) - encapsulation demonstrated by private access modifier
    private String name;  // User's name
    private int age;      // User's age

    // Constructor - initializing user details
    public User(String name, int age) {
        this.name = name; // 'this' differentiates between instance variable and parameter
        this.age = age;
    }

    // Getter for name - demonstrates encapsulation
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Simple validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Overloaded method - method overloading demonstration
    public void displayUserDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void displayUserDetails(boolean isDetailed) {
        if (isDetailed) {
            System.out.println("User details - Name: " + name + ", Age: " + age);
        } else {
            System.out.println("Name: " + name);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a User object
        User user = new User("Alice", 25);

        // Displaying user details
        user.displayUserDetails(); // Calls the first method
        user.displayUserDetails(true); // Calls the overloaded method

        // Modifying attributes using setters
        user.setAge(30);
        user.setName("Bob");

        // Displaying updated details
        user.displayUserDetails();
    }
}
