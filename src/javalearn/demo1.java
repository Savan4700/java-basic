package javalearn;

public class demo1 {
    public static String[] fruits ;
    
	public void count()
	{
		int a=10,b=20;
		fruits=new String[] { "Orange", "Apple"};
		for(String fru : fruits){
			System.out.println("fruit "+fru);
		}
		parent p=new parent();
		child c=new child();
		p.function1(a,b);
		c.childFun();
		
	}
	
	
	public static void main(String[] args) {
		
	demo1 d=new demo1();
	d.count();
	
	}	
}

class  parent{
	public static String name;
	public void function1(int a,int b){
		int c=a+b;
		name="parent class";
		System.out.println("sum of two digit "+c);
	}
}
class child extends parent{
	String childname;
	public void childFun(){
		childname="child function name";
		System.out.println("child fun is run "+name);
		
	}
}

