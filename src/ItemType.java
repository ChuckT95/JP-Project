public enum ItemType {

  //ItemType AUDIO = new ItemType("AU");
//none of these items have been used yet for some reason, but I assume they come up in later iterations of the project
  Audio("AU"),
  Visual("VI"),
  AudioMobile("AM"),
  VisualMobile("VM");
  String TypeName;
  ItemType(String name){
    TypeName = name;
  }
}
