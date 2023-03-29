package sec01.exam01;

public class SmartTv  extends Televison implements Searchable{
	
	//오버라이딩
	public void turnOn() {
		System.out.println("SmartTv를 켭니다.");
	}
	public void turnOff() {
		System.out.println("SmartTv를 끕니다.");
	}
	
	
	public void setVolume(int volume) {
		if(volume > MAX_VALUE) {
			this.volume = MAX_VALUE;
		}else if(volume < MIN_VALUE) {
			this.volume = MIN_VALUE;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
		
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}
}
