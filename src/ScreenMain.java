public class ScreenMain {
  //this is the main Driver class
  public static void main(String args[]) {
    //this is the main Driver class
    Screen screen1 = new Screen();
    Screen screen2 = new Screen("TV", 60, 1);
    System.out.println(screen1.toString());
    System.out.println(screen2.toString());

  }
}
