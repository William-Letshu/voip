module voip {
    requires javafx.controls;
    requires javafx.fxml;

    opens voip to javafx.fxml;
    exports voip;
}
