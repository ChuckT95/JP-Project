import java.util.Scanner;

public class EmployeeInfo {
  private StringBuilder name;
  private String code;
  public StringBuilder getName(){
    return this.name = null;
  }
  public String getCode(){
    return this.code;
  }
  private void setName(){

    StringBuilder name2 = null;
    name2.append(inputName());

    if(checkName(name2)){

      createEmployeeCode(name2);

    }else{

      this.code = "Guest";

    }

  }
  private String inputName(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter name");
    String nameInput = scanner.nextLine();
    return nameInput;
  }
  private void createEmployeeCode(StringBuilder name){
    this.name = name;
    int i = name.indexOf(" ");
    StringBuilder username = name;
    this.code = username.delete(1, i).toString();

  }
  private boolean checkName(StringBuilder name){
    int i = name.indexOf(" ");
    if (i > -1){
      return true;
    }else{
      return false;
    }
  }

  public EmployeeInfo() {

    setName();

  }
}
