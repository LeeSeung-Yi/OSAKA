package Test3;
// 맛집 등록, 전체 조회, 프로그램 종료만
/*데이터는 List에 저장
평점이 5점이면 “인생 맛집! 친구에게 추천!” 메시지 출력*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/*DB/Food.csv를 읽어와 이스트로 저장
* crud작업 후 다시 .csv파일로 저장
*/
public class FoodDAO {

	private List<FoodDTO> foodList;
	private String filename;
	
	// 파일 경로 받아와 리스트 초기화
	public FoodDAO(String filename) {
		
		this.filename = filename;
		this.foodList = loadCsv(filename);
	}
	
	//csv에서 파일 읽기
	private List<FoodDTO> loadCsv(String filename) {
		List<FoodDTO> list = new ArrayList<>();
	
	/*
	 * try–catch :프로그램 실행 중 오류가 발생해도 프로그램이 멈추지 않고 돌아가게 해 줌
	 * 
	 * BufferedReader br = new BufferedReader(new FileReader(filename)); 문서를 한 줄 씩
	 * 읽게 해줌
	 */
	
		//1. csv파일에 저장된 맛집 정보를 프로그램(List)으로 불러옴
	try (BufferedReader br = new BufferedReader(
			new InputStreamReader(
					new FileInputStream(filename), "UTF-8"))){
		String line; //외부 파일에서 읽어온 한 줄 데이터 저장
		boolean isSkip = true;
		
		while ((line = br.readLine()) != null) { //한줄씩 읽다가 마지막 오면 종료
			if (isSkip) { //두번째 줄은 거짓이기 때문에 이 구문 실행x
				isSkip = false;
				continue;//첫줄 건너뜀
			}
			String[] parts = line.split(","); // 2번째 줄부터, 쉼표 기준으로 나누기
			
			String name = parts[0].trim(); //숫자
			String visitDate = parts[1].trim();
	        String menu = parts[2].trim();
	        int rating = Integer.parseInt(parts[3].trim());
		list.add(new FoodDTO(name, visitDate, menu, rating));//리스트 추가 및 dto생성
		}
		}catch (FileNotFoundException e) {
			e.printStackTrace();//에러 처리
		}catch (Exception e) { // 그 외 모든 오류 = 제일 마지막에 쓰는 내용
			System.out.println(e + "그 외 모든 오류");
		}
		return list;
	}

	//2. 파일을 통해 데이터 저장, 불러오기, 조작(추가, 조회, 수정, 삭제)
	//1) 상품 저장
		private void writeCsv() {
			PrintWriter pw = null;
			try {
				pw = new PrintWriter(new FileWriter(filename));
				 pw.println("name,visitDate,menu,rating"); //헤더 출력?
			for (FoodDTO dto :foodList) {
				 pw.printf("%s,%d,%s,%dn", dto.getName(),dto.getVisitDate(),dto.getMenu(),dto.getRating());		
			}
			pw.close(); // 닫는 것도 꼭!
			} catch (IOException e) {
	            System.out.println("저장 실패: " + e.getMessage());
	        }finally {
	        	if (pw != null)
	        	pw.close();
			}
		}
	
	//2) 전체 상품 조회 및 반환
		public List<FoodDTO> findAll() {
			return foodList; //데이터를 보냄
		}
	
	//3) 개별 상품 조회 및 반환
		public FoodDTO findByName(String name) {
			return foodList.stream()
					.filter(food -> food.getName().equals(name))
					.findFirst()
					.orElse(null); // 맞는게 없으면 null반환, 반환값 데스네~ null은 반환 값 없음.
		}
	//4) 상품 삭제 i는 list에서 찾아 삭제하려는 인덱스번호니까 int
		public boolean deleteByName(String name) {
			boolean removeFood = foodList.removeIf(food ->food.getName() ==name);
			if(removeFood) writeCsv();// 값이 참인 경우 호출
			return removeFood;
		}
	//5) 수정 메서드 만들기
		public boolean updateDAO(String name, String newName, String newVisitDate, String newMenu, int newRating) {
			FoodDTO dto = findByName(name);// 수정하려는 맛집 이름으로 다른 이름 찾기
			if (dto != null) {
				dto.setName(newName); // 찾아서 새로운 이름으로 변경하겠다?
				dto.setVisitDate(newVisitDate);
				dto.setMenu(newMenu);
				dto.setRating(newRating);
				return true;
			}
			return false;
		}
		public void save(FoodDTO dto) {
			// TODO Auto-generated method stub
			
		
		}
}
	
	/*
	//상품 저장: 등록
	public void save(FoodDTO food) {
		foodList.add(food);
	}
	
	// 전체 목록 조회
	public List<FoodDTO> findAll(){
		return foodList;
	}
	//개별 상품 조회
	public FoodDTO findByName(String name) {
		for (FoodDTO dto : foodList) { //푸드리스트에서 사용자가 찾고자 하는 name과 같은 객체를 찾아 반환
			if (dto.getName().equals(name)) {
				return dto;
			}
		}
		return null; //반환값 데스네~ null은 반환 값 없음.
	}
	//상품 삭제 - i는 list에서 찾아 삭제하려는 인덱스번호니까 int
	
	public boolean deleteByName(String name) {
		for (int i = 0; i < foodList.size(); i++) {
			if (foodList.get(i).getName().equals(name)) {//겟 네임은 dto에서 필드 거냄 리스트에서 객체 안거내고
				foodList.remove(i);
				return true;
				
			}
		}
		return false;
	}

	//수정
	public boolean updateDAO(String name, String newName, int newVisitDate, String newMenu, int newRating) {
		FoodDTO dto = findByName(name); // 수정하려는 맛집 이름으로 다른거 찾기
	if (dto != null) {
		dto.setName(newName); // 찾아서 새로운 이름으로 변경하겠다?
		dto.setVisitDate(newVisitDate);
		dto.setMenu(newMenu);
		dto.setRating(newRating);
		return true;
	}
		return false;
	*/

