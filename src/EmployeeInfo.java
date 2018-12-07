import java.util.Scanner;

public class EmployeeInfo {

  private StringBuilder name;
  private String code;

  //Constructor Runs setName()
  public EmployeeInfo() {
    //Constructor Runs setName()
    setName();
  }

  //unused getName() returns a String (employee name)
  public StringBuilder getName() {
    return this.name = null;
  }

  //getCode returns a String (employee code)
  public String getCode() {
    return this.code;
  }

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
}
