package ch1;


/*요구사항) 
 * 회원정보: 아이디, 이름, 이메일 필요
 * 
 * 기능: 회원등록(입력)
 * 			회원조회(출력)
 * 			프로그램 종료 
 * 
 * 회원등록 -> MemberDTO 클래스에 등록
 * 
 */
	
public class MemberDTO {
	
	//등록 정보 변수 기입
	private String name;
	private String id;
	private String email;
	
	//1. 기본 메서드
	public MemberDTO() {}
	
	public MemberDTO(String name, String id, String email) {
		this.name = name;
		this.id = id;
		this.email = email;
		
	//2. 게터 세터	메서드
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//3. 투스트링 메서드 불러오기
	@Override
	public String toString() {
		return "이름 =" + name + ", id=" + id + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
}
