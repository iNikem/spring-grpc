allprojects {

    group = "com.splunk.o11y"
    version = "0.0.1"

    repositories {
        maven {
            name = "artifactory"
            url = uri("https://repo.splunkdev.net/artifactory/maven")
            credentials(PasswordCredentials::class)
        }
        mavenCentral()
    }


//    dependencies {
//        testImplementation(platform("org.junit:junit-bom:5.10.0"))
//        testImplementation("org.junit.jupiter:junit-jupiter")
//    }
//
//    tasks.test {
//        useJUnitPlatform()
//    }

}
