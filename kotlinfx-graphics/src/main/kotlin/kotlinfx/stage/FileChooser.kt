package kotlinfx.stage

import javafx.stage.DirectoryChooser
import javafx.stage.FileChooser


inline fun fileChooser(initializer: FileChooser.() -> Unit = {}): FileChooser {
    return FileChooser().apply(initializer)
}

inline fun directoryChooser(initializer: DirectoryChooser.() -> Unit = {}): DirectoryChooser {
    return DirectoryChooser().apply(initializer)
}