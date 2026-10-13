package introjunit;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GentlemanTest {

//    Junit 4
//    @Test
//    void testSayHello() {
//        Gentleman gentleman = new Gentleman();
//
//        String actual = gentleman.sayHello("Laszlo");
//
//        assertThat(actual, equalTo("Hello Laszlo!"));
//    }
//
//
//    void testSayHelloWhenNameIsNUll() {
//        Gentleman gentleman = new Gentleman();
//
//        String actual = gentleman.sayHello(null);
//
//        assertThat(actual, equalTo("Hello Anonymus!"));
//    }

    @Test
    void testSayHello() {
        Gentleman gentleman = new Gentleman();

        String actual = gentleman.sayHello("Laszlo");

        assertEquals("Hello Laszlo!", actual);
    }

    @Test
    void testSayHelloWhenNameIsNUll() {
        Gentleman gentleman = new Gentleman();

        String actual = gentleman.sayHello(null);

        assertEquals("Hello Anonymus!", actual);
    }

}
