package variable5;
/*마을 주민(Person) 5명의 이름과 나이는 비공개입니다.
set/get 메서드로만 정보를 입력·확인할 수 있다.
Person 클래스에서 이름(name), 나이(age)는 모두 private.
5명의 Person 객체 배열을 만들어 set메서드로 값 저장, get메서드로 출력.
 * 
 */
public class Person {
	private String name; //변수 설정
	private int age;
	
	public String getName() { // 세터 게터
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
