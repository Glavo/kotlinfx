package kotlinfx.scene.web

import javafx.scene.web.HTMLEditor

inline fun htmlEditor(initializer: HTMLEditor.() -> Unit = {}): HTMLEditor = HTMLEditor().apply(initializer)