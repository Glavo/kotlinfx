package kotlinfx.scene

import javafx.geometry.HPos
import javafx.geometry.Insets
import javafx.geometry.Orientation
import javafx.geometry.Side
import javafx.scene.Node
import javafx.scene.image.Image
import javafx.scene.layout.*
import javafx.scene.paint.Paint

inline fun pane(vararg children: Node, initializer: Pane.() -> Unit = {}): Pane {
    return Pane(*children).apply(initializer)
}

@JvmName("paneOfArray")
inline fun pane(children: Array<out Node>, initializer: Pane.() -> Unit = {}): Pane {
    return Pane(*children).apply(initializer)
}

inline fun pane(children: Collection<Node>, initializer: Pane.() -> Unit = {}): Pane {
    return Pane().apply { this.children.addAll(children) }.apply(initializer)
}

inline fun hbox(vararg children: Node, initializer: HBox.() -> Unit = {}): HBox {
    return HBox(*children).apply(initializer)
}

@JvmName("hboxOfArray")
inline fun hbox(children: Array<out Node>, initializer: HBox.() -> Unit = {}): HBox {
    return HBox(*children).apply(initializer)
}

inline fun hbox(children: Collection<Node>, initializer: HBox.() -> Unit = {}): HBox {
    return HBox().apply { this.children.addAll(children) }.apply(initializer)
}

inline fun vbox(vararg children: Node, initializer: VBox.() -> Unit = {}): VBox {
    return VBox(*children).apply(initializer)
}

@JvmName("vboxOfArray")
inline fun vbox(children: Array<out Node>, initializer: VBox.() -> Unit = {}): VBox {
    return VBox(*children).apply(initializer)
}

inline fun vbox(children: Collection<Node>, initializer: VBox.() -> Unit = {}): VBox {
    return VBox().apply { this.children.addAll(children) }.apply(initializer)
}

@JvmName("borderPaneOfArray")
inline fun borderPane(
        center: Node? = null,
        top: Node? = null,
        right: Node? = null,
        bottom: Node? = null,
        left: Node? = null,
        initializer: BorderPane.() -> Unit = {}): BorderPane {
    return BorderPane().apply {
        if (center != null)
            this.center = center

        if (top != null)
            this.top = top

        if (right != null)
            this.right = right

        if (bottom != null)
            this.bottom = bottom

        if (left != null)
            this.left = left
    }.apply(initializer)
}

inline fun flowPane(orientation: Orientation = Orientation.HORIZONTAL, vararg children: Node, initializer: FlowPane.() -> Unit = {}): FlowPane {
    return FlowPane(orientation, *children).apply(initializer)
}

@JvmName("flowPaneOfArray")
inline fun flowPane(orientation: Orientation = Orientation.HORIZONTAL, children: Array<out Node>, initializer: FlowPane.() -> Unit = {}): FlowPane {
    return FlowPane(orientation, *children).apply(initializer)
}

inline fun flowPane(orientation: Orientation = Orientation.HORIZONTAL, children: Collection<Node>, initializer: FlowPane.() -> Unit = {}): FlowPane {
    return FlowPane(orientation).apply { this.children.addAll(children) }.apply(initializer)
}

inline fun anchorPane(vararg children: Node, initializer: AnchorPane.() -> Unit = {}): AnchorPane {
    return AnchorPane(*children).apply(initializer)
}

@JvmName("anchorPaneOfArray")
inline fun anchorPane(children: Array<out Node>, initializer: AnchorPane.() -> Unit = {}): AnchorPane {
    return AnchorPane(*children).apply(initializer)
}

inline fun anchorPane(children: Collection<Node>, initializer: AnchorPane.() -> Unit = {}): AnchorPane {
    return AnchorPane().apply { this.children.addAll(children) }.apply(initializer)
}

inline fun stackPane(vararg children: Node, initializer: StackPane.() -> Unit = {}): StackPane {
    return StackPane(*children).apply(initializer)
}

@JvmName("stackPaneOfArray")
inline fun stackPane(children: Array<out Node>, initializer: StackPane.() -> Unit = {}): StackPane {
    return StackPane(*children).apply(initializer)
}

inline fun stackPane(children: Collection<Node>, initializer: StackPane.() -> Unit = {}): StackPane {
    return StackPane().apply { this.children.addAll(children) }.apply(initializer)
}

inline fun gridPane(initializer: GridPane.() -> Unit = {}): GridPane {
    return GridPane().apply(initializer)
}

inline fun tilePane(initializer: TilePane.() -> Unit = {}): TilePane {
    return TilePane().apply(initializer)
}

