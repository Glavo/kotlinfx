@file:Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")

package kotlinfx

typealias Control = javafx.scene.control.Control
typealias Labeled = javafx.scene.control.Labeled

typealias ContentDisplay = javafx.scene.control.ContentDisplay
typealias FocusModel<T> = javafx.scene.control.FocusModel<T>
typealias MultipleSelectionModel<T> = javafx.scene.control.MultipleSelectionModel<T>
typealias OverrunStyle = javafx.scene.control.OverrunStyle

typealias TextFormatter<V> = javafx.scene.control.TextFormatter<V>

typealias ScrollToEvent<T> = javafx.scene.control.ScrollToEvent<T>
typealias SortEvent<C> = javafx.scene.control.SortEvent<C>

//region Accordion

typealias Accordion = javafx.scene.control.Accordion

inline fun accordion(vararg titledPanes: TitledPane, initializer: Accordion.() -> Unit = {}): Accordion {
    return Accordion(*titledPanes).apply(initializer)
}

@JvmName("accordionOfArray")
inline fun accordion(titledPanes: Array<out TitledPane>, initializer: Accordion.() -> Unit = {}): Accordion {
    return Accordion(*titledPanes).apply(initializer)
}

inline fun accordion(titledPanes: Collection<TitledPane>, initializer: Accordion.() -> Unit = {}): Accordion {
    return Accordion().apply {
        this.panes.addAll(titledPanes)
    }.apply(initializer)
}

//endregion

//region Button

typealias Button = javafx.scene.control.Button
typealias ButtonBase = javafx.scene.control.ButtonBase
typealias ButtonType = javafx.scene.control.ButtonType

typealias RadioButton = javafx.scene.control.RadioButton
typealias ToggleButton = javafx.scene.control.ToggleButton

inline fun button(initializer: Button.() -> Unit = {}): Button {
    return Button().apply(initializer)
}

inline fun button(text: String, initializer: Button.() -> Unit = {}): Button {
    return Button(text).apply(initializer)
}

inline fun button(text: String, graphic: Node, initializer: Button.() -> Unit = {}): Button {
    return Button(text, graphic).apply(initializer)
}

inline fun ButtonBase.onAction(crossinline v: (ActionEvent) -> Unit) {
    this.onAction = EventHandler { v(it) }
}

inline fun radioButton(initializer: RadioButton.() -> Unit = {}): RadioButton {
    return RadioButton().apply(initializer)
}

inline fun radioButton(text: String, initializer: RadioButton.() -> Unit = {}): RadioButton {
    return RadioButton(text).apply(initializer)
}

inline fun toggleButton(initializer: ToggleButton.() -> Unit = {}): ToggleButton {
    return ToggleButton().apply(initializer)
}

inline fun toggleButton(text: String, initializer: ToggleButton.() -> Unit = {}): ToggleButton {
    return ToggleButton(text).apply(initializer)
}

inline fun toggleButton(text: String, graphic: Node, initializer: ToggleButton.() -> Unit = {}): ToggleButton {
    return ToggleButton(text, graphic).apply(initializer)
}

//endregion

//region ButtonBar

typealias ButtonBar = javafx.scene.control.ButtonBar

inline fun buttonBar(buttonOrder: String? = null, initializer: ButtonBar.() -> Unit = {}): ButtonBar {
    return ButtonBar(buttonOrder).apply(initializer)
}

//endregion

//region CheckBox

typealias CheckBox = javafx.scene.control.CheckBox
typealias CheckBoxTreeItem<T> = javafx.scene.control.CheckBoxTreeItem<T>

inline fun checkBox(text: String = "", initializer: CheckBox.() -> Unit = {}): CheckBox {
    return CheckBox(text).apply(initializer)
}

inline fun <T> checkBoxTreeItem(
        value: T? = null,
        graphic: Node? = null,
        selected: Boolean = false,
        independent: Boolean = false,
        initializer: CheckBoxTreeItem<T>.() -> Unit = {}): CheckBoxTreeItem<T> {
    return (CheckBoxTreeItem(value, graphic, selected, independent) as CheckBoxTreeItem<T>).apply(initializer)
}

//endregion

//region ChoiceBox

typealias ChoiceBox<T> = javafx.scene.control.ChoiceBox<T>

