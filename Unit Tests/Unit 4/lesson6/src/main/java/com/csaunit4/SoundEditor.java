package com.csaunit4;

public class SoundEditor {
    
    // TO DO #1: Write the static method increaseVolume to increase the volume of the sound.
  public static double[] increaseVolume(double[] sound, double amount) {
    double[] louderSound = new double[sound.length];
    for (int i = 0; i < sound.length; i++) {
      louderSound[i] = sound[i] * amount;
    }

    return louderSound;
  }

  // TO DO #1: Write the static method reverseSound to reverse the sound.
  public static double[] reverseSound(double[] sound) {
    double[] newSound = new double[sound.length];

    int newIndex = 0;
    
    for (int index = sound.length - 1; index >= 0; index--) {
      newSound[newIndex] = sound[index];
      newIndex++;
    }

    return newSound;
  }

  // TO DO #1: Write the static method createClip to create a clip from a sound.
  public static double[] clipSound(double[] sound, int start, int end) {
    int startIndex = start * 44100;
    int endIndex = end * 44100;
    
    double[] newSound = new double[endIndex - startIndex];

    int index = 0;
    
    while (startIndex < endIndex) {
      newSound[index] = sound[startIndex];
      startIndex++;
      index++;
    }

    return newSound;
  }

  // TO DO #1: Write the static method combineSounds to combine two sounds into one.
  public static double[] combineSounds(double[] firstSound, double[] secondSound) {
    double[] newSound = new double[firstSound.length + secondSound.length];

    int newIndex = 0;
    
    for (int index = 0; index < firstSound.length; index++) {
      newSound[newIndex] = firstSound[index];
      newIndex++;
    }

    for (int index = 0; index < secondSound.length; index++) {
      newSound[newIndex] = secondSound[index];
      newIndex++;
    }

    return newSound;
  }

}