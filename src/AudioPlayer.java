import java.util.Comparator;

public class AudioPlayer extends Product implements MultimediaControl {

  String audioSpecification;
  ItemType mediaType;

  public void play() {
    System.out.println("Playing");
  }

  ;

  public void stop() {
    System.out.println("Stopped");
  }

  ;

  public void previous() {
    System.out.println("Previous");
  }

  ;

  public void next() {
    System.out.println("Next");
  }

  ;


  //constructor for AudioPlayer
  public AudioPlayer(String name, String audioSpecification, ItemType mediaType) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = mediaType;
  }

  public AudioPlayer() {
    super();
    this.audioSpecification = "Generic";
  }


  public final static Comparator<Product> productNameComparator =
      (a1, b2) -> a1.productName.compareTo(b2.productName);


}
