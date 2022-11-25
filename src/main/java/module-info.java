module com.idedeuz  {
    requires javafx.controls;
    requires javafx.fxml;
    requires antlr;
    requires itextpdf;
    requires org.fxmisc.richtext;
    requires reactfx;

    opens com.idedeuz to javafx.fxml;
    exports com.idedeuz;
}