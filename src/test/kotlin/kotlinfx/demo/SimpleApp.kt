package kotlinfx.demo

import kotlinfx.*

fun main() = launchApp {
    title = "Hello KotlinFX"
    width = 600.0
    height = 450.0

    scene = scene {
        root = borderPane {
            center = button("Click Me") {
                onAction {
                    showAlert(AlertType.INFORMATION) {
                        headerText = null
                        graphic = null
                        title = "I'm a dialog"
                        contentText = "Hello ${System.getProperty("user.name")}!"
                    }
                }
            }
        }
    }
}