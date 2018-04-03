@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.fxml

import javafx.fxml.FXMLLoader
import javafx.util.BuilderFactory
import javafx.util.Callback
import java.net.URL
import java.nio.charset.Charset
import java.util.*

inline fun <T> loadFXML(location: URL): T = FXMLLoader.load(location)

inline fun <T> loadFXML(location: URL, resources: ResourceBundle): T = FXMLLoader.load(location, resources)

inline fun <T> loadFXML(location: URL, resources: ResourceBundle, builderFactory: BuilderFactory): T =
        FXMLLoader.load(location, resources, builderFactory)

inline fun <T> loadFXML(location: URL,
                 resources: ResourceBundle,
                 builderFactory: BuilderFactory,
                 controllerFactory: Callback<Class<*>, Any>): T =
        FXMLLoader.load(location, resources, builderFactory, controllerFactory)

inline fun <T> loadFXML(location: URL,
                 resources: ResourceBundle,
                 builderFactory: BuilderFactory,
                 controllerFactory: Callback<Class<*>, Any>,
                 charset: Charset): T =
        FXMLLoader.load(location, resources, builderFactory, controllerFactory, charset)