package lab8;
/**
 * 
 * @author DOLA SAI RAM
 *
 */
public class TimerThread implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int timer=0;
		for(int i=1;i<=180;i++)
		{
			try {
				timer++;
				System.out.println(timer);
				Thread.sleep(1000);
				if(timer%10==0)
				{
					timer=0;
					System.out.println(timer);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}	
}