inline fun <T> choiceBox(vararg items: T, initializer: ChoiceBox<T>.() -> Unit = {}): ChoiceBox<T> {
    return ChoiceBox(observableMutableListOf(*items)).apply(initializer)
}

@JvmName("choiceBoxOfArray")
inline fun <T> choiceBox(items: Array<out T>, initializer: ChoiceBox<T>.() -> Unit = {}): ChoiceBox<T> {
    return ChoiceBox(observableMutableListOf(*items)).apply(initializer)
}

inline fun <T> choiceBox(items: Collection<T>, initializer: ChoiceBox<T>.() -> Unit = {}): ChoiceBox<T> {
    return ChoiceBox(items.toList().asObservableList()).apply(initializer)
}

inline fun <T> choiceBox(items: List<T>, initializer: ChoiceBox<T>.() -> Unit = {}): ChoiceBox<T> {
    return ChoiceBox(items.asObservableList()).apply(initializer)
}

inline fun <T> choiceBox(items: ObservableList<T>, initializer: ChoiceBox<T>.() -> Unit = {}): ChoiceBox<T> {
    return ChoiceBox(items).apply(initializer)
}

inline fun ChoiceBox<*>.onAction(crossinline v: (ActionEvent) -> Unit) {
    this.onAction = EventHandler { v(it) }
}

inline fun ChoiceBox<*>.onHidden(crossinline v: (Event) -> Unit) {
    this.onHidden = EventHandler { v(it) }
}

inline fun ChoiceBox<*>.onHiding(crossinline v: (Event) -> Unit) {
    this.onHiding = EventHandler { v(it) }
}

inline fun ChoiceBox<*>.onShowing(crossinline v: (Event) -> Unit) {
    this.onShowing = EventHandler { v(it) }
}

inline fun ChoiceBox<*>.onShown(crossinline v: (Event) -> Unit) {
    this.onShown = EventHandler { v(it) }
}

//endregion

//region ChoiceDialog

typealias ChoiceDialog<T> = javafx.scene.control.ChoiceDialog<T>

inline fun <T> choiceDialog(defaultChoice: T? = null, vararg choices: T, initializer: ChoiceDialog<T>.() -> Unit = {}): ChoiceDialog<T> {
    return (ChoiceDialog(defaultChoice, *choices) as ChoiceDialog<T>).apply(initializer)
}

@JvmName("choiceDialogOfArray")
inline fun <T> choiceDialog(defaultChoice: T? = null, choices: Array<out T>, initializer: ChoiceDialog<T>.() -> Unit = {}): ChoiceDialog<T> {
    return (ChoiceDialog(defaultChoice, *choices) as ChoiceDialog<T>).apply(initializer)
}

inline fun <T> choiceDialog(defaultChoice: T? = null, choices: Collection<T>, initializer: ChoiceDialog<T>.() -> Unit = {}): ChoiceDialog<T> {
    return (ChoiceDialog(defaultChoice, choices) as ChoiceDialog<T>).apply(initializer)
}

//endregion

//region ColorPicker

typealias ColorPicker = javafx.scene.control.ColorPicker

inline fun colorPicker(color: Color = Color.WHITE, initializer: ColorPicker.() -> Unit = {}): ColorPicker {
    return ColorPicker(color).also(initializer)
}

//endregion

//region ComboBox

typealias ComboBox<T> = javafx.scene.control.ComboBox<T>
typealias ComboBoxBase<T> = javafx.scene.control.ComboBoxBase<T>

inline fun <T> comboBox(vararg items: T, initializer: ComboBox<T>.() -> Unit = {}): ComboBox<T> {
    return ComboBox(FXCollections.observableArrayList(*items)).apply(initializer)
}

@JvmName("comboBoxOfArray")
inline fun <T> comboBox(items: Array<out T>, initializer: ComboBox<T>.() -> Unit = {}): ComboBox<T> {
    return ComboBox(FXCollections.observableArrayList(*items)).apply(initializer)
}

inline fun <T> comboBox(items: Collection<T>, initializer: ComboBox<T>.() -> Unit = {}): ComboBox<T> {
    return ComboBox(FXCollections.observableList(items.toList())).apply(initializer)
}

inline fun <T> comboBox(items: List<T>, initializer: ComboBox<T>.() -> Unit = {}): ComboBox<T> {
    return ComboBox(FXCollections.observableList(items)).apply(initializer)
}

