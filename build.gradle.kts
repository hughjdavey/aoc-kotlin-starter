import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    kotlin("jvm") version "1.3.60"
}

application {
    mainClassName = "util.Runner"
}

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile("org.reflections", "reflections", "0.9.11")
    testCompile("junit", "junit", "4.12")
    testCompile("org.hamcrest", "hamcrest-library", "2.2")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
