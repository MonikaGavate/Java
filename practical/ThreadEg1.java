package monika;

public class ThreadEg1 extends Thread {
	public void run()
	{
		System.out.println("Thread -- its my thread");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ThreadEg1 t=new ThreadEg1();
    t.start();
  
	}

}
