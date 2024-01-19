package day0116;

import java.util.Scanner;

class UserException extends Exception{
	public UserException(String msg) {
		super(msg); //익셉션 클래스 생성자를 통해 메세지로 등록
	}
}

public class ThrowsException_03 {
	
	public static void process() throws UserException {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		
		//나이가 10 ~ 59가 아니면 오류발생 
		System.out.println("나이를 입력해주세요. ");
		age = sc.nextInt();
		
		if(age < 10 || age >= 60) {
			throw new UserException("우리 모임 나이는 10 ~ 59세 입니다. ");
		}
		else System.out.println("당신은 " + age + "세 이므로 멤버 등록이 가능합니다. ");
		
		
	}
	
	public static void main(String[] args) {
		try {
			process();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
