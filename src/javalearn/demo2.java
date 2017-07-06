package javalearn;
class superclass{
 	int i;
	float j,f=10.3f;
	superclass(float i){
		j=i-f;
		
	}
	public void getFun(){
		System.out.println("age is "+j);
	}
}
public class demo2 extends superclass{
	public demo2(int i){
		super(i);
	}
	
	public static void main(String[] args) {
		demo2 d=new demo2(24);
		d.getFun();
	}
}
