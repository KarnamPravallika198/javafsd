import java.util.TreeSet;
public class treesetDemo {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("ayesha");
		set.add("pooja");
		set.add("puri");
		//no order is maintained
		System.out.println(set);
		//no duplication is allowed
		set.add("ayesha");
		System.out.println(set);
	    System.out.println("Is empty "+ set.isEmpty());
	    set.remove("puri");
	    System.out.println(set);
	    System.out.println("size: "+set.size());
	}

}
