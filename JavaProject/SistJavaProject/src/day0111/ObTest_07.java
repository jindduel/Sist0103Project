package day0111;

class MyTest {
	private String name;
	private String add;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//3번의 멤버 변수를 한번에 초기화 하는 메서드
	public void setMember(String name, String add, int age) {
//		this.name = name;
//		this.add = add;
//		this.age = age;
		
		setName(name);
		setAdd(add);
		setAge(age);
	}
	
	//3개의 멤버 변수 출력
	public String getMember() {
		String s = "이름 " + name + "\n주소 : " + add + "\n나이 : " + age;
		
		return s;
	}
	
}


public class ObTest_07 {
	public static void main(String[] args) {
		MyTest t1 = new MyTest();

		t1.setName("김태희");
		t1.setAdd("서울시 구로구");
		t1.setAge(33);
		
		System.out.println("**메서드를 각각 출력**");
		System.out.println("이름 : " + t1.getName());
		System.out.println("주소 : " + t1.getAdd());
		System.out.println("나이 : " + t1.getAge());
		
		System.out.println("*3개의 값을 한번에 출력하기**");
		MyTest t2 = new MyTest();
		t2.setMember("이효리", "제주시", 22);
		System.out.println(t2.getMember());
		
		
		
		
		
		
		
	}
}
