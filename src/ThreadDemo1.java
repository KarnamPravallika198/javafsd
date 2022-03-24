
public class ThreadDemo1 extends Thread {
	/// Thread class has its own method run() 
	/// but we want to implement over own method with same name run()
	/// here we r doing METHOD OVERRIDING
	public void run() {
		System.out.println("Thread started");
		for(int i=0; i<=5; i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
    public static void main(String[] args) {
    	ThreadDemo1 t1 = new ThreadDemo1();
    	ThreadDemo1 t2 = new ThreadDemo1();
    	t1.setName("first");
    	t2.setName("second");
    	t1.start();
    	t2.start();
    }
}
