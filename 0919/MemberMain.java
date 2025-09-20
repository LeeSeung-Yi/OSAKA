package ch1;

import java.lang.ModuleLayer.Controller;

public class MemberMain {

	public static void main(String[] args) {
	
		MemberDAO dao = new MemberDAO();
		MemberService service = new MemberService(dao);
		MemberController controller = new MemberController(service);
		
		controller.run(); //컨트롤러에 있는 run문 실행

	}

}
