package Level_01.lvl1_Ex1.classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	public void start() {

		BookManager manager = new BookManager();
		DisplayMenu(manager);
		sc.close();
	}

	public void DisplayMenu(BookManager manager) {

		int option = -1;

		while (option != 0) {
			System.out.println("\n *** Welcome to Library Management Menu ***\n\n" +
					"Please select an option typing it's number\n" +
					"1. Add a book to the collection.\n" +
					"2. Display the entire list of books.\n" +
					"3. Get the title of a book by it's position.\n" +
					"4. Add a book in a specific position.\n" +
					"5. Eliminate a book by title.\n" +
					"0. Leave this menu\n\n" +
					"Choose an option: ");
			try {
				option = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Error : " + e.getMessage());
				continue;
			}
			selectOption(manager, option);
		}
	}

	public int selectOption( BookManager manager, int option) {
		String answer = "";

		switch (option) {
			case 1:
				answer = addBook(manager);
				break;
			case 2:
				answer = manager.listBooks();
				break;
			case 3:
				answer = getBook(manager);
				break;
			case 4:
				answer = addBookInPosition(manager);
				break;
			case 5:
				answer = deleteBook(manager);
				break;
			case 0:
				answer = "Leaving the menu";
				break;
			default:
				answer = "Invalid option";
				break;
		}
		System.out.println(answer);
		return option;
	}
	public String askTitle(String message){
		System.out.println(message);
		return sc.nextLine();
	}
	public int askPosition(String message){
		System.out.println(message);
		return readInt();
	}

	private String addBook(BookManager manager) {
		String answer = "";
		String title = "";
		title = askTitle("Please type the title of the book to add");
		answer = manager.addBook(title);
		return answer;
	}

	private String getBook(BookManager manager) {
		String answer = "";
		int pos = askPosition("Please enter the position of the list which you would like to get the title: ");
		answer = manager.getBookByPosition(pos);
		return answer;
	}

	private String addBookInPosition(BookManager manager) {
		String title = "";
		title = askTitle("Please enter the title of the book you would like to add: ");
		int pos = askPosition("Please enter the position of the book you would like to add: ");
		return manager.addBookInPosition(title, pos);
	}

	private String deleteBook(BookManager manager) {
		String title = askTitle("Please enter the title of the book you " +
				"would like to delete: ");
		return manager.deleteBook(title);
	}

	public int readInt() {
		int pos = -1;
		try {
			pos = sc.nextInt();
		} catch (InputMismatchException e) {
			pos = -1;
		}
		sc.nextLine();
		return pos;
	}
}


