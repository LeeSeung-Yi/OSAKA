package variable5;
//인터페이스+ 캡슐화(private + set/get 메서드)
/*경주대회에 자동차(Car)와 자전거(Bicycle)가 참가한다. 속도(speed)는 비밀! 
 * 반드시 set/get 메서드로만 조작할 수 있다. Vehicle 인터페이스: move() 메서드 선언.
 *  Car와 Bicycle 클래스는 Vehicle을 구현, 속도(speed)는 private. 
 * 속도를 설정하고(move 전에), 이동(move) 후에 속도를 get메서드로 출력.
 * 
 */
public interface Vehicle { //인터페이스 선언: void 메서드를 약속함 
void move(); //이동 기능 선언


/* 🎀
* Vehicle 인터페이스 파일에 Car 클래스를 구현하셨네요!!
* 이 방법도 당연 가능하지만, Car 클래스가 별도로 있는 것으로 보아, 실수로 요기 두신 것 같아요 ㅎㅎ
* 혹시 몰라 언급하고 갑니다 😊
*/
	// car 클래스  :Vehicle 인터페이스 
public class Car implements Vehicle { // 실행 생성
    private int speed;


    // 세터 : 속도 설정
	public void setSpeed(int speed) {
		this.speed = speed; 
	}  
	// 게터 : 속도 조회
	public int getSpeed() {
		return speed;
	}    // 속도는 private는 비밀...
	
	// move 메서드 구현
	@Override
	 public void move() {
        System.out.println("자동차가 " + speed + "km/h로 움직입니다.");
    }
}
	
    
    









}
	

