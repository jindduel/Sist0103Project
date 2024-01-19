package day0110;

class Infor{
	
	private String stuName;
	private int stuAge;
	
	//setter메서드
	/*
	 * 1. 데이터를 수정할 목적 set변수명
	 * 2. 저장용도이므로 리턴값이 없음
	 * 3. 리턴값이 없으므로 void라고 지정해야함
	 */
	
	public void setName(String stuName) {
		this.stuName = stuName; //이름이 같으면 this.변수명
	}
	
	public void setAge(int stuAge) {
		this.stuAge = stuAge;
	}
	
	//getter 메서드
	/*
	 * 1. 데이터를 조회할 목적 get변수명
	 * 2. 데이터를 얻는 목적으로 인자값이 없음
	 * 3. 실행 결과물을 돌려줘야하므로 리턴값이 있음
	 */
	
	public String getName() {
		return stuName;
	}
	
	public int getAge() {
		return stuAge;
	}
}


public class WorkerMethod_12 {
	
	public static void main(String[] args) {
		Infor in1 = new Infor();
		//in1.stuName = "홍길동"; //인스턴스 변수에 private이 붙으면 변수 접근 x
		//in1.stuAge = 33;
		
		//setter 메소드
		in1.setName("최민영");
		in1.setAge(22);
		
		//getter 메소드
		String name = in1.getName();
		int age = in1.getAge();
		
		System.out.println(name + ", " + age);
		
	}
}
