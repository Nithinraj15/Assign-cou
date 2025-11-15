package Generics;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListProcessor processor = new ListProcessor();

        // creating a Array List for the numbers
        List<Number> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20.5);
        numbers.add(30.75);
        System.out.println("Sum of List: " + processor.sumOfList(numbers)); 

        // addIntegersToList
        List<Number> destination = new ArrayList<>();
        List<Integer> source = new ArrayList<>();
        source.add(5);
        source.add(10);
        source.add(15);
        processor.addIntegersToList(destination, source);
        System.out.print("Destination after adding integers: ");
        processor.printList(destination);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);  // Double
        doubleList.add(2.71);  // Double
        System.out.println("Sum of List<Double>: " + processor.sumOfList(doubleList));
        
        // printList
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        processor.printList(stringList); 

  
        // printList with Double List
        List<Double> doubleList1 = new ArrayList<>();
        doubleList1.add(3.14);
        doubleList1.add(2.71);
        processor.printList(doubleList1);
    }
}
