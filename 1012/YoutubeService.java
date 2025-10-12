package ch2;
// 서비스: 다오를 이용해서 데이터를 처리하고 반환하는 과정

import java.util.List;

public class YoutubeService {
	
		//다오를 이용하겟다
		private YoutubeDAO dao; // 1. 다오클래스의 객체를 담을 변수 선언 		
		// 생성자
		public YoutubeService() {
			this.dao = new YoutubeDAO(); // 2. 실제 DAO객체를 만들어서 변수 저장
			// this는 현재 자신을 나타냄
		}
		
		// 영상 전체 목록 가져옴
		public List<YoutubeDTO> getAllYoutube(){
		// 디비에서 가져와서 데이터 반환
		return dao.selectAllYoutube(); // -> 선언해놓은 다오 객체를 이용해서 db접근함
}

		public void addYoutube(YoutubeDTO dto) {
			// TODO Auto-generated method stub
			
		}
	
}
