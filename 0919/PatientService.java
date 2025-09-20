package variable6;

import java.util.List;
//서비스: 중간 관리자
//구체적 정보 등록, 조회 
public class PatientService {
	//필요한 정보 외부에서 가져옴
	//서비스가 다오 필요
	
	
private PatientDAO dao;
	
	public PatientService(PatientDAO dao) {
		this.dao = dao;
	}
	
	public List<PatientDTO> getAllAnimals() {
		return dao.findAll();
	}
	
	public void addAnimal(String id, String p_name, String a_name, int age, int phone) {
		PatientDTO dto = new PatientDTO(id, p_name, a_name, age, phone);
		dao.save(dto);
	}
}
