package variable5;


	public class Bicycle implements Vehicle {
	    private int speed;

	    public void setSpeed(int speed) {
	        this.speed = speed;
	    }

	    public int getSpeed() {
	        return speed;
	    }

	    @Override
	    public void move() {
	        System.out.println("자전거가 " + speed + "km/h로 움직입니다.");
	    }

}
	