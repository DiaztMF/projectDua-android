# projectDua-android

Native Android educational project demonstrating Explicit and Implicit Intents navigation, developed as part of the Mobile App Development curriculum.

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![Platform](https://img.shields.io/badge/Platform-Android%20SDK-green?logo=android)](https://developer.android.com/)
[![Language](https://img.shields.io/badge/Language-Java-red?logo=java)](https://www.oracle.com/java/)

## Installation

Clone the repository to your local environment:

``bash
git clone https://github.com/DiaztMF/projectDua-android.git
cd projectDua-android
``

Open the project folder directly in **Android Studio** (Ladybug / Hedgehog or newer).

## Quick Start

1. Allow Gradle to synchronize dependencies and build script plugins.
2. Select an Android Virtual Device (AVD) emulator or connect a physical Android smartphone with USB Debugging enabled.
3. Click **Run 'app'** (Shift + F10) or run from terminal:

``bash
./gradlew installDebug
``

## What is 

$rName is a focused Android development assignment created to master foundational mobile engineering patterns. It explores Explicit and Implicit Intents navigation through clean Android architecture guidelines.

## Why 

Mastering native Android development requires solid understanding of core framework components, UI lifecycles, and threading boundaries. This project provides hands-on practical implementation of Explicit and Implicit Intents navigation without third-party abstraction overhead.

## API / Routes

### Core Activities & Components
- Main application controllers under pp/src/main/java/.
- XML layout definitions, strings, and drawables located in pp/src/main/res/.
- Gradle build configuration defined in pp/build.gradle.

## Examples

Standard Activity lifecycle logging and initialization pattern:

``java
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Log.d("projectDua-android", "Activity initialized successfully");
}
``

## Architecture & Development Guides

- Platform Target: Android SDK (minSdk 21+, targetSdk 34).
- Language: Java with Android Jetpack support components.
- Build System: Gradle with Android Gradle Plugin (AGP).

## License

MIT License. See [LICENSE](LICENSE) for full details.