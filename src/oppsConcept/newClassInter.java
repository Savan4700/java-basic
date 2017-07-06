package oppsConcept;

  class newClassInter implements  abstractInterface{
	  	public void dancing(){
			System.out.println("this is Dancing");
		}
	  	public void moving(){
			System.out.println("this is moving");
		}
	  	
		public static void main(String[] args) {
			abstractInterface obj=new newClassInter();
			obj.dancing();
			obj.moving();
			
			
		}
}
