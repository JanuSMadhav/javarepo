package mypackage;

public class Book {
	String name;
	int price;
	Author author; //class is declared as a data type
	Book(String name, int price, Author author){ //constructor for class Book
		this.name = name;
		this.price = price;
		this.author = author;
	}
}
