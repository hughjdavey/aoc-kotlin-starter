package util

import days.Day
import org.reflections.Reflections

object Runner {

    private val reflections = Reflections("days")

    @JvmStatic
    fun main(args: Array<String>) {
        if (args.isNotEmpty()) {
            val day = try {
                args[0].toInt()
            }
            catch (e: NumberFormatException) {
                printError("Day argument must be an integer")
                return
            }

            val dayClass = getAllDayClasses()?.find { dayNumber(it.simpleName) == day }
            if (dayClass != null) {
                printDay(dayClass)
            }
            else {
                printError("Day $day not found")
            }
        }
        else {
            val allDayClasses = getAllDayClasses()
            if (allDayClasses != null) {
                allDayClasses.forEach { printDay(it) }
            }
            else {
                printError("Couldn't find day classes - make sure you;re in the right directory and try building again")
            }
        }
    }

    private fun getAllDayClasses(): MutableSet<Class<out Day>>? {
        return reflections.getSubTypesOf(Day::class.java)
    }

    private fun printDay(dayClass: Class<out Day>) {
        println("\n=== DAY ${dayNumber(dayClass.simpleName)} ===")
        val day = dayClass.constructors[0].newInstance() as Day
        println("Part 1: ${day.partOne()}")
        println("Part 2: ${day.partTwo()}")
    }

    private fun printError(message: String) {
        System.err.println("ERROR\n$message")
    }

    private fun dayNumber(dayClassName: String) = dayClassName.replace("Day", "").toInt()
}
