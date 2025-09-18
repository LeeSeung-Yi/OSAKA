package variable3;
//Pizza 클래스로 종류 "페퍼로니", 사이즈 "L" 피자 객체를 만들고 정보 출력
public class Pizza {//클래스 선언- 피자인 클래스를 만듬
	//변수(필드) : 객제의 정보 저장
	String type; // 종류 저장
	String size;// 사이즈 저장
	// ㄴ변수선언
	
//생성자: 객체 만들 때 자동으로 호출되는 메서드: 객체에 정보를 바로 넣어줌
public Pizza(String type, String size) {
		this.type = type; //클래스 변수 = 생성자의 변수(함수 안 전달된 값)
		this.size = size; 
}
//매서드
 void eat () {
			System.out.println("피자종류:"+type );
		}
 void eat1 () {
		System.out.println("피자크기:"+size );
		
		
	}
 
 
 
	} 


