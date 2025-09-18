package variable5;
//객체의 추상화: 비밀번호를 private 변수로 만들고, set/get 메서드로만 값을 바꿀 수 있다. 
//누가 내 비밀번호를 바꾸고 확인하려면 반드시 메서드를 이용해야 한다'
public class User {

	
// 1. 비밀번호는 외부에서 직접 접근할 수 없도록 private + 변수(비번)설정
	private String password;
	
//2. 비밀번호 설정(set 메서드): 생성자	

	public void setPassword(String password) {
		this.password = password;
	}
	
//3. 비밀번호 확인 (get 메서드)
		public String getPassword() {
		return password;
		}
	
	
}
