package kotlinfx.scene.control

import javafx.scene.control.ChoiceDialog

inline fun <T> choiceDialog(defaultChoice: T? = null, vararg choices: T, initializer: ChoiceDialog<T>.() -> Unit = {}): ChoiceDialog<T> {
    return ChoiceDialog<T>(defaultChoice, *choices).apply(initializer)
}

@JvmName("choiceDialogOfArray")
inline fun <T> choiceDialog(defaultChoice: T? = null,  choices: Array<out T>, initializer: ChoiceDialog<T>.() -> Unit = {}): ChoiceDialog<T> {
    return ChoiceDialog<T>(defaultChoice, *choices).apply(initializer)
}

inline fun <T> choiceDialog(defaultChoice: T? = null, choices: Collection<T>, initializer: ChoiceDialog<T>.() -> Unit = {}): ChoiceDialog<T> {
    return ChoiceDialog<T>(defaultChoice, choices).apply(initializer)
}
