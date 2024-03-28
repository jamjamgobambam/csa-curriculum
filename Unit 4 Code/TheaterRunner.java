import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Use SoundLoader.read() to extract the samples from the "welcome.wav" and
     * "beat.wav" sound files into 1D double arrays. Then call the combineSounds()
     * method and store the sound returned in a 1D double array called newSound.
     * -----------------------------------------------------------------------------
     */

    double[] firstSound = SoundLoader.read("welcome.wav");
    double[] secondSound = SoundLoader.read("beat.wav");
    double[] newSound = SoundEditor.combineSounds(firstSound, secondSound);

    // Creates a Scene object
    Scene soundScene = new Scene();

    // Plays newSound in the scene
    soundScene.playSound(newSound);

    // Plays the scene
    Theater.playScenes(soundScene);
    
  }
}