package javalearn;
import java.util.List;
import java.util.ArrayList;

public class listDemo {
	public static void main(String[] args) {
		List<String> listStrings = new ArrayList<String>();
		 
		// OK to add Strings:
		listStrings.add("One");
		listStrings.add("Two");
		listStrings.add("Three");
		System.out.println("array list "+listStrings); 
		
		int size=listStrings.size();
		System.out.println(size); 
		
		listStrings.clear();
		System.out.println(listStrings); 
		// But this will cause compile error
		
	}
}
