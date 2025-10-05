package Level_01.Lvl1_Ex1.classes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookMenu {
	public void start(){
		Scanner sc = new Scanner(System.in);
		BookManager manager = new BookManager();
		DisplayMenu(sc, manager);
		sc.close();
	}
	public void DisplayMenu(Scanner sc, BookManager manager){

		int option = -1;
		String answer = "";
		while (option != 0){
			System.out.println("\n *** Welcome to Library Management Menu ***\n\n" +
					"Please select an option typing it's number\n" +
					"1. Add a book to the collection.\n" +
					"2. Display the entire list of books.\n" +
					"3. Get the title of a book by it's position.\n" +
					"4. Add a book in a specific position.\n" +
					"5. Eliminate a book by title.\n" +
					"0. Leave this menu\n\n" +
					"Choose an option: ");
			try{
			option = sc.nextInt();
			sc.nextLine();
			}
			catch (InputMismatchException e){
				System.out.printf("Error : " + e.getMessage());
				continue;
			}
			switch (option){
				case 1:
					answer = addBook(sc, manager);
					break;
				case 2:
					answer = manager.listBooks();
					break;
				case 3:
					answer = getBook(manager, sc);
					break;
				case 4:
					answer = addBookInPosition(manager, sc);
					break;
				case 5:
					answer = deleteBook(manager, sc);
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

	private String addBook( Scanner sc,  BookManager manager){
		String answer = "";
		String title = "";
		System.out.println("Please type the title of the book to add");
		title = sc.nextLine();
		answer = manager.addBook(title);
		return answer;
	}

	private String getBook(BookManager manager, Scanner sc){
		String answer = "";
		System.out.printf("Please entre the position of the list which you would like to get the title: ");
		int pos = readInt(sc);
		answer = manager.getBookByPosition(pos);
		return answer;
	}

	private String addBookInPosition(BookManager manager, Scanner sc){
		String title = "";
		System.out.printf("Please enter the title of the book you would like to add: ");
		title = sc.nextLine();
		System.out.println("Please enter the position of the book you would like to add: ");
		int pos = readInt(sc);
		return manager.addBookInPosition(title,pos);
	}

	private String deleteBook(BookManager manager, Scanner sc){
		String title = "";
		System.out.printf("Please enter the title of the book you would like to delete: ");
		title = sc.nextLine();
		return  manager.deleteBook(title);
	};

	public int readInt(Scanner sc){
		int pos = -1;
		try {
			pos = sc.nextInt();
		}
		catch(InputMismatchException e){
			pos = -1;
		}
		sc.nextLine();
		return pos;
	}

}

