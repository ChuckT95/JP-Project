import java.util.Collections;
import java.util.Comparator;

public class ProductionLineDriver {

  public static void main(String args[]) {
    MoviePlayerDriver.testMoviePlayer();
    PlayerDriver.testPlayer();

    Product.print();
    EmployeeInfo employee = new EmployeeInfo();
    employee.getCode();

  }
}