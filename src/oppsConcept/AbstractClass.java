package oppsConcept;
abstract class AbstactClass1{
	public void display(){
		System.out.println("this is display");
	}
	public abstract void move();
	
	
}
abstract class newMobiles extends AbstactClass1{
	public void move(){
		System.out.println("this is moved");
	}
}

public  class AbstractClass extends newMobiles{
	public static void main(String[] args) {
		AbstractClass m=new AbstractClass();
		m.display();
		m.move();
	}
}
