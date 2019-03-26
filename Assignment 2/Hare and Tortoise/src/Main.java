
public class Main {
	public static void main(String args[])
	{
		Hare h=new Hare();
		Thread t1=new Thread(h,"hare");
		t1.setPriority(10);
		Tortoise tortoise=new Tortoise();
		Thread t2=new Thread(tortoise,"Tortoise");
		t2.setPriority(1);
		t1.start();
		t2.start();
	}
}
