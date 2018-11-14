public enum ItemType {

  //ItemType AUDIO = new ItemType("AU");

  Audio("AU"),
  Visual("VI"),
  AudioMobile("AM"),
  VisualMobile("VM");
  String TypeName;

  ItemType(String name) {
    this.TypeName = name;
  }
}
