package ch2;
/*1. 유튜브 영상 관리 프로그램

필드: 영상 제목, 채널명, 업로드 날짜(yyyy-MM-dd), 조회수, 좋아요 수

DB에 저장된 모든 유튜브 영상의 목록을 조회해서,
영상 번호, 제목, 채널명, 업로드 날짜, 조회수, 좋아요 수를 한 줄씩 출력
*/

public class YoutubeDTO {
	
	//1. 변수 생성
	private int id; // 영상번호, 영상관리니까 id 필요 (DB에서 자동 생성)
	private String title;
	private String channelName;
	private String uploadDate;
	private int views;
	private int likes;
	
	
	//2. 필드값 생성
	public YoutubeDTO(int id, String title, String channelName, String uploadDate, int views, int likes) {
		
		this.id = id;
		this.title = title;
		this.channelName = channelName;
		this.uploadDate = uploadDate;
		this.views = views;
		this.likes = likes;
	}

	
	//3. 게터& 세터 : 게터는 변수값을 외부에서 읽게 해줌, 세터는 필드값을 외부에서 변경할 수 있게 해줌
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() { //영상 제목을 읽을 수 있음
		return title;
	}


	public void setTitle(String title) {//영상 제목을 설정할 수 있음
		this.title = title;
	}


	public String getChannelName() {
		return channelName;
	}


	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}


	public String getUploadDate() {
		return uploadDate;
	}


	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}


	public int getViews() {
		return views;
	}


	public void setViews(int views) {
		this.views = views;
	}


	public int getLikes() {
		return likes;
	}


	public void setLikes(int likes) {
		this.likes = likes;
	}

	
	//toString()은 객체를 문자열로 표현할 때 호출 메서드: 보기 좋게 출력하고 싶을 때
	
	@Override // 덮어씌어줌: 사람이 보기 좋게 만들어줌
	
	public String toString() {
		return 
				"Yutube 아이디=" + id 
				+ ", 제목=" + title 
				+ ", 채널 이름=" + channelName 
				+ ", 업로드 일=" + uploadDate 
				+ ", 조회수=" + views 
				+ ", 좋아요수=" + likes
				;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
