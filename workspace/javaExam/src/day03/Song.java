package day03;

public class Song {
	String title;
	String artist;
	String album;
	String composer;
	int year;
	int track;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	
	public static void show(String[] args) {
		Song IU = new Song();
		IU.setAlbum("Real");
		IU.setArtist("아이유");
		IU.setComposer("이민수");
		IU.setTitle("좋은날");
		IU.setTrack(3);
		IU.setYear(2010);
	}

}
