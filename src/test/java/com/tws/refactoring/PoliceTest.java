package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PoliceTest {

    @Test
    void testcheckDriver() {
        assertTrue(new Police().checkDriverAgeIsLegal(new Driver(18)));
        assertFalse(new Police().checkDriverAgeIsLegal(new Driver(17)));
    }
}
