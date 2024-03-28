package com.csaunit3;

import static org.junit.jupiter.api.Assertions.*;
import static org.easymock.EasyMock.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@DisplayName("ArrayPainter.java Test")
@TestMethodOrder(OrderAnnotation.class)
public class ArrayPainterTest {

    String[] paintColors = {"red", "green", "blue"};
    ArrayPainter painter;
    String message;

    @BeforeEach
    public void setup() {
        painter = partialMockBuilder(ArrayPainter.class)
            .withConstructor(5, 0, "south", 18, paintColors)
            .addMockedMethod("move")
            .addMockedMethod("paint")
            .createMock();
    }
    
    @Test
    @Order(1)
    @DisplayName("Move and paint with the color in the \"paintColors\" at the parameter \"index\" => ")
    public void testMoveAndPaint() {
        painter.move();
        painter.paint(paintColors[0]);
        painter.move();
        painter.paint(paintColors[1]);
        painter.move();
        painter.paint(paintColors[2]);
        replay(painter);

        painter.moveAndPaint();
        verify(painter);
    }

    @Test
    @Order(2)
    @DisplayName("Change the value in \"paintColors\" at the parameter \"index\" to \"newColor\" => ")
    public void testSetColor() {
        message = "ArrayPainter setColor() does change the value in \"paintColors\" at the parameter \"index\" to \"newColor\".";
        message += "\n        Access the element at \"index\" in \"paintColors\" and set it to the new value passed to \"newColor\".";
        message += "\n       ";

        String[] expected = {"red", "yellow", "blue"};
        painter.setColor(1, "yellow");
        String[] newPaintColors = painter.getPaintColors();
        assertArrayEquals(expected, newPaintColors, message);
    }

}