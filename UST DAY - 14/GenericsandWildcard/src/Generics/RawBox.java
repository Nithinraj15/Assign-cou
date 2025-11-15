package Generics;

public class RawBox {
    private Object item;  // Field to store any type of object
    
    // Constructor to initialize the item
    public RawBox(Object item) {
        this.item = item;
    }

    // Method to return the item
    public Object getItem() {
        return item;
    }
}

