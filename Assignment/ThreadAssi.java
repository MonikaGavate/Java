package monika;

public class ThreadAssi extends Thread {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i*2);
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ThreadAssi t=new ThreadAssi();
  ThreadAssi t1=new ThreadAssi();
  ThreadAssi t2=new ThreadAssi();
  t.start();
  try {
	t.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  t1.start();
  t2.start();
  System.out.println(t.getName()+" "+t.isDaemon());
  System.out.println(t.getName()+" "+Thread.currentThread().isDaemon());
  
  System.out.println(t1.getName()+" "+t.isDaemon());
  System.out.println(t1.getName()+" "+Thread.currentThread().isDaemon());
  
  System.out.println("Thread Name:"+t.getName());
  System.out.println("Priority:"+t.getPriority());
  
  t1.setPriority(MAX_PRIORITY);
  System.out.println("Priority:"+t1.getPriority());

  System.out.println("Thread Name:"+t1.getName());
	}

}
