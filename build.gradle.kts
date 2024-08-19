plugins {
    id("java")
}

group = "com.chromium"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("net.minestom:minestom-snapshots:dd96c907d9")
    implementation("org.slf4j:slf4j-simple:2.0.14")
}

