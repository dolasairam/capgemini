package lab2;

/***
 * 
 * @author DOLA SAI RAM
 *
 */
class Videos extends MediaItem
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

