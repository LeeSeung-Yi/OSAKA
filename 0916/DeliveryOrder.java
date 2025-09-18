package variable3;

public class DeliveryOrder {
	// DeliveryOrder 클래스를 사용해서 음식 "떡볶이", 주소 "기숙사"인 주문 객체를 만들고 deliver() 메서드를 실행
	String food;
	String adress;
	
	
	//생성자
	public DeliveryOrder(String food, String adress) {
		super();
		this.food = food;
		this.adress = adress;
	}
	//출력문(메서드)
	public void delivery() {
		System.out.println("음식:" + food);
		System.out.println("주소:" + adress);
	}
	
	
}
