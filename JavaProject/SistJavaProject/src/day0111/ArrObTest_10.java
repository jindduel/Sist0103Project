package day0111;

class Student1 {
	private String stuName;
	private String hp;
	private int score;
	
	//생성자
	public Student1(String name, String hp, int score) {
		this.stuName = name;
		this.hp = hp;
		this.score = score;
	}
	
	//출력 메서드
	public void writeData() {
		System.out.println("이름 : " + stuName);
		System.out.println("전화번호 : " + hp);
		System.out.println("점수 : " + score);
		System.out.println("------------------------");
	}
}

public class ArrObTest_10 {
	public static void main(String[] args) {
		/*Student1[] stu = new Student1[3];
		
		stu[0] = new Student1("이민호", "010-111-2222", 88);
		stu[1] = new Student1("이영자", "010-888-9999", 77);
		stu[2] = new Student1("김민정", "010-777-88888", 98);*/
		
		Student1[] stu = {
				new Student1("이민호", "010-111-2222", 88), 
				new Student1("이영자", "010-888-9999", 77),
				new Student1("김민정", "010-777-8888", 98)
		};
		
		//출력 방법 1
		for(int i = 0; i < stu.length; i++) stu[i].writeData();
		System.out.println("------------------------");
		
		//출력 방법 2
		for(Student1 i : stu) i.writeData();
	}
}