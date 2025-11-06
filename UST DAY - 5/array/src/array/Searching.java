package array;
import java.util.*;
class Customer implements Comparable<Customer> {
    private int customerId;
    private String name;
    private String email;
    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }
    public int getCustomerId() {
        return customerId;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name + ", Email: " + email;
    }
    public int compareTo(Customer other) {
        return Integer.compare(this.customerId, other.customerId);
    }
}
public class Searching{
	public static Customer linearSearch(ArrayList<Customer> customers, int targetCustomerId) {
	    for (Customer c : customers) {
	        if (c.getCustomerId() == targetCustomerId) {
	            return c;
	        }
	    }
	    return null;
    }
	public static Customer binarySearch(ArrayList<Customer> customers, int targetCustomerId) {
	    int low = 0;
	    int high = customers.size() - 1;

	    while (low <= high) {
	        int mid = (low + high) / 2;
	        Customer midCustomer = customers.get(mid);

	        if (midCustomer.getCustomerId() == targetCustomerId) {
	            return midCustomer;
	        } else if (midCustomer.getCustomerId() < targetCustomerId) {
	            low = mid + 1;
	        } else {
	            high = mid - 1;
	        }
	    }
	    return null;
	}


    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(105, "Nithinraj", "nithin@gmail.com"));
        customers.add(new Customer(101, "Gowtham", "gowtham@gmail.com"));
        customers.add(new Customer(108, "Manoj", "manoj@gmail.com"));
        customers.add(new Customer(103, "Gokul", "gokul@gmail.com"));
        customers.add(new Customer(106, "Ravi", "ravi@example.com"));

        Collections.sort(customers);

        System.out.println("Linear Search:");
        System.out.println(linearSearch(customers, 103)); 
        System.out.println(linearSearch(customers, 999)); 

        System.out.println("\nBinary Search:");
        System.out.println(binarySearch(customers, 106)); 
        System.out.println(binarySearch(customers, 999)); 
    }
}

