import java.util.Comparator;

public class MoviePlayer extends Product implements MultimediaControl {

  Screen screenType;
  MonitorType monitorType;

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

  public MoviePlayer(String Name, MonitorType monitorType, Screen screenType) {
    super(Name);
    this.monitorType = monitorType;
    this.screenType = screenType;
  }

  public MoviePlayer() {
    super();
    this.screenType = new Screen();
    this.monitorType = null;
  }


}
