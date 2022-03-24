import java.util.LinkedHashSet;
public class linkedhashsetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("ayesha");
		set.add("prava1");
		set.add("prava2");
		set.add("prav3");
		System.out.println(set);
		System.out.println("size of: "+ set.size());
		set.add(null);
		System.out.println(set);
		System.out.println("size of: "+ set.size());
		
	}

}
