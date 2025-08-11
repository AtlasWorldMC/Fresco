plugins {
    id("java-gradle-plugin")
    id("maven-publish")
}

dependencies {
    implementation(project(":core"))
    implementation(gradleApi())
    implementation(localGroovy())
}

gradlePlugin {
    plugins {
        create("fresco") {
            id = "fr.atlasworld.fresco.plugin"
            implementationClass = project.property("plugin_main") as String
        }
    }
}

publishing {
    repositories {
        mavenLocal()
    }
}
