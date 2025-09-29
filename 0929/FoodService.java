package Test3;

import java.util.List;



public class FoodService { // 등록하는 역할

	private FoodDAO dao;
	
	
	

	public FoodService(FoodDAO dao) {
		this.dao = dao;
	}
	
	//상품 
	public void saveFood(String name, String visitDate, String menu, int rating) {
	    FoodDTO dto = new FoodDTO(name, visitDate, menu, rating);
	    dao.save(dto);
	}
	
	//전체 상품 조회
	public List<FoodDTO> getAllFood() {
		return dao.findAll();
	
	}
	//개별 상품 조회
	public FoodDTO getByName(String name) {
		return dao.findByName(name);
	}
	
	//삭제
	public boolean deleteByName(String name) {
		return dao.deleteByName(name);
	}
	//수정
	public boolean updateFood(String name, String newName, String newVisitDate, String newMenu, int newRating) {
		return dao.updateDAO(name, newName, newVisitDate, newMenu, newRating);	
	}
	
	
	
	
	
	public void saveFood(String name, int visitDate, String menu) {
		// TODO Auto-generated method stub
		
	}

	public boolean updateDAO(String name, String newName, int newVisitDate, String newMenu, int newRating) {
		// TODO Auto-generated method stub
		return false;
	}

	
	}

	
	
	
	

