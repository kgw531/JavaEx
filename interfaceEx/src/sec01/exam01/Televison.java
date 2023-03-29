package sec01.exam01;

public abstract class Televison implements RemoteControl {
	protected int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() { 
		System.out.println("TV를 끕니다.");

	}
	// 인터페이스에서 정의한 3개의 추상메서드를 정의해야하는데 이 중 하나라도 구현하지 않으면 추상 클래스가 된다.
	
//	public void setVolume(int volume) {
//		if(volume > MAX_VALUE) {
//			this.volume = MAX_VALUE;
//		}else if(volume < MIN_VALUE) {
//			this.volume = MIN_VALUE;
//		}else {
//			this.volume = volume;
//		}
//		System.out.println("현재 TV 볼륨 : " + this.volume);
//		
//	}

}
