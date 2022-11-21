# aoc-kotlin-starter

:sparkles: [Screenshots](#screenshots) :sparkles:

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

##### Test input

By default, instantiations of `Day` classes in tests will use the input files in `src/test/resources`, _not_ those in `src/main/resources`.
This hopefully gives you flexibility - you could either just copy the real input into `src/test/resources` if you want to test
the actual answers, or you could add a file of test data based on the examples given on the Advent of Code description for the day.
The stub `Day1Test` class shows a test of the functionality of `Day1` where the test input differs from the actual input.

### Architecture

* Inputs go into `src/main/resources` and follow the naming convention `input_day_X.txt`
* Solutions go into `src/main/kotlin/days` and extend the `Day` abstract class, calling its constructor with their day number 
* Solutions follow the naming convention `DayX`
* It is assumed all solutions will have two parts but share the same input
* Input is exposed in the solution classes in two forms - `inputList` and `inputString`
* Day 1 solution class and input file are stubbed as a guide on how to extend the project,
and how you can use the `inputList` and `inputString` mentioned above
* To get started simply replace `src/main/input_day_1.txt` with the real input and the solutions in `Day1` with your own
* A Day 1 test class also exists, mostly to show a few hamcrest matchers, and how test input files can differ from actual ones (see **Test input** section above).
To get started with testing you can edit this class, and the input file at `src/test/resources/input_day_1.txt`

### Screenshots

Screenshots show fake data (not a real advent of code year!)

##### Running all days

![Running all days](/../screenshots/assets/run-all.png)

##### Running a single day

![Running a single day](/../screenshots/assets/run-one.png)