inline fun tilePane(
        orientation: Orientation = Orientation.HORIZONTAL,
        hgap: Double = 0.0,
        vgap: Double = 0.0,
        vararg children: Node,
        initializer: TilePane.() -> Unit = {}): TilePane {
    return TilePane(orientation, hgap, vgap, *children).apply(initializer)
}

@JvmName("titlePaneOfArray")
inline fun tilePane(
        orientation: Orientation = Orientation.HORIZONTAL,
        hgap: Double = 0.0,
        vgap: Double = 0.0,
        children: Array<out Node>,
        initializer: TilePane.() -> Unit = {}): TilePane {
    return TilePane(orientation, hgap, vgap, *children).apply(initializer)
}

inline fun tilePane(
        orientation: Orientation = Orientation.HORIZONTAL,
        hgap: Double = 0.0,
        vgap: Double = 0.0,
        children: Collection<Node>,
        initializer: TilePane.() -> Unit = {}): TilePane {
    return TilePane(orientation, hgap, vgap).apply { this.children.addAll(children) }.apply(initializer)
}

inline fun background(vararg fills: BackgroundFill, initializer: Background.() -> Unit = {}): Background {
    return Background(*fills).apply(initializer)
}

inline fun background(vararg images: BackgroundImage, initializer: Background.() -> Unit = {}): Background {
    return Background(*images).apply(initializer)
}

inline fun background(
        fills: Array<out BackgroundFill> = arrayOf(),
        images: Array<out BackgroundImage> = arrayOf(),
        initializer: Background.() -> Unit = {}): Background {
    return Background(fills, images).apply(initializer)
}

inline fun backgroundFill(fill: Paint, radii: CornerRadii, insets: Insets, initializer: BackgroundFill.() -> Unit = {}): BackgroundFill {
    return BackgroundFill(fill, radii, insets).apply(initializer)
}

inline fun backgroundImage(
        image: Image,
        repeatX: BackgroundRepeat,
        repeatY: BackgroundRepeat,
        position: BackgroundPosition,
        size: BackgroundSize,
        initializer: BackgroundImage.() -> Unit = {}): BackgroundImage {
    return BackgroundImage(image, repeatX, repeatY, position, size).apply(initializer)
}

inline fun backgroundPosition(
        horizontalSide: Side,
        horizontalPosition: Double,
        horizontalAsPercentage: Boolean,
        verticalSide: Side,
        verticalPosition: Double,
        verticalAsPercentage: Boolean,
        initializer: BackgroundPosition.() -> Unit = {}): BackgroundPosition {
    return BackgroundPosition(horizontalSide, horizontalPosition, horizontalAsPercentage, verticalSide, verticalPosition, verticalAsPercentage).apply(initializer)
}

inline fun border(vararg strokes: BorderStroke, initializer: Border.() -> Unit = {}): Border {
    return Border(*strokes).apply(initializer)
}

inline fun border(vararg images: BorderImage, initializer: Border.() -> Unit = {}): Border {
    return Border(*images).apply(initializer)
}

inline fun border(
        strokes: Array<out BorderStroke> = arrayOf(),
        images: Array<out BorderImage> = arrayOf(),
        initializer: Border.() -> Unit = {}): Border {
    return Border(strokes, images).apply(initializer)
}

inline fun borderImage(
        image: Image,
        widths: BorderWidths,
        insets: Insets,
        slices: BorderWidths,
        filled: Boolean,
        repeatX: BorderRepeat,
        repeatY: BorderRepeat,
        initializer: BorderImage.() -> Unit = {}): BorderImage {
    return BorderImage(image, widths, insets, slices, filled, repeatX, repeatY).apply(initializer)
}

inline fun borderStroke(
        stroke: Paint,
        style: BorderStrokeStyle,
        radii: CornerRadii,
        widths: BorderWidths,
        initializer: BorderStroke.() -> Unit = {}): BorderStroke {
    return BorderStroke(stroke, style, radii, widths).apply(initializer)
}

inline fun borderStroke(
        stroke: Paint,
        style: BorderStrokeStyle,
        radii: CornerRadii,
        widths: BorderWidths,
        insets: Insets,
        initializer: BorderStroke.() -> Unit = {}): BorderStroke {
    return BorderStroke(stroke, style, radii, widths, insets).apply(initializer)
}

