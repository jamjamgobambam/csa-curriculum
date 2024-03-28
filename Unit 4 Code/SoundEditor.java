import org.code.theater.*;
import org.code.media.*;

/*
 * Edits sound samples to create effects
 */
public class SoundEditor {

  /* -------------------------------------- TO DO --------------------------------------
   * ✅ Write a static method called combineSounds() with parameters double[] firstSound
   * and double[] secondSound that returns the first sound combined with the second sound.
   * -----------------------------------------------------------------------------------
   */

  public static double[] combineSounds(double[] firstSound, double[] secondSound) {
    double[] combined = new double[firstSound.length + secondSound.length];
    int combinedIndex = 0;

    for (int index = 0; index < firstSound.length; index++) {
      combined[combinedIndex] = firstSound[index];
      combinedIndex++;
    }

    for (int index = 0; index < secondSound.length; index++) {
      combined[combinedIndex] = secondSound[index];
      combinedIndex++;
    }

    return combined;
  }

}