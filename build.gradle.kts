plugins {
	id("org.springframework.boot") version "2.7.18"
	id("io.spring.dependency-management") version "1.1.7"

	kotlin("jvm") version "1.8.22"
	kotlin("plugin.spring") version "1.8.22"
	kotlin("plugin.jpa") version "1.4.30"
}

group = "com.mercadolivro"
version = "0.0.1-SNAPSHOT"
description = "Marketplace focado em livros"

java {
	toolchain {
		languageVersion.set(JavaLanguageVersion.of(11))
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")

	implementation("io.springfox:springfox-boot-starter:3.0.0")






	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.flywaydb:flyway-core:7.7.0")

	runtimeOnly("mysql:mysql-connector-java:8.0.33")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
}



springBoot {
	mainClass.set("com.mercadolivro.MercadoLivroApplicationKt")
}


tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
	kotlinOptions {
		jvmTarget = "11"
		freeCompilerArgs = listOf("-Xjsr305=strict")
	}
}
