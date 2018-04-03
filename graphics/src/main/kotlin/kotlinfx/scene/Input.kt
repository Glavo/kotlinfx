package kotlinfx.scene

import javafx.scene.Node
import javafx.scene.input.*

@JvmField
val SystemClipboard: Clipboard = Clipboard.getSystemClipboard()

inline fun clipboardContext(initializer: ClipboardContent.() -> Unit = {}): ClipboardContent {
    return ClipboardContent().apply(initializer)
}

inline fun mnemonic(node: Node, keyCombination: KeyCombination, initializer: Mnemonic.() -> Unit = {}): Mnemonic {
    return Mnemonic(node, keyCombination).apply(initializer)
}