# KotlinFX

[![Build Status](https://travis-ci.com/Glavo/kotlinfx.svg?branch=master)](https://travis-ci.com/kala-projects/kotlinfx)

## Getting Started

First, you need to add the jcenter repository to your build:

Gradle:
```groovy
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

Then add dependencies:

Gradle:
```groovy
dependencies {
    implementation group: 'asia.kala', name: 'kotlinfx', version: '0.2.0'
}
```

## A simple example

```kotlin
fun main() = runApp {
    title = "Hello KotlinFX"
    width = 600.0
    height = 450.0

    scene = scene {
        root = borderPane {
            center = button("Click Me") {
                onAction {
                   alert(Alert.AlertType.INFORMATION) {
                       headerText = null
                       graphic = null
                       title = "I'm a dialog"
                       contentText = "Hello ${System.getProperty("user.name")}!"
                   }.show()
                }
            }
        }
    }
}
```
