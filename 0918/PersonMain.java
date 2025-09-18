package variable5;
// 배열을 사용해 여러 명의 사람의 정보를 저장하고 출력하는 코드
public class PersonMain {

	public static void main(String[] args) {
		
		Person[] person = new Person[5]; //1.객체를 5개 담을 배열 생성 
		for (int i = 0; i < 5; i ++) { //2. 배열 안에 person 객체 생성
			person[i] = new Person(); 
		}
		
		person[0].setName("일"); //3. 각각 이름 나이 저장
		person[0].setAge(20);
		person[1].setName("이");
		person[1].setAge(21);
		person[2].setName("삼");
		person[2].setAge(22);
		person[3].setName("사");
		person[3].setAge(23);
		person[4].setName("오");
		person[4].setAge(24);
		
		for (int i = 0; i < 5; i++) { //4. 저장한 정보 출력
			System.out.println("이름: " + person[i].getName() + ", 나이: " + person[i].getAge());
		}

		
		
	}

}
