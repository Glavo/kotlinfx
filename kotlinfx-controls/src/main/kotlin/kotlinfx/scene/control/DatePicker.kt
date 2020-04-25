package kotlinfx.scene.control

import javafx.scene.control.DatePicker
import java.time.LocalDate

inline fun datePicker(localDate: LocalDate? = null, initializer: DatePicker.() -> Unit = {}): DatePicker {
    return DatePicker(localDate).apply(initializer)
}