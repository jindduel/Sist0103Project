package day0111;

class Member {
	private String stuName;
	private String stuGen;
	private String stuAdd;
	
	static String ban;
	static int cnt;
	
	
	public void setMemberData(String name, String gen, String add) {
		this.stuName = name;
		this.stuGen = gen;
		this.stuAdd = add;
	}
	
	//출력 메서드
	public void writeMemberData() {
		cnt++;
		System.out.println(" ** 학생" + cnt +" 정보 ** ");
		System.out.println("소속학급 : " + ban);
		System.out.println("이름 : " + stuName);
		System.out.println("성별 : " + stuGen);
		System.out.println("주소 : " + stuAdd);
		System.out.println("----------------------");
	}
	
}

public class StaticObTest_05 {
	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member();
		
		m1.setMemberData("최지우", "여자", "서울시 강남구");
		m2.setMemberData("이민우", "남자", "서울시 구로구");
		
		Member.ban = "쌍용교육센터 Java반";
		
		m1.writeMemberData();
		m2.writeMemberData();
		
		
	}
}