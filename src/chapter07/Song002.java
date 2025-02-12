package chapter07;

public class Song002 {
	private String songName;
	private String songSinger;	
	private String minutes;

	
	public String getSongName() {
		return songName;
	}


	public void setSongName(String songName) {
		this.songName = songName;
	}


	public String getSongSinger() {
		return songSinger;
	}


	public void setSongSinger(String songSinger) {
		this.songSinger = songSinger;
	}


	public String getMinutes() {
		return minutes;
	}


	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}


	
	@Override
	public String toString() {
		return "Song002 [songName=" + songName + ", songSinger=" + songSinger + ", minutes=" + minutes + "]";
	}


	public static void main(String[] args) {
		Song002 ags=new Song002();
		ags.setSongName("밤양갱");
		ags.setSongSinger("BIBI");
		ags.setMinutes("02:33");
		System.out.println(ags.toString());
		ags.setSongName("Love wins all");
		ags.setSongSinger("IU");
		ags.setMinutes("04:31");
		System.out.println(ags.toString());
	}

}
