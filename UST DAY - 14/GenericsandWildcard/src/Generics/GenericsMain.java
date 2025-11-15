package Generics;
public class GenericsMain {
    public static void main(String[] args) {
        // Create GenericBox instances with specific types
        GenericBox<Integer> integerBox = new GenericBox<>(456);  // Box holding an Integer
        GenericBox<String> stringBox = new GenericBox<>("Java Generics");  // Box holding a String

        // Attempt to assign a String to an Integer box (this will cause a compile-time error)
        // Uncommenting the following line will cause a compile-time error:
        // integerBox = new GenericBox<>("WrongType");  // Compile-time error: incompatible types

        // The following lines are fine
        Integer integerItem = integerBox.getItem();  // No cast needed
        System.out.println("Integer Item: " + integerItem);  // Output: Integer Item: 456

        String stringItem = stringBox.getItem();  // No cast needed
        System.out.println("String Item: " + stringItem);  // Output: String Item: Java Generics
    }
}
