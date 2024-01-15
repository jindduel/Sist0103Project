package day0111;

class Artist {
	//변수명
	String gName;
	String song;
	
	static String agency;
	static int cnt = 0;
	
	//명시적 생성자
	public Artist(String gName, String song) {
		this.gName = gName;
		this.song = song;
	}
	
	//출력 메서드
	public void printInfo() {
		cnt++;
		System.out.println("** 아티스트 정보_" + cnt + " **");
		System.out.println("소속기획사 : " + agency);
		System.out.println("그룹명 : "  + gName);
		System.out.println("대표곡 : " + song);
		System.out.println("------------------");
	}
}

public class QuizInstance_06 {
	public static void main(String[] args) {
		Artist art1 = new Artist("bts", "버터");
		Artist art2 = new Artist("뉴진스", "어텐션");
		
		Artist.agency = "하이브";
		
		art1.printInfo();
		art2.printInfo();
	}
}
