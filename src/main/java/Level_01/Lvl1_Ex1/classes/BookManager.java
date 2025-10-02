package Lvl1_Ex1.classes;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
	public void start(){
	Scanner sc = new Scanner(System.in);
	DisplayMenu(sc);
	sc.close();
	}

	public void DisplayMenu(Scanner sc){
		ArrayList<Book> library = new ArrayList<Book>();
		int option = -1;
		String answer = "";
		while (option != 0){
			System.out.println("\n *** Welcome to Library Management Menu ***\n\n" +
					"Please select an option typing it's number\n" +
					"1. Add a book to the collection.\n" +
					"2. Display the entire list of books.\n" +
					"3. Get the title of a book by it's position.\n" +
					"4. Add a book in a specific position.\n" +
					"5. Elimante a book by title.\n" +
					"0. Leave this menu ");
			option = sc.nextInt();
			sc.nextLine();
			switch (option){
				case 1:
					answer = addBook(library,sc);
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 0:
					answer = "Leaving the menu";
					break;
				default:
					answer = "Invalid option";
					break;
			}
			System.out.println(answer);
		}
	}

	public String addBook(ArrayList<Book> library, Scanner sc){
		String answer = "";
		String title = "";
		System.out.println("Please type the title of the book to add");
		title = sc.nextLine();
		if (dupBook(title,library)) {
			answer = "This book it's already in the library.";
		}
		else{
			library.add(new Book(title));
			answer = title + " has been added to the collection";
		}
		return answer;
	}

	public boolean dupBook(String title, ArrayList<Book> library){
		boolean isDup = false;
		for (Book book:library){
			if (book.getName().equalsIgnoreCase(title))
				isDup = true;
		}
		return isDup;
	}
}
