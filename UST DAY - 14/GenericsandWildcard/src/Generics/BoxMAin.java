package Generics;
public class BoxMAin {
    public static void main(String[] args) {
        // Create RawBox instances with different types of objects
        RawBox integerBox = new RawBox(123);    
        RawBox stringBox = new RawBox("Hello World");  

        Integer integerItem = (Integer) integerBox.getItem();  // Casting to Integer
        System.out.println("Integer Item: " + integerItem);  

        try {
            Integer stringItem = (Integer) stringBox.getItem();  
            System.out.println("String Item: " + stringItem);
        } catch (ClassCastException e) {
            // Catch and print the ClassCastException error
            System.out.println("Error: " + e.getMessage());
        }
    }
}

