package ch1;
// 사용자 제저: 입/출력 

import java.lang.reflect.Member;
import java.util.List;
import java.util.Scanner;

public class MemberController {

	
	Scanner sc= new Scanner(System.in);
	private MemberService service;
	
	public MemberController( MemberService service) {
		this.service = service;
		
	}
	
	public void run() { //반환하지 않고 실행해서 보이드
	while(true) { //트루만 있고 빠져나가게끔 할 수 없음 -> 스위치문으로 처리
		System.out.println("번호입력: - 회원 등록/2- 전체회원조회/0-종료 ");
		int q= sc.nextInt(); 
		//next.int: 입력하면 엔터를 친 개행문자가 남음
		sc.nextLine(); //개행문자 지우기 위해 추가- 위에 남은 개행문자를 바로 읽고 버림. 버퍼 정리
		
			switch (q) {
			case 1:
				System.out.println("이름:");
				String name = sc.nextLine();
				System.out.println("id:");
				String id = sc.nextLine();
				System.out.println("email:");
				String email = sc.nextLine();
				
				service.addMember(name, id, email);
				System.out.println("회원 등록 끝!");
				break;
			case 2: 
				List<MemberDTO> member = service.getAllMember();
				//순차적 불러오기
							/*
							for (int i = 0; i <member.size(); i ++ ){ //멤버의 갯수 알려줌 = size
								MemberDTO dto = member.get(i); // 데이터를 가져옴 = get
								System.out.println(dto);
							}
							*/
				
				//새로운 순차적 불러오기
				for(MemberDTO dto : member) { 
					System.out.println(dto);
					
				}
				
				//조회를 위한 값
				break;
			case 0:
				System.out.println("프로그램 종료");
				// break; 구문을 빠져나옴
				return; // 즉시 종료
			default:
				System.out.println("숫자만 입력하세요");
			}
		
		
		
		
		
	}
	}	
	}
		