inline fun <T> comboBox(items: javafx.collections.ObservableList<T>, initializer: ComboBox<T>.() -> Unit = {}): ComboBox<T> {
    return ComboBox<T>(items).apply(initializer)
}

inline fun ComboBoxBase<*>.onAction(crossinline v: (ActionEvent) -> Unit) {
    this.onAction = EventHandler { v(it) }
}

inline fun ComboBoxBase<*>.onHidden(crossinline v: (Event) -> Unit) {
    this.onHidden = EventHandler { v(it) }
}

inline fun ComboBoxBase<*>.onHiding(crossinline v: (Event) -> Unit) {
    this.onHiding = EventHandler { v(it) }
}

inline fun ComboBoxBase<*>.onShowing(crossinline v: (Event) -> Unit) {
    this.onShowing = EventHandler { v(it) }
}

inline fun ComboBoxBase<*>.onShown(crossinline v: (Event) -> Unit) {
    this.onShown = EventHandler { v(it) }
}

//endregion

//region DatePicker

typealias DatePicker = javafx.scene.control.DatePicker

inline fun datePicker(initializer: DatePicker.() -> Unit = {}): DatePicker {
    return DatePicker().apply(initializer)
}

inline fun datePicker(localDate: java.time.LocalDate, initializer: DatePicker.() -> Unit = {}): DatePicker {
    return DatePicker(localDate).apply(initializer)
}

//endregion

//region Dialog

typealias Dialog<R> = javafx.scene.control.Dialog<R>
typealias DialogEvent = javafx.scene.control.DialogEvent
typealias DialogPane = javafx.scene.control.DialogPane

typealias Alert = javafx.scene.control.Alert
typealias AlertType = javafx.scene.control.Alert.AlertType

typealias TextInputDialog = javafx.scene.control.TextInputDialog

inline fun <R> dialog(initializer: Dialog<R>.() -> Unit = {}): Dialog<R> {
    return Dialog<R>().apply(initializer)
}

inline fun <R> showDialog(initializer: Dialog<R>.() -> Unit = {}) {
    Dialog<R>().apply(initializer).show()
}

inline fun <R> showDialogAndWait(initializer: Dialog<R>.() -> Unit = {}): R? {
    return Dialog<R>().apply(initializer).showAndWait().orElse(null)
}

inline fun dialogPane(initializer: DialogPane.() -> Unit): DialogPane {
    return DialogPane().apply(initializer)
}

inline fun Dialog<*>.onHidden(crossinline v: (DialogEvent) -> Unit) {
    this.onHidden = EventHandler { v(it) }
}

inline fun Dialog<*>.onHiding(crossinline v: (DialogEvent) -> Unit) {
    this.onHiding = EventHandler { v(it) }
}

inline fun Dialog<*>.onShowing(crossinline v: (DialogEvent) -> Unit) {
    this.onShowing = EventHandler { v(it) }
}

inline fun Dialog<*>.onShown(crossinline v: (DialogEvent) -> Unit) {
    this.onShown = EventHandler { v(it) }
}

inline fun Dialog<*>.onCloseRequest(crossinline v: (DialogEvent) -> Unit) {
    this.onCloseRequest = EventHandler { v(it) }
}

inline fun alert(alertType: AlertType, contextText: String = "", vararg buttons: ButtonType, initializer: Alert.() -> Unit = {}): Alert {
    return Alert(alertType, contextText, *buttons).apply(initializer)
}

@JvmName("alertOfButtonArray")
inline fun alert(alertType: AlertType, contextText: String = "", buttons: Array<out ButtonType>, initializer: Alert.() -> Unit = {}): Alert {
    return Alert(alertType, contextText, *buttons).apply(initializer)
}

inline fun alert(alertType: AlertType, contextText: String = "", buttons: Collection<ButtonType>, initializer: Alert.() -> Unit = {}): Alert {
    return Alert(alertType, contextText, *buttons.toTypedArray()).apply(initializer)
}

inline fun showAlert(alertType: AlertType, contextText: String = "", vararg buttons: ButtonType, initializer: Alert.() -> Unit = {}) {
    Alert(alertType, contextText, *buttons).apply(initializer).show()
}

@JvmName("showAlertOfButtonArray")
inline fun showAlert(alertType: AlertType, contextText: String = "", buttons: Array<out ButtonType>, initializer: Alert.() -> Unit = {}) {
    Alert(alertType, contextText, *buttons).apply(initializer).show()
}

