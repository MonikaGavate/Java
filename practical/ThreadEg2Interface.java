package monika;

public class ThreadEg2Interface implements Runnable {
public void run()
{
	System.out.println("thread is running----");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ThreadEg2Interface t=new ThreadEg2Interface();
  Thread m=new Thread(t);//using the constructor Thread(runnable r)
  m.start();
	}
	

}
