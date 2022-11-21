package util

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.collection.IsIterableContainingInOrder.contains
import org.hamcrest.core.Is.`is`
import org.junit.jupiter.api.Test

class InputReaderTest {

    @Test
    fun testReadInputAsString() {
        val testInputAsString = InputReader.getInputAsString(1)
        assertThat(testInputAsString, `is`("this\nis\na\ntest input\nfile\n"))
    }

    @Test
    fun testReadInputAsList() {
        val testInputAsList = InputReader.getInputAsList(1)
        assertThat(testInputAsList, contains("this", "is", "a", "test input", "file"))
    }
}
