import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class StackVectorTest {

    Stack prueba = new StackVector();

    @org.junit.jupiter.api.Test
    void push() {
        prueba.push(3);
        assertEquals(3,prueba.peek());

    }

    @org.junit.jupiter.api.Test
    void pop() {
        prueba.push(5);
        assertEquals(5,prueba.pop());
    }

    @org.junit.jupiter.api.Test
    void peek() {
        prueba.push(3);
        assertEquals(3,prueba.peek());
    }

    @org.junit.jupiter.api.Test
    void empty() {
        prueba.push(6);
        assertFalse(prueba.empty());

    }

    @org.junit.jupiter.api.Test
    void size() {
        prueba.push(6);
        assertTrue(1==prueba.size());
    }


}