import java.util.Vector;
public class vextorDemo {
    public static void main(String[] args) {
    	Vector<String> vector = new Vector<String>();
    	vector.add("grapes");
    	vector.add("kiwi");
    	vector.add("sweet tamrind");
    	vector.add("mango");
    	System.out.println(vector);
    	System.out.println("Size: "+ vector.size());
    	System.out.println("at position 3: "+ vector.get(3));
    }
}
