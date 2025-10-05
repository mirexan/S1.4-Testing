package Level_01.Lvl1_Ex1.classes;

import java.util.*;

public class BookManager {
	private ArrayList<Book> library = new ArrayList<Book>();

	public String deleteBook(String title){
		String answer = "";
		Iterator<Book> it = library.iterator();
		while (it.hasNext() && answer.isEmpty()){
			Book book = it.next();
			if (book.getName().equalsIgnoreCase(title)){
				library.remove(book);
				answer = title + " has been removed from list";
			}
		}
		if (answer.isEmpty()){
			answer = "There is no book titled "+ title + " in the library";
		}
		return answer;
	}

	public String addBookInPosition(String title,int pos){
		String answer = "";
		if (pos < 0 || pos > library.size()){
			answer = "Invalid position";
		}
		else{
			library.add(pos,new Book (title));
			Collections.sort(library);
			answer = "The book " + title + " has been added at position " + pos + " but,\n" +
					"the collection has been sorted by alphabetical order.";
		}
		return (answer);
	}

	public String listBooks(){
		String answer = "";
		for (int i = 0; i < library.size() ;i++) {
			answer += i + ". " + library.get(i).getName() + "\n";
		}
		return answer;
	}

	public ArrayList<Book> getLibrary(){
		return library;
	}

	public String getBookByPosition(int pos){
		String answer = "";
		if (pos < 0 || pos > library.size()){
			answer = "Invalid position";
		}
		else{
			answer = library.get(pos).getName();
		}
		return  answer;
	}
	public String addBook(String title){
		String answer = "";
		if (dupBook(title)) {
			answer = "This book is already in the library.";
		}
		else{
			library.add(new Book(title));
			Collections.sort(library);
			answer = title + " has been added to the collection";
		}
		return answer;
	}

	public boolean dupBook(String title){
		boolean isDup = false;
		for (Book book:library){
			if (book.getName().equalsIgnoreCase(title))
				isDup = true;
		}
		return isDup;
	}
}
