package day0110;

class Korean {
	final String nation = "대한민국";
	final String ssn;
	
	String name;
	
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}


public class book253_18 {
	public static void main(String[] args) {
		Korean k1 = new Korean("123456-1234567", "김자바");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
	}
}
