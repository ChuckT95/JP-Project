public class MoviePlayerDriver {

  public static void testMoviePlayer() {

    MoviePlayer moviePlayer2 = new MoviePlayer("DBPOWER MK101",  new Screen(), MonitorType.LCD);
    System.out.println(moviePlayer2.toString());
    moviePlayer2.play();
    moviePlayer2.stop();
    moviePlayer2.previous();
    moviePlayer2.next();
  }
}
