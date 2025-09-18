package variable5;
//TextBook(subject: 과목명), Novel(genre: 장르)은 Book을 상속.
//main에서 각 객체의 정보를 setter로 저장, getter와 메서드로 출력.


public class Textbook extends Book {
    private String subject;

	

	public void setSubject(String subject) {
		this.subject = subject;
	}
    
    
	public String getSubject() {
		return subject;
	}
	
@Override
	public void printInfo() {
    super.printInfo(); // 부모 클래스의 출력
    System.out.println("과목명: " + subject); // 추가 정보 출력
}
}
	





