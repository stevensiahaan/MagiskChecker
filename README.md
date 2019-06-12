[![](https://jitpack.io/v/stevensiahaan/MagiskChecker.svg)](https://jitpack.io/#stevensiahaan/MagiskChecker) [![MIT license](https://img.shields.io/badge/License-MIT-blue.svg)](https://lbesson.mit-license.org/)

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
  implementation 'com.github.stevensiahaan:MagiskChecker:1.1'
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
	<version>1.1</version>
</dependency>
```

## Usage
```java
MagiskUtils magiskUtils = new MagiskUtils();
Log.e(TAG, (magiskUtils.isDeviceRootedByMagisk() ? "Rooted" : "Not Rooted"));
```
