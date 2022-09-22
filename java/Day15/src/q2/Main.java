package q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
Playlist p=new Playlist();
for(int a=0;a<4;a++) {
	System.out.print("Enter movie name");
	String mo=sc.nextLine();
	System.out.println("Enter the song name");
	String so=sc.nextLine();
	Song s= new Song(mo,so);
	p.addSong(s);
}
System.out.println(p.songs.size());
System.out.println(p.songs);

	}

}
