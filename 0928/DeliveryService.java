package homework;

import java.util.List;

//디티오- 다오- 서비스- 컨트롤러- csv순서- 메인
// 데이터와 사용자간 연결 위함


public class DeliveryService {

	private DeliveryDAO dao; //객체 다오에 담긴 정보를 갖고와서 쓰겠다.
	int nextId;
	
//생성자	
	public DeliveryService(DeliveryDAO dao) {
		this.dao = dao;
		this.nextId = getId() +1;
	}
//파일에서 읽어온 데이터의 최대 크기를 id로 사용
	private int getId() {
		int max = 0;
		for(DeliveryDTO dto : dao.findAll()) {
			if (dto.getId() > max) {
				max = dto.getId();
			}
		}
		return max;
	}
//0. 상품 등록(품번 입력)
	public void saveDelivery(String name, int price, int order, int stock ) {
		DeliveryDTO dto = new DeliveryDTO(nextId++, name, price, order, stock);
		dao.findAll().add(dto);
		dao.save(); // 컨트롤러에서 저장값을 부름 그래서 다오로 넘기나?
	}
		//1. 전체 상품 조회
	public List<DeliveryDTO> getAllDeliverys() {
		return dao.findAll();
	}
		//2. 개별 상품 조회 (id로 검색)
		public DeliveryDTO getById(int id) {
			for (DeliveryDTO dto : dao.findAll()) {
				if (dto.getId() == id) {
					return dto;
				}
			}
		return null; // 개별 상품 못찾을 때
	}
		//3. 상품 삭제 
	public boolean deleteById(int id) {
		List<DeliveryDTO> list = dao.findAll();
		for (DeliveryDTO dto : list) {
			if (dto.getId() == id) {
				list.remove(dto); //만약에 id가 같으면? 리스트에서 제거?
				dao.save();
				return true;
			}
		}
		return false; // 삭제 실패
	}
	
	//4. 상품 수정
	public boolean update(int id, String newName, int newPrice, int newOrder, int newStock) {
        for (DeliveryDTO dto : dao.findAll()) {
            if (dto.getId() == id) {
                dto.setName(newName);
                dto.setPrice(newPrice);
                dto.setOrder(newOrder);
                dto.setStock(newStock);
                dao.save(); // 저장
                return true;
            }
        }
        return false;
	}
	//5. 통계- 총 상품
	public int getTotal() {
		return dao.findAll().size();
	}
	
	}
	
        
