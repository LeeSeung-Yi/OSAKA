package variable3;

public class DeliveryOrderMain {

	public static void main(String[] args) {
		//객체
		DeliveryOrder order = new DeliveryOrder("떡볶이", "기숙사");
		
		
		//배달 실행
		order.delivery();
	}

}
