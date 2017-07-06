package javalearn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 
class HDTVS {
	private int size;
	private String brand;
 
	public HDTVS(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}
 
	public int getSize() {
		return size;
	}
 
	public void setSize(int size) {
		this.size = size;
	}
 
	public String getBrand() {
		return brand;
	}
 
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
 
class SizeComparator implements Comparator<HDTVS> {
	@Override
	public int compare(HDTVS tv1, HDTVS tv2) {
		int tv1Size = tv1.getSize();
		int tv2Size = tv2.getSize();
 
		if (tv1Size > tv2Size) {
			return 1;
		} else if (tv1Size < tv2Size) {
			return -1;
		} else {
			return 0;
		}
	}
}
 
public class comparators {
	public static void main(String[] args) {
		HDTVS tv1 = new HDTVS(55, "Samsung");
		HDTVS tv2 = new HDTVS(60, "Sony");
		HDTVS tv3 = new HDTVS(42, "Panasonic");
 
		ArrayList<HDTVS> al = new ArrayList<HDTVS>();
		al.add(tv1);
		al.add(tv2);
		al.add(tv3);
 
		Collections.sort(al, new SizeComparator());
		for (HDTVS a : al) {
			System.out.println(a.getBrand());
		}
	}
}
