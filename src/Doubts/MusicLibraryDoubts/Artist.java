package Doubts.MusicLibraryDoubts;

import MusicLibrary.entity.Song;

import java.util.List;

public class Artist {

  private Integer id;
  private List<Song> releasedSongs;

  public void releaseSong(Song song) {
    releasedSongs.add(song);
  }
}
