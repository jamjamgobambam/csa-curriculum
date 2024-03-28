import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Use SoundLoader.read() to extract the samples from the "retrobeat.wav"
     * sound file into a 1D double array. Then call the createClip() method and
     * store the sound returned in a 1D double array called newSound.
     * -----------------------------------------------------------------------------
     */



    // Creates a Scene object
    Scene myScene = new Scene();

    // Plays newSound in the scene
    myScene.playSound(newSound);

    // Plays the scene
    Theater.playScenes(myScene);
    
  }
}