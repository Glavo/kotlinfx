package kotlinfx.stage

import javafx.stage.Stage
import javafx.stage.StageStyle

inline fun stage(style: StageStyle = StageStyle.DECORATED, initializer: Stage.() -> Unit = {}): Stage {
    return Stage(style).apply(initializer)
}
