package homework;
/*1. 배달 주문 리스트 프로그램

외부 csv 파일을 만들어 읽고 쓰기

자동증가번호(id), 품명, 가격, 주문가능수, 현재재고(주문 후 남은 수량)

품명입력, 전체조회, 개별조회, 삭제, 수정, 통계*/

public class DeliveryDTO {
	private int id;
	private String name;
	private int price;
	private int order; //주문 가능 수
	private int stock; // 현재 재고
	
	public DeliveryDTO(int id, String name, int price, int order, int stock) {
// 필드값
		this.id = id;
		this.name = name;
		this.price = price;
		this.order = order;
		this.stock = stock;
	}
// 게터 세터
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "자동증가번호=" + id 
				+ ", 품명=" + name
				+ ", 가격=" + price 
				+ ", 현재 가능 주문 수=" + order 
				+ ", 재고=" + stock;
	}
	
	
	
}
