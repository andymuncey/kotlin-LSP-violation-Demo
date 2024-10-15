import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SquareTest {

    @Test
    fun area() {

        val square = Square(4)
        assertEquals(16, square.area())

        square.setSide(3)
        assertEquals(9,square.area())

    }

    @Test
    fun width(){
        val square = Square(4)
        assertEquals(4, square.width)
        square.width = 5
        assertEquals(5,square.width)
        assertEquals(5,square.height)
    }
}