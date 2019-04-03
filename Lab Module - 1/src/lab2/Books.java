package lab2;

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
