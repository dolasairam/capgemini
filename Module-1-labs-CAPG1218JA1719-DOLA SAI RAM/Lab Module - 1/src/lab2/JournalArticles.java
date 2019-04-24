package lab2;

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
