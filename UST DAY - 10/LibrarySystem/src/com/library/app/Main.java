package com.library.app;

import com.library.model.Book;
import com.library.service.Library;

public class Main {

	public static void main(String[] args) {
		Library lib = new Library();
		Book boo1 = new Book("Java","Nithin","HSP1");
		Book boo2 = new Book("C","Gokul","HSP2");
		Book boo3 = new Book("C++","Gowtham","HSP3");
		lib.addBook(boo1);
		lib.addBook(boo2);
		lib.addBook(boo3);
		lib.displayAllBooks();
	}

}
