package Ch9.AbstractClasses.InnerClass.Challenge.PlaylistSongs;

import lombok.Getter;

import java.util.ArrayList;


@Getter
public class Album {

    private String albumName;
    private SongList songs;


    public Album (String albumName) {
        this.albumName = albumName;
        songs = new SongList();
    }

    private class SongList {
        @Getter
        ArrayList<Song> songs;

        private SongList () {

            songs = new ArrayList<>();
        }

        private boolean findSongInnerClass (String songName) {
            for( Song song : this.songs )
            {
                if (song.getSongName().equalsIgnoreCase(songName))
                    return true;
            }
            return false;
        }
        private void addSongInnerClass (String songName, double duration) {
        this.songs.add(Song.addSong(songName,duration));
        }
    }


    public boolean addSong (String songName, double duration ) {
        boolean found = findSong(songName);
        if(!found) {
            songs.addSongInnerClass(songName, duration);
            return true;
        }
        else {
            System.out.println("Song Already Exists");
            return false;
        }
    }

    private boolean findSong(String songName) {
       return songs.findSongInnerClass(songName);
    }

    public void showSongs () {
        if ( songs.getSongs().size() >= 1) {
            for (int i = 0; i < songs.getSongs().size(); i++) {
                Song song = songs.getSongs().get(i);
                System.out.println (i + 1 + ".  " + song.getSongName() + " - " + song.getDuration());
            }
            System.out.println("*****************************************");
        }
        else
            System.out.println("No songs in this album " );
    }

    public Song addToPlaylist (String songName) {
            for( int i = 0 ; i < songs.getSongs().size(); i++ ) {
                Song song = songs.getSongs().get(i);
                if(song.getSongName().equals(songName)) {
//                    System.out.println("Song Added");
                    return song;
                }

        }
        System.out.println("Song not found in your album");
            return null;
    }

}
