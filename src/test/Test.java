package test;

public class Test {

	public static void main(String[] args) {
		
		String s = "2.4.5.6";
		if(s.startsWith("23.")) {
			String[] str = s.split("\\.");
			System.out.println(str[str.length-1]);
		}
		
	}
}
