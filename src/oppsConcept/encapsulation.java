package oppsConcept;

public abstract class encapsulation implements abstractInterface,interface2{
	public static void main(String[] args) {
		
		encapsulation en=new encapsulation() {
			
			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("display");
			}
			
			@Override
			public void moving() {
				// TODO Auto-generated method stub
				System.out.println("moving");
			}
			
			@Override
			public void dancing() {
				// TODO Auto-generated method stub
				System.out.println("dancing");
			}
		};
		en.display();
		en.moving();
		en.dancing();
	}
}
