public class MoviePlayer extends Product implements MultimediaControl {

  Screen screenType;
  MonitorType monitorType;

  public MoviePlayer(String name, MonitorType monitorType, Screen screenType) {
    super(name);
    this.monitorType = monitorType;
    this.screenType = screenType;
  }

  //unused default movieplayer constructor
  public MoviePlayer() {
    super();
    this.screenType = new Screen();
    this.monitorType = null;
  }

  @Override
  public void play() {
    System.out.println("Playing movie");
  }

  @Override
  public void stop() {
    System.out.println("Stopped movie");
  }

  @Override
  public void previous() {
    System.out.println("Previous movie");
  }

  @Override
  public void next() {
    System.out.println("Next Movie");
  }

}