inline fun showAlert(alertType: AlertType, contextText: String = "", buttons: Collection<ButtonType>, initializer: Alert.() -> Unit = {}) {
    Alert(alertType, contextText, *buttons.toTypedArray()).apply(initializer).show()
}

inline fun showAlertAndWait(alertType: AlertType, contextText: String = "", vararg buttons: ButtonType, initializer: Alert.() -> Unit = {}): ButtonType? {
    return Alert(alertType, contextText, *buttons).apply(initializer).showAndWait().orElse(null)
}

@JvmName("showAlertAndWaitOfButtonArray")
inline fun showAlertAndWait(alertType: AlertType, contextText: String = "", buttons: Array<out ButtonType>, initializer: Alert.() -> Unit = {}): ButtonType? {
    return Alert(alertType, contextText, *buttons).apply(initializer).showAndWait().orElse(null)
}

inline fun showAlertAndWait(alertType: AlertType, contextText: String = "", buttons: Collection<ButtonType>, initializer: Alert.() -> Unit = {}): ButtonType? {
    return Alert(alertType, contextText, *buttons.toTypedArray()).apply(initializer).showAndWait().orElse(null)
}

inline fun textInputDialog(defaultValue: String = "", initializer: TextInputDialog.() -> Unit = {}): TextInputDialog {
    return TextInputDialog(defaultValue).apply(initializer)
}

inline fun showTextInputDialog(defaultValue: String = "", initializer: TextInputDialog.() -> Unit = {}) {
    TextInputDialog(defaultValue).apply(initializer).show()
}

inline fun showTextInputDialogAndWait(defaultValue: String = "", initializer: TextInputDialog.() -> Unit = {}): String? {
    return TextInputDialog(defaultValue).apply(initializer).showAndWait().orElse(null)
}

//endregion

//region Hyperlink

typealias Hyperlink = javafx.scene.control.Hyperlink

inline fun hyperlink(initializer: Hyperlink.() -> Unit = {}): Hyperlink {
    return Hyperlink().apply(initializer)
}

inline fun hyperlink(text: String, initializer: Hyperlink.() -> Unit = {}): Hyperlink {
    return Hyperlink(text).apply(initializer)
}

inline fun hyperlink(text: String, graphic: Node, initializer: Hyperlink.() -> Unit = {}): Hyperlink {
    return Hyperlink(text, graphic).apply(initializer)
}

//endregion

//region Label

typealias Label = javafx.scene.control.Label

inline fun label(initializer: Label.() -> Unit = {}): Label {
    return Label().apply(initializer)
}

inline fun label(text: String, initializer: Label.() -> Unit = {}): Label {
    return Label(text).apply(initializer)
}

inline fun label(text: String, graphic: Node, initializer: Label.() -> Unit = {}): Label {
    return Label(text, graphic).apply(initializer)
}

//endregion

//region ListView

typealias ListView<T> = javafx.scene.control.ListView<T>
typealias ListViewEditEvent<T> = javafx.scene.control.ListView.EditEvent<T>

inline fun <T> listView(vararg items: T, initializer: ListView<T>.() -> Unit = {}): ListView<T> {
    return ListView(FXCollections.observableArrayList(*items)).apply(initializer)
}

@JvmName("listViewOfArray")
inline fun <T> listView(items: Array<out T>, initializer: ListView<T>.() -> Unit = {}): ListView<T> {
    return ListView(FXCollections.observableArrayList(*items)).apply(initializer)
}

inline fun <T> listView(items: Collection<T>, initializer: ListView<T>.() -> Unit = {}): ListView<T> {
    return ListView(FXCollections.observableList(items.toList())).apply(initializer)
}

inline fun <T> listView(items: List<T>, initializer: ListView<T>.() -> Unit = {}): ListView<T> {
    return ListView(FXCollections.observableList(items)).apply(initializer)
}

inline fun <T> listView(items: javafx.collections.ObservableList<T>, initializer: ListView<T>.() -> Unit = {}): ListView<T> {
    return ListView<T>(items).apply(initializer)
}


inline fun <T> ListView<T>.onEditStart(crossinline v: (ListViewEditEvent<T>) -> Unit) {
    this.onEditStart = EventHandler { v(it) }
}

inline fun <T> ListView<T>.onEditCommit(crossinline v: (ListViewEditEvent<T>) -> Unit) {
    this.onEditCommit = EventHandler { v(it) }
}

