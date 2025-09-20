package ch1;

import java.util.List;
import java.util.Scanner;

public class StudentController {
	private StudentService service;
	private Scanner sc = new Scanner(System.in);
	
	
	  public StudentController(StudentService service) { //?
	        this.service = service;
	}	
	  public void run() {
		  while (true) {
			  System.out.println("번호입력: 1-학생 등록 / 2-전체 학생 조회 / 0-종료");
			  int q= sc.nextInt();
			  sc.nextLine(); // 개행 문자 제거
			  
			  switch (q) {
			  case 1:
				  System.out.print("이름: ");
                  String name = sc.nextLine();
                  System.out.print("학번: ");
                  String studentId = sc.nextLine();
                  System.out.print("반명: ");
                  String className = sc.nextLine();

                  service.addStudent(name, studentId, className);
                  System.out.println("학생 등록 완료!");
                  break;

			  case 2:
                  List<StudentDTO> students = service.getAllStudents();
                //새로운 순차적 불러오기
                      for (StudentDTO dto : students) {
                          System.out.println(dto);
                      }
                 
                  break;
			  case 0:
					System.out.println("프로그램 종료");
					// break; 구문을 빠져나옴
					return; // 즉시 종료
			
			  default:
					System.out.println("번호만 입력하세요");
					 break;
		  }
			  
			  }
	  }
	  }
			  
		  
	  
	  
	  

