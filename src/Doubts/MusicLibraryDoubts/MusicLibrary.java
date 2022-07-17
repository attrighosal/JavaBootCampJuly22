package Doubts.MusicLibraryDoubts;

import MusicLibrary.entity.Song;

import java.util.HashMap;
import java.util.Map;

public class MusicLibrary {

  private Map<Integer, Artist> artists = new HashMap<>();

  public void releaseSong(Integer artistId, Song song) {
    Artist a = artists.get(artistId);
    a.releaseSong(song);

    artists.get(artistId).releaseSong(song);
  }

}
