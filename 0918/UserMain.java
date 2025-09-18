package variable5;
//비밀번호를 외부에서 사용하는 방법
//비밀번호를 private 변수로 만들고, set/get 메서드로만 값을 바꿀 수 있다. 
//누가 내 비밀번호를 바꾸고 확인하려면 반드시 메서드를 이용해야 한다'
public class UserMain {

	public static void main(String[] args) {
		User user = new User(); //user  클래스 객체 생성
		
		//비밀번호 직접 접근 못하게 함
		//user.password = "abc123";
		
		//set메서드로 설정 
		user.setPassword("abc123"); //user라는 우리가 설정 변수가 . password라는 메서드 실행
		
		//get 메서드로 확인
		System.out.println("내 비밀번호는:" + user.getPassword());
		user.getPassword(); // 리턴값이 있어 비밀버노 가져오기만 하고 출력되지 않음
		// 출력
	}

}
