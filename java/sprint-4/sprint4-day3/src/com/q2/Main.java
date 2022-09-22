package com.q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PlayList p = new PlayList();
		for (int i = 0; i < 4; i++) {
			System.out.println("Enter movie name");
			String movie = sc.nextLine();
			System.out.println("Enter song name");
			String song = sc.nextLine();
			Song s = new Song(movie, song);
			p.addSong(s);

		}

		System.out.println(p.songs.size());
		System.out.println(p.songs);

	}

}
