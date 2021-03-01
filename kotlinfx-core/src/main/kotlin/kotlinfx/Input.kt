package kotlinfx

import javafx.scene.Node

typealias Clipboard = javafx.scene.input.Clipboard
typealias ClipboardContent = javafx.scene.input.ClipboardContent

typealias DataFormat = javafx.scene.input.DataFormat
typealias Dragboard = javafx.scene.input.Dragboard

typealias KeyCombination = javafx.scene.input.KeyCombination
typealias Mnemonic = javafx.scene.input.Mnemonic

typealias InputEvent = javafx.scene.input.InputEvent
typealias InputMethodEvent = javafx.scene.input.InputMethodEvent
typealias ScrollEvent = javafx.scene.input.ScrollEvent
typealias SwipeEvent = javafx.scene.input.SwipeEvent
typealias TouchEvent = javafx.scene.input.TouchEvent
typealias ZoomEvent = javafx.scene.input.ZoomEvent
typealias GestureEvent = javafx.scene.input.GestureEvent
typealias ContextMenuEvent = javafx.scene.input.ContextMenuEvent
typealias DragEvent = javafx.scene.input.DragEvent
typealias KeyEvent = javafx.scene.input.KeyEvent
typealias MouseEvent = javafx.scene.input.MouseEvent
typealias MouseDragEvent = javafx.scene.input.MouseDragEvent
typealias RotateEvent = javafx.scene.input.RotateEvent

typealias TransferMode = javafx.scene.input.TransferMode
typealias InputMethodHighlight = javafx.scene.input.InputMethodHighlight
typealias MouseButton = javafx.scene.input.MouseButton



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
