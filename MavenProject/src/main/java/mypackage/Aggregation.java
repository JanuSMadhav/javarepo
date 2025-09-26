package mypackage;

public class Aggregation {

	public static void main(String[] args) {
		Author auth = new Author("Vaikkom Muhammed Basheer", 87, "Kottayam");
		//Author auth1 = new Author("Meera", 45, "Thiruvananthapuram");
		Book book = new Book("Shabdangal", 250, auth); //book : object of class Book
		System.out.println(book.name);
		System.out.println("Price: "+ book.price);
		System.out.println("Author:" +book.author.AuthorName);
		System.out.println("Age:"+book.author.age);
		System.out.println("Place:" +book.author.place);
	}

}
