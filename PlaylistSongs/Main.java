package PlaylistSongs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        LinkedList<Song> songs = new LinkedList<>();

        Album album1 = new Album("Manele Vechi 2005");
        Album album2 = new Album("Trap ");
        album1.addSong("Eu as da zilele mele", 3.40);
        album1.addSong("Am norocul scris in frunte", 3.10);
        album1.addSong("Eu as da zilele mele", 3.40);
        album1.addSong("Saint Tropez", 3.20);

        album2.addSong("Superlife", 4.20);
        album2.addSong("All night", 4.10);
        album2.addSong("Still Cold", 4.00);
        album1.showSongs();
        album2.showSongs();

        albums.add(album1);
        albums.add(album2);

        songs.add(album2.addToPlaylist("Superlife"));
        songs.add(album2.addToPlaylist("All night"));
        songs.add(album1.addToPlaylist("Saint Tropez"));
        songs.add(album1.addToPlaylist("Am norocul scris in frunte"));
        songs.add(album1.addToPlaylist("Eu as da zilele mele"));
        songs.add(album2.addToPlaylist("Still Cold"));


        play(songs);


    }

    public static void menu() {
        System.out.println("************");
        System.out.println("1. Skip forward \n" +
                "2. Skip backwards \n" +
                "3. Replay song\n" +
                "4. Quit\n");
    }

    private static void play(LinkedList songs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********");
        System.out.println("PLAYLIST \n********");
        ListIterator<Song> songListIterator = songs.listIterator();
        System.out.println("Currently playing:" + songListIterator.next());
        boolean quit = false;
        boolean goingForward = true;
        while (!quit) {
            menu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                        if(!goingForward) {
                            songListIterator.next();
                        }
                        if(songListIterator.hasNext()) {
                            System.out.println("Now playing: " + songListIterator.next());
                            goingForward = true;
                        }
                        else
                            System.out.println("End of the playlist");
                        break;
                case 2:
                    if(goingForward) {
                        songListIterator.previous();
                    }
                    if(songListIterator.hasPrevious()) {
                        System.out.println("Now playing: " + songListIterator.previous());
                        goingForward = false;
                    }
                    else
                        System.out.println("You reach the start of the playlist");
                    break;
                case 3:
                    if (goingForward) {
                        songListIterator.previous();
                        System.out.println("Now playing: " + songListIterator.next());
                    }else
                    {
                        System.out.println("Now playing: " + songListIterator.next());
                        goingForward=true;
                    }
                    break;
                case 4:
                    quit = true;
                    break;
            }
        }


    }


}
