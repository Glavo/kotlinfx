package kotlinfx.scene.control

import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.Node
import javafx.scene.control.*

inline fun menuBar(vararg menus: Menu, initializer: MenuBar.() -> Unit = {}): MenuBar {
    return MenuBar(*menus).apply(initializer)
}

@JvmName("menuBarOfArray")
inline fun menuBar(menus: Array<out Menu>, initializer: MenuBar.() -> Unit = {}): MenuBar {
    return MenuBar(*menus).apply(initializer)
}

inline fun menuBar(menus: Collection<Menu>, initializer: MenuBar.() -> Unit = {}): MenuBar {
    return MenuBar().apply { this.menus.addAll(menus) }.apply(initializer)
}

inline fun contextMenu(vararg menus: MenuItem, initializer: ContextMenu.() -> Unit = {}): ContextMenu {
    return ContextMenu(*menus).apply(initializer)
}

@JvmName("contextMenuOfArray")
inline fun contextMenu(menus: Array<out MenuItem>, initializer: ContextMenu.() -> Unit = {}): ContextMenu {
    return ContextMenu(*menus).apply(initializer)
}

inline fun contextMenu(menus: Collection<MenuItem>, initializer: ContextMenu.() -> Unit = {}): ContextMenu {
    return ContextMenu().apply { this.items.addAll(menus) }.apply(initializer)
}

inline fun ContextMenu.onAction(crossinline v: (ActionEvent) -> Unit) {
    this.onAction = EventHandler { v(it) }
}


inline fun menuItem(text: String = "", graphic: Node? = null, initializer: MenuItem .() -> Unit = {}): MenuItem {
    return MenuItem(text, graphic).apply(initializer)
}

inline fun menu(text: String = "", graphic: Node? = null, vararg items: MenuItem, initializer: Menu.() -> Unit = {}): Menu {
    return Menu(text, graphic, *items).apply(initializer)
}

@JvmName("menuOfArray")
inline fun menu(text: String = "", graphic: Node? = null, items: Array<out MenuItem>, initializer: Menu.() -> Unit = {}): Menu {
    return Menu(text, graphic, *items).apply(initializer)
}

inline fun menu(text: String = "", graphic: Node? = null, items: Collection<MenuItem>, initializer: Menu.() -> Unit = {}): Menu {
    return Menu(text, graphic).apply { this.items.addAll(items) }.apply(initializer)
}

inline fun menuButton(text: String = "", graphic: Node? = null, vararg items: MenuItem, initializer: MenuButton.() -> Unit = {}): MenuButton {
    return MenuButton(text, graphic, *items).apply(initializer)
}

@JvmName("menuButtonOfArray")
inline fun menuButton(text: String = "", graphic: Node? = null, items: Array<out MenuItem>, initializer: MenuButton.() -> Unit = {}): MenuButton {
    return MenuButton(text, graphic, *items).apply(initializer)
}

inline fun menuButton(text: String = "", graphic: Node? = null, items: Collection<MenuItem>, initializer: MenuButton.() -> Unit = {}): MenuButton {
    return MenuButton(text, graphic).apply { this.items.addAll(items) }.apply(initializer)
}

inline fun splitMenuButton(vararg items: MenuItem, initializer: SplitMenuButton.() -> Unit = {}): SplitMenuButton {
    return SplitMenuButton(*items).apply(initializer)
}

@JvmName("splitMenuButtonOfArray")
inline fun splitMenuButton(items: Array<out MenuItem>, initializer: SplitMenuButton.() -> Unit = {}): SplitMenuButton {
    return SplitMenuButton(*items).apply(initializer)
}

inline fun splitMenuButton(items: Collection<MenuItem>, initializer: SplitMenuButton.() -> Unit = {}): SplitMenuButton {
    return SplitMenuButton().apply { this.items.addAll(items) }.apply(initializer)
}


inline fun customMenuItem(node: Node? = null, hideOnClick: Boolean = true, initializer: CustomMenuItem.() -> Unit = {}): CustomMenuItem {
    return CustomMenuItem(node, hideOnClick).apply(initializer)
}

inline fun separatorMenuItem(initializer: SeparatorMenuItem.() -> Unit = {}): SeparatorMenuItem {
    return SeparatorMenuItem().apply(initializer)
}

inline fun checkMenuItem(text: String = "", graphic: Node? = null, initializer: CheckMenuItem.() -> Unit = {}): CheckMenuItem {
    return CheckMenuItem(text, graphic).apply(initializer)
}

inline fun radioMenuItem(text: String = "", graphic: Node? = null, initializer: RadioMenuItem.() -> Unit = {}): RadioMenuItem {
    return RadioMenuItem(text, graphic).apply(initializer)
}

inline fun MenuItem.onAction(crossinline v: (ActionEvent) -> Unit) {
    this.onAction = EventHandler { v(it) }
}