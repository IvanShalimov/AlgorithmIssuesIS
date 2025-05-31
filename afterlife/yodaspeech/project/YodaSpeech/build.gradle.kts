plugins {
    kotlin("jvm") version "2.1.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.apache.opennlp:opennlp-tools:2.5.3")
    implementation("ch.qos.logback:logback-classic:1.4.14") // SLF4J binding for Logback
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}