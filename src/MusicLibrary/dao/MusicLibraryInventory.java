package MusicLibrary.dao;

import MusicLibrary.entity.Artist;
import MusicLibrary.entity.Song;
import MusicLibrary.entity.User;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MusicLibraryInventory {

  private Map<Long, User> users;
  private Map<Long, Artist> artists;
  private Map<Long, Song> songs;
  private Map<Long, List<Long>> userSongHistory;

  public MusicLibraryInventory() {
    this.users = new HashMap<>();
    this.artists = new HashMap<>();
    this.songs = new HashMap<>();
    this.userSongHistory = new HashMap<>();
  }

  public void addUser(User user) {
    users.put(user.getId(), user);
  }

  public void addArtist(Artist artist) {
    artists.put(artist.getId(), artist);
  }

  public void addSong(Song song) {
    songs.put(song.getId(), song);
  }

  public Artist getArtistById(Long artistId) {
    return artists.get(artistId);
  }

  public User getUserById(Long userId) {
    return users.get(userId);
  }

  public Song getSongById(Long songId) {
    return songs.get(songId);
  }

  public void addSongToUserHistory(Long userId, Long songId) {
    userSongHistory.putIfAbsent(userId, new LinkedList<>());
    userSongHistory.get(userId).add(songId);
  }
}