inline fun borderStroke(
        topStroke: Paint,
        rightStroke: Paint,
        bottomStroke: Paint,
        leftStroke: Paint,
        topStyle: BorderStrokeStyle,
        rightStyle: BorderStrokeStyle,
        bottomStyle: BorderStrokeStyle,
        leftStyle: BorderStrokeStyle,
        radii: CornerRadii,
        widths: BorderWidths,
        insets: Insets,
        initializer: BorderStroke.() -> Unit = {}): BorderStroke {
    return BorderStroke(topStroke, rightStroke, bottomStroke, leftStroke, topStyle, rightStyle, bottomStyle, leftStyle, radii, widths, insets).apply(initializer)
}

inline fun borderWidths(width: Double, initializer: BorderWidths.() -> Unit = {}): BorderWidths {
    return BorderWidths(width).apply(initializer)
}

inline fun borderWidths(
        top: Double,
        right: Double,
        bottom: Double,
        left: Double,
        topAsPercentage: Boolean = false,
        rightAsPercentage: Boolean = false,
        bottomAsPercentage: Boolean = false,
        leftAsPercentage: Boolean = false,
        initializer: BorderWidths.() -> Unit = {}): BorderWidths {
    return BorderWidths(top, right, bottom, left, topAsPercentage, rightAsPercentage, bottomAsPercentage, leftAsPercentage).apply(initializer)
}

inline fun cornerRadii(radius: Double, initializer: CornerRadii.() -> Unit = {}): CornerRadii {
    return CornerRadii(radius).apply(initializer)
}

inline fun cornerRadii(
        radius: Double,
        asPercent: Boolean,
        initializer: CornerRadii.() -> Unit = {}): CornerRadii {
    return CornerRadii(radius, asPercent).apply(initializer)
}

inline fun cornerRadii(
        topLeft: Double,
        topRight: Double,
        bottomRight: Double,
        bottomLeft: Double,
        asPercent: Boolean,
        initializer: CornerRadii.() -> Unit = {}): CornerRadii {
    return CornerRadii(topLeft, topRight, bottomRight, bottomLeft, asPercent).apply(initializer)
}

inline fun cornerRadii(
        topLeftHorizontalRadius: Double,
        topLeftVerticalRadius: Double,
        topRightVerticalRadius: Double,
        topRightHorizontalRadius: Double,
        bottomRightHorizontalRadius: Double,
        bottomRightVerticalRadius: Double,
        bottomLeftVerticalRadius: Double,
        bottomLeftHorizontalRadius: Double,
        topLeftHorizontalRadiusAsPercent: Boolean,
        topLeftVerticalRadiusAsPercent: Boolean,
        topRightVerticalRadiusAsPercent: Boolean,
        topRightHorizontalRadiusAsPercent: Boolean,
        bottomRightHorizontalRadiusAsPercent: Boolean,
        bottomRightVerticalRadiusAsPercent: Boolean,
        bottomLeftVerticalRadiusAsPercent: Boolean,
        bottomLeftHorizontalRadiusAsPercent: Boolean,
        initializer: CornerRadii.() -> Unit = {}): CornerRadii {
    return CornerRadii(topLeftHorizontalRadius, topLeftVerticalRadius, topRightVerticalRadius, topRightHorizontalRadius, bottomRightHorizontalRadius, bottomRightVerticalRadius, bottomLeftVerticalRadius, bottomLeftHorizontalRadius, topLeftHorizontalRadiusAsPercent, topLeftVerticalRadiusAsPercent, topRightVerticalRadiusAsPercent, topRightHorizontalRadiusAsPercent, bottomRightHorizontalRadiusAsPercent, bottomRightVerticalRadiusAsPercent, bottomLeftVerticalRadiusAsPercent, bottomLeftHorizontalRadiusAsPercent).apply(initializer)
}

inline fun columnConstraints(initializer: ColumnConstraints.() -> Unit = {}): ColumnConstraints {
    return ColumnConstraints().apply(initializer)
}

inline fun columnConstraints(width: Double, initializer: ColumnConstraints.() -> Unit = {}): ColumnConstraints {
    return ColumnConstraints(width).apply(initializer)
}

inline fun columnConstraints(minWidth: Double, prefWidth: Double, maxWidth: Double, initializer: ColumnConstraints.() -> Unit = {}): ColumnConstraints {
    return ColumnConstraints(minWidth, prefWidth, maxWidth).apply(initializer)
}

inline fun columnConstraints(
        minWidth: Double,
        prefWidth: Double,
        maxWidth: Double,
        hgrow: Priority,
        halignment: HPos,
        fillWidth: Boolean,
        initializer: ColumnConstraints.() -> Unit = {}): ColumnConstraints {
    return ColumnConstraints(minWidth, prefWidth, maxWidth, hgrow, halignment, fillWidth).apply(initializer)
}