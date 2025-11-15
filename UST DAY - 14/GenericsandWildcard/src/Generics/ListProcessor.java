package Generics;
import java.util.List;

public class ListProcessor {

    // Method to calculate the sum of a list of numbers
    public double sumOfList(List<? extends Number> numbers) {
        double sum = 0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }

    // Method to add elements from source list to destination list
    public void addIntegersToList(List<? super Integer> destination, List<Integer> source) {
        destination.addAll(source);
    }

    // Method to print elements of a list of any type
    public void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");  
        }
        System.out.println(); 
    }
}

