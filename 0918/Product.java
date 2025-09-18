package variable5;
/*상품(Product) 정보(name, price)는 직접 못 보고,
반드시 set/get 메서드로만 값 설정, toString() 메서드로만 출력 가능.
name, price는 private.
toString() 오버라이딩: "상품명: 이름, 가격: 원" 형식 출력.
main에서 set메서드로 값 저장 후, toString()으로 출력. 
 * 
 */
public class Product {

	private String name; // 비밀 정보 변수
	private int price;
	
	//생성자
	
			public void setName(String name) {
				this.name = name;
			}
			
			public void setPrice(int price) {
				this.price = price;
			}
	// 출력 메서드
			
			public String getName() {
				return name;
			}
			
			public int getPrice() {
				return price;
			}
				@Override // 우리가 원하는 형식으로 출력하겠다.
				//System.out.println(p);
				public String toString() { 
					return "상품명: " + name + ", 가격: " + price + "원";
						//toString() 메서드는 객체를 문자열로 표현할 때 호출되는 메서드
						//예를 들어 System.out.println(객체); 처럼 객체를 출력하면,
					 	//자동으로 toString() 메서드가 호출
			}
			
		}
