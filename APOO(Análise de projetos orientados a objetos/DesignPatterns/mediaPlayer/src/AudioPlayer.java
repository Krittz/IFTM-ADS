public class AudioPlayer implements MediaPlayer {

  private MediaAdapter mediaAdapter;

  public void play(String audioType, String fileName) {
    if (audioType.equalsIgnoreCase("mp3")) {
      System.out.println("Playing mp3 file. Name: " + fileName);
    } else if (audioType.equalsIgnoreCase("mp4")) {
      mediaAdapter = new MediaAdapter();
      mediaAdapter.play(audioType, fileName);
    }
  }
}
