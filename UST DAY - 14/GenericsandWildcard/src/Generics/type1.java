package Generics; 
// Creating a class for the ObjectContainer 
class ObjectContainer {
    private Object item;

 // Initializing the Constructor
    public ObjectContainer(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}
 class StringContainer {
    private String item;
// Initializing the constructor
    public StringContainer(String item) {
        this.item = item;
    }
// it is the method used to get the getItem()
    public String getItem() {
        return item;
    }
}
 class IntegerContainer {
    private Integer item;
 // Initializing the Constructor
    public IntegerContainer(Integer item) {
        this.item = item;
    }
 // it is the method used to get the getItem()
    public Integer getItem() {
        return item;
    }
}

public class type1 {
    public static void main(String[] args) {
        //Storing and retrieving a String
        ObjectContainer stringContainer = new ObjectContainer("Hello Generics");
        String str = (String) stringContainer.getItem(); // Explicit cast
        System.out.println("Length of string: " + str.length());

        //Storing and retrieving an Integer
        ObjectContainer intContainer = new ObjectContainer(123);
        Integer num = (Integer) intContainer.getItem(); // Explicit cast
        System.out.println("Integer + 5 = " + (num + 5));

        // Demonstrating a Runtime Error
        ObjectContainer errorContainer = new ObjectContainer(456);
        // The actual object stored is an Integer, but we're trying to cast it to String.
        // The compiler allows this because it only sees Object and trusts the cast,
        // but the actual type mismatch is only caught at runtime.
        String errorStr = (String) errorContainer.getItem();
        System.out.println("This won't print: " + errorStr);
         StringContainer stringContainer1 = new StringContainer("Hello Generics");
        String str1 = stringContainer1.getItem(); // No casting needed
        System.out.println("Length of string: " + str1.length());

        // Test IntegerContainer
        IntegerContainer intContainer1 = new IntegerContainer(123);
        Integer num1 = intContainer1.getItem(); // No casting needed
        System.out.println("Integer + 10 = " + (num1 + 10));
    }
}
