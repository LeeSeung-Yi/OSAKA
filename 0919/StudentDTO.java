package ch1;

public class StudentDTO {
	private String name; //이름
	private String studentId; //학번
    private String className; //반명
    
    
	public StudentDTO(String name, String studentId, String className) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.className = className;
	}


	@Override
	public String toString() {
		return "StudentDTO 이름=" + name + ", 학번=" + studentId + ", 반명=" + className + "]";
	}
	
	
}
