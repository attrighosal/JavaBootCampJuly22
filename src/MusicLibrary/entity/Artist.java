package MusicLibrary.entity;

import java.util.LinkedList;
import java.util.List;

public class Artist {

  private static Long counter = 1L;

  private Long id;
  private String firstName;
  private String lastName;
  private List<Song> releasedSongs;

  public Artist(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.releasedSongs = new LinkedList<>();
    this.id = counter;
    counter++;
  }

  public Long getId() {
    return id;
  }

  public void releaseSong(Song song) {
    this.releasedSongs.add(song);
  }

  public String toString() {
    return "Artist id : "+id+", name : "+firstName+" "+lastName;
  }
}
