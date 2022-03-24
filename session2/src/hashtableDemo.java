import java.util.Hashtable;
import java.util.Map;
///hashtable don't allow null as a value
public class hashtableDemo {
    public static void main(String[] args) {
    	Hashtable<Integer, String> map = new Hashtable<Integer,String>();
    	map.put(1, "pravalli1");
    	map.put(2, "pravalli2");
    	map.put(3, "pravalli3");
    	map.put(4, "pravalli4");
    	map.put(5, "pravalli5");
    	map.put(6, "pravalli6");
    	System.out.println(map);
    	System.out.println(map.containsKey(3));
    	System.out.println(map.containsValue(3));
    	System.out.println("get value of key 2: "+map.get(2));
    	for(Map.Entry entry: map.entrySet()) {
    		System.out.println(entry.getKey()+" "+entry.getValue());
    	}
    }
}
