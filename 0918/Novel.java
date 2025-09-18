package variable5;

public class Novel extends Book { 
		private String genre; // 장르 변수 선언

		
		//생성
		public void setGenre(String genre) {
			this.genre = genre;
		}
		
	
		
		public String getGenre() {
			return genre;
		}
		
		@Override // 부모클래스에 있는 중복해서 자식한테 덮어씌운다는 뜻
		    public void printInfo() {
		        super.printInfo(); //여기까지 부모
		        System.out.println("장르: " + genre); //부모의 제목, 저자, 가격을 출력하고
		         	                                                        //그 다음에 자식클래스의 장르로 추가로 출력
		    }
		}
	
		 
	
	
	
	
	
	
	


