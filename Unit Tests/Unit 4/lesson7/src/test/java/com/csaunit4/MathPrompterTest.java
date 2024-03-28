package com.csaunit4;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;

public class MathPrompterTest {

    static InputStream sysInBackup;
    ByteArrayInputStream testInput;
    
    @BeforeEach
    public void setup() {
        sysInBackup = System.in;
        testInput = new ByteArrayInputStream("test".getBytes());
        System.setIn(testInput);
    }

    @AfterAll
    public static void tearDown() {
        System.setIn(sysInBackup);
    }
}