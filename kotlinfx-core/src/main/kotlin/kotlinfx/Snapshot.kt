@file:Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")

package kotlinfx


typealias SnapshotParameters = javafx.scene.SnapshotParameters
typealias SnapshotResult = javafx.scene.SnapshotResult

inline fun <T> SnapshotResult.source(): T = this.source as T