plugins {
    application
    kotlin("jvm") version "2.2.21"
}

application {
    mainClass.set("util.Runner")
}

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.reflections", "reflections", "0.10.2")
    implementation("org.slf4j:slf4j-nop:2.0.17")

    testImplementation("org.junit.jupiter", "junit-jupiter", "6.0.1")
    testRuntimeOnly("org.junit.platform", "junit-platform-launcher", "6.0.1")
    testImplementation("org.hamcrest", "hamcrest", "3.0")
    testImplementation ("com.github.stefanbirkner:system-lambda:1.2.1")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}
