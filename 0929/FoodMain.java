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
public class FoodMain {

	public static void main(String[] args) {
		String filename = "DB/Food.csv";
		FoodDAO dao = new FoodDAO(filename);
		FoodService service = new FoodService(dao);
		FoodController controller = new FoodController(service);
		controller.run();

	}

}
