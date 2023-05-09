public class App {

  public static void main(String[] args) throws Exception {
    AudioPlayer player = new AudioPlayer();
    player.play("mp4", "movie.mp4");
    player.play("mp3", "song.mp3");
  }
}
