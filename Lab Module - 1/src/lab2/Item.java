package lab2;

/***
 * 
 * @author DOLA SAI RAM
 *
 */
public abstract class Item
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

