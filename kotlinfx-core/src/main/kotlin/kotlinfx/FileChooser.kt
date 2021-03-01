package kotlinfx

typealias FileChooser = javafx.stage.FileChooser
typealias DirectoryChooser = javafx.stage.DirectoryChooser
typealias ExtensionFilter = javafx.stage.FileChooser.ExtensionFilter

inline fun fileChooser(initializer: FileChooser.() -> Unit = {}): FileChooser {
    return FileChooser().apply(initializer)
}

inline fun directoryChooser(initializer: DirectoryChooser.() -> Unit = {}): DirectoryChooser {
    return DirectoryChooser().apply(initializer)
}
