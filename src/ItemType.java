public enum ItemType {

  //ItemType AUDIO = new ItemType("AU");

  AUDIO("AU"),
  VISUAL("VI"),
  AAUDIOMOBILE("AM"),
  VISUALMOBILE("VM");
  String TypeName;

  ItemType(String name) {
    this.TypeName = name;
  }
}