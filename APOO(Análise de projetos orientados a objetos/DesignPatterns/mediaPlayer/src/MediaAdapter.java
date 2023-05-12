public class MediaAdapter implements MediaPlayer {

  private Mp4Player mp4Player;

  public MediaAdapter() {
    mp4Player = new Mp4Player();
  }

  public void play(String audioType, String fileName) {
    if (audioType.equalsIgnoreCase("mp4")) {
      mp4Player.playMp4(fileName);
    }
  }
  
}
