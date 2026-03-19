// Módulo: engine/build.gradle.kts

plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    application // Usamos el plugin estándar de Gradle, que es estable
}

group = "com.vueltaf1nal"
version = "0.0.1"

application {
    // Cambiamos la sintaxis a la moderna de Gradle 8
    mainClass.set("io.ktor.server.netty.EngineMain")
}

kotlin {
    jvmToolchain(21)
}

// Definimos la versión una sola vez para no repetir
val ktor_version = "2.3.10"

dependencies {
    val ktor_version = "2.3.10"

    // Core y Netty
    implementation("io.ktor:ktor-server-core-jvm:$ktor_version")
    implementation("io.ktor:ktor:2.3.10")
    implementation("io.ktor:ktor-server-netty-jvm:$ktor_version")

    // Plugins comunes
    implementation("io.ktor:ktor-server-cors-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-content-negotiation-jvm:$ktor_version")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-call-logging-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-auth-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-auth-jwt-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-compression-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-call-id-jvm:$ktor_version")

    // OpenAPI y Swagger (Asegurate que estos nombres sean los correctos)
    implementation("io.ktor:ktor-server-openapi:$ktor_version")
    implementation("io.ktor:ktor-server-swagger:$ktor_version")

    // Templating
    implementation("io.ktor:ktor-server-thymeleaf-jvm:$ktor_version")

    // Logs
    implementation("ch.qos.logback:logback-classic:1.4.14")

    testImplementation("io.ktor:ktor-server-test-host-jvm:$ktor_version")
}
