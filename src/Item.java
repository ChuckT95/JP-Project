import java.util.Date;

public interface Item {

  // the initial interface with a list of promises to create certain methods, and a final string
  final String Manufacturor = "OracleProduction";

  void setProductionNumber(int productionNumber);

  void setName(String Name);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();


}
