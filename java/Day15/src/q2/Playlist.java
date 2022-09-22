package q2;

import java.util.HashSet;

public class Playlist {
public HashSet<Song> songs=new HashSet<>();

public void addSong(Song song) {
	if(songs.add(song)) {
		System.out.println("Song is added successfully");
	}else {
		System.out.println("Song is already added");
	}
}
}
