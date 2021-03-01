package org.glavo.kotlinfx.test

import kotlinfx.*
import kotlinfx.swing.*
import javax.swing.JButton

fun main(args: Array<String>) = launchApp(args) {
    scene = scene(width = 100.0, height = 50.0) {
        root = stackPane(
                JButton("Click me!").asJFXNode()
        )
    }
}