abstract class Item
{
	private int identifaction_id;
	private String title;
	private int no_of_copies;
	public Item(int identifaction_id, String title, int no_of_copies) {
		super();
		this.identifaction_id = identifaction_id;
		this.title = title;
		this.no_of_copies = no_of_copies;
	}
	public Item() {
		super();
	}
	
	public int getIdentifaction_id() {
		return identifaction_id;
	}
	public void setIdentifaction_id(int identifaction_id) {
		this.identifaction_id = identifaction_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNo_of_copies() {
		return no_of_copies;
	}
	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}
	@Override
	public String toString() {
		return "Item [identifaction_id=" + identifaction_id + ", title=" + title + ", no_of_copies=" + no_of_copies
				+ "]";
	}
	public abstract void checkIn();
	public abstract void checkOut();
	public abstract void addItem();
	
}

class Books extends WrittenItem
{
	int bookId;
	String bookName;
	
	public Books() {}
	
	public Books(int identifaction_id, String title, int no_of_copies, int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("Books CheckIn");
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("Books CheckOut");
	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		System.out.println("Books Added");
	}

	@Override
	public void authorName() {
		// TODO Auto-generated method stub
		System.out.println("book Author");
		}
	
}
class JournalArticles extends WrittenItem
{
	private int year;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("Journal Articles Check IN");
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("Journal Articles Check out");
	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		System.out.println("Journal Articles Added");
	}

	@Override
	public void authorName() {
		// TODO Auto-generated method stub
		System.out.println("Journal Author");
		
	}
	
}
class Videos extends MeidaItem
{
	private String director;
	private String genre;
	private String year;
	
	public Videos() {
		super();
	}

	public Videos(String director, String genre, String year) {
		super();
		this.director = director;
		this.genre = genre;
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("Videos CheckIn");
		
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("videos checkout");
		
	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		System.out.println("Video item added");
	}

	@Override
	public void artists() {
		// TODO Auto-generated method stub
		System.out.print("Videos artists");
	}

	@Override
	public void genre() {
		// TODO Auto-generated method stub
		System.out.println("Videos genre");
		
	}
	
}
abstract class MeidaItem extends Item
{
	int noOfItem;
	public abstract void artists();
	public abstract void genre();
}
class CDs extends MeidaItem
{

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("Cds checkIN");
		
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		System.out.println("cds checkout");
	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		System.out.println("item added");
	}

	@Override
	public void artists() {
		// TODO Auto-generated method stub
		System.out.println("Cds Artists");
		
	}

	@Override
	public void genre() {
		// TODO Auto-generated method stub
		System.out.println("Cd genre ");
	}
	
}
abstract class WrittenItem extends Item
{
	private String author;
	public abstract void authorName();
	
}
public class Lab2 {

	public Lab2() {
		// TODO Auto-generated constructor stub
	}

}
