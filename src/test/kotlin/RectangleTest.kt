import org.junit.jupiter.api.Assertions.*

class RectangleTest {

    @org.junit.jupiter.api.BeforeEach
    fun setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    fun tearDown() {
    }

    @org.junit.jupiter.api.Test
    fun area() {

        val rectangle = Rectangle(4,4)
        assertEquals(16, rectangle.area())
        rectangle.height = 3
        assertEquals(12, rectangle.area())

    }
}