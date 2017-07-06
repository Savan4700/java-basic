package javalearn;

public class genericCode {
	public static <T> void method(T... inputarr){
		for (T element:inputarr)
		{
			System.out.printf(" %s", element);
		}
	System.out.println();	
	}
	public static void main(String[] args) {
		Integer[] intarr={1,2,3,4,5};
		Double[] dobarr={11.45,55.55,54.65};
		method(intarr);
		method(dobarr);
		method("savan");
	}
	
}
