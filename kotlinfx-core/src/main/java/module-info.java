module kotlinfx.core {
    requires kotlin.stdlib;

    requires transitive javafx.base;
    requires transitive javafx.graphics;
    requires transitive javafx.controls;

    exports kotlinfx;
}