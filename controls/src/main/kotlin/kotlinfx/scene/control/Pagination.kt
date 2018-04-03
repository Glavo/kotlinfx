package kotlinfx.scene.control

import javafx.scene.control.Pagination

inline fun pagination(pageCount: Int = Int.MAX_VALUE, pageIndex: Int = 0, initializer: Pagination.() -> Unit = {}): Pagination {
    return Pagination(pageCount, pageIndex).apply(initializer)
}