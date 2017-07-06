package oppsConcept;
class parent{
	private int i;
	private String name;
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class encapsulationDemo extends parent{
	
	public static void main(String[] args) {
		encapsulationDemo dm=new encapsulationDemo();
		dm.setI(10);
		dm.setName("Manish");
		System.out.println("Role No: "+dm.getI()+" Name: "+dm.getName());
	}

}
