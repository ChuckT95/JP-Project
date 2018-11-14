import java.util.Comparator;
import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public abstract class Product implements Item, Comparator {


  int productionNumber;
  int serialNumber;
  String productName;
  final String Manufacturer = "OracleProduction";
  public static List<Product> products = new ArrayList<Product>();
  public static int currentProductionNumber = 1;
  //here, I have created a value for the date
  Date manufacturedOn;

  //allows the user to visit the date
  public Date getManufactureDate() {
    return manufacturedOn;
  }

  // allows the production number to be changed
  public void setProductionNumber(int productionNumber) {
    productionNumber = this.productionNumber;
  }

  //a get and set for the name
  public void setName(String Name) {
    Name = this.productName;
  }

  public String getName() {
    return productName;
  }

  //a get for the serial number, which is set when the object is made
  public int getSerialNumber() {
    return serialNumber;
  }

  //the override for the toString() method
  public String toString() {
    return "Manufacturer : " + Manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Manufactured on :  " + manufacturedOn + "\n"
        + "Product Name :  " + productName + "\n";
  }

  //the constructor is declared in "Watchamacallit", which is a full class that can be used to make objects,
  //and extends this abstract class
  public Product(String Name) {
    productName = Name;
    serialNumber = currentProductionNumber++;
    this.manufacturedOn = new Date();
    products.add(this);
    sortProducts();
  }

  public Product() {
    productName = "Generic";
    serialNumber = currentProductionNumber++;
    this.manufacturedOn = new Date();
    products.add(this);
    sortProducts();
  }

  public int compare(Object o1, Object o2) {
    Product a1 = (Product) o1;
    Product b2 = (Product) o2;
    return a1.productName.compareTo(b2.productName);
  }

  void sortProducts() {
    Collections.sort(products, new Comparator<Product>() {
      public int compare(Product a1, Product b2) {
        return a1.productName.compareTo(b2.productName);
      }
    });
  }

  public static void print() {
    for (Product product1 : products) {
      System.out.println(product1.toString());
    }
  }

  public static void printType(Product type) {

    for (Product product1 : products) {
      if (product1.getClass() == type.getClass()) {
        System.out.println(product1.toString());
      }
    }


  }


  public final static Comparator<Product> productNameComparator =
      (a1, b2) -> a1.productName.compareTo(b2.productName);

}
