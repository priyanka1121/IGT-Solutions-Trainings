package listdemo;
import java.util.*;
public class Demo1 {
	public static void main(String[] args) {
		//List l = new List();// its is interface 
		//ArrayList al= new ArrayList();
		LinkedList al= new LinkedList();
		//Vector al = new Vector(); legacy class ...! old class ? whne java stated in 1995 
		al.add(100);
		al.add(350);
		al.add(500);
		al.add(500);
		al.add(3,50000);
		al.add("ABC");
//		al.addFirst("333333333");
		al.add('A');
		al.add(true);
//		al.addLast("999999999999");
		Iterator i =al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}	
	}
}
		//Array list 						linkedlist

// Best : fetching the data 					best : inserstion and deletion y ?
// y ? 		 reserbat										it wil not shift interally 
	// its stores as index 

// worst : insertion and deletioin 			 fethcing the data 

//Railway res ap 
//univercirty management: till 4 years once in an while student will the college , leave 


// list is allowd the duplicate values 

// set : it will not allow the duplicate values 




