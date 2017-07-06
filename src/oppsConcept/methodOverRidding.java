package oppsConcept;
class demo1{
	public void method1(){
		System.out.println("i m parent");
	}
	
}
class demo2 extends demo1{
	public void method1(){
		System.out.println("i m child");
	}
}
public class methodOverRidding extends demo2 {
	public static void main(String[] args) {
		methodOverRidding mr=new methodOverRidding();
		mr.method1();	
	}
	
}