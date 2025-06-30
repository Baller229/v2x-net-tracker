plugins {
    kotlin("jvm") version "1.8.20"
    application
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("MainKt")
}

kotlin {
    jvmToolchain(11)
}
