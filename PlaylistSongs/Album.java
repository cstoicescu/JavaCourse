package PlaylistSongs;

import lombok.Getter;


import java.util.ArrayList;


@Getter
public class Album {

    private String albumName;
    private ArrayList<Song> songs;

    public Album (String albumName) {
        this.albumName = albumName;
        songs = new ArrayList<>();
    }

    public boolean addSong (String songName, double duration ) {
        boolean found = findSong(songName);
        if(!found) {
            songs.add(Song.addSong(songName, duration));
            return true;
        }
        else {
            System.out.println("Song Already Exists");
            return false;
        }
    }

    private boolean findSong(String songName) {
        for ( int i = 0 ; i < songs.size(); i++)  {
            Song song = songs.get(i);
            if (song.getSongName().toLowerCase().equals(songName.toLowerCase()))
                return true;
        }
        return false;
    }

    public void showSongs () {
        if ( songs.size() >= 1) {
            for (int i = 0; i < songs.size(); i++) {
                Song song = songs.get(i);
                System.out.println (i + 1 + ".  " + song.getSongName() + " - " + song.getDuration());
            }
            System.out.println("*****************************************");
        }
        else
            System.out.println("No songs in this album " );
    }

    public Song addToPlaylist (String songName) {
            for( int i = 0 ; i < songs.size(); i++ ) {
                Song song = songs.get(i);
                if(song.getSongName().equals(songName)) {
//                    System.out.println("Song Added");
                    return song;
                }

        }
        System.out.println("Song not found in your album");
            return null;
    }

}
