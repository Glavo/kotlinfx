package kotlinfx.swing

import javafx.application.Platform
import javafx.scene.Scene
import javax.swing.JComponent
import javax.swing.SwingUtilities

typealias SwingNode = javafx.embed.swing.SwingNode
typealias JFXPanel = javafx.embed.swing.JFXPanel

fun JComponent.asJFXNode(): SwingNode {
    return SwingNode().also { node -> SwingUtilities.invokeLater { node.content = this } }
}

fun Scene.asSwingPanel(): JFXPanel {
    return JFXPanel().also { panel -> Platform.runLater { panel.scene = this } }
}