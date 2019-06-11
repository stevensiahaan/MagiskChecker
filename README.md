# MagiskChecker
MagiskChecker is used to check whether your device already rooted by Magisk or not

## Download
#### Gradle
**Step 1.** Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

 **Step 2.** Add the dependency
```gradle
dependencies {
  implementation 'com.github.stevensiahaan:MagiskChecker:1.0'
}
```
#### Maven
**Step 1.**
```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```

 **Step 2.** Add the dependency
```xml
<dependency>
  <groupId>com.github.stevensiahaan</groupId>
	    <artifactId>MagiskChecker</artifactId>
	    <version>1.0</version>
</dependency>
```
