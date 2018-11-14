public class Watchamacallit extends Product {

  //having a constructor defined (not being default) prevented me from being able to put the full constructor in the main abstract class
  //here, is a constructor that does all of the required things.
  public Watchamacallit(String input) {

    super(input);

  }

  @Override
  public int compare(Object o1, Object o2) {
    return 0;
  }
}
