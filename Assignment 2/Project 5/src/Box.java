
public class Box {
	double length;
	double width;
	double height;
	double volume;
	public Box(){}
	public Box(double length, double width, double height, double volume) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.volume = volume;
	}
	@Override
	public int hashCode()
	{
		return (int)volume;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Box && this.length==((Box)obj).length && this.height==((Box)obj).height && 
				this.width==((Box)obj).width && this.volume==((Box)obj).volume)
		{
			
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", height=" + height + ", volume=" + volume + "]\n";
	}
	
}