inline fun <T> ListView<T>.onEditCancel(crossinline v: (ListViewEditEvent<T>) -> Unit) {
    this.onEditCancel = EventHandler { v(it) }
}

inline fun ListView<*>.onScrollTo(crossinline v: (ScrollToEvent<Int>) -> Unit) {
    this.onScrollTo = EventHandler { v(it) }
}

inline fun <T> listCell(initializer: ListCell<T>.() -> Unit = {}): ListCell<T> {
    return ListCell<T>().apply(initializer)
}

//endregion

//region Pagination

typealias Pagination = javafx.scene.control.Pagination

inline fun pagination(pageCount: Int = Pagination.INDETERMINATE, pageIndex: Int = 0, initializer: Pagination.() -> Unit = {}): Pagination {
    return Pagination(pageCount, pageIndex).apply(initializer)
}

//endregion

//region PasswordField

typealias PasswordField = javafx.scene.control.PasswordField

inline fun passwordField(initializer: PasswordField.() -> Unit = {}): PasswordField {
    return PasswordField().apply(initializer)
}

//endregion

//region ProgressBar

typealias ProgressBar = javafx.scene.control.ProgressBar
typealias ProgressIndicator = javafx.scene.control.ProgressIndicator

inline fun progressBar(progress: Double = ProgressIndicator.INDETERMINATE_PROGRESS, initializer: ProgressBar.() -> Unit = {}): ProgressBar {
    return ProgressBar(progress).apply(initializer)
}

inline fun progressIndicator(progress: Double = ProgressIndicator.INDETERMINATE_PROGRESS, initializer: ProgressIndicator.() -> Unit = {}): ProgressIndicator {
    return ProgressIndicator(progress).apply(initializer)
}

//endregion

//region ScrollBar

typealias ScrollBar = javafx.scene.control.ScrollBar

inline fun scrollBar(initializer: ScrollBar.() -> Unit = {}): ScrollBar {
    return ScrollBar().apply(initializer)
}

//endregion

//region ScrollPane

typealias ScrollPane = javafx.scene.control.ScrollPane

inline fun scrollPane(context: javafx.scene.Node? = null, initializer: ScrollPane.() -> Unit = {}): ScrollPane {
    return ScrollPane(context).apply(initializer)
}

//endregion

//region Separator

typealias Separator = javafx.scene.control.Separator

inline fun separator(orientation: Orientation = Orientation.HORIZONTAL, initializer: Separator.() -> Unit = {}): Separator {
    return Separator(orientation).apply(initializer)
}

//endregion

//region Slider

typealias Slider = javafx.scene.control.Slider

inline fun slider(initializer: Slider.() -> Unit = {}): Slider {
    return Slider().apply(initializer)
}

inline fun slider(min: Double = 0.0, max: Double = 100.0, value: Double = 0.0, initializer: Slider.() -> Unit = {}): Slider {
    return Slider(min, max, value).apply(initializer)
}

//endregion

//region Spinner

typealias Spinner<T> = javafx.scene.control.Spinner<T>

inline fun <T> spinner(initializer: Spinner<T>.() -> Unit = {}): Spinner<T> {
    return Spinner<T>().apply(initializer)
}

inline fun <T> spinner(min: Int, max: Int, initialValue: Int, amountToStepBy: Int = 1, initializer: Spinner<T>.() -> Unit = {}): Spinner<T> {
    return Spinner<T>(min, max, initialValue, amountToStepBy).apply(initializer)
}

inline fun <T> spinner(min: Double, max: Double, initialValue: Double, amountToStepBy: Double = 1.0, initializer: Spinner<T>.() -> Unit = {}): Spinner<T> {
    return Spinner<T>(min, max, initialValue, amountToStepBy).apply(initializer)
}

inline fun <T> spinner(vararg items: T, initializer: Spinner<T>.() -> Unit = {}): Spinner<T> {
    return Spinner(FXCollections.observableArrayList(*items)).apply(initializer)
}

@JvmName("spinnerOfArray")
inline fun <T> spinner(items: Array<out T>, initializer: Spinner<T>.() -> Unit = {}): Spinner<T> {
    return Spinner(FXCollections.observableArrayList(*items)).apply(initializer)
}

