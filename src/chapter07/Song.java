package chapter07;

public class Song {
	private String songName;
	private String songSinger;	
	private String minutes;
	
	public void setSong(String sN, String sS, String m) {
		songName = sN;
		songSinger = sS;
		minutes = m;
	}
	
	public void getSong() {
		System.out.println(songName);
		System.out.println(songSinger);
		System.out.println(minutes);
	}

	public static void main(String[] args) {
		Song song1=new Song();
		song1.setSong("밤양갱","BIBI","02:33");
		song1.getSong();
		Song song2=new Song();
		song2.setSong("Love wins all","IU","04:31");
		song2.getSong();
	}
	

}	



