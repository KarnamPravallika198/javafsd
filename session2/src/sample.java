import java.util.Scanner;
public class sample {
	/// method to display normal msg
	public void display() {
		System.out.println("This is a return type example program");
	}
	/// method to add to integers
	public int add(int a,int b) {
		int sum;
		sum= a+b;
		return sum;
	}
	///method to check user validity and return true or false
	public boolean valid(int age) {
		if(age>21)
			return true;
		else
			return false;
	}
	///method to return full name
	public String fullname(String fname, String lname) {
		return fname+" "+lname;
	}
	/// method to convert temperature from celcius to farenheit
	public void tempconv(float celcius) {
		System.out.println((9*celcius)/5 +32);
	}
	/// MAIN METHOD
	public static void main(String[] args) {
		sample s= new sample();
		//s.display();
		//int total = s.add(10, 10);
		//System.out.println("The total is:"+total);
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter age");
		//int age = sc.nextInt();
		//System.out.println(s.valid(age));
		//System.out.println("enter firstname");
		//String fname = sc.next();
		//System.out.println("enter lastname");
		//String lname = sc.next();
		//System.out.println(s.fullname(fname, lname));
		System.out.println("enter temperature");
		int temp = sc.nextInt();
		s.tempconv(temp);
		
		
	}
	
}
