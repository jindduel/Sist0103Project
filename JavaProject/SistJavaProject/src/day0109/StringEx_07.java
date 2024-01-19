package day0109;

public class StringEx_07 {
	public static void main(String[] args) {
		System.out.println("String 객체에 대한 멤버 메서드 익혀보기");
		
		String str1 = "apple";
		String str2 = "APPLE";
		String str3 = "Have a Nice Day";
		String str4 = "   Today now   ";
		
		System.out.println("str3의 길이 : " + str3.length());
		System.out.println("str4의 길이 : " + str4.length());
		
		System.out.println("앞 뒤 공백 제거 후 str4의 길이 : " + str4.trim().length());
		System.out.println("*" + str4 + "*");
		System.out.println("*" + str4.trim() + "*");
		
		System.out.println("str3에서 0번 문자 : " + str3.charAt(0));
		System.out.println("str3에서 0번 문자 : " + str3.charAt(7));
		
		System.out.println("str3에서 H의 인덱스 : " + str3.indexOf("H"));
		System.out.println("str3에서 H의 인덱스 : " + str3.indexOf("N"));

		System.out.println("str3에서 Have 추출 : " + str3.substring(0, 4));
		System.out.println("str3에서 Nice 추출 : " + str3.substring(7, 11));
		System.out.println("str3에서 Nice부터 끝까지 추출 : " + str3.substring(7));
		
		//equals 같으면 true 반환
		System.out.println("문자열 비교 : " + str1.equals(str2));
		System.out.println("문자열 비교 : " + str1.equalsIgnoreCase(str2));
		
		//a.compareTo(b) a와 b가 같으면 0 출력 a가 작으면 음수 출력(아스키코드 값 차이), a가 크면 양수 출력
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str1));
		System.out.println("computer".compareTo("command"));
	}
	
}
