package getter.setter;

public class Car {
	private int speed;
	private boolean stop;
	
	
	
	public int getSpeed() {
		// 필드 값을 반환
		return speed;
	}
	public void setSpeed(int speed) {
		// 필드의 값을 변경
		// 값이 유효한 지 검증 후 값을 변경할 수 있다.
		if(speed > 0) {
			this.speed = speed;	
		}else {
			this.speed = 0;
		}
	}
	// is로 시작하면 반환타입이 boolean인 경우가 많다.
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		if(stop) {
			this.setSpeed(0);
		}
		this.stop = stop;
	}
	
	
	
	
	
}
