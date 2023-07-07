package P3;

public class Demo2 {

	public static void main(String[] args) {
		String s = new String("Priyanka");
		System.out.println(s);
		
		s = s.concat("gupta");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Priyanka");
		sb.append("gupta");
		System.out.println(sb);
		
		sb.insert(0, "MR");
		System.out.println(sb);
		
		sb.delete(0, 3);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sbl = new StringBuilder("Gupta");
		sbl.append("Gupta");
		System.out.println(sbl);

	}

}
