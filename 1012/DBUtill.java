package ch2;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtill {
	private static final String URL ="jdbc:oracle:thin:@localhost:1521:xe"; //접속 주소
	private static final String USER = "c##osaka"; //계정 아이디
	private static final String PW = "1234"; // 계정 비밀번호
	
	//커넥션 객체 반환 메서드: 외부에서 접근 가능 public
	public static Connection getConnection() {
	try {
		return  DriverManager.getConnection(URL, USER, PW); //접속할 주소 아이디 번호
		}catch (Exception e) { //문제발생
		System.out.println("db 연결 실패 :" + e.getMessage());
		}
	return null; //문제 없으면 널 값으로 넘김
	// 왜 다오에서 오류처리 했는데 여기서도 연결실패를 적을까?
	}
}
