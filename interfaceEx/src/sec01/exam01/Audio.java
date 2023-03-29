package sec01.exam01;
// 여러 개의 인터페이스를 구현할 수 있다.
// 인터페이스들에 선언된 추상 메서드를 모두 구현 해야 한다.
// 미구현 메서드가 남아 있다면 추상클래스가 된다.ㄴ
public class Audio implements RemoteControl, Searchable{
	private int volume;
	

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VALUE) {
			this.volume = MAX_VALUE;
		}else if(volume < MIN_VALUE) {
			this.volume = MIN_VALUE;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
		
	}
	
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}


}
