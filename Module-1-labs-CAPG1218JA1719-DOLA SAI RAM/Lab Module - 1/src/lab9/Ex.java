package lab9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author DOLA SAI RAM
 *
 */
	public class Ex implements Runnable {

		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
					ExecutorService es=Executors.newFixedThreadPool(3);
				Ex e= new Ex();
				for(int i=0;i<10;i++)
				{
					Thread t=new Thread(e);
					t.start();
					es.execute(e);
				}
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(Thread.currentThread()+" is running");
		}

	}
