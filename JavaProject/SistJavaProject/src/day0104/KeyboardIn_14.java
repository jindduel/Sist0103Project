package day0104;

import java.util.Scanner;

public class KeyboardIn_14 {

	public static void main(String[] args) {
		//키보드 입력에 필요한 Scanner 클래스를 import
		Scanner scan = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("이름을 입력해주세요. ");
		name = scan.nextLine(); //한글을 문자로 읽어옴
		
		System.out.print("나이를 입력해주세요. ");
		//age = scan.nextInt(); //숫자로 읽어옴
		age = Integer.parseInt(scan.nextLine()); //숫자 입력 후 엔터를 누르면 버퍼로 저장되므로 엔터를 미리 읽어 없앰
		
		System.out.print("당신이 사는 지역은? ");
		String city = scan.nextLine();
		
		System.out.println(name + "님의 나이는 " + age + "세이고 " + city + "에 살아요.");

	}

}
