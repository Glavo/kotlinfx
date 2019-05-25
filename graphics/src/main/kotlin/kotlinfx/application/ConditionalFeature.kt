package kotlinfx.application

import javafx.application.ConditionalFeature
import javafx.application.Platform

inline val ConditionalFeature.isSupported: Boolean
    inline get() = Platform.isSupported(this)