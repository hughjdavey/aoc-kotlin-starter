# aoc-kotlin-starter

Starter template for solving [Advent of Code](https://adventofcode.com) in [Kotlin](https://kotlinlang.org/)

### Features

* Gradle setup so you can run a specific day or all days on the command line (see **Running** below)
* Timings for each part of each day
* Input for each day automatically exposed in String and List form
* Junit and Hamcrest test libraries included (see **Testing** below)
* Starter .gitignore

### Running

Project is already setup with gradle. To run the app:

* Navigate to top-level directory on the command line
* Run `./gradlew run` to run all days
* Run `./gradlew run --args $DAY` where `$DAY` is an integer to run a specific day

### Testing

Project includes Junit and Hamcrest and a stub unit test to get you going. To run all tests:

* Navigate to top-level directory on the command line
* Run `./gradlew test`
* Add `--info`, `--debug` or `--stacktrace` flags for more output

### Architecture

* Inputs go into `src/main/resources` and follow the naming convention `input_day_X.txt`
* Solutions go into `src/main/kotlin/days` and extend the `Day` abstract class, calling its constructor with their day number 
* Solutions follow the naming convention `DayX`
* It is assumed all solutions will have two parts but share the same input
* Input is exposed in the solution classes in two forms - `inputList` and `inputString`
* Day 1 solution class and input file are stubbed as a guide on how to extend the project
* To get started simply replace `input_day_1.txt` with the real input and the solutions in `Day1` with your own
