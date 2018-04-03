module kotlinfx.graphics {
    requires kotlin.stdlib;

    requires transitive javafx.graphics;

    exports kotlinfx.animation;
    exports kotlinfx.application;
    exports kotlinfx.concurrent;
    exports kotlinfx.geometry;
    exports kotlinfx.scene;
    exports kotlinfx.stage;
}