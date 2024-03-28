package com.csaunit4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("SoundEditor.java Test")
public class SoundEditorTest {
    
    @Test
    @DisplayName("Return a new double array containing the sound with the volume increased => ")
    public void testIncreaseVolume() {
        String message = "SoundEditor increaseVolume() does not return the expected new double array. Create a new double array";
        message += "\n        that stores the values from the original array multiplied by \"amount\".";
        message += "\n       ";

        double[] testValues = {0.1, 0.2, 0.3, 0.4, 0.5};
        double[] expected = {0.2, 0.4, 0.6, 0.8, 1.0};
        double[] actual = SoundEditor.increaseVolume(testValues, 2);

        assertArrayEquals(expected, actual, message);
    }

    @Test
    @DisplayName("Return a new double array containing the sound reversed => ")
    public void testReverseSound() {
        String message = "SoundEditor reverseSound() does not return the expected new double array. Create a new double array";
        message += "\n        that stores the values from the original array in reverse order.";
        message += "\n       ";

        double[] testValues = {0.1, 0.2, 0.3, 0.4, 0.5};
        double[] expected = {0.5, 0.4, 0.3, 0.2, 0.1};
        double[] actual = SoundEditor.reverseSound(testValues);

        assertArrayEquals(expected, actual, message);
    }

    @Test
    @DisplayName("Return a new double array containing the samples from the specified start and end seconds => ")
    public void testClipSound() {
        String message = "SoundEditor clipSound() does not return the expected new double array. Create a new double array";
        message += "\n        that stores the values from the original array from the start location to the end location.";
        message += "\n       ";

        // double[] beat = SoundLoader.read("retrobeat.wav");

        double[] testBeat = {0.1, 0.2, 0.3, 0.4, 0.5};
        double[] expected = clipSound(testBeat, 2, 4);
        double[] actual = SoundEditor.clipSound(testBeat, 2, 4);

        assertArrayEquals(expected, actual, message);
    }

    private double[] clipSound(double[] sound, int start, int end) {
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

    @Test
    @DisplayName("Return a new double array containing the samples from the first sound followed by the second sound => ")
    public void testCombineSounds() {
        String message = "SoundEditor combineSounds() does not return the expected new double array. Create a new double array";
        message += "\n        that stores the values from the first sound followed by the values from the second sound..";
        message += "\n       ";

        double[] firstSound = {0.1, 0.2, 0.3, 0.4, 0.5};
        double[] secondSound = {0.6, 0.7, 0.8, 0.9, 1.0};
        double[] expected = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0};
        double[] actual = SoundEditor.combineSounds(firstSound, secondSound);

        assertArrayEquals(expected, actual, message);
    }
}