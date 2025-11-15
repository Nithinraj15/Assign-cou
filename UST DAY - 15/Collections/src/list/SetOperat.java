package list;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class SetOperations {
    // Performs union operation
    public static Set union(Set set1, Set set2) {
        Set resultSet = new HashSet(set1);  
        resultSet.addAll(set2);
        return resultSet;
    }

    // Performs intersection operation
    public static Set intersection(Set set1, Set set2) {
        Set resultSet = new HashSet(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }

    // Performs difference operation
    public static Set difference(Set set1, Set set2) {
        Set resultSet = new HashSet(set1); 
        resultSet.removeAll(set2);
        return resultSet;
    }

    public static boolean isSubset(Set set1, Set set2) {
        return set2.containsAll(set1); 
    }
}

public class SetOperat {
    public static void main(String[] args) {
        // Creating sets
        Set fruit1 = new HashSet<>(Arrays.asList("Apple", "Banana", "Orange"));
        Set fruit2 = new HashSet<>(Arrays.asList("Banana", "Grape", "Apple"));
        Set fruit3 = new HashSet<>(Arrays.asList("Apple", "Banana"));

        // Union of fruit1 and fruit2
        System.out.println("Union: " + SetOperations.union(fruit1, fruit2));

        // Intersection of fruit1 and fruit2
        System.out.println("Intersection: " + SetOperations.intersection(fruit1, fruit2));

        // Difference between fruit1 and fruit2
        System.out.println("Difference: " + SetOperations.difference(fruit1, fruit2));

        // Check if fruit3 is a subset of fruit1 (should be true)
        System.out.println("Is fruit3 a subset of fruit1? " + SetOperations.isSubset(fruit3, fruit1));

        // Check if fruit1 is a subset of fruit3 (should be false)
        System.out.println("Is fruit1 a subset of fruit3? " + SetOperations.isSubset(fruit1, fruit3));
    }
}
