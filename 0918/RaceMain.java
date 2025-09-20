package variable5;

// 🎀 Main 클래스명도 의미있게 지어주셔서 좋습니다 👍
// 전반적으로 클래스명 짓는 것도 성의있게 해주신 거 같아 아주 좋아요!
public class RaceMain {

	public static void main(String[] args) {
	
			Car car = new Car();
	        Bicycle bike = new Bicycle();

	        // 속도 설정
	        car.setSpeed(100);
	        bike.setSpeed(30);

	        // 이동 실행 및 속도 출력
	        car.move();
	        System.out.println("현재 자동차 속도: " + car.getSpeed() + "km/h");

	        bike.move();
	        System.out.println("현재 자전거 속도: " + bike.getSpeed() + "km/h");
	    }
	
	}


