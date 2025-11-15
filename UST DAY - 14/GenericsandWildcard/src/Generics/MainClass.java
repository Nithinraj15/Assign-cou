package Generics;

import java.util.List;

class CollectionUtilities {
    
    // Static generic method to find the max element in a list
    public static <T extends Comparable<T>> T findMax(List<T> list) {
        // Check if the list is null or empty
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("The list cannot be null or empty.");
        }
        T max = list.get(0);

        for (T num : list) {
            if (num.compareTo(max) > 0) {
                max = num; 
            }
        }

        return max;
    }
}

class Book implements Comparable<Book> {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    // compareTo method to compare books based on the number of pages
    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.pages, other.pages);  // Compares the number of pages
    }
}

public class MainClass {
    public static void main(String args[]) {
        // Finding max in a List of Integers
        List<Integer> intList = List.of(10, 20, 5, 8, 15);
        Integer maxInt = CollectionUtilities.findMax(intList);
        System.out.println("Maximum Number: " + maxInt);  // Output: 20

        // Finding max in a List of Strings
        List<String> strList = List.of("apple", "banana", "kiwi", "orange");
        String maxStr = CollectionUtilities.findMax(strList);
        System.out.println("Maximum String: " + maxStr);  // Output: orange

        //Handling empty list 
        try {
            List<Integer> emptyList = List.of();
            CollectionUtilities.findMax(emptyList);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());  
        }

        // Finding max in a List of Books
        List<Book> bookList = List.of(new Book("Java Programming", 450), 
                                     	new Book("Data Structures", 300), 
                                      new Book("Algorithms", 500));
        Book maxBook = CollectionUtilities.findMax(bookList);
        System.out.println("Book with the maximum pages: " + maxBook.getTitle());  
    }
}
