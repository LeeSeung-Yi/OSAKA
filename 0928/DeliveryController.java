package homework;
import java.util.List;
/*=== 배달 주문 프로그램 ===
1. 품명 입력
2. 전체 조회
3. 개별 조회
4. 삭제
5. 수정
6. 통계
0. 종료
메뉴 선택 >>
*/
import java.util.Scanner;

public class DeliveryController {
// 입력받아야함
	Scanner sc = new Scanner(System.in);
	 private DeliveryService service; // 서비스 클래스에서 서비스 객체 생성?
	
	//생성자
	public DeliveryController(DeliveryService service) {
		 this.service = service; //매게 변수 통해서 들어와서 서비스로 들어가게끔 통로 만듬
	}
	
	//실행메서드
	public void run() { // 여러번 조회, 등록, 삭제 등 반복하기위해
		while (true) {
			printMenu();
			int choice =sc.nextInt();
			sc.nextLine(); //버퍼 제거 
			
			switch (choice) {
			case 1:
				registerDelivery();
				break;
			case 2:
				   outAllDelivery();
				break;
			case 3:
				  showDeliveryById();
				break;
			case 4:
				  deleteDelivery();
				break;
			case 5:
				updateDelivery();
				break;
			case 6:
				 Statistics();
					break;
					
			 case 0:
                 System.out.println("프로그램 종료!");
                 return;
             default:
                 System.out.println("잘못된 메뉴 번호입니다.");
				
			}
		}
	}
	//메뉴 출력
	private void printMenu() {
		System.out.println("==== 상품 관리 시스템 ====");
		System.out.println("1. 상품 등록");
		System.out.println("2. 전체 상품 조회");
		System.out.println("3. 개별 상품 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 수정 ");
		System.out.println("6. 통계");
		System.out.println("0. 종료");
	}
//1. 입력받아 상품 등록
	private void  registerDelivery() {
		System.out.println("상품명을 입력하세요: ");
		String name = sc.nextLine();
		System.out.println("가격을 입력하세요: ");
		int price = sc.nextInt();
		System.out.println("주문 수량을 입력하세요: ");
		int order = sc.nextInt();
		System.out.println("재고를 입력하세요: ");
		int stock = sc.nextInt();

		service.saveDelivery(name, price, order, stock); // 서비스에 넘겨서 저장,
		System.out.println("입력 완료");
	}
//2. 전체조회
	private void  outAllDelivery() {
        System.out.println("[전체 상품 목록]");
        List<DeliveryDTO> list = service.getAllDeliverys();
        if (list.isEmpty()) {
            System.out.println("등록된 상품이 없습니다.");
            return;
        }
        for (DeliveryDTO dto : list) {
            System.out.println(dto);
        }
    }
	//3. 개별 조회
	  private void showDeliveryById() {
	        int id = sc.nextInt();
	        DeliveryDTO dto = service.getById(id);
	        if (dto != null) {
	            System.out.println(dto);
	        } else {
	            System.out.println("조회할 상품이 없습니다.");
	        }
	    }
	  //4. 삭제
	  private void deleteDelivery() {
	        int id =  sc.nextInt();
	        boolean result = service.deleteById(id);
	        if (result) {
	            System.out.println("상품이 삭제되었습니다.");
	        } else {
	            System.out.println("해당 ID가 존재하지 않습니다.");
	        }
	    }
	  //5. 수정
	  private void updateDelivery() {
	        int id =  sc.nextInt();
	        String newName = sc.nextLine();
	        int newPrice =  sc.nextInt();
	        int newOrder =  sc.nextInt();
	        int newStock =  sc.nextInt();

	        if (service.update(id, newName, newPrice, newOrder, newStock )) {
				System.out.println("수정 완료.");
			} else {
				System.out.println("수정 실패.");
			}
		}
	  //6. 통계
	  private void Statistics() {
	        int total = service.getTotal(); // 전체 상품 수
	    
	        System.out.println("통계");
	        System.out.println("총 상품 개수: " + total);
	    }
	  
}
