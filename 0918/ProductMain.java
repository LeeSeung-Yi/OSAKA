package variable5;

public class ProductMain {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setName("아이폰17");
		product.setPrice(1290000);
		// 🎀 팁: '.toString()'이라고 명시하지 않고
		// System.out.println(product); << 요렇게만 작성해도 동일한 결과가 나온답니당
		System.out.println(product.toString());
	}

}
