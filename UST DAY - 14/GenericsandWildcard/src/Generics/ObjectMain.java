package Generics;

// Creating the generic class Box
class Box<T> {
    private T items;  // Private variable to hold the item

    // Constructor to initialize the Box with an item
    Box(T items) {
        this.items = items;
    }

    // Method to get the item
    public T getItem() {
        return items;
    }

    // Method to set the item
    public void setItem(T items) {
        this.items = items;
    }

    // toString method to return a string representation of the Box
    @Override
    public String toString() {
        return "Box contains: " + items;
    }
}

class ArrayUtils {
    // Generic method for printing the array
    public static <T> void printArray(T[] array) {
        if (array == null) {
            System.out.println("The array is null.");
            return; 
        }

       
        for (T arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println(); 
    }
}

public class ObjectMain {
    public static void main(String args[]) {
        // Creating Box objects with type safety
        Box<Integer> integerBox = new Box<>(123);
        Box<String> stringBox = new Box<>("Hello Generics");

        // Printing initial contents of the boxes
        System.out.println(integerBox);  
        System.out.println(stringBox);  

        // Using the setItem() method to change the contents of only one box
        integerBox.setItem(456); 

        System.out.println(integerBox);  
        System.out.println(stringBox);   

        System.out.print("Integer array: ");
        ArrayUtils.printArray(new Integer[]{1, 2, 3});

        System.out.print("String array: ");
        ArrayUtils.printArray(new String[] {"apple", "banana", "cherry"});
    }
}
