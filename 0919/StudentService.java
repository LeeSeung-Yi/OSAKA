package ch1;

import java.util.List;

public class StudentService {
	private  StudentDAO dao;

	//생성자
	public StudentService(StudentDAO dao) {
	this.dao = dao;
	}
	
	public void addStudent(String name, String studentId, String className) {
		StudentDTO dto = new StudentDTO(name, studentId, className);
		dao.save(dto);
	
	}
	public List  <StudentDTO> getAllStudents(){
	 return dao.findALL();	
	}
}
