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

val MouseButton.isPrimary: Boolean
    inline get() = this == MouseButton.PRIMARY

val MouseButton.isMiddle: Boolean
    inline get() = this == MouseButton.MIDDLE

val MouseButton.isSecondary: Boolean
    inline get() = this == MouseButton.SECONDARY
