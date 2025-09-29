package Test3;

/*아래의 요구사항을 만족하는 맛집 방문 기록 프로그램을 만드시오.
[요구사항]
상호명(String) name
방문일(String, 예: 2024-09-29) visitDate
대표메뉴(String) menu
평점(int, 1~5점) rating

[기능]
맛집 등록
맛집 전체 조회
프로그램 종료
*/
public class FoodDTO {
	private String name;
	private String visitDate;
	private String menu;
	private int rating;

	

	

	public FoodDTO(String name, String visitDate, String menu, int rating) {
		
		this.name = name;
		this.visitDate = visitDate;
		this.menu = menu;
		this.rating = rating;
	}

	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return String.format("맛집 정보: 이름=%s, " + "방문일=%s, " // 문자
				+ "메뉴=%s, " // 숫자
				+ "평점=%d", // 문자
				name, visitDate, menu, rating);
	}

}
