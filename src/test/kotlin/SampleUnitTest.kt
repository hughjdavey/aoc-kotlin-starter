import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.Test

class SampleUnitTest {

    @Test
    fun sampleTest() {
        assertThat(2 + 2, `is`(4))
    }
}
