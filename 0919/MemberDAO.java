package ch1;

import java.util.ArrayList;
import java.util.List;

/*1. 회원 리스트 저장, 조회
 * 
 * 
 */
public class MemberDAO {
		//실제 회원 정보 추가, 순서 있게 저장. 데이터를 담는 컬렉션 객체 	
		//클래스명(데이터 타입)+ 객체명(변수명) = new 
		private List<MemberDTO> memberList = new ArrayList<>();
		
		// 위에서 공간 만들고, 실제 저장 메서드 만들기
		public void save(MemberDTO dto) {
			 memberList.add(dto); 	
		}//[MemberDTO(한라봉), MemberDTO(천혜양), MemberDTO(오렌지)]
		
//2. 회원정보 조회(출력)
		public List<MemberDTO>  findAll() {
			return  memberList; // 저장된 모든 회원 정보를 반환하겠다
		}
		
		
		

}


/*
 * List
 * 여러 데이터를 순서대로 담을 수 있는 인터페이스
 * 
 * ArrayList
 * 여러 데이터를 순서대로 담을 수 있는 클래스 
 * 순서가 있고 (인데스) 자동으로 크기 조절
 * .add(데이터 추가)/ .remove(데이터 삭제)/ .size(데이터 갯수)
 */
 