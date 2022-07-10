package MusicLibrary.entity;

public class Song {

  private static Long count = 1L;

  private Long id;
  private String title;
  private String genre;
  private Integer releaseYear;
  private String language;
  private Long listenCount;

  public Song(String title, String genre, Integer releaseYear, String language) {
    this.title = title;
    this.genre = genre;
    this.releaseYear = releaseYear;
    this.language = language;
    this.listenCount = 0L;
    this.id = count;
    count++;
  }

  public Long getId() {
    return id;
  }

  public void listen() {
    this.listenCount++;
  }

  public String toString() {
    return "Song id : "+id+", title : "+title;
  }
}
