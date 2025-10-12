package ch2;

import java.util.List;
import java.util.Scanner;

// 컨트롤러는 사용자에게 보여줄 화면 제어하는 과정
public class YoutubeController {
	
	private Scanner sc = new Scanner(System.in);
	private YoutubeService service = new YoutubeService(); //서비스를 통해 영상 목록을 가져오겠다.
	
	public void run() {
		while(true) { //조건문
			System.out.println("====유튜브 영상 관리====");
			System.out.println("1. 영상등록| 2. 전체 영상 조회 |0.  종료");
			int menu = sc.nextInt();
						sc.nextLine(); //개행 제거
			
			switch(menu) {
			case 1: addYoutube();
				break;
				
			case 2: showAllYoutube();
				break;
				
			case 0: 
				System.out.println("프로그램 종료");
				break; //return?
			
			default: // 조건문 만족안할 때 
				System.out.println("오류, 다시 입력해주세요");
			}
		}
		
	}



//DB에 저장된 모든 유튜브 영상의 목록을 조회해서, 
//영상 번호(db자동 증가), 제목, 채널명, 업로드 날짜, 조회수, 좋아요 수를 한 줄씩 출력
	
	private void addYoutube() { // 반환 아니고 그냥 보여지는 거니까? void
		System.out.println("1. 영상등록");
			System.out.println("제목:");
			String title = sc.nextLine();
			System.out.println("채널명:");
			 String channel = sc.nextLine();
			System.out.println("업로드 날짜(yyyy-mm-dd):");
			String uploaddate = sc.nextLine();
			System.out.println("조회수:");
			int views = sc.nextInt(); // 숫자는 int
			System.out.println("좋아요 수:");
			int likes = sc.nextInt();
			sc.nextLine(); //개행제거
			
			YoutubeDTO dto = new YoutubeDTO(0, title, channel, uploaddate, views, likes);
	        service.addYoutube(dto);
	        System.out.println("등록 완료!");
	}
	
	
	private void showAllYoutube() {
		List<YoutubeDTO> List = service.getAllYoutube(); //리스트에 겟옷 담음
		outYoutubeList(List);
	}
		private void outYoutubeList(List<YoutubeDTO>list) {
			//null 객제가 없는 경우~ .isEmpty 객체는 있으나 데이터가 0인 경우
			if(list == null || list.isEmpty()) {
				System.out.println("등록된 영상이 없음");
			}else {
				for(YoutubeDTO dto : list) { //전체 리스트에서 디티오값 불러옴
					System.out.println(dto); // 있으면 dto값 출력
				}
		}
	
		}
		}
	
	
	
	
