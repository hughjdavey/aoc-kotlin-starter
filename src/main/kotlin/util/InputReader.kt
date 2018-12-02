package util

import java.io.File

object InputReader {

    fun getInputAsString(day: Int): String {
        return File("src/main/resources/input_day_$day.txt").readText()
    }

    fun getInputAsList(day: Int): List<String> {
        return File("src/main/resources/input_day_$day.txt").readLines()
    }
}
