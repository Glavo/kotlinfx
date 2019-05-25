# KotlinFX


## Getting Started

To add a dependency using Gradle:
```groovy
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
    compileOnly 'org.glavo:kotlinfx:0.1.7'
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