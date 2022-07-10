package MusicLibrary;

import MusicLibrary.service.MusicLibraryService;

import java.util.Scanner;

public class MusicLibraryApplication {

  public static void main(String[] args) {
    int choice=0;
    Scanner sc = new Scanner(System.in);
    MusicLibraryService service = new MusicLibraryService();

    while(choice != -1) {
      printCommandTemplate();
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          registerUserInputs(service, sc);
          break;
        case 2:
          registerArtistInputs(service, sc);
          break;
        case 3:
          releaseSongInputs(service, sc);
          break;
        case 4:
          listenToSongInputs(service, sc);
          break;
        case -1:
          break;
        default:
          System.out.println("Please enter a valid choice");
          break;
      }
    }
  }

  private static void printCommandTemplate() {
    System.out.println("Enter the choice");
    System.out.println("1. To register a User");
    System.out.println("2. To register an Artist");
    System.out.println("3. To release a Song");
    System.out.println("4. To listen to a Song");
    System.out.println("-1. To quit");
  }

  private static void registerUserInputs(MusicLibraryService service, Scanner sc) {
    System.out.println("Enter the first Name : ");
    String firstName = sc.next();
    System.out.println("Enter the last Name : ");
    String lastName = sc.next();
    System.out.println("Enter the Email Id : ");
    String emailId = sc.next();
    System.out.println("Enter the Phone Number : ");
    Long phoneNumber = sc.nextLong();
    System.out.println("Enter the city : ");
    String city = sc.next();
    System.out.println("Enter the locality : ");
    String locality = sc.next();
    System.out.println("Enter the state : ");
    String state = sc.next();
    System.out.println("Enter the Pin Code : ");
    Integer pinCode = sc.nextInt();

    service.registerUser(firstName, lastName, emailId, phoneNumber,
        city, locality, state, pinCode);

  }

  private static void registerArtistInputs(MusicLibraryService service, Scanner sc) {
    System.out.println("Enter the first Name : ");
    String firstName = sc.next();
    System.out.println("Enter the last Name : ");
    String lastName = sc.next();

    service.registerArtist(firstName, lastName);
  }

  private static void releaseSongInputs(MusicLibraryService service, Scanner sc) {
    System.out.println("Enter the title : ");
    String title = sc.next();
    System.out.println("Enter the genre : ");
    String genre = sc.next();
    System.out.println("Enter the release year : ");
    Integer releaseYear = sc.nextInt();
    System.out.println("Enter the language : ");
    String language = sc.next();
    System.out.println("Enter the Artis Id : ");
    Long artistId = sc.nextLong();


    service.releaseSong(title, genre, releaseYear, language, artistId);
  }

  private static void listenToSongInputs(MusicLibraryService service, Scanner sc) {
    System.out.println("Enter the User Id : ");
    Long userId = sc.nextLong();
    System.out.println("Enter the Song Id : ");
    Long songId = sc.nextLong();

    service.listenToSong(userId, songId);
  }
}
