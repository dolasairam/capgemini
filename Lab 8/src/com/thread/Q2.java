package com.thread;
//:  Write a thread program to display timer where timer will get refresh after every 10seconds.( Use Runnable implementation )
class Q2 implements Runnable{

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

class Main
{
	public static void main(String args[])
	{
		Q2 q2=new Q2();
		Thread t=new Thread(q2,"sairam");
		t.start();
	}
}