inline fun <T> spinner(items: Collection<T>, initializer: Spinner<T>.() -> Unit = {}): Spinner<T> {
    return Spinner(FXCollections.observableList(items.toList())).apply(initializer)
}

inline fun <T> spinner(items: List<T>, initializer: Spinner<T>.() -> Unit = {}): Spinner<T> {
    return Spinner(FXCollections.observableList(items)).apply(initializer)
}

inline fun <T> spinner(items: javafx.collections.ObservableList<T>, initializer: Spinner<T>.() -> Unit = {}): Spinner<T> {
    return Spinner(items).apply(initializer)
}

//endregion

//region Table

typealias TableView<S> = javafx.scene.control.TableView<S>
typealias TableCell<S, T> = javafx.scene.control.TableCell<S, T>
typealias TableColumn<S, T> = javafx.scene.control.TableColumn<S, T>
typealias TableRow<T> = javafx.scene.control.TableRow<T>
typealias TablePosition<S, T> = javafx.scene.control.TablePosition<S, T>
typealias TableColumnCellEditEvent<S, T> = javafx.scene.control.TableColumn.CellEditEvent<S, T>

inline fun <T> tableView(vararg items: T, initializer: TableView<T>.() -> Unit = {}): TableView<T> {
    return TableView(javafx.collections.FXCollections.observableArrayList(*items)).apply(initializer)
}

@JvmName("choiceBoxOfArray")
inline fun <T> tableView(items: Array<out T>, initializer: TableView<T>.() -> Unit = {}): TableView<T> {
    return TableView(javafx.collections.FXCollections.observableArrayList(*items)).apply(initializer)
}

inline fun <T> tableView(items: Collection<T>, initializer: TableView<T>.() -> Unit = {}): TableView<T> {
    return TableView(javafx.collections.FXCollections.observableList(items.toList())).apply(initializer)
}

inline fun <T> tableView(items: List<T>, initializer: TableView<T>.() -> Unit = {}): TableView<T> {
    return TableView(javafx.collections.FXCollections.observableList(items)).apply(initializer)
}

inline fun <T> tableView(items: ObservableList<T>, initializer: TableView<T>.() -> Unit = {}): TableView<T> {
    return TableView<T>(items).apply(initializer)
}

inline fun TableView<*>.onScrollTo(crossinline v: (javafx.scene.control.ScrollToEvent<Int>) -> Unit) {
    this.onScrollTo = EventHandler { v(it) }
}

inline fun <T> TableView<T>.onScrollToColumn(crossinline v: (javafx.scene.control.ScrollToEvent<TableColumn<T, *>>) -> Unit) {
    this.onScrollToColumn = EventHandler { v(it) }
}

inline fun <S, T> tableCell(initializer: TableCell<S, T>.() -> Unit = {}): TableCell<S, T> {
    return TableCell<S, T>().apply(initializer)
}

inline fun <S, T> tableColumn(text: String = "", initializer: TableColumn<S, T>.() -> Unit = {}): TableColumn<S, T> {
    return TableColumn<S, T>(text).apply(initializer)
}

inline fun <T> tableRow(initializer: TableRow<T>.() -> Unit = {}): TableRow<T> {
    return TableRow<T>().apply(initializer)
}

inline fun <S, T> TableView<S>.tablePosition(row: Int, tableColumn: TableColumn<S, T>, initializer: TablePosition<S, T>.() -> Unit = {}): TablePosition<S, T> {
    return TablePosition<S, T>(this, row, tableColumn).apply(initializer)
}

inline fun <S, T> TableColumn<S, T>.onEditStart(crossinline v: (TableColumnCellEditEvent<S, T>) -> Unit) {
    this.onEditStart = EventHandler { v(it) }
}

inline fun <S, T> TableColumn<S, T>.onEditCommit(crossinline v: (TableColumnCellEditEvent<S, T>) -> Unit) {
    this.onEditCommit = EventHandler { v(it) }
}

inline fun <S, T> TableColumn<S, T>.onEditCancel(crossinline v: (TableColumnCellEditEvent<S, T>) -> Unit) {
    this.onEditCancel = EventHandler { v(it) }
}

//endregion

//region TabPane

typealias Tab = javafx.scene.control.Tab
typealias TabPane = javafx.scene.control.TabPane

inline fun tabPane(initializer: TabPane.() -> Unit = {}): TabPane {
    return TabPane().apply(initializer)
}

