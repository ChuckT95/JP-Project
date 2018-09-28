import java.util.Date;
public abstract class Product2 implements Item{
  int productionNumber;
  int serialNumber;
  String productName;
  final String Manufacturor = "OracleProduction";
  public static int currentProductionNumber = 0;
  //here, I have created a value for the date
  Date manufacturedOn;
  //allows the user to visit the date
  public Date getManufactureDate(){
    return manufacturedOn;
  }
  // allows the production number to be changed
  public void setProductionNumber(int productionNumber){
    productionNumber = this.productionNumber;
  }
//a get and set for the name
  public void setName(String Name){
    Name = this.productName;
  }
  public String getName(){
    return productName;
  }

//a get for the serial number, which is set when the object is made
  public int getSerialNumber(){
    return serialNumber;
  }
  //the override for the toString() method
  public String toString(){
    return "Manufacturor   :  "  + Manufacturor + "\n"
        + "Serial Number  :  " + serialNumber + "\n"
        + "Manufactured on:  " + manufacturedOn + "\n"
        + "Product Name   :  " + productName + "\n" ;
  }
  //the constructor is declared in "Watchamacallit", which is a full class that can be used to make objects,
  //and extends this abstract class
  public Product2(String Name){
    productName = Name;
    serialNumber = currentProductionNumber++;
    this.manufacturedOn= new Date();
  }

}
