public class PlayerDriver {

  public static void main(String args[]) {
    MoviePlayerDriver.testMoviePlayer();
    testPlayer();
  }

  static void testPlayer() {
    AudioPlayer audioPlayer2 = new AudioPlayer("Sony", "Name2", ItemType.Audio);
    System.out.println(audioPlayer2.toString());
    audioPlayer2.play();
    audioPlayer2.stop();
    audioPlayer2.previous();
    audioPlayer2.next();
    MoviePlayer moviePlayer2 = new MoviePlayer("Apple", MonitorType.LED,
        new Screen());
    System.out.println(moviePlayer2.toString());
    moviePlayer2.play();
    moviePlayer2.stop();
    moviePlayer2.previous();
    moviePlayer2.next();
  }
}