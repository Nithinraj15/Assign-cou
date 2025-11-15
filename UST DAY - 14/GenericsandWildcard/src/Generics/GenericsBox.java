package Generics;

class GenericBox<T> {
 private T item; 
 
 // Constructor to initialize the item of type T
 public GenericBox(T item) {
     this.item = item;
 }

 // Method to return the item of type T
 public T getItem() {
     return item;
 }
}


