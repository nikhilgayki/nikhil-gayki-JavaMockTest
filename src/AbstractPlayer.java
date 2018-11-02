
abstract class Player{
	
	abstract void Play(String song, String jack, int Vol);
}

class MP3Player extends Player{

	@Override
	void Play(String song, String jack, int vol) {
		
		System.out.println("Song to be played = "+ song);
		System.out.println("Selected Mode = "+ jack);
		System.out.println("Selected Volume Level = "+ vol);
	}
	
	void loud(){
		System.out.println("MP3 Player is ON");
	}
	
}

class MP4Player extends Player{

	@Override
	void Play(String song, String jack, int vol) {
		
		System.out.println("Song to be played = "+ song);
		System.out.println("Selected Mode = "+ jack);
		System.out.println("Selected Volume Level = "+ vol);
	}
	
	void loud(){
		System.out.println("MP4 Player is ON");
	}
	
}

public class AbstractPlayer {
	
	public static void main(String[] args) {
		
		MP3Player a = new MP3Player();
		MP4Player b = new MP4Player();
		
		a.Play("Song in MP3", "Audio", 15);
		a.loud();
		
		System.out.println("-------------------");
		
		b.Play("Song in MP4", "Video", 40);
		b.loud();
	}
	 
}
