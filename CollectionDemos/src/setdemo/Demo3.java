package setdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Demo3 {

	public static void main(String[] args) {
	// list: allow the dup values 
		
//		ArrayList al = new ArrayList<>();
//		LinkedList al = new LinkedList<>();
		//Vector al = new Vector<>();
		
//		Set s = new Set();// bcz its a n interfac , no dup  //
		
		//HashSet al = new HashSet();//  order : mixed + no dup 
		//LinkedHashSet al= new LinkedHashSet();// no dup + order
		TreeSet al= new TreeSet(); // no dup + soreted order 
		
		al.add(111);
		al.add(245);
		al.add(200);
		al.add(200);
		al.add(242);
		al.add(534);
		al.add(530);
		
		Iterator i =al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}

//LIST 				SET
//dup : yes 				no 
//maintain the order		not 
//							linkedhashSert
//							TreeSet
