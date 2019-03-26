
public class Cards {
	
	private String key;
	private Integer value;
	public Cards(String key, int value) {
		super();
		this.key = key;
		this.value = value;
	}
	public Cards() {
		super();
	}
	@Override
	public String toString() {
		return "Cards [key=" + key + ", value=" + value + "\n]";
	}
	@Override
	public int hashCode() {
		return value;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cards && this.key.equals(((Cards) obj).key) && this.value==((Cards)obj).value)
			return true;
		return false;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	
}
