package music;

public class Track {
    private final String title;
    private final String artist;
    private final String album;
    private final int duration;
    private final int year;
    
    public Track(String title, String artist, String album, int duration, int year) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public int getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }

    
}