package homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;



//OrderItemDAO - CSV 파일과 데이터를 주고받는 클래스 (파일 입출력 전담)

public class DeliveryDAO {
	private String filename;
	private List<DeliveryDTO> deliveryList;

// 파일 경로를 받아 리스트 초기화
	public DeliveryDAO(String filename) {
		this.filename = filename;
		this.deliveryList= loadCsv(filename);
		
		
		
		
		
	}
//csv에서 파일 읽기
	private List<DeliveryDTO> loadCsv(String filename) {
	List<DeliveryDTO>list = new ArrayList<DeliveryDTO>();	
	
	/*트라이캐치: 프로그램 실행 오류가 일어나도 최소 한번은 멈추지 않고 돌아가게 해줌
	 * BufferedReader br = new BufferedReader(new FileReader(filename)); 문서를 한 줄 씩
		 * 읽게 해줌
	 * 
	 */
	
	try { BufferedReader br = new BufferedReader(new FileReader(filename));
	String line; // 외부 파일에서 읽어온 데이터 저장 한줄만
	boolean isSkip = true;
	
	while((line = br.readLine()) != null) { // 한줄 씩 읽다가 null되면 종료
		if(isSkip) { 
			isSkip = false; // 두번째 줄부터는 거짓이기 대문에 구문 실행되지 않음
			continue; //이번 반복 건너뛰고 넘어가라
		}
		String[] parts = line.split(","); // 쉼펴기준으로 나누겟음
		int id = Integer.parseInt(parts[0].trim()); //문자열로 나눈 것을 점수로 변환, 트림은 띄어쓰게 삭제
		String name= parts[1].trim();
		int price= Integer.parseInt(parts[2].trim());
		int order= Integer.parseInt(parts[3].trim());
		int stock= Integer.parseInt(parts[4].trim());
		
		list.add(new DeliveryDTO(id, name, price, order, stock)); // 새로운 디티오 만들고 리스트에 추가하여 디티오로 넘겨줌
	}
	
	} catch (FileNotFoundException e) { // 에러 처리
		e.printStackTrace();
	} catch (Exception e) { // 외 모든 오류 처리: 마지막에 씀
		System.out.println(e +"그 외 모든 오류입니당 ");
	}
	return list;
	} 
	
	
	// 1. 상품 저장- csv에 저장
	private void writeCsv() { // 파일에 데이터를 저장하는 역할 - 전에 컨트롤러랑 서비스 먼저 
		try {
			 PrintWriter pw = new PrintWriter(new FileWriter(filename));
			 pw.println("id,name,price,orderLimit,stock");
	            for (DeliveryDTO dto : deliveryList) {
	                pw.printf("%d,%s,%d,%d,%d%n",
	                    dto.getId(), dto.getName(), dto.getPrice(), dto.getOrder(), dto.getStock());
	            }
	            pw.close();
	        } catch (IOException e) {
	            System.out.println("CSV 저장 실패: " + e.getMessage());
	        }
	    }
		        // CSV 헤더
	// 리스트 전체 반환
    public List<DeliveryDTO> findAll() {
        return this.deliveryList;
    }

    // 리스트 저장 -> CSV 저장 호출
    public void save() {
        writeCsv();
    }

    // DTO 추가 후 저장
    public void save(DeliveryDTO dto) {
        deliveryList.add(dto);
        save();
    }

	
	
	
		
	}
	
	
	
	
	
	
