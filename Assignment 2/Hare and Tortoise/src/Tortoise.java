
public class Tortoise implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" Distance \t"+i);
			if(i==10)
			{
				System.out.println(Thread.currentThread().getName()+" Wins the race");
			}
		}
	}

}
