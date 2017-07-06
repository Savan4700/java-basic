package javalearn;
import java.util.*;
class setDemo{
	
	
}
public class setExample extends setDemo{
	public static void main(String[] args) {
		Map m=new HashMap();
		m.put("1","value1");
		m.put("4", "value2");
		m.put("3", "value3");
		m.put("2", "value4");
		m.put("5", "value5");
		System.out.println();
		System.out.println("map is : "+m);
		
		HashSet hs=new HashSet();
		hs.add("A");
		hs.add("D");
		hs.add("B");
		hs.add("C");
		hs.add("A");
		System.out.println("set is : "+hs);
		
		LinkedList  ls=new LinkedList();
		ls.add("aa");
		ls.add("dd");
		ls.add("bb");
		ls.add("cc");
		
		System.out.println("list is : "+ls);
		
	}
	
	
}