inline fun tabPane(vararg tabs: Tab, initializer: TabPane.() -> Unit = {}): TabPane {
    return TabPane(*tabs).apply(initializer)
}

@JvmName("tabPaneOfArray")
inline fun tabPane(tabs: Array<out Tab>, initializer: TabPane.() -> Unit = {}): TabPane {
    return TabPane(*tabs).apply(initializer)
}

inline fun tabPane(tabs: Collection<Tab>, initializer: TabPane.() -> Unit = {}): TabPane {
    return TabPane().apply { this.tabs.addAll(tabs) }.apply(initializer)
}

inline fun tab(text: String? = null, context: javafx.scene.Node? = null, initializer: Tab.() -> Unit): Tab {
    return Tab(text, context).apply(initializer)
}

//endregion

//region TextArea

typealias TextArea = javafx.scene.control.TextArea

inline fun textArea(text: String = "", initializer: TextArea.() -> Unit = {}): TextArea {
    return TextArea(text).apply(initializer)
}

//endregion

//region TextField

typealias TextField = javafx.scene.control.TextField

inline fun textField(text: String = "", initializer: TextField.() -> Unit = {}): TextField {
    return TextField(text).apply(initializer)
}

inline fun TextField.onAction(crossinline v: (ActionEvent) -> Unit) {
    this.onAction = EventHandler { v(it) }
}

//endregion

//region TitledPane

typealias TitledPane = javafx.scene.control.TitledPane

inline fun titledPane(initializer: TitledPane.() -> Unit = {}): TitledPane {
    return TitledPane().apply(initializer)
}

inline fun titledPane(title: String, context: Node, initializer: TitledPane.() -> Unit = {}): TitledPane {
    return TitledPane(title, context).apply(initializer)
}

//endregion

//region Toggle

typealias Toggle = javafx.scene.control.Toggle
typealias ToggleGroup = javafx.scene.control.ToggleGroup

inline fun toggleGroup(initializer: ToggleGroup.() -> Unit = {}): ToggleGroup {
    return ToggleGroup().apply(initializer)
}

inline fun toggleGroup(vararg items: Toggle, initializer: ToggleGroup.() -> Unit = {}): ToggleGroup {
    return ToggleGroup().apply { toggles.addAll(items) }.apply(initializer)
}

@JvmName("choiceBoxOfArray")
inline fun toggleGroup(items: Array<out Toggle>, initializer: ToggleGroup.() -> Unit = {}): ToggleGroup {
    return ToggleGroup().apply { toggles.addAll(items) }.apply(initializer)
}

inline fun toggleGroup(items: Collection<Toggle>, initializer: ToggleGroup.() -> Unit = {}): ToggleGroup {
    return ToggleGroup().apply { toggles.addAll(items) }.apply(initializer)
}

//endregion

//region ToolBar

typealias ToolBar = javafx.scene.control.ToolBar

inline fun toolBar(initializer: ToolBar.() -> Unit = {}): ToolBar {
    return ToolBar().apply(initializer)
}

inline fun toolBar(vararg items: Node, initializer: ToolBar.() -> Unit = {}): ToolBar {
    return ToolBar(*items).apply(initializer)
}

@JvmName("menuBarOfArray")
inline fun toolBar(items: Array<out Node>, initializer: ToolBar.() -> Unit = {}): ToolBar {
    return ToolBar(*items).apply(initializer)
}

inline fun toolBar(items: Collection<Node>, initializer: ToolBar.() -> Unit = {}): ToolBar {
    return ToolBar().apply { this.items.addAll(items) }.apply(initializer)
}

//endregion

//region Tooltip

typealias Tooltip = javafx.scene.control.Tooltip

inline fun tooltip(text: String? = null, initializer: Tooltip.() -> Unit = {}): Tooltip {
    return Tooltip(text).apply(initializer)
}

//endregion

//region Tree

typealias TreeView<T> = javafx.scene.control.TreeView<T>
typealias TreeCell<T> = javafx.scene.control.TreeCell<T>
typealias TreeItem<T> = javafx.scene.control.TreeItem<T>
typealias TreeViewEditEvent<T> = javafx.scene.control.TreeView.EditEvent<T>

inline fun <T> treeView(root: TreeItem<T>? = null, initializer: TreeView<T>.() -> Unit = {}): TreeView<T> {
    return TreeView(root).apply(initializer)
}

