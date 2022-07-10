package MusicLibrary.service;

import MusicLibrary.dao.MusicLibraryInventory;
import MusicLibrary.entity.*;

public class MusicLibraryService {

  private MusicLibraryInventory inventory;

  public MusicLibraryService() {
    this.inventory = new MusicLibraryInventory();
  }

  public void registerUser(String firstName, String lastName,
                           String emaild, Long phoneNumber,
                           String city, String locality,
                           String state, Integer pinCode) {

    Contact contact = new Contact(emaild, phoneNumber);
    Address address = new Address(city, locality, state, pinCode);
    User user = new User(firstName, lastName, contact, address);
    inventory.addUser(user);
    System.out.println("Registered "+user);
  }

  public void registerArtist(String firstName, String lastName) {
    Artist artist = new Artist(firstName, lastName);
    inventory.addArtist(artist);
    System.out.println("Registered "+artist);
  }

  public void releaseSong(String title, String genre,
                          Integer releaseYear, String language,
                          Long artistId) {
    Song song = new Song(title, genre, releaseYear, language);
    Artist artist = inventory.getArtistById(artistId);
    if (artist==null) {
      System.out.println("Invalid Artist Id");
      return;
    }
    inventory.addSong(song);
    artist.releaseSong(song);
    System.out.println("Registered "+song);
  }

  public void listenToSong(Long userId, Long songId) {
    User user = inventory.getUserById(userId);
    Song song = inventory.getSongById(songId);
    if (user==null) {
      System.out.println("Invalid User Id");
      return;
    }
    if (song==null) {
      System.out.println("Invalid Song Id");
      return;
    }
    song.listen();
    inventory.addSongToUserHistory(userId, songId);
    System.out.println("User Id : "+userId+" Listened to Song Id : "+songId);
  }
}
