rootProject.name = "VUELTA-F1NAL"

include(":engine")
dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://packages.confluent.io/maven/")
    }
}
