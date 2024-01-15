package day0111;


class MyInfo {
	String name;
	String mbti;
	int age;
	
	public MyInfo(String name, String mbti, int age) {
		this.name = name;
		this.mbti = mbti;
		this.age = age;
	}
	
	public static void printTitle() {
		System.out.println("이름\tMBTI\t나이	");
		System.out.println("=====================");
	}
	
	public void printInfo() {
		System.out.println(name + "\t" + mbti + "\t" + age + "세");
	}
}

public class QuizArrObTest_12 {
	public static void main(String[] args) {
		/*
		 * 이름	MBTI	나이	
		 * =================
		 * 이효리	ENTP	26세
		 * 이상순	ISFJ	34세
		 * 이영자	ENFJ	28세
		 */
		
		MyInfo[] m = {
				new MyInfo("이효리", "ENTP", 26),
				new MyInfo("이상순", "ISFJ", 33),
				new MyInfo("이영자", "ENFJ", 28)
		};
		
		MyInfo.printTitle();
		for(MyInfo i : m) i.printInfo();
		System.out.println("=====================");
		
	}
}
