module kotlinfx.swing {
    requires kotlin.stdlib;

    requires transitive java.desktop;
    requires transitive javafx.graphics;
    requires transitive javafx.swing;

    exports kotlinfx.swing;
}