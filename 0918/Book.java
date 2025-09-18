package variable5;
/*도서관에서는 책(Book), 전공서적(TextBook), 소설(Novel)을 보관한다.
책 정보는 사서만 setter/getter로만 접근할 수 있고, 직접 만질 수 없음.

Book 클래스에 제목(title), 저자(author), 가격(price)는 private 변수.
오직 set/get 메서드로만 정보 수정·조회가 가능하도록 설정.
TextBook(subject: 과목명), Novel(genre: 장르)은 Book을 상속.
main에서 각 객체의 정보를 setter로 저장, getter와 메서드로 출력.
 * 
 *상속+ 캡슐화
 */
public class Book {
		// 1. 외부 접근 막게 프라이빗 변수 설정
	
	    private String title;
	    private String author;
	    private int price;
	    
	    
	    //2. set으로 정보 수정: 생성자
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public void setAuthor(String author) {
			this.author = author;
		}
	
		public void setPrice(int price) {
			this.price = price;
		}
		
		
	//3. get으로 정보 획득
		
		public String getTitle() {
			return title;
		}
		public String getAuthor() {
			return author;
		}
		public int getPrice() {
			return price;
		}
		
		//4. 출력메서드
		public void printInfo() {
		    System.out.println("제목: " + title);
		    System.out.println("저자: " + author);
		    System.out.println("가격: " + price + "원");
		
		    /*객체가 자기 정보를 스스로 출력
		     * main에서 일일히 출력 쓰기 보다 부모클래스에 한줄로만 쓰면 끝
		     */
		
		}
}
