package kotlinfx

typealias ConditionalFeature = javafx.application.ConditionalFeature

/**
 * Queries whether a specific conditional feature is supported
 * by the platform.
 *
 * For example:
 * ```kotlin
 * // Query whether filter effects are supported
 * if (ConditionalFeature.EFFECT.isSupported) {
 *    // use effects
 * }
 * ```
 *
 * @see javafx.application.Platform.isSupported
 */
inline val ConditionalFeature.isSupported: Boolean
    inline get() = javafx.application.Platform.isSupported(this)
