package kotlinfx.swing

import javafx.application.Platform
import javafx.embed.swing.JFXPanel
import javafx.embed.swing.SwingNode
import javafx.scene.Scene
import javax.swing.JComponent
import javax.swing.SwingUtilities

fun JComponent.asJFXNode(): SwingNode {
    val node = SwingNode()
    SwingUtilities.invokeLater { node.content = this }
    return node
}

fun Scene.asSwingPanel(): JFXPanel {
    val panel = JFXPanel()
    Platform.runLater { panel.scene = this }
    return panel
}