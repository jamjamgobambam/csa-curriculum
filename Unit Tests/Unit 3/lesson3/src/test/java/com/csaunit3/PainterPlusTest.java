package com.csaunit3;

import static org.easymock.EasyMock.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@DisplayName("PainterPlus.java Test")
@TestMethodOrder(OrderAnnotation.class)
public class PainterPlusTest {

    PainterPlus painter;
    String[] colors = {"red", "green", "blue"};
    String message;

    @BeforeEach
    public void setup() {
        painter = partialMockBuilder(PainterPlus.class)
            .withConstructor(1, 9, "east", 40)
            .addMockedMethod("move")
            .addMockedMethod("paint")
            .createMock();
    }
    
    @Test
    @Order(1)
    @DisplayName("Move and paint with each value in \"colors\" while PainterPlus can move forward => ")
    public void testPaintParkMoveAndPaint() {
        painter.paint(colors[0]);
        painter.move();
        painter.paint(colors[1]);
        painter.move();
        painter.paint(colors[2]);
        painter.move();
        replay(painter);

        painter.paintPark(colors);
        verify(painter);
    }

    @Test
    @Order(2)
    @DisplayName("Turn left when PainterPlus can no longer move forward => ")
    public void testPaintParkTurnLeft() {
        painter.turnLeft();
        replay(painter);

        painter.paintPark(colors);
        verify(painter);
    }

    @Test
    @Order(3)
    @DisplayName("PainterPlus object starts at (1, 9) facing \"east\" with 40 units of paint => ")
    public void testPainterPlusObjectStart() {

    }

    @Test
    @Order(4)
    @DisplayName("PainterPlus object paints a rectangle around the park benches in The Neighborhood => ")
    public void testPainterPlusPaintsAroundParkBenches() {

    }
}