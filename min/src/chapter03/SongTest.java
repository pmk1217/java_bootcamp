package chapter03;


public class SongTest {
		public static void main(String[] args) {
			Song song = new Song();
			song.setAlbum("Real");
			song.setArtist("아이유");
			song.setComposer("이민수");
			song.setTitle("좋은날");
			song.setYear(2010);
			song.setTrack(3);
			
			song.show();
			
			Song song2 = new Song("Love Dive","IVE" , "Jamine Parker 외 3명", "Love Dive", 2022, 1);
			song2.show();
		}
}
