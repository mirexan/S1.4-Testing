package Level_01.lvl1_Ex1.classes;

public class Book implements Comparable<Book>{
	private String name;

	public Book(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	@Override
	public int compareTo(Book newBook) {
		return this.name.compareTo(newBook.getName());
	}
}
