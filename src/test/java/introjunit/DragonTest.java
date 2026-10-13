package introjunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// 1. class creation
class DragonTest {

    int i = 1;
    Dragon beforeEachDragon;

    //2. before each method
    @BeforeEach
    void setUp() {
        System.out.println("Before each method " + i++ + ". time");
        beforeEachDragon = new Dragon("Before each dragon", 2, 2.0, new int[]{1, 2}, true);
    }

    @AfterEach
    void close() {
        System.out.println("After each method " + i++ + ". time");
    }

    //3. test method
    @Test
    void testDragonWhenNameIsNotNull() {
        Dragon dragon = new Dragon("Dragon", 3, 2.0, new int[]{}, false);

        String actual = dragon.getName();

        assertEquals("Dragon", actual);
    }

    @Test
    void testDragonWhenNameIsNull() {
        Dragon dragon = new Dragon(null, 3, 2.0, new int[]{}, false);

        String actual = dragon.getName();

        assertNull(actual);
    }

    @Test
    void testDragonWhenNumberOfHeadGiven() {
        Dragon dragon = new Dragon(null, 3, 2.0, new int[]{}, false);

        int actual = dragon.getNumberOfHeads();

        assertEquals(3, actual);
    }

    @Test
    void testDragonWhenGreenColoredDragonGivenThenReturnTrue() {
        Dragon dragon = new Dragon(null, 3, 2.0, new int[]{}, true);

        boolean actual = dragon.isGreenColoredDragon();

        assertTrue(actual);
    }

    @Test
    void testDragonWhenGreenColoredDragonGivenThenReturnFalse() {
        Dragon dragon = new Dragon(null, 3, 2.0, new int[]{}, false);

        boolean actual = dragon.isGreenColoredDragon();

        assertFalse(actual);
    }

    @Test
    void testDragonHeight() {
        Dragon dragon = new Dragon(null, 3, 2.0, new int[]{}, false);

        double actual = dragon.getHeight();

        assertEquals(2.0, actual);
    }

    @Test
    void testDragonWhenNullGiven() {
        Dragon dragon = null;

        assertNull(dragon);
    }

    @Test
    void testDragonWhenDragonGiven() {
        Dragon dragon = new Dragon(null, 3, 2.0, new int[]{}, false);

        assertNotNull(dragon);
    }

    @Test
    void testDragonWhenSameObjectReferenceGiven() {
        Dragon dragon1 = new Dragon(null, 3, 2.0, new int[]{}, false);
        Dragon dragon2 = dragon1;

        assertSame(dragon1, dragon2);
    }

    @Test
    void testDragonWhenNotSameObjectReferenceGiven() {
        Dragon dragon1 = new Dragon(null, 3, 2.0, new int[]{}, false);
        Dragon dragon2 = new Dragon(null, 3, 2.0, new int[]{}, false);;

        assertNotSame(dragon1, dragon2);
    }

    @Test
    void testDragonWhenHeightOfHeadsGiven() {
        Dragon dragon = new Dragon(null, 3, 2.0, new int[]{1, 2, 3, 4, 5}, false);

        int[] actual = dragon.getHeightPerHead();

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, actual);
    }

    @Test
    void testDragonDoubleWithDelta() {
        Dragon dragon = new Dragon(null, 3, 3.0, new int[]{1, 2, 3, 4, 5}, false);

        double actual = 10 / dragon.getHeight();

        assertEquals(3.3, actual, 0.5);
    }

    @Test
    void testBeforeEach() {
        String actual = beforeEachDragon.getName();
        assertEquals("Before each dragon", actual);
    }



}