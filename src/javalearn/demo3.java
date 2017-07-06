package javalearn;
class parents{
	int i=10;
}
class childs extends parents{
	int j=10;
}

public class demo3{
	int i,j,sum;
//	String List,ArrayList;
	public static void main(String[] args) {
		childs cd=new childs();
		System.out.println(cd.i+cd.j);
		
		
	}
}
