/// constructor practice
public class constructorDemo {
	///class level variable
	int id;
	String name;
    /// default constructor
	public constructorDemo() {
	    id = 1;
	    name = "pravallika";
	}
	///parameterized constructor
	public constructorDemo(int id,String name) {
		this.id = id;
		this.name = name;
	}
    public static void main(String[] args) {
    	// when u create object automatically it calls the default constructor
    	// if no default constructor found then compiler will create that
    	constructorDemo cd = new constructorDemo();
    	///here calling and using default constructor
    	System.out.println("user 1");
    	System.out.println("Id :"+cd.id);
    	System.out.println("Name :"+cd.name);
    	///here calling and using parameterised constructor
    	constructorDemo cd1 = new constructorDemo(2,"jongu");
    	System.out.println("user 2");
    	System.out.println("Id :"+cd1.id);
    	System.out.println("Name :"+cd1.name);
    	
    }
}
