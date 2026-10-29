package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.rules.ExpectedException;

class StudentTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test(expected = IllegalArgumentException.class)
    void testFirstExceptionHandling() {
        Student student = new Student();
        student.addMark(10);
    }

    @Test
    void testSecondExceptionHandling() {
        Student student = new Student();
        student.addMark(10);

        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Mark must be between 1 and 5!");
    }

    @Test
    void testThirdExceptionHandling() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            Student student = new Student();
            student.addMark(10);
        });

        Assertions.assertEquals("Mark must be between 1 and 5!", ex.getMessage());
    }
}