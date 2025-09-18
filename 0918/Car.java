package variable5;

public class Car implements Vehicle {
	  private int speed;  // 속도는 private로 감추기

	    // 속도 설정(setter)
	    public void setSpeed(int speed) {
	        this.speed = speed;
	    }

	    // 속도 조회(getter)
	    public int getSpeed() {
	        return speed;
	    }

	    // move 메서드 구현 (이동)
	    @Override
	    public void move() {
	        System.out.println("자동차가 " + speed + "km/h로 움직입니다.");
	    }
}
