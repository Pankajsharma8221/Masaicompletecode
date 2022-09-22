package com.q2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PlayList {
	public HashSet<Song> songs = new HashSet<>();
	
	public void addSong(Song song) {
		if(songs.add(song))
			System.out.println("Song added successfully");
		else
			System.out.println("Song is already added in the playlist");
	}
}
