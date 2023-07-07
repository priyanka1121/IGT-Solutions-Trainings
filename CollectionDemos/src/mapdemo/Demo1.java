package mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo1 {
	public static void main(String[] args) {
		
		//ArrayList al = new ArrayList<>();
//		LinkedList al = new LinkedList<>();
		//Vector al = new Vector<>();
		
//		Set s = new Set();// bcz its a n interfac , no dup  //shMa
		//
		//HashSet al = new HashSet();//  order : mixed + no dup 
		//LinkedHashSet al= new LinkedHashSet();// no dup + order
		//TreeSet al= new TreeSet(); // no dup + soreted order 
//		Map< K, V> map= new Map(); its an interface 
		//HashMap map= new HashMap<>(); // no dup + no order 
		//LinkedHashMap map= new LinkedHashMap<>();
		TreeMap map = new TreeMap<>();
		map.put(111, "Harsih");
		map.put(444, "Abi");
		map.put(333, "Sindu");
		map.put(777,"Chandu");
		map.put(235,"Chandu");
		map.put(555, "Bindu");
		map.put(777,"Priyank");	
		
		Set s = map.entrySet();
		Iterator i =s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
