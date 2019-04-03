package lab8;
/***
 * 
 * @author DOLA SAI RAM
 *
 */
public class TimerThreadMain {
	public static void main(String args[])
	{
		TimerThread q2=new TimerThread();
		Thread t=new Thread(q2,"sairam");
		t.start();
	}
}
