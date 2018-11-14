import java.util.Comparator;

public class AudioPlayer extends Product implements MultimediaControl {

  public final Comparator<Product> productNameComparator =
      (a1, b2) -> a1.productName.compareTo(b2.productName);
  String audioSpecification;
  ItemType mediaType;


  //constructor for AudioPlayer
  public AudioPlayer(String name, String audioSpecification, ItemType mediaType) {
    //constructor for AudioPlayer
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = mediaType;
  }


  public AudioPlayer() {
    super();
    this.audioSpecification = "Generic";
  }

  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stopped");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }


}
