package kotlinfx

typealias Stage = javafx.stage.Stage
typealias StageStyle = javafx.stage.StageStyle

inline fun stage(style: StageStyle = StageStyle.DECORATED, initializer: Stage.() -> Unit = {}): Stage {
    return Stage(style).apply(initializer)
}