inline fun <T> treeItem(value: T? = null, graphic: javafx.scene.Node? = null, initializer: TreeItem<T>.() -> Unit = {}): TreeItem<T> {
    return (TreeItem(value, graphic) as TreeItem<T>).apply(initializer)
}

inline fun <T> treeCell(initializer: TreeCell<T>.() -> Unit = {}): TreeCell<T> {
    return TreeCell<T>().apply(initializer)
}

inline fun <T> TreeView<T>.onEditStart(crossinline v: (TreeViewEditEvent<T>) -> Unit) {
    this.onEditStart = EventHandler { v(it) }
}

inline fun <T> TreeView<T>.onEditCommit(crossinline v: (TreeViewEditEvent<T>) -> Unit) {
    this.onEditCommit = EventHandler { v(it) }
}

inline fun <T> TreeView<T>.onEditCancel(crossinline v: (TreeViewEditEvent<T>) -> Unit) {
    this.onEditCancel = EventHandler { v(it) }
}

inline fun TreeView<*>.onScrollTo(crossinline v: (ScrollToEvent<Int>) -> Unit) {
    this.onScrollTo = EventHandler { v(it) }
}

//endregion

//region TreeTableView

typealias TreeTableView<T> = javafx.scene.control.TreeTableView<T>
typealias TreeTableRow<T> = javafx.scene.control.TreeTableRow<T>
typealias TreeTableColumn<S, T> = javafx.scene.control.TreeTableColumn<S, T>
typealias TreeTableCell<S, T> = javafx.scene.control.TreeTableCell<S, T>
typealias TreeTablePosition<S, T> = javafx.scene.control.TreeTablePosition<S, T>

typealias TreeTableColumnCellEditEvent<S, T> = javafx.scene.control.TreeTableColumn.CellEditEvent<S, T>

inline fun <T> treeTableView(root: javafx.scene.control.TreeItem<T>? = null, initializer: TreeTableView<T>.() -> Unit = {}): TreeTableView<T> {
    return TreeTableView<T>(root).apply(initializer)
}

inline fun TreeTableView<*>.onScrollTo(crossinline v: (javafx.scene.control.ScrollToEvent<Int>) -> Unit) {
    this.onScrollTo = EventHandler { v(it) }
}

inline fun <T> TreeTableView<T>.onSort(crossinline v: (SortEvent<TreeTableView<T>>) -> Unit) {
    this.onSort = EventHandler { v(it) }
}

inline fun <T> TreeTableView<T>.onScrollToColumn(crossinline v: (javafx.scene.control.ScrollToEvent<TreeTableColumn<T, *>>) -> Unit) {
    this.onScrollToColumn = EventHandler { v(it) }
}

inline fun <S, T> treeTableCell(initializer: TreeTableCell<S, T>.() -> Unit = {}): TreeTableCell<S, T> {
    return TreeTableCell<S, T>().apply(initializer)
}

inline fun <S, T> treeTreeTableColumn(text: String = "", initializer: TreeTableColumn<S, T>.() -> Unit = {}): TreeTableColumn<S, T> {
    return TreeTableColumn<S, T>(text).apply(initializer)
}

inline fun <T> treeTableRow(initializer: TreeTableRow<T>.() -> Unit = {}): TreeTableRow<T> {
    return TreeTableRow<T>().apply(initializer)
}

inline fun <S, T> TreeTableView<S>.treeTablePosition(row: Int, tableColumn: TreeTableColumn<S, T>, initializer: TreeTablePosition<S, T>.() -> Unit = {}): TreeTablePosition<S, T> {
    return TreeTablePosition<S, T>(this, row, tableColumn).apply(initializer)
}


inline fun <S, T> TreeTableColumn<S, T>.onEditStart(crossinline v: (TreeTableColumnCellEditEvent<S, T>) -> Unit) {
    this.onEditStart = EventHandler { v(it) }
}

inline fun <S, T> TreeTableColumn<S, T>.onEditCommit(crossinline v: (TreeTableColumnCellEditEvent<S, T>) -> Unit) {
    this.onEditCommit = EventHandler { v(it) }
}

inline fun <S, T> TreeTableColumn<S, T>.onEditCancel(crossinline v: (TreeTableColumnCellEditEvent<S, T>) -> Unit) {
    this.onEditCancel = EventHandler { v(it) }
}


//endregion