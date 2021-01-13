package Structural.CompositePattern.Assignment;

/**
 * @author Bishwa on 15/10/2020
 */
public class Song implements IComponent {
    private String songName;
    private String artist;
    private float speed = 1;

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    @Override
    public void play() {

    }

    @Override
    public void setPlaybackSpeed(float speed) {

    }

    @Override
    public String getName() {
        return this.songName;
    }

    public String getArtist() {
        return artist;
    }
}