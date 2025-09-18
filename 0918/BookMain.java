package variable5;
//도서관에서는 책(Book), 전공서적(TextBook), 소설(Novel)을 보관한다.
//책 정보는 사서만 setter/getter로만 접근할 수 있고, 직접 만질 수 없음.
//Book 클래스에 제목(title), 저자(author), 가격(price)는 private 변수.
//오직 set/get 메서드로만 정보 수정·조회가 가능하도록 설정.
//TextBook(subject: 과목명), Novel(genre: 장르)은 Book을 상속.
//main에서 각 객체의 정보를 setter로 저장, getter와 메서드로 출력.



public class BookMain {

	public static void main(String[] args) {
		//교과서
				Textbook textbook= new Textbook(); //객체 설정
				 textbook.setTitle("자바의 정석");
			        textbook.setAuthor("이승이");
			        textbook.setPrice(30000); // 부모 메서드
			        textbook.setSubject("컴공");

			        System.out.println("== 전공서적 ==");
			        textbook.printInfo(); // 정보 출력

		

		//소설
			        Novel novel = new Novel();
			        novel.setTitle("해리포터");
			        novel.setAuthor("이승이");
			        novel.setPrice(2000);
			        novel.setGenre("판타지"); //자식메서드

			        System.out.println("== 소설 ==");
			        novel.printInfo(); // 정보 출력
			    }
			

	}

