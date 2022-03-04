package monika;

public class ThreadSleepEg extends Thread {
	public void run()
	{
		for(int i=1;i<=10;i++) {
		try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ThreadSleepEg t1=new ThreadSleepEg();
    ThreadSleepEg t2=new ThreadSleepEg();
    ThreadSleepEg t3=new ThreadSleepEg();
    t1.start();
    t2.start();
    t3.start();
	}
}