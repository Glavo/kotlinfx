@file:Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")

package kotlinfx.scene

import javafx.scene.SnapshotResult

inline fun <T> SnapshotResult.source(): T = this.source as T