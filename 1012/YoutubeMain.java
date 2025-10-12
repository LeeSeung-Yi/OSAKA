package ch2;
// 컨트롤러를 통해 프로그램 시작, 실행
public class YoutubeMain {

	public static void main(String[] args) {
		
		YoutubeController controller = new YoutubeController();
		controller.run(); // 전체 영상 출력
		
		
		
		

	}

}
/*이클립스에서 프로젝트 우클릭

1. Build Path → Configure Build Path...

2. Libraries 탭 클릭

3. Add External JARs... 버튼 클릭

4. 방금 다운로드한 ojdbc8.jar 파일 선택 → Apply and Close
*/