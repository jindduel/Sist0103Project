package day0111;

class Manggo {
	private String witer;
	private String subject;
	private static String msg = "Happy Day!";
	
	public String getWiter() {
		return witer;
	}
	public void setWiter(String witer) {
		this.witer = witer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public static String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	//
	
	
}

public class ObTest_09 {
	public static void writeManggo(Manggo m) {
		System.out.println("**망고 클래스 출력**");
		System.out.println("작성자 : " + m.getWiter());
		System.out.println("제목 : " + m.getSubject());
	}
	
	public static void main(String[] args) {	
		System.out.println("망고 클래스 메세지 출력");
		System.out.println(Manggo.getMsg());
		
		Manggo m1 = new Manggo();
		m1.setWiter("이민후");
		m1.setSubject("오늘은 목요일");
		
		Manggo m2 = new Manggo();
		m2.setWiter("이민정");
		m2.setSubject("오늘 모임 어때?");
		
		writeManggo(m1);
		writeManggo(m2);
		
	}
}
