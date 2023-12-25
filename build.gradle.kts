plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


tasks.jar {
    manifest {
        attributes(
            "Main-Class" to "Trie"
        )
    }
    from(sourceSets.main.get().output) {
        into("META-INF/gradle")
        eachFile {
            "main-${this.name}".also { name = it }
        }
    }
}


dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}