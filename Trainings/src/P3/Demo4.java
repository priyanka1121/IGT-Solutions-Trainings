package P3;

import java.util.ArrayList;

class emp{
	
}
public class Demo4{
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> al = new ArrayList<Comparable>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(10.5);
		al.add("xyz");
		al.add("A");
		al.add(true);
		System.out.println(al);
	}
}