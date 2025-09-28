package homework;

public class DeliveryMain {

	public static void main(String[] args) {
	
			String filename = "DB/delivery.csv"; // CSV 파일 경로
	        DeliveryDAO dao = new DeliveryDAO(filename); // 파일 IO
	        DeliveryService service = new DeliveryService(dao); // 로직 처리
	        DeliveryController controller = new DeliveryController(service); // 사용자 입력 처리

	        controller.run(); // 실행 시작
	}

}
