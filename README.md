# apoLib
[![](https://jitpack.io/v/apo2073/ApoLib.svg)](https://jitpack.io/#apo2073/ApoLib)

## build.gradle
```
dependencyResolutionManagement {
	repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
	repositories {
		mavenCentral()
		maven { url 'https://jitpack.io' }
	}
}


dependencies {
	implementation 'com.github.apo2073:ApoLib:Tag'
}
```

## maven
```
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>

<dependency>
    <groupId>com.github.apo2073</groupId>
    <artifactId>ApoLib</artifactId>
    <version>Tag</version>
</dependency>
```