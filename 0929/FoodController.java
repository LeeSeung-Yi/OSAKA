package Test3;

import java.util.List;
//입력할 때 입력완료 대신 5점 입력시만 메시지 뜨게 하기
import java.util.Scanner;

public class FoodController {

	private Scanner sc = new Scanner(System.in);
	private FoodService service;

	// 생성자
	public FoodController(FoodService service) {
		this.service = service;
	}

	public void run() {
		while (true) {
			System.out.println("번호입력:1- 맛집등록, 2- 맛집 전체 조회, 3- 개별 맛집 조회, 4- 맛집 삭제, 5- 맛집 수정, 0- 프로그램 종료");
			sc.nextLine();

			printMenu();
			int choice = sc.nextInt();
			sc.nextLine(); // 버퍼 제거

			switch (choice) {
			case 1:
				addFood();
				break;

			case 2:
				outAllFood();
				break;
			case 3: // 사용자가 3을 누르면 개별 조회
				 outFoodByName();
				break; // 개별적 조회 출력
			case 4: //
				deleteFood();
				break; // 삭제
			case 5:
				updateFood();
				break; // 수정 기능 추가
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("올바른 정보를 입력하세요.");

			}
		}
	}

	private void printMenu() {
		 System.out.println("=== 맛집 다이어리 ===");
		    System.out.println("1. 맛집 등록");
		    System.out.println("2. 맛집 조회");
		    System.out.println("3. 개별 맛집 조회");
		    System.out.println("4. 맛집 삭제");
		    System.out.println("5. 맛집 수정");
		    System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");
	}

	// 1. 상품 등록
	private void addFood() {
		System.out.println(" 상호명 입력: ");
		String name = sc.nextLine();
		System.out.println("방문 일 입력(예: 2024-09-29) :");
		String visitDate = sc.nextLine();
		sc.nextLine(); // 버퍼 비우기 인트 후에 라인 호출하면 오류뜨니까
		System.out.println("대표메뉴 입력: ");
		String menu = sc.nextLine();
		System.out.println("평점 입력(1~5): ");
		int rating = sc.nextInt();

		service.saveFood(name, visitDate, menu, rating);
		System.out.println("입력완료");
		if (rating == 5) {
			System.out.println("인생 맛집! 친구에게 추천!");
		} else {
			System.out.println("비추천 ㅜㅜ");
		}

	}

	// 2. 전체 상품 조회
	private void outAllFood() {
		List<FoodDTO> list = service.getAllFood();
		if (list.isEmpty()) {
			System.out.println(" 요청하신 가게가 없습니다.");
		} else {
			for (FoodDTO dto : list) {
				System.out.println(dto);
			}
		}
	}

	// 3. 개별 상품 조회
	private void outFoodByName() {
		System.out.println("조회할 가게 입력");
		String name = sc.nextLine();
		FoodDTO dto = service.getByName(name); // 이름으로 서비스에 정보 요청
		if (dto == null) { // 반환된 객체가 null이면 상품이 없으무니다
			System.out.println("조회할 상품이 없습니다.");
		} else { // 상품이 존재하면 출력
			System.out.println(dto); // dto.toString() 자동 호출
		}
	}
	//4. 삭제
	private void deleteFood() {
		System.out.println("삭제할 가게명을 입력하시오");
		 String name = sc.nextLine(); // 상품명 입력받기
		 
		 boolean result = service.deleteByName(name); // 서비스에서 이름으로 삭제 메서드 호출
		    if (result) {
		        System.out.println("상품이 삭제되었습니다.");
		    } else {
		        System.out.println("삭제할 상품이 존재하지 않습니다.");
		    }
	}
	// 5. 상품 수정
	private void updateFood() {
		System.out.print("수정할 상품명: ");
	    String name = sc.nextLine();
	    
	    FoodDTO dto = service.getByName(name);  // name으로 상품 조회 (서비스에 이 메서드가 있어야 함)
	    
	    if (dto == null) {
	        System.out.println("해당 이름의 상품이 없습니다.");
	        return;
	    }
	    System.out.print("변경 맛집 (" + dto.getName() + "): ");
	    String newName = sc.nextLine();

	    System.out.print("변경일 (" + dto.getVisitDate() + "): ");
	    int newVisitDate = sc.nextInt();
	    sc.nextLine(); // 숫자 입력 후 버퍼 비우기

	    System.out.print("변경메뉴 (" + dto.getMenu() + "): ");
	    String newMenu = sc.nextLine();

	    System.out.print("변경 평점 (" + dto.getRating() + "): ");
	    int newRating = sc.nextInt();
	    sc.nextLine();

	    boolean result = service.updateDAO(name, newName, newVisitDate, newMenu, newRating);

	    if (result) {
	        System.out.println("수정 완료.");
	    } else {
	        System.out.println("수정 실패.");
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
