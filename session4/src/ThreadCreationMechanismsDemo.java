
public class ThreadCreationMechanismsDemo implements Runnable {
	public static int count =0;
	public void run() {
		while(ThreadCreationMechanismsDemo.count<=10) {
			try {
				System.out.println("My Thread "+ (++ThreadCreationMechanismsDemo.count));
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				System.out.println("Error occured :"+ e);
			}
		}
	}
	public static void main(String[]  args) {
		ThreadCreationMechanismsDemo ins = new ThreadCreationMechanismsDemo();
		Thread myThread = new Thread(ins);
		myThread.start();
		while(ThreadCreationMechanismsDemo.count<=10) {
			try {
				System.out.println("Main Thread "+ (++ThreadCreationMechanismsDemo.count));
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				System.out.println("Error Occured :"+e);
			}
		}
		System.out.println("Main Thread completed");
	}

}
