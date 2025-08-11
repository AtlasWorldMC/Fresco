plugins {
    id("maven-publish")
    id("java-library")
}

java {
    withJavadocJar()
}

dependencies {
    api(libs.annotations)
    api(libs.gson)

    implementation(libs.slf4j)
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"]) // Publish the java component (jar + metadata)
        }
    }
    repositories {
        mavenLocal()
    }
}
