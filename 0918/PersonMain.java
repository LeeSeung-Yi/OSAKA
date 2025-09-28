package variable5;
// 배열을 사용해 여러 명의 사람의 정보를 저장하고 출력하는 코드
public class PersonMain {

	public static void main(String[] args) {
		
		Person[] person = new Person[5]; //1.객체를 5개 담을 배열 생성 
		for (int i = 0; i < 5; i ++) { //2. 배열 안에 person 객체 생성
			person[i] = new Person(); 
		}

		/* 🎀
		* 승이쨩께서 아주 잘 해주셔서 딱히 드릴 말씀이 없지만!
		* 여기서 하나 생각할 포인트를 짚어 보겠습니다 ㅎㅎ
		* 만약 승이쨩의 마을이 재개발되어 인구가 50명으로 늘어난다면…
		* setName(), setAge()를 50번이나 직접 호출해 줘야 하는 아주 무시무시한 일이 발생할 수도 있어요 🫢
		* 이럴 때를 대비해서, 이름과 나이를 배열에 담고 for문으로 초기화해 보는 건 어떨까요?
		* 나중에 시간 있을 때 고민해 주셔도 됩니다 ㅎㅎ
		*/
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
