import java.util.HashMap;
import java.util.Map;
public class hashmapDemo {
    public static void main(String[] args) {
    	HashMap<Integer, String> map = new HashMap<Integer, String>();
    	map.put(1, "prav");
    	map.put(2, "prav1");
    	map.put(3, "prav2");
    	map.put(4, "prav3");
    	map.put(5, "prav4");
    	map.put(6, "prav5");
    	System.out.println(map);
    	System.out.println(map.containsKey("prav"));
    	System.out.println(map.containsValue(3));
    	System.out.println("get value of key 2: "+map.get(2));
    	for(Map.Entry entry: map.entrySet()) {
    		System.out.println(entry.getKey()+" "+entry.getValue());
    	}
    }
}
