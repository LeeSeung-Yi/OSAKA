package variable3;
//제목(title)과 가수(artist)를 저장하고, 
//play() 메서드는 "노래를 재생합니다!"를 출력
public class Song {
// 변수(필드)
	String title; //노래 제목
	String artist; //가수 이름
	
	// 생성자: 객체 안에 정보 넣어줌
	public Song(String title, String artist) {
		
		this.title = title;
		this.artist = artist;
	}
	//메서드: 노래 재생
	public void music() {
		System.out.println("노래를 재생합니다!");
	}
	public void music1() {
		System.out.println("제목:" + title);
		System.out.println("노래:" + artist);
	}	
		}

	
	
//출력식을 만들어 놓고 메인에 변수값이 아닌 함수식 적으면 결과 함수식에 들어갔다 나옴	

