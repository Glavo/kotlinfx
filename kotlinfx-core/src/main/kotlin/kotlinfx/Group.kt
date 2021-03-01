package kotlinfx

typealias Group = javafx.scene.Group

inline fun group(vararg children: Node, initializer: Group.() -> Unit): Group {
    return Group(*children).apply(initializer)
}

@JvmName("groupOfArray")
inline fun group(children: Array<out Node>, initializer: Group.() -> Unit): Group {
    return Group(*children).apply(initializer)
}

inline fun group(children: Collection<Node>, initializer: Group.() -> Unit): Group {
    return Group(children).apply(initializer)
}

var Group.context: Collection<Node>
    get() = children
    set(value) {
        children.setAll(value)
    }