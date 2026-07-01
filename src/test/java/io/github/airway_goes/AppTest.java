package io.github.airway_goes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void addTest() {
        App app    = new App();
        int result = app.add(1, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    void mainTest() {
        App.main(null);
        Assertions.assertTrue(true);
    }
}
