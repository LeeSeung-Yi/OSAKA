package ch1;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	private List<StudentDTO> d = new ArrayList<>();
	
	public void save(StudentDTO dto) {
		d.add(dto);
	}
	public List<StudentDTO> findALL(){
		return d;
	}
	
	
}
