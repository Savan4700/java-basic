package oppsConcept;
class other{
	public void method1(){
		System.out.println("first method");
		
	}
	public void method1(int i)
	{
		System.out.println("parameter : "+i);
	}
}

public class methodOverloading extends other{
	public static void main(String[] args) {
		methodOverloading mo= new methodOverloading();
		mo.method1();
		mo.method1(10);
	}
}
