package variable3;
//1. K팝 케데헌 아이돌 멤버의 이름, 포지션, 그룹 등등을 저장하는 Idol 클래스 생성
public class Idol {
	//변수 
	String name;
	String position;
	String group;
	int age;
	
	// 생산자: 객체 정보
	
	public Idol(String name, String position, String group, int age) {
		super();
		this.name = name;
		this.position = position;
		this.group = group;
		this.age = age;
	}
	//메소드
public void boys() {
 System.out.println("이름"+ name);
 System.out.println("포지션"+ position);
 System.out.println("그룹"+ group);
 System.out.println("나이"+ age);
	
	
	
	
}
	
	
}
