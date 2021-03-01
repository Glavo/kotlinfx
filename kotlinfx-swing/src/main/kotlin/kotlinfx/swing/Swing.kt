package kotlinfx.swing

import javafx.application.Platform
import javafx.scene.Scene
import javax.swing.JComponent
import javax.swing.SwingUtilities

typealias SwingNode = javafx.embed.swing.SwingNode
typealias JFXPanel = javafx.embed.swing.JFXPanel

/**
 * Embed a Swing content to a [javafx.scene.Node].
 *
 * Usage:
 * ```kotlin
 *
 * fun main(args: Array<String>) = launchApp(args) {
 *   scene = scene(width = 100.0, height = 50.0) {
 *     root = stackPane(
 *       JButton("Click me!").asJFXNode()
 *     )
 *   }
 * }
 * ```
 */
fun JComponent.asJFXNode(): SwingNode {
    return SwingNode().also { node -> SwingUtilities.invokeLater { node.content = this } }
}

/**
 * Embed a JavaFX [Node][javafx.scene.Node] to a [JComponent].
 */
fun Scene.asSwingPanel(): JFXPanel {
    return JFXPanel().also { panel -> Platform.runLater { panel.scene = this } }
}