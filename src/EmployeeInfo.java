import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

  String deptId;
  Pattern p = Pattern.compile("\\b([A-Z]+[a-z]{3}+\\d{2})\\b");
  Scanner in = new Scanner(System.in);
  private StringBuilder name;
  private String code;

  //Constructor Runs setName(), and setDeptId()
  public EmployeeInfo() {
    //Constructor Runs setName(), and setDeptId()
    setName();
    setDeptId();
  }

  //Uses scanner.next() to get input ending in space or enter
  public String getDeptId() { //Uses scanner.next() to get input ending in space or enter
    //Uses scanner.next() to get input ending in space or enter
    System.out.println("please enter Department ID");
    String string = in.next();
    return string;
  }

  //uses several methods to set deptId value at construction
  private void setDeptId() {
    String temp = getDeptId();
    if (validId(temp)) {
      this.deptId = reverseString(temp);
    } else {
      this.deptId = "None01";
    }
  }

  //returns deptId
  private String getId() {
    return reverseString(this.deptId);
  }

  //Checks to see if input matches regular expression
  private boolean validId(String id) {
    Matcher matcher = p.matcher(id);
    if (matcher.find()) {
      return true;
    } else {
      return false;
    }
  }

  //reverses a string
  public String reverseString(String id) {
    String string = new StringBuilder(id).reverse().toString();

    return string;
  }

  //unused getName() returns a String (employee name)
  public StringBuilder getName() {
    return this.name = null;
  }

  //getCode returns a String (employee code)
  public String getCode() {
    return this.code;
  }

  //sets name to input value filtered through createEmployeeCode()
  private void setName() {
    StringBuilder name2 = new StringBuilder();
    name2.append(inputName());
    this.name = name2;
    if (checkName(name)) {
      createEmployeeCode(name);
    } else {
      this.code = "Guest";
    }
  }

  // takes user input to get name, and returns it as a string
  private String inputName() {
    String nameInput;
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter name");
    nameInput = scanner.nextLine();
    return nameInput;
  }

  //creates an employee code from name by editing a StringBuilder
  private void createEmployeeCode(StringBuilder name) {

    this.name = name;
    int i = name.lastIndexOf(" ");
    StringBuilder username = name;
    this.code = username.delete(1, ++i).toString();
  }

  // checks to see if an inputted StringBuilder contains a space
  private boolean checkName(StringBuilder name) {
    int i = name.lastIndexOf(" ");
    if (i > -1) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    return "Code : " + code + "\n"
        + "Department ID : " + reverseString(deptId) + "\n";
  }
}
