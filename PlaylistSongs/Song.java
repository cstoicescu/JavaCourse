package PlaylistSongs;

import lombok.Getter;
import lombok.ToString;

@Getter

public class Song {

    private String songName;
    private double duration;

    public Song (String songName, double duration) {
        this.songName = songName;
        this.duration = duration;
    }

    public static Song addSong (String songName, double duration) {
        return new Song ( songName, duration ) ;
    }

    public String toString() {
        return (" " + this.songName + " duration -> " + this.duration);
    }
}
