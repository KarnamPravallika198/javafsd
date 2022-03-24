import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String[] args) {
    	ArrayList<String> list = new ArrayList<String>();
    	list.add("pravallika");
    	list.add("jongu");
    	list.add("haru");
    	list.add("hardik");
    	list.add("janani");
    	System.out.println(list);
    	list.remove(4);
    	System.out.println(list);
    	list.add(4,"pravz");
    	System.out.println(list);
    	System.out.println(list.contains("pravallika"));
    	System.out.println("element at index 2 is : " +list.get(2));
    	System.out.println("size of list:"+list.size());
    	for(String s:list) {
    		System.out.println(s);
    	}
    	}
}
