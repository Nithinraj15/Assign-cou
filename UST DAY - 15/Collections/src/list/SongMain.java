package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


class Song {
	// All are private fields for the class Song
	private String title;
	private String artist;
	private int durationInSeconds;
	// Constructor for the class Song
	public Song(String title, String artist, int durationInSeconds) {
		this.title = title;
		this.artist = artist;
		this.durationInSeconds = durationInSeconds;
	}
	// get() method for all the fields title, Artist, duration
 	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public int getDurationInSeconds() {
		return durationInSeconds;
	}
	@Override
	// returning the value as string format using toString()
	public String toString() {
		return "Title: " + title + ", Artist: " + artist + ", Duration: " + durationInSeconds + "s";
	}
}
class SongMain{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Song song1 = new Song("Shape of You", "Ed Sheeran", 240);
		Song song2 = new Song("Blinding Lights", "The Weeknd", 200);
		Song song3 = new Song("Levitating", "Dua Lipa", 220);
		Song song4 = new Song("Uptown Funk", "Mark Ronson ft. Bruno Mars", 270);
        Song song5 = new Song("Stay", "The Kid LAROI & Justin Bieber", 180);
        Song song6 = new Song("Save Your Tears", "The Weeknd", 215);
        Song song7 = new Song("Watermelon Sugar", "Harry Styles", 174);
        Song song8 = new Song("Good 4 U", "Olivia Rodrigo", 210);
		ArrayList <Song> playlist = new ArrayList<>();
		playlist.add(song1);
		playlist.add(song2);
		playlist.add(song3);
		playlist.add(song4);
		playlist.add(song5);
		playlist.add(song6);
		playlist.add(song7);
		playlist.add(song8);
		for(Song s : playlist) {
			System.out.println(s);
		}
		System.out.println("=======================================");
		System.out.println("Enter the index of the song to print: ");
		int n = sc.nextInt();
		if(n>=0 && n<=playlist.size()){
		System.out.println("Your choosen song at index " + n + " is: ");	
		System.out.println(playlist.get(n));
		}else {
			System.out.println("The index which you entered is not found");
		}
		System.out.println("================================================");
		System.out.println("Using Iterator");
		Iterator <Song> it = playlist.iterator();
		int sum =0;
		while(it.hasNext()) {
			Song song = it.next();
			sum += song.getDurationInSeconds();
		}
		System.out.println("Total Duration of all song: " + sum);
		Iterator <Song> it1 = playlist.iterator();
		while(it1.hasNext()) {
			Song maxval = it1.next();
			if(maxval.getDurationInSeconds() < 180) {
				it1.remove();
			}
		}
		System.out.println("================================================");
		System.out.println("Modified Playlist (after removing songs < 180 seconds):");
        for (Song s : playlist) {
            System.out.println(s);  // Display remaining songs
        }
	}
}
