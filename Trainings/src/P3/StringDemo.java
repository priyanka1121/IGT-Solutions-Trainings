package P3;

public class StringDemo {

	public static void main(String[] args) {
		String name = "HeeLLo WorLD";
		System.out.println(name);
		
		String s = new String("priyanka");
		System.out.println(s);
		
		System.out.println("My name is : "+ s.toUpperCase());
		System.out.println("My name is : "+ s.toLowerCase());
		System.out.println(name.length());
		System.out.println(name.trim().length());
		System.out.println(""+name.replace("o", "q"));
		System.out.println(s.startsWith("P"));
		System.out.println(s.endsWith("a"));
		System.out.println(s.concat(name));
		System.out.println(s.equals("priyanka"));
		System.out.println(s.equalsIgnoreCase("priyanka"));
		System.out.println(s.charAt(4));
	

	}

}
