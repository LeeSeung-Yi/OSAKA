package ch2;
// 유튜브영상정보를 db에서 직접 연결해서 읽어 오고 저장하는 코드

// 디비에서 영상 목록 가져와서 호출한 쪽으로 돌려줌

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ch1.DBUtill;


public class YoutubeDAO {

//1. 전체 영상 조회	
	public List<YoutubeDTO> selectAllYoutube() { // 유튜브 영상 전체를 불러옴
		List<YoutubeDTO> list = new ArrayList<>(); // 결과를 담을 리스트 변수 생성

		String sql = "Select  * from youtube"; // db에서 가져올 sql구문

		// try-with-resources 구문 사용: 자동으로 자원 반납
		/*
		 * 트라이 캐치문: 예외 처리 구문- 예외를 그냥 두면 프로그램이 강제 정료되니까 .prepareStatement(null); db와 sql
		 * 구문으로 소통하는 통로
		 * 
		 */
		try (Connection conn = DBUtill.getConnection(); // db 연결 객체 가져옴
				PreparedStatement pstmt = conn.prepareStatement(sql); // sql실행 위해서 pstmt객체 실행
				ResultSet rs = pstmt.executeQuery()) { // ResultSet : sql 실행결과를 받는 위한 객체

			// 가로 안 rs.next() : 다음 줄이 있으면 true, 없으면 false로 빠져나옴
			while (rs.next()) {// db에서 데이터 꺼네서 dto에 저장

				// db 오라클에서 값을 꺼내옴- 반복하고 싶은 코드

				int id = rs.getInt("id"); // 영상 번호
				String title = rs.getString("title"); // 영상 제목
				String channelName = rs.getString("channelname"); // 채널명
				String uploadDate = rs.getString("uploaddate"); // 업로드 날짜 (문자열로 처리)
				int views = rs.getInt("views"); // 조회수
				int likes = rs.getInt("likes"); // 좋아요 수

				// dto에 담기
				YoutubeDTO dto = new YoutubeDTO(id, title, channelName, uploadDate, views, likes);

				// 내용들 dto에서 받아서 -> 리스트에 dto 값 추가
				list.add(dto);
			}

		} catch (Exception e) { // 오류 발생시 메시지 출력
			System.out.println("오류:" + e.getMessage());
		}
		return list;// 최종 리스트 반환: 디비에서 가져온 영상 목록을 호출한 쪽으로 돌려줌
	}
}